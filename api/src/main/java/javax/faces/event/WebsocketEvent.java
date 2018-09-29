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

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.event.Observes;
import javax.faces.push.Push;
import javax.inject.Qualifier;
import javax.websocket.CloseReason.CloseCode;

/**
 * <p class="changed_added_2_3">
 * This web socket event will be fired when a new <code>&lt;f:websocket&gt;</code> has been
 * <code>&#64;</code>{@link Opened} or <code>&#64;</code>{@link Closed}. An application scoped CDI bean can
 * <code>&#64;</code>{@link Observes} them.
 * <p>
 * For detailed usage instructions, see <code>&#64;</code>{@link Push} javadoc.
 *
 * @see Push
 * @see Opened
 * @see Closed
 * @since 2.3
 */
public final class WebsocketEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    public WebsocketEvent(String channel, Serializable user, CloseCode code) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Returns the <code>&lt;f:websocket channel&gt;</code>.
     * @return The web socket channel name.
     */
    public String getChannel() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Returns the <code>&lt;f:websocket user&gt;</code>, if any.
     * @param <S> The generic type of the user identifier.
     * @return The web socket user identifier, if any.
     * @throws ClassCastException When <code>S</code> is of wrong type.
     */
    @SuppressWarnings("unchecked")
    public <S extends Serializable> S getUser() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Returns the close code.
     * If this returns <code>null</code>, then it was {@link Opened}.
     * If this returns non-<code>null</code>, then it was {@link Closed}.
     * @return The close code.
     */
    public CloseCode getCloseCode() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_3">
     * Indicates that a <code>&lt;f:websocket&gt;</code> has opened.
     * <p>
     * For detailed usage instructions, see <code>&#64;</code>{@link Push} javadoc.
     *
     * @see Push
     * @since 2.3
     */
    @Qualifier
    @Target(PARAMETER)
    @Retention(RUNTIME)
    @Documented
    public @interface Opened {
        //
    }

    /**
     * <p class="changed_added_2_3">
     * Indicates that a <code>&lt;f:websocket&gt;</code> has closed.
     * <p>
     * For detailed usage instructions, see <code>&#64;</code>{@link Push} javadoc.
     *
     * @see Push
     * @since 2.3
     */
    @Qualifier
    @Target(PARAMETER)
    @Retention(RUNTIME)
    @Documented
    public @interface Closed {
        //
    }

}
