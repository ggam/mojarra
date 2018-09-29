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

/**
 * <p><strong>ScalarDataModel</strong> is a convenience implementation of
 * {@link DataModel} that wraps an individual Java object.</p>
 */

public class ScalarDataModel<E> extends DataModel<E> {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Construct a new {@link ScalarDataModel} with no specified
     * wrapped data.</p>
     */
    public ScalarDataModel() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Construct a new {@link ScalarDataModel} wrapping the specified
     * scalar object.</p>
     *
     * @param scalar Scalar to be wrapped (if any)
     */
    public ScalarDataModel(E scalar) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------------------------- Properties


    /**
     * <p>Return <code>true</code> if there is <code>wrappedData</code>
     * available, and the current value of <code>rowIndex</code> is zero.
     * Otherwise, return <code>false</code>.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row availability
     */
    @Override
    public boolean isRowAvailable() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>If there is <code>wrappedData</code> available, return 1.
     * If no <code>wrappedData</code> is available, return -1.</p>
     *
     * @throws javax.faces.FacesException if an error occurs getting the row count
     */
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>If wrapped data is available, return the wrapped data instance.
     * Otherwise, return <code>null</code>.</p>
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
     * @throws ClassCastException {@inheritDoc}
     */
    @Override
    public void setWrappedData(Object data) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


}
