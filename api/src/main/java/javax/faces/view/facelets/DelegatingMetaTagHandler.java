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

package javax.faces.view.facelets;

import java.io.IOException;
import javax.el.ELException;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;

/**
 * <p class="changed_added_2_0"><span
 * class="changed_modified_2_0_rev_a">Enable</span> the JSF
 * implementation to provide the appropriate behavior for the kind of
 * {@link MetaTagHandler} subclass for each kind of element in the view,
 * while providing a base-class from which those wanting to make a Java
 * language custom tag handler can inherit.  The JSF runtime provides
 * the implementation of {@link #getTagHandlerDelegate} for the
 * appropriate subclass.</p>
 */

public abstract class DelegatingMetaTagHandler extends MetaTagHandler {
    
    protected TagHandlerDelegateFactory delegateFactory;
    
    public DelegatingMetaTagHandler(TagConfig config) {
        super(config);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">
     *  Get the tag handler delegate.
     * </p>
     * 
     * <p class="changed_added_2_3">
     *  Code that extends from DelegatingMetaTagHandler (directly or indirectly,
     *  as through extending ComponentHandler) must take care to decorate, not 
     *  replace, the TagHandlerDelegate instance returned by this method. 
     *  Failure to do so may produce unexpected results.
     * </p>
     * 
     * @return the tag handler delegate.
     */
    protected abstract TagHandlerDelegate getTagHandlerDelegate();
    
    // Properties ----------------------------------------

    public boolean isDisabled(FaceletContext ctx) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    public TagAttribute getBinding() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    public Tag getTag() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    public String getTagId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    public TagAttribute getTagAttribute(String localName) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    @Override
    public void setAttributes(FaceletContext ctx, Object instance) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    // Methods ----------------------------------------
    

    /**
     * <p class="changed_added_2_0">The default implementation simply
     * calls through to {@link TagHandlerDelegate#apply}.</p>
     *
     * @param ctx the <code>FaceletContext</code> for this view execution
     *
     * @param parent the parent <code>UIComponent</code> of the
     * component represented by this element instance.
     * @since 2.0
     */

    @Override
    public void apply(FaceletContext ctx, UIComponent parent) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_0_rev_a">Invoke the <code>apply()</code>
     * method on this instance's {@link TagHandler#nextHandler}.</p>
     *
     * @param ctx the <code>FaceletContext</code> for this view execution
     *
     * @param c the <code>UIComponent</code> of the
     * component represented by this element instance.
     * 
     * @throws IOException if thrown by the next {@link FaceletHandler}

     * @throws FaceletException if thrown by the next {@link FaceletHandler}

     * @throws javax.faces.FacesException if thrown by the next {@link FaceletHandler}

     * @throws javax.el.ELException if thrown by the next {@link FaceletHandler}

     * @since 2.0
     */

    public void applyNextHandler(FaceletContext ctx, UIComponent c) 
            throws IOException, FacesException, ELException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");

    }
    
    /**
     * <p class="changed_added_2_0">The default implementation simply
     * calls through to {@link TagHandlerDelegate#createMetaRuleset} and
     * returns the result.</p>
     *
     * @param type the <code>Class</code> for which the
     * <code>MetaRuleset</code> must be created.
     *
     * @since 2.0
     */

    @Override
    protected MetaRuleset createMetaRuleset(Class type) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
}
