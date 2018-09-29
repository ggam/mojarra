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

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import javax.faces.context.FacesContext;

/**
 * <p><strong class="changed_added_2_0 changed_modified_2_3">BehaviorEvent</strong> 
 * is the event that can be generated from component 
 * {@link javax.faces.component.behavior.Behavior}.</p>
 *
 * @since 2.0
 */
public abstract class BehaviorEvent extends FacesEvent {

    private static final long serialVersionUID = 6516644738910462065L;

    /**
     * <p class="changed_added_2_0 changed_removed_2_3">Construct a new event object 
     * from the specified source component and <code>behavior</code>.</p>
     *
     * @param component Source {@link UIComponent} for this event
     * @param behavior {@link Behavior} that sent this event
     * @throws IllegalArgumentException if <code>component</code> or 
     * <code>behavior</code> is <code>null</code>
     * @since 2.0
     */
    public BehaviorEvent(UIComponent component, Behavior behavior) {
        super(component);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">Construct a new event object 
     * from the Faces context, specified source component and behavior.</p>
     *
     * @param facesContext the Faces context.
     * @param component Source {@link UIComponent} for this event
     * @param behavior {@link Behavior} that sent this event
     * @throws IllegalArgumentException if <code>component</code> or 
     * <code>behavior</code> is <code>null</code>
     * @since 2.3
     */
    public BehaviorEvent(FacesContext facesContext, UIComponent component, Behavior behavior) {
        super(facesContext, component);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_0">Return the source {@link Behavior} 
     * that sent this event.
     *
     * @since 2.0
     *
     * @return the {@code Behavior}
     */
    public Behavior getBehavior() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
