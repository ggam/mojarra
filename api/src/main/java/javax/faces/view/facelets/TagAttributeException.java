/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright 2005-2007 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.faces.view.facelets;

/**
 * <p class="changed_added_2_0">An Exception caused by a {@link
 * TagAttribute}</p>
 *
 * @since 2.0
 */
public final class TagAttributeException extends FaceletException {

    /**
     * Stores the serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param attr the {@link TagAttribute}.
     */
    public TagAttributeException(TagAttribute attr) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     * 
     * @param attr the {@link TagAttribute}.
     * @param message the message.
     */
    public TagAttributeException(TagAttribute attr, String message) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     * 
     * @param attr the {@link TagAttribute}.
     * @param cause the cause.
     */
    public TagAttributeException(TagAttribute attr, Throwable cause) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     * 
     * @param attr the {@link TagAttribute}.
     * @param message the message.
     * @param cause the cause.
     */
    public TagAttributeException(TagAttribute attr, String message,
            Throwable cause) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     *
     * @param tag the {@link Tag}.
     * @param attr the {@link TagAttribute}.
     */
    public TagAttributeException(Tag tag, TagAttribute attr) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     * 
     * @param tag the {@link Tag}.
     * @param attr the {@link TagAttribute}.
     * @param message the message.
     */
    public TagAttributeException(Tag tag, TagAttribute attr, String message) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     * 
     * @param tag the {@link Tag}.
     * @param attr the {@link TagAttribute}.
     * @param cause the cause.
     */
    public TagAttributeException(Tag tag, TagAttribute attr, Throwable cause) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * Constructor.
     *
     * @param tag the {@link Tag}.
     * @param attr the {@link TagAttribute}.
     * @param message the message.
     * @param cause the cause.
     */
    public TagAttributeException(Tag tag, TagAttribute attr, String message,
            Throwable cause) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
