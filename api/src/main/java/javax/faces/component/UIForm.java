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

package javax.faces.component;

import static javax.faces.component.visit.VisitResult.COMPLETE;

import java.util.Collection;
import java.util.Iterator;

import javax.faces.application.Application;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.context.FacesContext;
import javax.faces.event.PostValidateEvent;
import javax.faces.event.PreValidateEvent;

/**
 * <p>
 * <strong class="changed_modified_2_1">UIForm</strong> is a {@link UIComponent} that represents an
 * input form to be presented to the user, and whose child components represent (among other things)
 * the input fields to be included when the form is submitted.
 * </p>
 * 
 * <p>
 * By default, the <code>rendererType</code> property must be set to
 * "<code>javax.faces.Form</code>". This value can be changed by calling the
 * <code>setRendererType()</code> method.
 * </p>
 */
public class UIForm extends UIComponentBase implements NamingContainer, UniqueIdVendor {

    // ------------------------------------------------------ Manifest Constants

    /**
     * <p>
     * The standard component type for this component.
     * </p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.Form";

    /**
     * <p>
     * The standard component family for this component.
     * </p>
     */
    public static final String COMPONENT_FAMILY = "javax.faces.Form";

    /**
     * Properties that are tracked by state saving.
     */
    enum PropertyKeys {

        /**
         * <p>
         * The prependId flag.
         * </p>
         */
        prependId,

        /**
         * <p>
         * Last id vended by
         * {@link UIForm#createUniqueId(javax.faces.context.FacesContext, String)}.
         * </p>
         */
        lastId,

        submitted,
    }

    
    // ------------------------------------------------------------ Constructors

    /**
     * <p>
     * Create a new {@link UIForm} instance with default property values.
     * </p>
     */
    public UIForm() {
        super();
        setRendererType("javax.faces.Form");
    }


    // -------------------------------------------------------------- Properties

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    /**
     * <p>
     * <span class="changed_modified_2_1">Returns</span> the current value of the
     * <code>submitted</code> property. The default value is <code>false</code>. See
     * {@link #setSubmitted} for details.
     * </p>
     * 
     * <p class="changed_modified_2_1">
     * This property must be kept as a transient property using the
     * {@link UIComponent#getTransientStateHelper}.
     * </p>
     * 
     * @return <code>true</code> if the form was submitted, <code>false</code> otherwise.
     */
    public boolean isSubmitted() {
        return (Boolean) getTransientStateHelper().getTransient(PropertyKeys.submitted, false);
    }

    /**
     * <p>
     * <span class="changed_modified_2_1">If</span> <strong>this</strong> <code>UIForm</code>
     * instance (as opposed to other forms in the page) is experiencing a submit during this request
     * processing lifecycle, this method must be called, with <code>true</code> as the argument,
     * during the {@link UIComponent#decode} for this <code>UIForm</code> instance. If
     * <strong>this</strong> <code>UIForm</code> instance is <strong>not</strong> experiencing a
     * submit, this method must be called, with <code>false</code> as the argument, during the
     * {@link UIComponent#decode} for this <code>UIForm</code> instance.
     * </p>
     * 
     * <p>
     * The value of a <code>UIForm</code>'s submitted property must not be saved as part of its
     * state.
     * </p>
     * 
     * <p class="changed_modified_2_1">
     * This property must be kept as a transient property using the
     * {@link UIComponent#getTransientStateHelper}.
     * </p>
     * 
     * @param submitted the new value of the submitted flag.
     */
    public void setSubmitted(boolean submitted) {
        getTransientStateHelper().putTransient(PropertyKeys.submitted, submitted);
    }

    /**
     * Is the id prepended.
     * 
     * @return <code>true</code> if it is, <code>false</code> otherwise.
     */
    public boolean isPrependId() {
        return (Boolean) getStateHelper().eval(PropertyKeys.prependId, true);
    }

    public void setPrependId(boolean prependId) {
        getStateHelper().put(PropertyKeys.prependId, prependId);
    }

    
    // ----------------------------------------------------- UIComponent Methods

    /**
     * <p>
     * Override {@link UIComponent#processDecodes} to ensure that the form is decoded
     * <strong>before</strong> its children. This is necessary to allow the <code>submitted</code>
     * property to be correctly set.
     * </p>
     *
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processDecodes(FacesContext context) {

        if (context == null) {
            throw new NullPointerException();
        }

        // Process this component itself
        decode(context);

        // If we're not the submitted form, don't process children.
        if (!isSubmitted()) {
            return;
        }

        // Process all facets and children of this component
        Iterator<UIComponent> kids = getFacetsAndChildren();
        while (kids.hasNext()) {
            kids.next().processDecodes(context);
        }
    }

    /**
     * <p class="changed_modified_2_3">
     * Override {@link UIComponent#processValidators} to ensure that the children of this
     * <code>UIForm</code> instance are only processed if {@link #isSubmitted} returns
     * <code>true</code>.
     * </p>
     *
     * @throws NullPointerException {@inheritDoc}
     * @see javax.faces.event.PreValidateEvent
     * @see javax.faces.event.PostValidateEvent
     */
    @Override
    public void processValidators(FacesContext context) {

        if (context == null) {
            throw new NullPointerException();
        }
        
        if (!isSubmitted()) {
            return;
        }
        
        pushComponentToEL(context, this);
        Application application = context.getApplication();
        application.publishEvent(context, PreValidateEvent.class, this);
        
        // Process all the facets and children of this component
        Iterator<UIComponent> kids = getFacetsAndChildren();
        while (kids.hasNext()) {
            kids.next().processValidators(context);
        }
        
        application.publishEvent(context, PostValidateEvent.class, this);
        popComponentFromEL(context);
    }

    /**
     * <p>
     * Override {@link UIComponent#processUpdates} to ensure that the children of this
     * <code>UIForm</code> instance are only processed if {@link #isSubmitted} returns
     * <code>true</code>.
     * </p>
     *
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processUpdates(FacesContext context) {

        if (context == null) {
            throw new NullPointerException();
        }
        
        if (!isSubmitted()) {
            return;
        }

        pushComponentToEL(context, this);

        try {
            // Process all facets and children of this component
            Iterator<UIComponent> kids = getFacetsAndChildren();
            while (kids.hasNext()) {
                kids.next().processUpdates(context);
            }
        } finally {
            popComponentFromEL(context);
        }
    }

    /**
     * <p class="changed_modified_2_2">
     * Generate an identifier for a component. The identifier will be prefixed with
     * UNIQUE_ID_PREFIX, and will be unique within this component-container. Optionally, a unique
     * seed value can be supplied by component creators which should be included in the generated
     * unique id.
     * </p>
     * <p class="changed_added_2_2">
     * If the <code>prependId</code> property has the value <code>false</code>, this method must
     * call <code>createUniqueId</code> on the next ancestor <code>UniqueIdVendor</code>.
     * </p>
     *
     * @param context FacesContext
     * @param seed an optional seed value - e.g. based on the position of the component in the
     *            VDL-template
     * @return a unique-id in this component-container
     */
    @Override
    public String createUniqueId(FacesContext context, String seed) {
        return null;
    }

    /**
     * <p>
     * Override the {@link UIComponent#getContainerClientId} to allow users to disable this form
     * from prepending its <code>clientId</code> to its descendent's <code>clientIds</code>
     * depending on the value of this form's {@link #isPrependId} property.
     * </p>
     */
    @Override
    public String getContainerClientId(FacesContext context) {     
        return null;
    }

    /**
     * @see UIComponent#visitTree
     */
    @Override
    public boolean visitTree(VisitContext context, VisitCallback callback) {

        // NamingContainers can optimize partial tree visits by taking advantage
        // of the fact that it is possible to detect whether any ids to visit
        // exist underneath the NamingContainer. If no such ids exist, there
        // is no need to visit the subtree under the NamingContainer.

        // UIForm is a bit different from other NamingContainers. It only acts
        // as a NamingContainer when prependId is true. Note that if it
        // weren't for this, we could push this implementation up in to
        // UIComponent and share it across all NamingContainers. Instead,
        // we currently duplicate this implementation in UIForm and
        // UINamingContainer, so that we can check isPrependId() here.

        if (!isPrependId()) {
            return super.visitTree(context, callback);
        }

        Collection<String> idsToVisit = context.getSubtreeIdsToVisit(this);

        // If we have ids to visit, let the superclass implementation
        // handle the visit
        if (!idsToVisit.isEmpty()) {
            return super.visitTree(context, callback);
        }

        // If we have no child ids to visit, just visit ourselves, if
        // we are visitable.
        if (isVisitable(context)) {
            FacesContext facesContext = context.getFacesContext();
            pushComponentToEL(facesContext, null);

            try {
                return context.invokeVisitCallback(this, callback) == COMPLETE;
            } finally {
                popComponentFromEL(facesContext);
            }
        }

        // Done visiting this subtree. Return false to allow
        // visit to continue.
        return false;
    }
    
    
    // ----------------------------------------------------- Private Methods
    
    private Integer getLastId() {
        return (Integer) getStateHelper().get(PropertyKeys.lastId);
    }
    
    private void setLastId(Integer lastId) {
        getStateHelper().put(PropertyKeys.lastId, lastId);
    }
}
