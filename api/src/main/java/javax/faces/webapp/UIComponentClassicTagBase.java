/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.faces.webapp;
import javax.faces.application.Application;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTag;
import javax.servlet.jsp.tagext.JspIdConsumer;
import javax.servlet.jsp.tagext.Tag;

import java.io.IOException;
import java.util.List;


/**
 * <p><strong><code>UIComponentTagBase</code></strong> is the base class
 * for all JSP tags that use the "classic" JSP tag interface that
 * correspond to a {@link javax.faces.component.UIComponent} instance in
 * the view.  In Faces 1.2, all component tags are <code>BodyTag</code>
 * instances to allow for the execution of the page to build the
 * component tree, but not render it.  Rendering happens only after the
 * component tree is completely built.</p>
 *
 * <p>{@link UIComponentTag} extends
 * <code>UIComponentClassicTagBase</code> to add support for properties
 * that conform to the Faces 1.1 EL.</p>
 *
 * <p>{@link UIComponentELTag} extends
 * <code>UIComponentClassicTagBase</code> class to add support for
 * properties that conform to the EL API.</p>
 *
 * <p>The default implementation allows the proper interweaving of
 * template text, non-Faces JSP tag output, and Faces component tag
 * output in the same page, as expected by the page author.</p>
 *
 * <p>The CASE markers in the following example will be cited in the
 * method descriptions of this class.</p>
 *
 * <ul>
 *
 * <li><p>CASE 1 describes template text and/or non-component custom tag
 * output occurring as the child of a component tag, but before the
 * first component tag child of that component tag.</p></li>
 *
 * <li><p>CASE 2 describes template text and/or non-component custom tag
 * output occurring between two sibling component tags.</p></li>
 *
 * <li><p>CASE 3 describes template text and/or non-component custom tag
 * output occurring as the child content of an &lt;f:verbatim&gt;
 * tag at any point in the page.</p></li>
 *
 * <li><p>CASE 4 describes template text and/or non-component custom tag
 * output occurring between the last child component tag and its
 * enclosing parent component tag's end tag.</p></li>
 *
 * </ul>
 *
 * <pre><code>

 &lt;h:panelGrid style="color:red" border="4" columns="2"&gt;
 CASE 1
 &lt;h:outputText value="component 1"/&gt;
 CASE 2
 &lt;h:outputText value="component 2"/&gt;
 &lt;f:verbatim&gt;CASE 3&lt;/f:verbatim&gt;
 &lt;c:out value="${pageScope.CASE4}" /&gt;
 &lt;/h:panelGrid&gt;

 * </code></pre>
 *
 * <p>The preceding arrangement of faces component tags, must yield
 * markup that will render identically to the following (assuming that
 * <code>${pageScope.CASE4}</code> evaluates to "<code>CASE 4</code>"
 * without the quotes).</p>
 *
 * <pre><code>

 &lt;table border="4" style="color:red"&gt;

 &lt;tbody&gt;

 &lt;tr&gt;&lt;td&gt;CASE 1&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;component 1&lt;/td&gt;&lt;/tr&gt;

 &lt;tr&gt;&lt;td&gt;CASE 2&lt;/td&gt; &lt;tr&gt;&lt;td&gt;component 2&lt;/td&gt;&lt;/tr&gt;

 &lt;tr&gt;&lt;td&gt;CASE 3&lt;/td&gt; &lt;td&gt;CASE 4&lt;/td&gt;&lt;/tr&gt;

 &lt;/tbody&gt;

 &lt;/table&gt;

 * </code></pre>

 *
 */

public abstract class UIComponentClassicTagBase extends UIComponentTagBase implements JspIdConsumer, BodyTag {

    // ------------------------------------------------------ Manifest Constants
    /**
     * Used as the prefix for ids.  This is necessary to avoid
     * uniqueness conflicts with the transient verbatim components.
     */
    protected static final String UNIQUE_ID_PREFIX =
            UIViewRoot.UNIQUE_ID_PREFIX + '_';

    // ------------------------------------------------------ Instance Variables
    /**
     * <p>The <code>bodyContent</code> for this tag handler.</p>
     */
    protected BodyContent bodyContent = null;

    /**
     * <p>The JSP <code>PageContext</code> for the page we are embedded in.</p>
     */
    protected PageContext pageContext = null;

    public UIComponentClassicTagBase() {}

    UIComponentClassicTagBase(PageContext pageContext, FacesContext facesContext) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // --------------------------------------------- Support Methods for Tag

    //
    // Simple methods to be overridden by subclasses if necessary
    //

    /**
     * <p>Return the flag value that should be returned from the
     * <code>doStart()</code> method when it is called.  Subclasses
     * may override this method to return the appropriate value.</p>
     *
     * @throws JspException to cause <code>doStart()</code> to
     *  throw an exception
     *
     * @return the value to return from <code>doStart()</code>
     */
    protected int getDoStartValue() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the flag value that should be returned from the
     * <code>doEnd()</code> method when it is called.  Subclasses
     * may override this method to return the appropriate value.</p>
     *
     * @throws JspException to cause <code>doEnd()</code> to
     *  throw an exception
     *
     * @return the value to return from <code>doEnd()</code>
     */
    protected int getDoEndValue() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Delegate to the <code>encodeBegin()</code> method of our
     * corresponding {@link UIComponent}.  This method is called from
     * <code>doStartTag()</code>.  Normally, delegation occurs unconditionally;
     * however, this method is abstracted out so that advanced tags can
     * conditionally perform this call.
     *
     * @throws IOException if an input/output error occurs
     *
     * @deprecated No encoding is done during JSP page execution.
     * Encoding is deferred until the page has completed executing to
     * allow the entire tree to be built before any encoding occurs.
     */
    protected void encodeBegin() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Delegate to the <code>encodeChildren()</code> method of our
     * corresponding {@link UIComponent}.  This method is called from
     * <code>doStartTag()</code>.  Normally, delegation occurs unconditionally;
     * however, this method is abstracted out so that advanced tags can
     * conditionally perform this call.
     *
     * @throws IOException if an input/output error occurs
     *
     * @deprecated No encoding is done during JSP page execution.
     * Encoding is deferred until the page has completed executing to
     * allow the entire tree to be built before any encoding occurs.
     */
    protected void encodeChildren() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Delegate to the <code>encodeEnd()</code> method of our
     * corresponding {@link UIComponent}.  This method is called from
     * <code>doStartTag()</code>.  Normally, delegation occurs unconditionally;
     * however, this method is abstracted out so that advanced tags can
     * conditionally perform this call.
     *
     * @throws IOException if an input/output error occurs
     *
     * @deprecated No encoding is done during JSP page execution.
     * Encoding is deferred until the page has completed executing to
     * allow the entire tree to be built before any encoding occurs.
     */
    protected void encodeEnd() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // --------------------------------------------------------- Tag Properties


    /**
     * <p>Set the <code>PageContext</code> of the page containing this
     * tag instance.</p>
     *
     * @param pageContext The enclosing <code>PageContext</code>
     */
    @Override
    public void setPageContext(PageContext pageContext) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the <code>Tag</code> that is the parent of this instance.</p>
     */
    @Override
    public Tag getParent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the <code>Tag</code> that is the parent of this instance.</p>
     *
     * @param parent The new parent <code>Tag</code>
     */
    @Override
    public void setParent(Tag parent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }




    //
    // Complex methods to support Tag
    //

    /**
     * <p>Set up the {@link javax.faces.context.ResponseWriter} for the
     * current response, if this has not been done already.</p>
     *
     * <p>@deprecated.  {@link
     * javax.faces.application.ViewHandler#renderView} is now
     * responsible for setting up the response writer.  This method is
     * now a no-op.</p>

     */
    protected void setupResponseWriter() {
    }

    /**
     * <p>Find and return the {@link UIComponent}, from the component
     * tree, that corresponds to this tag handler instance.  If there
     * is no such {@link UIComponent}, create one
     * and add it as a child or facet of the {@link UIComponent} associated
     * with our nearest enclosing {@link UIComponentTag}.  The process for
     * locating or creating the component is:</p>
     * <ol>
     * <li>If we have previously located this component, return it.</li>
     * <li>Locate the parent component by looking for a parent
     *     {@link UIComponentTag} instance, and ask it for its component.
     *     If there is no parent {@link UIComponentTag} instance, this tag
     *     represents the root component, so get it from the current
     *     <code>Tree</code> and return it.</li>
     * <li>If this {@link UIComponentTag} instance has the
     *     <code>facetName</code> attribute set, ask the parent
     *     {@link UIComponent} for a facet with this name.  If not found,
     *     create one, call <code>setProperties()</code> with the new
     *     component as a parameter, and register it under this name.
     *     Return the found or created facet {@link UIComponent}.</li>
     * <li>Determine the component id to be assigned to the new
     *     component, as follows:  if this {@link UIComponentTag} has
     *     an <code>id</code> attribute set, use that value; otherwise,
     *     generate an identifier that is guaranteed to be the same for
     *     this {@link UIComponent} every time this page is processed
     *     (i.e. one based on the location of all {@link UIComponentTag}
     *     instances without an <code>id</code> attribute set).</li>
     * <li>Ask the parent {@link UIComponent} for a child with this identifier.
     *     If not found, create one, call <code>setProperties()</code>
     *     with the new component as a parameter, and register it as a child
     *     with this identifier.  Return the found or created
     *     child {@link UIComponent}.</li>
     * </ol>
     * <p>When creating a component, the process is:</p>
     * <ol>
     * <li>Retrieve the component type by calling
     * {@link UIComponentTag#getComponentType}</li>
     * <li>If the component has a <code>binding</code> attribute,
     * create an expression from it, and call
     * {@link Application#createComponent} with that expression,
     * the {@link FacesContext}, and the component type.  Store the
     * expression using the key <code>"binding"</code>.</li>
     * <li>Otherwise, call {@link Application#createComponent} with
     * only the component type.
     * <li>Call <code>setProperties()</code>.
     * <li>Add the new component as a child or facet of its parent</li>
     * </ol>
     *
     * @param context the {@code FacesContext} for the current request.
     *
     * @return the found component
     *
     * @throws JspException if an unexpected condition arises while finding the component
     */
    protected UIComponent findComponent(FacesContext context) throws JspException
    {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    //
    // Tag tree navigation
    //

    /**
     * <p>Locate and return the nearest enclosing {@link UIComponentClassicTagBase}
     * if any; otherwise, return <code>null</code>.</p>
     *
     * @param context <code>PageContext</code> for the current page
     *
     * @return the parent tag
     */
    public static UIComponentClassicTagBase getParentUIComponentClassicTagBase(PageContext context)
    {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    //
    // Methods related to the createdComponents and createdFacets lists.
    //

    @Override
    protected int getIndexOfNextChildTag() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    protected void addChild(UIComponent child) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    protected void addFacet(String name) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    //
    // Methods to support content interweaving
    //

    /**
     *
     * <p>Create a transient UIOutput component from the body content,
     * of this tag instance or return null if there is no body content,
     * the body content is whitespace, or the body content is a
     * comment.</p>
     *
     * @return the component 
     */

    protected UIComponent createVerbatimComponentFromBodyContent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Use the {@link Application} instance to create a new component
     * with the following characteristics.</p>
     *
     * <p><code>componentType</code> is
     * <code>javax.faces.HtmlOutputText</code>.</p>
     *
     * <p><code>transient</code> is <code>true</code>.</p>
     *
     * <p><code>escape</code> is <code>false</code>.</p>
     *
     * <p><code>id</code> is
     * <code>FacesContext.getViewRoot().createUniqueId()</code></p>
     *
     *
     * @return the component
     */

    protected UIOutput createVerbatimComponent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Add <i>verbatim</i> as a sibling of <i>component</i> in
     * <i>component</i> in the parent's child list.  <i>verbatim</i> is
     * added to the list at the position immediatly preceding
     * <i>component</i>.</p>
     *
     * 
     * @param parentTag the parent tag
     *
     * @param verbatim the verbatim to add before the component
     *
     * @param component the component to be added after the component
     *
     */

    protected void addVerbatimBeforeComponent(
            UIComponentClassicTagBase parentTag,
            UIComponent verbatim,
            UIComponent component) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Add <i>verbatim</i> as a sibling of <i>component</i> in
     * <i>component</i> in the parent's child list.  <i>verbatim</i> is
     * added to the list at the position immediatly following
     * <i>component</i>.</p>
     *
     * @param parentTag the parent tag
     *
     * @param verbatim the verbatim to add after the component
     *
     * @param component the component to be added before the component
     */

    protected void addVerbatimAfterComponent(UIComponentClassicTagBase parentTag,
                                             UIComponent verbatim,
                                             UIComponent component) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------------------ Tag Methods

    /**
     *
     * <p>Perform any processing necessary to find (or create) the
     * {@link UIComponent} instance in the view corresponding to this
     * tag instance in the page and, if and only if a component was
     * created, insert it into the tree at the proper location as
     * expected by the page author.  Secondarily, cause a transient
     * {@link UIOutput} component to be created and placed in the tree
     * <b>before</b> the <code>UIComponent</code> instance for
     * <b>this</b> tag.  The value of this <code>UIOutput</code>
     * component must include anything covered by <code>CASE 1</code> or
     * <code>CASE 2</code> in the class description.</p>
     *
     * <p>The default implementation, which is intended to be sufficient
     * for most components, implements this secondary requirement by
     * calling {@link #getParentUIComponentClassicTagBase}, and calling
     * {@link #createVerbatimComponentFromBodyContent} on the result.
     * It then adds the returned component to the tree <b>before</b> the
     * actual component for <b>this</b> tag instance instance by calling
     * {@link #addVerbatimBeforeComponent}.</p>
     *
     * <p>Before returning, the component is pushed onto the component
     * stack for this response to enable the {@link
     * #getParentUIComponentClassicTagBase} method to work properly.</p>
     *
     * <p>The flag value to be returned is acquired by calling the
     * <code>getDoStartValue()</code> method, which tag subclasses may
     * override if they do not want the default value.</p>
     *
     * @throws JspException if an error occurs
     */
    @Override
    public int doStartTag() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     *
     * <p>Perform any processing necessary to handle the content
     * implications of CASE 3 in the class description.</p>
     *
     * <p>The default implementation, which is intended to be sufficient
     * for most components, calls {@link
     * #createVerbatimComponentFromBodyContent} on <b>this</b> instance
     * and adds it as a child of the component for this tag's component
     * at the <b>end</b> of the child list.  In addition, the following
     * housekeeping steps are taken.</p>
     *
     * <ul>
     *
     * <li>Retrieve from the {@link UIComponent} the set of component
     * ids of child components created by {@link UIComponentTag}
     * instances the last time this page was processed (if any).
     * Compare it to the list of children created during this page
     * processing pass, and remove all children present in the old list
     * but not the new.  Save the new list as a component attribute so
     * that it gets saved as part of the component's state.</li>
     *
     * <li>Retrieve from the {@link UIComponent} the set of facet names
     * of facets created by {@link UIComponentTag} instances the last
     * time this page was processed (if any).  Compare it to the list of
     * facets created during this page processing pass, and remove all
     * facets present in the old list but not the new.  Save the new
     * list as a component attribute so that it gets saved as part of
     * the component's state.</li>
     *
     * <li>Release all references to the component, and pop it from the
     * component stack for this response, removing the stack if this was
     * the outermost component.</li> </ul>
     *
     * <p>The flag value to be returned is acquired by calling the
     * <code>getDoEndValue()</code> method, which tag subclasses may
     * override if they do not want the default value.</p>
     *
     * @throws JspException if an error occurs
     */
    @Override
    public int doEndTag() throws JspException
    {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Release any resources allocated during the execution of this
     * tag handler.</p>
     */
    @Override
    public void release() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------- Support methods for BodyTag

    /**
     * <p>Return the flag value that should be returned from the
     * <code>doAfterBody()</code> method when it is called.  Subclasses
     * may override this method to return the appropriate value.</p>
     *
     * @return the value to return from <code>doAfterBody()</code>
     *
     * @return JspException if the value cannot be returned
     *
     * @throws JspException if an unexpected condition arises while
     * getting the value
     */
    protected int getDoAfterBodyValue() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------------------- BodyTag Methods

    /**
     * <p>Set the <code>bodyContent</code> for this tag handler.  This method
     * is invoked by the JSP page implementation object at most once per
     * action invocation, before <code>doInitiBody()</code>.  This method
     * will not be invoked for empty tags or for non-empty tags whose
     * <code>doStartTag()</code> method returns <code>SKIP_BODY</code> or
     * <code>EVAL_BODY_INCLUDE</code>.</p>
     *
     * @param bodyContent The new <code>BodyContent</code> for this tag
     */
    @Override
    public void setBodyContent(BodyContent bodyContent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Get the <code>JspWriter</code> from our <code>BodyContent</code>.
     * </p>
     *
     * @return the writer
     */
    public JspWriter getPreviousOut() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    public BodyContent getBodyContent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }



    /**
     * <p>Prepare for evaluation of the body.  This method is invoked by the
     * JSP page implementation object after <code>setBodyContent()</code>
     * and before the first time the body is to be evaluated.  This method
     * will not be invoked for empty tags or for non-empty tags whose
     * <code>doStartTag()</code> method returns <code>SKIP_BODY</code>
     * or <code>EVAL_BODY_INCLUDE</code>.</p>
     *
     * @throws JspException if an error is encountered
     */
    @Override
    public void doInitBody() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     *
     * <p>Perform any processing necessary to handle the content
     * implications of CASE 4 in the class description.</p>
     *
     * <p>Return result from {@link #getDoAfterBodyValue}</p>
     * @throws JspException if an error is encountered
     */
    @Override
    public int doAfterBody() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ----------------------------------------------- Methods relating to Id

    /**
     * <p>Set the component identifier for our component.  If the
     * argument begins with {@link
     * UIViewRoot#UNIQUE_ID_PREFIX} throw an
     * <code>IllegalArgumentException</code></p>
     *
     * @param id The new component identifier.  This may not start with
     * {@link UIViewRoot#UNIQUE_ID_PREFIX}.
     *
     * @throws IllegalArgumentException if the argument is
     * non-<code>null</code> and starts with {@link
     * UIViewRoot#UNIQUE_ID_PREFIX}.
     */
    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the <code>id</code> value assigned by the page author.</p>
     *
     * @return the id of this tag
     */
    protected String getId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>If this method has been called before on this tag's useful
     * lifetime (before {@link #release} was called), return the
     * previously returned value.  Otherwise, if {@link #getJspId}
     * returns non-<code>null</code>, prepend {@link #UNIQUE_ID_PREFIX}
     * to the <code>jspId</code> and return the result.</p>
     *
     * @return the value as specified above
     */

    protected String getFacesJspId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Returns the <code>List</code> of {@link UIComponent} ids created or
     * located by nested {@link UIComponentTag}s while processing the current
     * request.
     *
     * @return the created components
     */
    protected List<String> getCreatedComponents() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------   JspIdConsumer Methods


    /**
     * <p>Defined on {@link JspIdConsumer}.  This method is called by
     * the container before {@link #doStartTag}.  The argument is
     * guaranteed to be unique within the page.</p>
     *
     * <p>IMPLEMENTATION NOTE:  This method will detect where we
     * are in an include and assign a unique ID for each include
     * in a particular 'logical page'.  This allows us to avoid
     * possible duplicate ID situations for included pages that
     * have components without explicit IDs.</p>
     *
     * @param id the container generated id for this tag, guaranteed to
     * be unique within the page.
     */

    @Override
    public void setJspId(String id) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    public String getJspId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------------- Abstract methods

    /**
     * <p>Override properties and attributes of the specified component,
     * if the corresponding properties of this tag handler instance were
     * explicitly set.  This method must be called <strong>ONLY</strong>
     * if the specified {@link UIComponent} was in fact created during
     * the execution of this tag handler instance, and this call will occur
     * <strong>BEFORE</strong> the {@link UIComponent} is added to
     * the view.</p>
     *
     * <p>Tag subclasses that want to support additional set properties
     * must ensure that the base class <code>setProperties()</code>
     * method is still called.  A typical implementation that supports
     * extra properties <code>foo</code> and <code>bar</code> would look
     * something like this:</p>
     * <pre>
     * protected void setProperties(UIComponent component) {
     *   super.setProperties(component);
     *   if (foo != null) {
     *     component.setAttribute("foo", foo);
     *   }
     *   if (bar != null) {
     *     component.setAttribute("bar", bar);
     *   }
     * }
     * </pre>
     *
     * <p>The default implementation overrides the following properties:</p>
     * <ul>
     * <li><code>rendered</code> - Set if a value for the
     *     <code>rendered</code> property is specified for
     *     this tag handler instance.</li>
     * <li><code>rendererType</code> - Set if the <code>getRendererType()</code>
     *     method returns a non-null value.</li>
     * </ul>
     *
     * @param component {@link UIComponent} whose properties are to be
     *  overridden
     */
    protected abstract void setProperties(UIComponent component);


    /**
     * <p>Create and return a new child component of the type returned
     * by calling <code>getComponentType()</code>.  If this {@link
     * UIComponentTag} has a non-null <code>binding</code> attribute,
     * this is done by call {@link Application#createComponent} with the
     * expression created for the <code>binding</code> attribute, and
     * the expression will be stored on the component.  Otherwise,
     * {@link Application#createComponent} is called with only the
     * component type.  Finally, initialize the components id and other
     * properties.  </p>
     * @param context {@link FacesContext} for the current request
     * @param newId id of the component
     *
     * @return the created component
     *
     * @throws JspException if the component cannot be created
     */

    protected abstract UIComponent createComponent(FacesContext context,
                                                   String newId) throws JspException;

    /**
     * <p>Return <code>true</code> if this component has a
     * non-<code>null</code> binding attribute.  This method is
     * necessary to allow subclasses that expose the
     * <code>binding</code> property as an Faces 1.1 style EL property
     * as well as subclasses that expose it as an EL API property.</p>
     *
     * @return whether or not this component has a binding attribute
     */

    protected abstract boolean hasBinding();

    // --------------------------------------------------------- Properties

    /**
     * <p>Return the {@link UIComponent} instance that is associated with
     * this tag instance.  This method is designed to be used by tags nested
     * within this tag, and only returns useful results between the
     * execution of <code>doStartTag()</code> and <code>doEndTag()</code>
     * on this tag instance.</p>
     */
    @Override
    public UIComponent getComponentInstance() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return <code>true</code> if we dynamically created a new component
     * instance during execution of this tag.  This method is designed to be
     * used by tags nested within this tag, and only returns useful results
     * between the execution of <code>doStartTag()</code> and
     * <code>doEndTag()</code> on this tag instance.</p>
     */
    @Override
    public boolean getCreated() { // NOPMD
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    protected FacesContext getFacesContext() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the facet name that we should be stored under, if any;
     * otherwise, return null (indicating that we will be a child component).
     * </p>
     *
     * @return the name of the facet
     */
    protected String getFacetName() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
