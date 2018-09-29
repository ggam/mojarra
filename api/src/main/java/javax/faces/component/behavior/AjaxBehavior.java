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

package javax.faces.component.behavior;

import java.util.Collection;
import java.util.Set;
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorListener;


/**
 * <p class="changed_added_2_0"><span
 * class="changed_modified_2_0_rev_a changed_modified_2_2">An</span> instance of this class
 * is added as a {@link ClientBehavior} to a component using the {@link
 * javax.faces.component.behavior.ClientBehaviorHolder#addClientBehavior}
 * contract that components implement.  The presence of this {@link
 * ClientBehavior} will cause the rendering of JavaScript that produces
 * an <code>Ajax</code> request using the specification public
 * JavaScript API when the component is rendered.</p>

 * <p class="changed_modified_2_0_rev_a">If the component is an instance
 * of {@link javax.faces.component.EditableValueHolder}, Where at all
 * possible, the component must have the UI register the ajax event when
 * the initial value is changed, not when focus is lost on the
 * component.</p>

 * <!-- https://javaserverfaces.dev.java.net/issues/show_bug.cgi?id=1219 -->
 *
 * @since 2.0
 */

public class AjaxBehavior extends ClientBehaviorBase {

    /**
     * <p class="changed_added_2_0">The standard id for this behavior.</p>
     */
    public static final String BEHAVIOR_ID = "javax.faces.behavior.Ajax";
    
    public AjaxBehavior() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ---------------------------------------------------------- Public Methods
    @Override
    public String getRendererType() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">
     * This method returns an unmodifiable <code>Set</code> containing
     * the {@link ClientBehaviorHint} <code>SUBMITTING</code>.</p> 
     *
     * @return unmodifiable set containing the hint {@link ClientBehaviorHint}
     * <code>SUBMITTING</code>.
     *
     * @since 2.0
     */
    @Override
    public Set<ClientBehaviorHint> getHints() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Return the <code>String</code> of
     * JavaScript function name that will be used to identify
     * the client callback function that should be run in the event of
     * an error.
     *
     * @return the JavaScript function name of <code>ONERROR</code>.
     * 
     * @since 2.0
     */
    public String getOnerror() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the JavaScript function name 
     * that will be used to identify the client callback function that 
     * should be run in the event of an error.
     *
     * @param onerror the error handling function name
     *
     * @since 2.0
     */
    public void setOnerror(String onerror) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Return the <code>String</code> of
     * JavaScript function name that will be used to identify the
     * client callback function that should be run on the occurance
     * of a client-side event.
     *
     * @return the JavaScript function name of <code>ONEVENT</code>.
     *      
     * @since 2.0
     */
    public String getOnevent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the JavaScript function name 
     * that will be used to identify the client callback function that 
     * should be run in response to event activity.
     *
     * @param onevent the event handling function name
     *
     * @since 2.0
     */
    public void setOnevent(String onevent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
   }

    /**
     * <p class="changed_added_2_0">Return a non-empty
     * <code>Collection&lt;String&gt;</code> of component
     * identifiers that will be used to identify components that should be
     * processed during the <code>execute</code> phase of the request
     * processing lifecycle.</p>
     * <p>Note that the returned collection may be unmodifiable.  Modifications
     * should be performed by calling {@link #setExecute}.</p>
     * 
     * @return the JavaScript function name of <code>EXECUTE</code>.
     * 
     * @since 2.0
     */
    public Collection<String> getExecute() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the component identifiers that 
     * will be used to identify components that should be
     * processed during the <code>execute</code> phase of the request
     * processing lifecycle.</p>
     *
     * @param execute the ids of components to execute
     *
     * @since 2.0
     */
    public void setExecute(Collection<String> execute) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_2">Returns the delay value, or <code>null</code>
     * if no value was set.</p>
     * 
     * @return the delay value.
     * 
     * @since 2.2
     */
    public String getDelay() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">If less than
     * <em>delay</em> milliseconds elapses between calls to
     * <em>request()</em> only the most recent one is sent and all other
     * requests are discarded. The default value of this option is
     * 300. If the value of <em>delay</em> is the literal string
     * <code>'none'</code> without the quotes, no delay is used.</p>
     *
     * @param delay the ajax delay value
     *
     * @since 2.2
     */
    public void setDelay(String delay) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    

    /**
     * <p class="changed_added_2_0">Return a non-empty
     * <code>Collection&lt;String&gt;</code> of component
     * identifiers that will be used to identify components that should be
     * processed during the <code>render</code> phase of the request
     * processing lifecycle.</p>
     * <p>Note that the returned collection may be unmodifiable.  Modifications
     * should be performed by calling {@link #setRender}.</p>
     *
     * @return  the ids of components to render.
     *
     * @since 2.0
     */
    public Collection<String> getRender() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the component identifiers that 
     * will be used to identify components that should be
     * processed during the <code>render</code> phase of the request
     * processing lifecycle.</p>
     *
     * @param render the ids of components to render
     *
     * @since 2.0
     */
    public void setRender(Collection<String> render) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_2">
     * Return the resetValues status of this behavior.</p>
     *
     *  @return the resetValues status.
     * 
     * @since 2.2
     */

    public boolean isResetValues() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">
     * Set the resetValues status of this behavior.</p>
     * 
     *  @param resetValues the resetValues status.
     * 
     * @since 2.2
     */

    public void setResetValues(boolean resetValues) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    

    /**
     * <p class="changed_added_2_0">Return the disabled status of this behavior.</p>
     *
     * @return the disabled status of this behavior.
     *
     * @since 2.0
     */
    public boolean isDisabled() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the disabled status of this 
     * behavior.</p>
     *
     * @param disabled the flag to be set.
     *
     * @since 2.0
     */
    public void setDisabled(boolean disabled) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Return the immediate status of this 
     * behavior.</p>
     *
     * @return  the immediate status.
     * 
     * @since 2.0
     */
    public boolean isImmediate() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">Sets the immediate status of this 
     * behavior.</p>
     *
     * @param immediate the flag to be set.
     *
     * @since 2.0
     */
    public void setImmediate(boolean immediate) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Tests whether the immediate attribute
     * is specified.  Returns true if the immediate attribute is specified,
     * either as a locally set property or as a value expression.  This
     * information allows an associated client behavior renderer to fall back
     * on the parent component's immediate status when immediate is not 
     * explicitly specified on the <code>AjaxBehavior</code>.
     * </p>
     *  
     *  @return the flag whether the immediate attribute is specified.
     *  
     * @since 2.0
     */
    public boolean isImmediateSet() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">Tests whether the resetValues attribute
     * is specified.  Returns true if the resetValues attribute is specified,
     * either as a locally set property or as a value expression. 
     * </p>
     *
     * @return the flag whether the resetValues attribute is specified.
     *
     * @since 2.2
     */
    public boolean isResetValuesSet() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Returns the {@link ValueExpression}
     * used to calculate the value for the specified property name, if any.
     * </p>
     *
     * @param name Name of the property for which to retrieve a
     *  {@link ValueExpression}
     *
     * @return the {@link ValueExpression}.
     *
     * @throws NullPointerException if <code>name</code>
     *  is <code>null</code>
     */
    public ValueExpression getValueExpression(String name) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Sets the {@link ValueExpression} 
     * used to calculate the value for the specified property name.</p>
     *
     * @param name Name of the property for which to set a
     *  {@link ValueExpression}
     * @param binding The {@link ValueExpression} to set, or <code>null</code>
     *  to remove any currently set {@link ValueExpression}
     *
     * @throws NullPointerException if <code>name</code>
     *  is <code>null</code>
     */
    public void setValueExpression(String name, ValueExpression binding) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Add the specified {@link AjaxBehaviorListener}
     * to the set of listeners registered to receive event notifications
     * from this {@link AjaxBehavior}.</p>
     *
     * @param listener The {@link AjaxBehaviorListener} to be registered
     *
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     *
     * @since 2.0
     */
    public void addAjaxBehaviorListener(AjaxBehaviorListener listener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Remove the specified {@link AjaxBehaviorListener}
     * from the set of listeners registered to receive event notifications
     * from this {@link AjaxBehavior}.</p>
     *
     * @param listener The {@link AjaxBehaviorListener} to be removed
     *
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     *
     * @since 2.0
     */
    public void removeAjaxBehaviorListener(AjaxBehaviorListener listener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Object saveState(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void restoreState(FacesContext context, Object state) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
