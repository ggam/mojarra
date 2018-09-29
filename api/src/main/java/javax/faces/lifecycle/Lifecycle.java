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

package javax.faces.lifecycle;

import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseListener;


/**
 * <p><strong class="changed_modified_2_2">Lifecycle</strong> manages the
 * processing of the entire lifecycle of a particular JavaServer Faces
 * request.  It is responsible for executing all of the phases that have
 * been defined by the JavaServer Faces Specification, in the specified
 * order, unless otherwise directed by activities that occurred during
 * the execution of each phase.</p>
 *
 * <p>An instance of <code>Lifecycle</code> is created by calling the
 * <code>getLifecycle()</code> method of {@link LifecycleFactory}, for
 * a specified lifecycle identifier.  Because this instance is
 * shared across multiple simultaneous requests, it must be implemented
 * in a thread-safe manner.</p>
 */

public abstract class Lifecycle {


    // ---------------------------------------------------------- Public Methods


    /**
     * <p>Register a new {@link PhaseListener} instance that is interested in
     * being notified before and after the processing for standard phases of
     * the request processing lifecycle.</p>
     *
     * @param listener The {@link PhaseListener} to be registered
     *
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     */
    public abstract void addPhaseListener(PhaseListener listener);


    /**
     * <p>Execute all of the phases of the request processing lifecycle,
     * up to but not including the <em>Render Response</em> phase,
     * as described in the JavaServer Faces Specification, in the specified
     * order.  The processing flow can be affected (by the application,
     * by components, or by event listeners) by calls to the
     * <code>renderResponse()</code> or <code>responseComplete()</code>
     * methods of the {@link FacesContext} instance associated with
     * the current request.</p>
     *
     * @param context FacesContext for the request to be processed
     *
     * @throws FacesException if thrown during the execution of the
     *  request processing lifecycle
     * @throws NullPointerException if <code>context</code>
     *  is <code>null</code>
     */
    public abstract void execute(FacesContext context) throws FacesException;
    
    
    /**
     * <p class="changed_added_2_2">Create or restore the {@link
     * ClientWindow} to be used to display the {@link
     * javax.faces.component.UIViewRoot} for this run through the
     * lifecycle.  See the class documentation for {@link ClientWindow}
     * for an overview of the feature.
     *
     * If {@link javax.faces.context.ExternalContext#getClientWindow()} returns
     * null, create a new instance of <code>ClientWindow</code> using the
     * {@link ClientWindowFactory}.  If the result is non-null, call
     * {@link ClientWindow#decode(javax.faces.context.FacesContext)} on it. 
     * Store the new <code>ClientWindow</code> by calling
     * {@link javax.faces.context.ExternalContext#setClientWindow(javax.faces.lifecycle.ClientWindow)}.</p>
     * 
     * @param context the {@link FacesContext} for this request.
     * 
     * @since 2.2
     */
    
    public void attachWindow(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the set of registered {@link PhaseListener}s for this
     * {@link Lifecycle} instance.  If there are no registered listeners,
     * a zero-length array is returned.</p>
     * 
     * @return the set of registered {@link PhaseListener}s
     */
    public abstract PhaseListener[] getPhaseListeners();


    /**
     * <p>Deregister an existing {@link PhaseListener} instance that is no
     * longer interested in being notified before and after the processing
     * for standard phases of the request processing lifecycle.  If no such
     * listener instance has been registered, no action is taken.</p>
     *
     * @param listener The {@link PhaseListener} to be deregistered
     * @throws NullPointerException if <code>listener</code>
     *  is <code>null</code>
     */
    public abstract void removePhaseListener(PhaseListener listener);


    /**
     * <p>Execute the <em>Render Response</em> phase of the request
     * processing lifecycle, unless the <code>responseComplete()</code>
     * method has been called on the {@link FacesContext} instance
     * associated with the current request.</p>
     *
     * @param context FacesContext for the request being processed
     *
     * @throws FacesException if an exception is thrown during the execution
     *  of the request processing lifecycle
     * @throws NullPointerException if <code>context</code>
     *  is <code>null</code>
     */
    public abstract void render(FacesContext context) throws FacesException;


}
