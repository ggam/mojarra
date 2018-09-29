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

package javax.faces.model;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.faces.model.DataModel;
import javax.faces.model.DataModelEvent;
import javax.faces.model.DataModelListener;
import javax.faces.model.ListDataModel;

/**
 * <p class="changed_added_2_3"><strong>IterableDataModel</strong> is an
 * implementation of {@link DataModel} that wraps an <code>Iterable</code>.</p>
 * 
 * <p>
 * This can be used to encapsulate nearly every collection type, including 
 * {@link Collection} derived types such as {@link List} and {@link Set}. 
 * As such this specific DataModel can be used instead of more specific 
 * DataModels like {@link ListDataModel} and {@link CollectionDataModel}.
 *
 */
public class IterableDataModel<E> extends DataModel<E> {

    /**
     * <p>Construct a new {@link IterableDataModel} with no specified
     * wrapped data.</p>
     */
    public IterableDataModel() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Construct a new {@link IterableDataModel} wrapping the specified
     * iterable.</p>
     *
     * @param iterable Iterable to be wrapped.
     */
    public IterableDataModel(Iterable<E> iterable) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return a flag indicating whether there is <code>rowData</code>
     * available at the current <code>rowIndex</code>.  If no
     * <code>wrappedData</code> is available, return <code>false</code>.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row availability
     */
    @Override
    public boolean isRowAvailable() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the number of rows of data objects represented by this
     * {@link DataModel}.  If the number of rows is unknown, or no
     * <code>wrappedData</code> is available, return -1.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row count
     */
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return an object representing the data for the currenty selected
     * row index.  If no <code>wrappedData</code> is available, return
     * <code>null</code>.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row data
     * @throws IllegalArgumentException if now row data is available
     *  at the currently specified row index
     */
    @Override
    public E getRowData() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the zero-relative index of the currently selected row.  If
     * we are not currently positioned on a row, or no <code>wrappedData</code>
     * is available, return -1.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row index
     */
    @Override
    public int getRowIndex() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Set the zero-relative index of the currently selected row, or -1
     * to indicate that we are not positioned on a row.  It is
     * possible to set the row index at a value for which the underlying data
     * collection does not contain any row data.  Therefore, callers may
     * use the <code>isRowAvailable()</code> method to detect whether row data
     * will be available for use by the <code>getRowData()</code> method.</p>
     *
     * <p>If there is no <code>wrappedData</code> available when this method
     * is called, the specified <code>rowIndex</code> is stored (and may be
     * retrieved by a subsequent call to <code>getRowData()</code>), but no
     * event is sent.  Otherwise, if the currently selected row index is
     * changed by this call, a {@link DataModelEvent} will be sent to the
     * <code>rowSelected()</code> method of all registered
     * {@link DataModelListener}s.</p>
     *
     * @param rowIndex The new zero-relative index (must be non-negative)
     *
     * @throws javax.faces.FacesException if an error occurs setting the row index
     * @throws IllegalArgumentException if <code>rowIndex</code>
     *  is less than -1
     */
    @Override
    public void setRowIndex(int rowIndex) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the object representing the data wrapped by this
     * {@link DataModel}, if any.</p>
     */
    @Override
    public Object getWrappedData() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Set the object representing the data collection wrapped by this
     * {@link DataModel}.  If the specified <code>data</code> is
     * <code>null</code>, detach this {@link DataModel} from any previously
     * wrapped data collection instead.</p>
     *
     * <p>If <code>data</code> is non-<code>null</code>, the currently selected
     * row index must be set to zero, and a {@link DataModelEvent} must be sent
     * to the <code>rowSelected()</code> method of all registered
     * {@link DataModelListener}s indicating that this row is now selected.</p>
     *
     * @param data Data collection to be wrapped, or <code>null</code> to
     *  detach from any previous data collection
     *
     * @throws ClassCastException if <code>data</code> is not of the
     *  appropriate type for this {@link DataModel} implementation
     */
    @SuppressWarnings("unchecked")
    @Override
    public void setWrappedData(Object data) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
