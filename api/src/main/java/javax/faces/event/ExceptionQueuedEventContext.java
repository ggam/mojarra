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

package javax.faces.event;

import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * <p class="changed_added_2_0">This helper class provides context to
 * the {@link ExceptionQueuedEvent} regarding the state of the system at the
 * point in time when the <code>ExceptionQueuedEvent</code> occurs and links
 * the <code>ExceptionQueuedEvent</code> to the {@link
 * javax.faces.context.ExceptionHandler} by virtue of implementing
 * {@link SystemEventListener}.</p>
 *
 * @since 2.0
 */

public class ExceptionQueuedEventContext implements SystemEventListenerHolder {

    /**
     * <p class="changed_added_2_0">The presence of an entry under this
     * key in the <code>Map</code> returned from {@link #getAttributes}
     * indicates the event occurred during the &#8220;before
     * phase&#8221; part of the current lifecycle phase.</p>
     */
    public static final String IN_BEFORE_PHASE_KEY =
          ExceptionQueuedEventContext.class.getName() + ".IN_BEFORE_PHASE";
    
    /**
     * <p class="changed_added_2_0">The presence of an entry under this
     * key in the <code>Map</code> returned from {@link #getAttributes}
     * indicates the event occurred during the &#8220;after
     * phase&#8221; part of the current lifecycle phase.</p>
     */
    public static final String IN_AFTER_PHASE_KEY =
          ExceptionQueuedEventContext.class.getName() + ".IN_AFTER_PHASE";
    
    // ------------------------------------------------------------ Constructors


    /**
     * <p class="changed_added_2_0">Instantiate a new
     * <code>ExceptionQueuedEventContext</code> that indicates the argument
     * <code>Throwable</code> just occurred.</p>
     *
     * @param context {@link FacesContext} for the current request
     * @param thrown the <code>Throwable</code> that is the context for
     * this <code>ExceptionQueuedEventContext</code> instance.
     */
    public ExceptionQueuedEventContext(FacesContext context, Throwable thrown) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">Instantiate a new
     * <code>ExceptionQueuedEventContext</code> that indicates the argument
     * <code>Throwable</code> just occurred, relevant to the argument
     * <code>component</code>.
     *
     * @param context {@link FacesContext} for the current request
     * @param thrown the <code>Throwable</code> that is the context for
     * this <code>ExceptionQueuedEventContext</code> instance.
     * @param component the {@link UIComponent} instance to which this
     * <code>ExceptionQueuedEventContext</code> pertains

     */
    public ExceptionQueuedEventContext(FacesContext context,
                                 Throwable thrown,
                                 UIComponent component) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
            
    /**
     * <p class="changed_added_2_0">Instantiate a new
     * <code>ExceptionQueuedEventContext</code> that indicates the argument
     * <code>Throwable</code> just occurred, relevant to the argument
     * <code>component</code>, during the lifecycle phase
     * <code>phaseId</code>.</p>
     *
     * @param context {@link FacesContext} for the current request

     * @param thrown the <code>Throwable</code> that is the context for
     * this <code>ExceptionQueuedEventContext</code> instance.
     *
     * @param component the <code>UIComponent</code> that is relevant to
     * the context.
     *
     * @param phaseId the <code>PhaseId</code> at the time this
     * <code>ExeceptionEventContext</code> is created.
     */
    public ExceptionQueuedEventContext(FacesContext context,
                                 Throwable thrown,
                                 UIComponent component,
                                 PhaseId phaseId) {      
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ---------------------------------------------------------- Public Methods


    /**
     * <p class="changed_added_2_0">The {@link FacesContext} for this
     * request.</p>
     * @return the {@link FacesContext} used to create this
     *  <code>ExceptionQueuedEventContext</code> instance.
     */
    public FacesContext getContext() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Return the <code>exception</code>
     * property.</p>
     *
     * @return the exception
     */
    public Throwable getException() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    
    /**
     * <p class="changed_added_2_0">Return the <code>UIComponent</code>
     * which was being processed when the exception was thrown. If none
     * or not available, this will be <code>null</code>.</p>
     *
     * @return the component
     */
    public UIComponent getComponent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">Return the <code>PhaseId</code>
     * which was being processed when the exception was thrown. If none
     * or not available, this will be <code>null</code>.</p>
     *
     * @return the phase id
     */
    public PhaseId getPhaseId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @return <code>true</code> if the exception occurred during the
     *  <code>before phase</code> processing for a particular lifecycle
     *  phase
     */
    public boolean inBeforePhase() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @return <code>true</code> if the exception occurred during the
     *  <code>after phase</code> processing for a particular lifecycle
     *  phase
     */
    public boolean inAfterPhase() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">A <code>Map</code> of attributes
     * relevant to the context of this <code>ExceptionQueuedEvent</code>.</p>
     *
     * @return attributes related to this context
     */
    public Map<Object, Object> getAttributes() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_added_2_0">Return a <code>List</code> that
     * contains a single entry, the {@link
     * javax.faces.context.ExceptionHandler} for the current
     * request.</p>
     */
    @Override
    public List<SystemEventListener> getListenersForEventClass(Class<? extends SystemEvent> facesEventClass) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
