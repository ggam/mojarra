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

import javax.faces.component.UIComponent;
import javax.faces.component.ValueHolder;
import javax.faces.convert.Converter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;






/**
 * <p><strong>ConverterELTag</strong> is a base class for all JSP custom
 * actions that create and register a <code>Converter</code> instance on
 * the {@link ValueHolder} associated with our most immediate
 * surrounding instance of a tag whose implementation class is a
 * subclass of {@link UIComponentClassicTagBase}.  To avoid creating duplicate
 * instances when a page is redisplayed, creation and registration of a
 * {@link Converter} occurs <strong>only</strong> if the corresponding
 * {@link UIComponent} was created (by the owning {@link
 * UIComponentTag}) during the execution of the current page.</p>
 *
 * <p>This class may be used as a base class for tag instances that
 * support specific {@link Converter} subclasses.</p>
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
 */

public abstract class ConverterELTag extends TagSupport {


    // ---------------------------------------------------------- Public Methods


    private static final long serialVersionUID = -1876768812840134640L;

    /**
     * <p>Create a new instance of the specified {@link Converter}
     * class, and register it with the {@link UIComponent} instance associated
     * with our most immediately surrounding {@link UIComponentClassicTagBase} instance, if
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


    // ------------------------------------------------------- Protected Methods


    /**
     * <p>Create and return a new {@link Converter} to be registered
     * on our surrounding {@link UIComponent}.</p>
     *
     * @throws JspException if a new instance cannot be created
     * 
     * @return the {@code Converter}
     */
    protected abstract Converter createConverter()
        throws JspException;
}
