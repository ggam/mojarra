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

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * <p class="changed_added_2_0">When an instance of this event is passed
 * to {@link SystemEventListener#processEvent} or {@link
 * ComponentSystemEventListener#processEvent}, the listener
 * implementation may assume that the <code>source</code> of this event
 * instance is the {@link UIViewRoot} instance that is about to be
 * rendered.</p>

 * <div class="changed_added_2_0">
 *
 * <p>It is valid for a listener for this event to change the {@link
 * UIViewRoot} in the current {@link javax.faces.context.FacesContext},
 * but the listener must ensure that the new <code>UIViewRoot</code> was
 * created with a call to {@link
 * javax.faces.application.ViewHandler#createView}, and that the view is
 * fully populated with the children to be traversed during render.  The
 * listener implementation may call {@link
 * javax.faces.view.ViewDeclarationLanguage#buildView} to populate
 * the <code>UIViewRoot</code>.</p>
 *
 * </div>
 *
 * @since 2.0
 */
public class PreRenderViewEvent extends ComponentSystemEvent {


    // ------------------------------------------------------------ Constructors


    private static final long serialVersionUID = -781238104491250220L;

    /**

     * <p class="changed_added_2_0">Instantiate a new
     * <code>PreRenderViewEvent</code> that indicates the argument
     * <code>root</code> is about to be rendered.</p>

     * @param root the <code>UIViewRoot</code> that is about to be
     * rendered.

     * @throws IllegalArgumentException if the argument is <code>null</code>.
     */
    public PreRenderViewEvent(UIViewRoot root) {
        super(root);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_3">Instantiate a new
     * <code>PreRenderViewEvent</code> that indicates the argument
     * <code>root</code> is about to be rendered.</p>
     * 
     * @param facesContext the Faces context.
     * @param root the <code>UIViewRoot</code> that is about to be
     * rendered.
     * @throws IllegalArgumentException if the argument is <code>null</code>.
     */
    public PreRenderViewEvent(FacesContext facesContext, UIViewRoot root) {
        super(facesContext, root);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
