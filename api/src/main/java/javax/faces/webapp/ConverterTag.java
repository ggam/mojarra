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

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.component.ValueHolder;
import javax.faces.convert.Converter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;






/**
 * <p><strong>ConverterTag</strong> is a base class for all JSP custom actions
 * that create and register a <code>Converter</code> instance on the
 * {@link ValueHolder} associated with our most immediate
 * surrounding instance of a tag whose implementation class is a subclass
 * of {@link UIComponentTag}.  To avoid creating duplicate instances when
 * a page is redisplayed, creation and registration of a {@link Converter}
 * occurs <strong>only</strong> if the corresponding {@link UIComponent} was
 * created (by the owning {@link UIComponentTag}) during the execution of the
 * current page.</p>
 *
 * <p>This class may be used directly to implement a generic converter
 * registration tag (based on the converter-id specified by the
 * <code>converterId</code> attribute), or as a base class for tag
 * instances that support specific {@link Converter} subclasses.  This
 * <code>converterId</code> attribute must refer to one of the well
 * known converter-ids, or a custom converter-id as defined in a
 * <code>faces-config.xml</code> file.</p>
 *
 * <p>Subclasses of this class must implement the
 * <code>createConverter()</code> method, which creates and returns a
 * {@link Converter} instance.  Any configuration properties that specify
 * behavior of this {@link Converter} must have been set by the
 * <code>createConverter()</code> method.  Generally, this occurs
 * by copying corresponding attribute values on the tag instance.</p>
 *
 * <p>This tag creates no output to the page currently being created.  It
 * is used solely for the side effect of {@link Converter} creation.</p>
 *
 * @deprecated This has been partially replaced by {@link
 * ConverterELTag}.  The remainder of the functionality, namely, the
 * binding facility and the implementation of the {@link
 * #createConverter} method, is now an implementation detail.
 */

public class ConverterTag extends TagSupport {


    // ---------------------------------------------------------- Static Members


    private static final long serialVersionUID = -5909792518081427720L;

    /**
     * <p>Set the identifer of the {@link Converter} instance to be created.
     *
     * @param converterId The identifier of the converter instance to be
     * created.
     */
    public void setConverterId(String converterId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Set the expression that will be used to create a {@link ValueExpression}
     * that references a backing bean property of the {@link Converter} instance to 
     * be created.</p>
     *
     * @param binding The new expression
     *
     * @throws JspException if a JSP error occurs
     */
    public void setBinding(String binding) throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    // ---------------------------------------------------------- Public Methods


    /**
     * <p>Create a new instance of the specified {@link Converter}
     * class, and register it with the {@link UIComponent} instance associated
     * with our most immediately surrounding {@link UIComponentTag} instance, if
     * the {@link UIComponent} instance was created by this execution of the
     * containing JSP page.  If the localValue of the
     * {@link UIComponent} is a String, attempt to convert it.</p>
     *
     * @throws JspException if a JSP error occurs
     */
    @Override
    public int doStartTag() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Release references to any acquired resources.
     */
    @Override
    public void release() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------------- Protected Methods


    /**
     * <p>Create and return a new {@link Converter} to be registered
     * on our surrounding {@link UIComponent}.</p>
     *
     * @throws JspException if a new instance cannot be created
     * 
     * @return the {@code Converter}
     */
    protected Converter createConverter()
        throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
