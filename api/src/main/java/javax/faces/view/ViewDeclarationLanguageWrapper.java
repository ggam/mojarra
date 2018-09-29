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


import java.beans.BeanInfo;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import javax.faces.FacesWrapper;
import javax.faces.application.Resource;
import javax.faces.application.ViewVisitOption;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 * <p class="changed_added_2_2"><span class="changed_modified_2_3">Provides</span> a simple implementation of
 * {@link ViewDeclarationLanguage} that can
 * be subclassed by developers wishing to provide specialized behavior
 * to an existing {@link ViewDeclarationLanguage} instance.  The default
 * implementation of all methods is to call through to the wrapped
 * {@link ViewDeclarationLanguage} instance.</p>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.2
 */
public abstract class ViewDeclarationLanguageWrapper extends ViewDeclarationLanguage implements FacesWrapper<ViewDeclarationLanguage> {


    private ViewDeclarationLanguage wrapped;

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public ViewDeclarationLanguageWrapper() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">If this view declaration language has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     * @since 2.3
     */
    public ViewDeclarationLanguageWrapper(ViewDeclarationLanguage wrapped) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public ViewDeclarationLanguage getWrapped() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ----------------------------------------------- Methods from ViewDeclarationLanguage


    @Override
    public UIViewRoot restoreView(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public ViewMetadata getViewMetadata(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public UIViewRoot createView(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void buildView(FacesContext context, UIViewRoot root) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void renderView(FacesContext context, UIViewRoot view) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void retargetAttachedObjects(FacesContext context, UIComponent topLevelComponent, List<AttachedObjectHandler> handlers) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void retargetMethodExpressions(FacesContext context, UIComponent topLevelComponent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean viewExists(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Stream<String> getViews(FacesContext context, String path, ViewVisitOption... options) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Stream<String> getViews(FacesContext context, String path, int maxDepth, ViewVisitOption... options) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public List<String> calculateResourceLibraryContracts(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public UIComponent createComponent(FacesContext context, String taglibURI, String tagName, Map<String, Object> attributes) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public BeanInfo getComponentMetadata(FacesContext context, Resource componentResource) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Resource getScriptComponentResource(FacesContext context, Resource componentResource) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public StateManagementStrategy getStateManagementStrategy(FacesContext context, String viewId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
