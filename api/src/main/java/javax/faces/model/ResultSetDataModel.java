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


import java.sql.ResultSet;
import java.util.Map;

import javax.faces.FacesException;


/**
 * <p><strong>ResultSetDataModel</strong> is a convenience implementation of
 * {@link DataModel} that wraps a <code>ResultSet</code> of Java objects.
 * Note that the specified <code>ResultSet</code> <strong>MUST</strong>
 * be scrollable.  In addition, if input components (that will be updating
 * model values) reference this object in value binding expressions, the
 * specified <code>ResultSet</code> <strong>MUST</strong> be updatable.</p>
 */

public class ResultSetDataModel extends DataModel<Map<String,Object>> {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Construct a new {@link ResultSetDataModel} with no specified
     * wrapped data.</p>
     */
    public ResultSetDataModel() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Construct a new {@link ResultSetDataModel} wrapping the specified
     * <code>ResultSet</code>.</p>
     *
     * @param resultSet <code>ResultSet</code> to be wrapped (if any)
     */
    public ResultSetDataModel(ResultSet resultSet) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------------------------- Properties


    /**
     * <p>Return <code>true</code> if there is <code>wrappedData</code>
     * available, and the result of calling <code>absolute()</code> on the
     * underlying <code>ResultSet</code>, passing the current value of
     * <code>rowIndex</code> plus one (to account for the fact that
     * <code>ResultSet</code> uses one-relative indexing), returns
     * <code>true</code>.  Otherwise, return <code>false</code>.</p>
     *
     * @throws FacesException if an error occurs getting the row availability
     */ 
    @Override
    public boolean isRowAvailable() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return -1, since <code>ResultSet</code> does not provide a
     * standard way to determine the number of available rows without
     * scrolling through the entire <code>ResultSet</code>, and this can
     * be very expensive if the number of rows is large.</p>
     *
     * @throws FacesException if an error occurs getting the row count
     */
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>If row data is available, return a <code>Map</code> representing
     * the values of the columns for the row specified by <code>rowIndex</code>,
     * keyed by the corresponding column names.  If no wrapped data is
     * available, return <code>null</code>.</p>
     *
     * <p>If a non-<code>null</code> <code>Map</code> is returned, its behavior
     * must correspond to the contract for a mutable <code>Map</code> as
     * described in the JavaDocs for <code>AbstractMap</code>, with the
     * following exceptions and specialized behavior:</p>
     * <ul>

     * <li>The <code>Map</code>, and any supporting objects it returns,
     *     must perform all column name comparisons in a
     *     case-insensitive manner.  This case-insensitivity must be
     *     implemented using a case-insensitive <code>Comparator</code>,
     *     such as
     *     <code>String.CASE_INSENSITIVE_ORDER</code>.</li>

     * <li>The following methods must throw
     *     <code>UnsupportedOperationException</code>:  <code>clear()</code>,
     *     <code>remove()</code>.</li>
     * <li>The <code>entrySet()</code> method must return a <code>Set</code>
     *     that has the following behavior:
     *     <ul>
     *     <li>Throw <code>UnsupportedOperationException</code> for any attempt
     *         to add or remove entries from the <code>Set</code>, either
     *         directly or indirectly through an <code>Iterator</code>
     *         returned by the <code>Set</code>.</li>
     *     <li>Updates to the <code>value</code> of an entry in this
     *         <code>set</code> must write through to the corresponding
     *         column value in the underlying <code>ResultSet</code>.</li>
     *     </ul></li>
     * <li>The <code>keySet()</code> method must return a <code>Set</code>
     *     that throws <code>UnsupportedOperationException</code> on any
     *     attempt to add or remove keys, either directly or through an
     *     <code>Iterator</code> returned by the <code>Set</code>.</li>
     * <li>The <code>put()</code> method must throw
     *     <code>IllegalArgumentException</code> if a key value for which
     *     <code>containsKey()</code> returns <code>false</code> is
     *     specified.  However, if a key already present in the <code>Map</code>
     *     is specified, the specified value must write through to the
     *     corresponding column value in the underlying <code>ResultSet</code>.
     *     </li>
     * <li>The <code>values()</code> method must return a
     *     <code>Collection</code> that throws
     *     <code>UnsupportedOperationException</code> on any attempt to add
     *     or remove values, either directly or through an <code>Iterator</code>
     *     returned by the <code>Collection</code>.</li>
     * </ul>
     *
     * @throws FacesException if an error occurs getting the row data
     * @throws IllegalArgumentException if now row data is available
     *  at the currently specified row index
     */ 
    @Override
    public Map<String,Object> getRowData() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @throws FacesException {@inheritDoc}     
     */ 
    @Override
    public int getRowIndex() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * @throws FacesException {@inheritDoc}
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
