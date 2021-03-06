/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id: MockResult.java,v 1.2 2006/03/16 19:41:24 edburns Exp $
 */



package com.sun.faces.mock;


import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import javax.faces.FacesException;
import javax.servlet.jsp.jstl.sql.Result;
import org.apache.commons.beanutils.PropertyUtils;


/**
 * <p>Mock object that implements enough of
 * <code>javax.servlet.jsp.jstl.sql.ResultSet</code> to exercise the
 * <code>ResultDataModel</code> functionality.  It wraps an array of
 * JavaBeans objects that are passed to the constructor.</p>
 *
 * <p><strong>IMPLEMENTATION NOTE</strong> - The <code>SortedMap</code>
 * objects returned by <code>getRows()</code> do <strong>NOT</strong>
 * support case-insensitive key comparisons, as required by the JSTL
 * specification.  Therefore, key values in value reference expressions
 * will be matched case sensitively in unit tests.</p>
 */

public class MockResult implements Result {


    // ------------------------------------------------------------ Constructors


    /**
     * <p>Construct a new <code>MockResult</code> instance wrapping the
     * specified array of beans.</p>
     *
     * @param beans Array of beans representing the content of the result set
     */
    public MockResult(Object beans[]) {

        if (beans == null) {
            throw new NullPointerException();
        }
        this.beans = beans;

    }


    // ------------------------------------------------------ Instance Variables


    // Array of beans representing our underlying data
    private Object beans[] = null;


    // ----------------------------------------------------- Implemented Methods


    public SortedMap[] getRows() {

        TreeMap results[] = new TreeMap[beans.length];
        for (int i = 0; i < results.length; i++) {
            try {
                results[i] = new TreeMap(PropertyUtils.describe(beans[i]));
            } catch (Exception e) {
                throw new FacesException(e);
            }
        }
        return (results);

    }


    public int getRowCount() {

        return (beans.length);

    }


    // --------------------------------------------------- Unimplemented Methods


    public Object[][] getRowsByIndex() {
        throw new UnsupportedOperationException();
    }


    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }


    public boolean isLimitedByMaxRows() {
        throw new UnsupportedOperationException();
    }


}
