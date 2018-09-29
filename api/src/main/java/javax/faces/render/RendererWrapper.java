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

package javax.faces.render;

import java.io.IOException;

import javax.faces.FacesWrapper;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.ConverterException;


/**
 * <p class="changed_added_2_2"><span class="changed_modified_2_3">Provides</span> a simple implementation of
 * {@link Renderer} that can be subclassed by developers wishing to
 * provide specialized behavior to an existing {@link Renderer}
 * instance.  The default implementation of all methods is to call
 * through to the wrapped {@link Renderer} instance.</p>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.2
 */

public abstract class RendererWrapper extends Renderer implements FacesWrapper<Renderer> {

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public RendererWrapper() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">If this renderer has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     * @since 2.3
     */
    public RendererWrapper(Renderer wrapped) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Renderer getWrapped() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public String convertClientId(FacesContext context, String clientId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Object getConvertedValue(FacesContext context, UIComponent component, Object submittedValue) throws ConverterException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void decode(FacesContext context, UIComponent component) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void encodeChildren(FacesContext context, UIComponent component) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean getRendersChildren() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
