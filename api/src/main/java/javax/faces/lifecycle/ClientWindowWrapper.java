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

import java.util.Map;

import javax.faces.FacesWrapper;
import javax.faces.context.FacesContext;

/**
 * <p class="changed_added_2_2"><span class="changed_modified_2_3">Wrapper</span> for {@link ClientWindow}</p>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.2
 */
public abstract class ClientWindowWrapper extends ClientWindow implements FacesWrapper<ClientWindow> {

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public ClientWindowWrapper() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">If this client window has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     * @since 2.3
     */
    public ClientWindowWrapper(ClientWindow wrapped) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public ClientWindow getWrapped() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Map<String, String> getQueryURLParameters(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void disableClientWindowRenderMode(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void enableClientWindowRenderMode(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean isClientWindowRenderModeEnabled(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void decode(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


}
