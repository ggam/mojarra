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

package javax.faces.view;


import java.util.List;

import javax.faces.FacesWrapper;

/**
 * <p class="changed_added_2_0"><strong
 * class="changed_modified_2_1 changed_modified_2_3">ViewDeclarationLanguageFactory</strong>
 * is a factory object that creates (if needed) and returns a new {@link
 * ViewDeclarationLanguage} instance based on the VDL found in a
 * specific view.</p>
 *
 * <div class="changed_added_2_0">
 *
 * <p>There must be one <code>ViewDeclarationLanguageFactory</code> instance per web
 * application that is utilizing JavaServer Faces.  This instance can be
 * acquired, in a portable manner, by calling:</p>
 *
 * <pre><code>
 *   ViewDeclarationLanguageFactory factory = (ViewDeclarationLanguageFactory)
 *    FactoryFinder.getFactory(FactoryFinder.VIEW_DECLARATION_LANGUAGE_FACTORY);
 * </code></pre>
 *

 * </div>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.0
 */

public abstract class ViewDeclarationLanguageFactory implements FacesWrapper<ViewDeclarationLanguageFactory> {

    private ViewDeclarationLanguageFactory wrapped;

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public ViewDeclarationLanguageFactory() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">If this factory has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     */
    public ViewDeclarationLanguageFactory(ViewDeclarationLanguageFactory wrapped) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_modified_2_3">If this factory has been decorated, the
     * implementation doing the decorating may override this method to provide
     * access to the implementation being wrapped.</p>
     */
    @Override
    public ViewDeclarationLanguageFactory getWrapped() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0"><span
     * class="changed_modified_2_1">Return</span> the
     * <code>ViewDeclarationLanguage</code> instance suitable for
     * handling the VDL contained in the page referenced by the argument
     * <code>viewId</code>.  The default implementation must return a
     * valid <code>ViewDeclarationLanguage</code> instance for views
     * written in either JSP, Faces XML Views, or Facelets for JSF
     * 2.</p>
     *
     * @param viewId the viewId to be inspected for an appropriate
     * <code>ViewDeclarationLanguage</code> implementation for the VDL used
     * in the view.
     *
     * @since 2.0
     *
     * @throws NullPointerException if <code>viewId</code> is null.
     *
     * @return the {@code ViewDeclarationLanguage} corresponding to the
     * argument {@code viewId}
     *
     */
    public abstract ViewDeclarationLanguage getViewDeclarationLanguage(String viewId);

    public List<ViewDeclarationLanguage> getAllViewDeclarationLanguages() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
