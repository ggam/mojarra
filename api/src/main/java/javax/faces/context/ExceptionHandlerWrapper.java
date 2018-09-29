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

import javax.faces.FacesException;
import javax.faces.FacesWrapper;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.SystemEvent;

/**
 * <p><span class="changed_modified_2_3">Provides</span>
 * a simple implementation of {@link ExceptionHandler} that can
 * be subclassed by developers wishing to provide specialized behavior
 * to an existing {@link ExceptionHandler} instance.  The default
 * implementation of all methods is to call through to the wrapped
 * {@link ExceptionHandler} instance.</p>
 *
 * <p class="changed_added_2_3">Usage: extend this class and push the implementation being wrapped to the
 * constructor and use {@link #getWrapped} to access the instance being wrapped.</p>
 *
 * @since 2.0
 */
public abstract class ExceptionHandlerWrapper extends ExceptionHandler implements FacesWrapper<ExceptionHandler> {

    /**
     * @deprecated Use the other constructor taking the implementation being wrapped.
     */
    @Deprecated
    public ExceptionHandlerWrapper() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">If this exception handler has been decorated,
     * the implementation doing the decorating should push the implementation being wrapped to this constructor.
     * The {@link #getWrapped()} will then return the implementation being wrapped.</p>
     *
     * @param wrapped The implementation being wrapped.
     * @since 2.3
     */
    public ExceptionHandlerWrapper(ExceptionHandler wrapped) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public ExceptionHandler getWrapped() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------- Methods from ExceptionHandler


    /**
     * <p>The default behavior of this method is to
     * call {@link ExceptionHandler#getHandledExceptionQueuedEvent()}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see ExceptionHandler#getHandledExceptionQueuedEvent()
     */
    @Override
    public ExceptionQueuedEvent getHandledExceptionQueuedEvent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to
     * call {@link javax.faces.context.ExceptionHandler#handle()}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see javax.faces.context.ExceptionHandler#handle()
     */
    @Override
    public void handle() throws FacesException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to
     * call {@link javax.faces.context.ExceptionHandler#isListenerForSource(Object)}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see javax.faces.context.ExceptionHandler#isListenerForSource(Object) ()
     */
    @Override
    public boolean isListenerForSource(Object source) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to
     * call {@link javax.faces.context.ExceptionHandler#processEvent(javax.faces.event.SystemEvent)}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see javax.faces.context.ExceptionHandler#processEvent(javax.faces.event.SystemEvent)
     */
    @Override
    public void processEvent(SystemEvent event) throws AbortProcessingException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to
     * call {@link javax.faces.context.ExceptionHandler#getRootCause(Throwable)}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see javax.faces.context.ExceptionHandler#getRootCause(Throwable)
     */
    @Override
    public Throwable getRootCause(Throwable t) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to call
     * {@link ExceptionHandler#getHandledExceptionQueuedEvents()} on the wrapped
     * {@link ExceptionHandler} object.</p>
     *
     * @see ExceptionHandler#getHandledExceptionQueuedEvents()
     */
    @Override
    public Iterable<ExceptionQueuedEvent> getHandledExceptionQueuedEvents() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>The default behavior of this method is to
     * call {@link ExceptionHandler#getUnhandledExceptionQueuedEvents()}
     * on the wrapped {@link ExceptionHandler} object.</p>
     *
     * @see ExceptionHandler#getUnhandledExceptionQueuedEvents()
     */
    @Override
    public Iterable<ExceptionQueuedEvent> getUnhandledExceptionQueuedEvents() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
