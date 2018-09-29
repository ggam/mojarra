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


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;


/**
 * <p><strong>FacetTag</strong> is the JSP mechanism for denoting a
 * {@link javax.faces.component.UIComponent} is to be added as a
 * <code>facet</code> to the component associated with its parent.</p>
 *
 * <p>A <strong>FacetTag</strong> must have one and only one
 * child.  This child must be a {@link UIComponentTag} instance representing
 * a single {@link javax.faces.component.UIComponent} instance.</p>
 */

public class FacetTag extends TagSupport {


    // -------------------------------------------------------------- Properties


    private static final long serialVersionUID = 5019035861261307895L;

    /**
     * <p>Return the name to be assigned to this facet.</p>
     *
     * @return the name
     */
    public String getName() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    

    /**
     * <p>Set the name to be assigned to this facet.</p>
     *
     * @param name The new facet name
     */
    public void setName(String name) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------------------- Tag Methods


    /**
     * <p>Release any resources allocated by this tag instance.
     */
    @Override
    public void release() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return <code>EVAL_BODY_INCLUDE</code> to cause nested body
     * content to be evaluated.</p>
     */
    @Override
    public int doStartTag() throws JspException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
