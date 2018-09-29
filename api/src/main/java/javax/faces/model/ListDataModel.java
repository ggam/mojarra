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


import java.util.List;


/**
 * <p><strong>ListDataModel</strong> is a convenience implementation of
 * {@link DataModel} that wraps an <code>List</code> of Java objects.</p>
 */

public class ListDataModel<E> extends DataModel<E> {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Construct a new {@link ListDataModel} with no specified
     * wrapped data.</p>
     */
    public ListDataModel() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Construct a new {@link ListDataModel} wrapping the specified
     * list.</p>
     *
     * @param list List to be wrapped (if any)
     */
    public ListDataModel(List<E> list) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------------------------- Properties


    /**
     * <p>Return <code>true</code> if there is <code>wrappedData</code>
     * available, and the current value of <code>rowIndex</code> is greater
     * than or equal to zero, and less than the size of the list.  Otherwise,
     * return <code>false</code>.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row availability
     */
    @Override
    public boolean isRowAvailable() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>If there is <code>wrappedData</code> available, return the
     * length of the list.  If no <code>wrappedData</code> is available,
     * return -1.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row count
     */
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>If row data is available, return the array element at the index
     * specified by <code>rowIndex</code>.  If no wrapped data is available,
     * return <code>null</code>.</p>
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
     * @throws javax.faces.FacesException {@inheritDoc}     
     */ 
    @Override
    public int getRowIndex() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @throws javax.faces.FacesException {@inheritDoc}
     * @throws IllegalArgumentException {@inheritDoc}
     */ 
    @Override
    public void setRowIndex(int rowIndex) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public Object getWrappedData() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @throws ClassCastException if <code>data</code> is
     *  non-<code>null</code> and is not a <code>List</code>
     */
    @Override
    public void setWrappedData(Object data) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


}
