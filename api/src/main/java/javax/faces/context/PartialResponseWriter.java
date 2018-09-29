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

import java.io.IOException;
import java.util.Map;

import javax.faces.component.NamingContainer;
import javax.faces.component.UIViewRoot;
import javax.faces.render.ResponseStateManager;

/**
 * <p class="changed_added_2_0"><strong>PartialResponseWriter</strong>
 * decorates an existing <code>ResponseWriter</code> to support the
 * generation of a partial response suitable for Ajax operations.
 * In addition to the markup generation methods inherited from
 * <code>javax.faces.context.ResponseWriter</code>, this class provides
 * methods for constructing the standard partial response elements.</p>
 *
 * @since 2.0
 */
public class PartialResponseWriter extends ResponseWriterWrapper {

    /**
     * <p class="changed_added_2_0">Reserved ID value to indicate
     * entire ViewRoot.</p>
     *
     * @since 2.0
     */
    public static final String RENDER_ALL_MARKER = "javax.faces.ViewRoot";

    /**
     * <p class="changed_added_2_0">Reserved ID value to indicate
     * serialized ViewState.</p>
     *
     * @since 2.0
     */
    public static final String VIEW_STATE_MARKER = ResponseStateManager.VIEW_STATE_PARAM;

    /**
     * <p class="changed_added_2_0">Create a <code>PartialResponseWriter</code>.</p>
     *
     * @param writer The writer to wrap.
     * @since 2.0
     */
    public PartialResponseWriter(ResponseWriter writer) {
        super(writer);
    }

    /**
     * <p class="changed_added_2_0">Write the start of a partial response.</p>
     * <p class="changed_added_2_3">If {@link UIViewRoot} is an instance of
     * {@link NamingContainer}, then write
     * {@link UIViewRoot#getContainerClientId(FacesContext)} as value of the
     * <code>id</code> attribute of the root element.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    @Override
    public void startDocument() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of a partial response.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    @Override
    public void endDocument() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an insert operation
     * where the contents will be inserted before the specified target node.</p>
     *
     * @param targetId ID of the node insertion should occur before
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startInsertBefore(String targetId)
            throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an insert operation
     * where the contents will be inserted after the specified target node.</p>
     *
     * @param targetId ID of the node insertion should occur after
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startInsertAfter(String targetId)
            throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of an insert operation.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void endInsert() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an update operation.</p>
     *
     * @param targetId ID of the node to be updated
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startUpdate(String targetId) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of an update operation.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void endUpdate() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write an attribute update operation.</p>
     *
     * @param targetId   ID of the node to be updated
     * @param attributes Map of attribute name/value pairs to be updated
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void updateAttributes(String targetId, Map<String, String> attributes)
            throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write a delete operation.</p>
     *
     * @param targetId ID of the node to be deleted
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void delete(String targetId) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write a redirect operation.</p>
     *
     * @param url URL to redirect to
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void redirect(String url) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an eval operation.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startEval() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of an eval operation.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void endEval() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an extension operation.</p>
     *
     * @param attributes String name/value pairs for extension element attributes
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startExtension(Map<String, String> attributes) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of an extension operation.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void endExtension() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the start of an error.</p>
     *
     * @param errorName Descriptive string for the error
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void startError(String errorName) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Write the end of an error.</p>
     *
     * @throws IOException if an input/output error occurs
     * @since 2.0
     */
    public void endError() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    private void startChangesIfNecessary() throws IOException {
         throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    private void endUpdateIfNecessary() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    private void endChangesIfNecessary() throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
