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

package javax.faces.context;

import java.util.Collection;
import java.util.List;

import javax.faces.FacesWrapper;
import javax.faces.event.PhaseId;

/**
 * <p class="changed_added_2_0"><span class="changed_modified_2_2
 * changed_modified_2_3">Provides</span>
 * a simple implementation of {@link PartialViewContext} that can
 * be subclassed by developers wishing to provide specialized behavior
 * to an existing {@link PartialViewContext} instance.  The default
 * implementation of all methods is to call through to the wrapped
 * {@link ExternalContext} instance.</p>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.0
 */
public abstract class PartialViewContextWrapper extends PartialViewContext implements FacesWrapper<PartialViewContext> {


    private PartialViewContext wrapped;

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public PartialViewContextWrapper() {

    }

    /**
     * <p class="changed_added_2_3">If this partial view context has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     * @since 2.3
     */
    public PartialViewContextWrapper(PartialViewContext wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public PartialViewContext getWrapped() {
        return wrapped;
    }


    // ----------------------------------------- Methods from PartialViewContext


    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#getExecuteIds()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#getExecuteIds()
     */
    @Override
    public Collection<String> getExecuteIds() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#getRenderIds()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#getRenderIds()
     */
    @Override
    public Collection<String> getRenderIds() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">
     * The default behavior of this method is to call
     * {@link PartialViewContext#getRenderIds()}
     * on the wrapped {@link PartialViewContext} object.
     * </p>
     *
     * @see PartialViewContext#getEvalScripts()
     */
    @Override
    public List<String> getEvalScripts() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#getPartialResponseWriter()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#getPartialResponseWriter()
     */
    @Override
    public PartialResponseWriter getPartialResponseWriter() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">The default behavior of this method is to
     * call {@link PartialViewContext#setPartialRequest(boolean)}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#setPartialRequest(boolean)
     */
    @Override
    public void setPartialRequest(boolean isPartialRequest) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#isAjaxRequest()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see javax.faces.context.PartialViewContext#isAjaxRequest()
     */
    @Override
    public boolean isAjaxRequest() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#isPartialRequest()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#isPartialRequest()
     */
    @Override
    public boolean isPartialRequest() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#isExecuteAll()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#isExecuteAll()
     */
    @Override
    public boolean isExecuteAll() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#isRenderAll()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#isRenderAll()
     */
    @Override
    public boolean isRenderAll() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#isResetValues()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#isResetValues()
     */
    @Override
    public boolean isResetValues() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#setRenderAll(boolean)}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#setRenderAll(boolean)
     */
    @Override
    public void setRenderAll(boolean renderAll) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#release()}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#release()
     */
    @Override
    public void release() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>The default behavior of this method is to
     * call {@link PartialViewContext#processPartial(PhaseId)}
     * on the wrapped {@link PartialViewContext} object.</p>
     *
     * @see PartialViewContext#processPartial(PhaseId)
     */
    @Override
    public void processPartial(PhaseId phaseId) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
