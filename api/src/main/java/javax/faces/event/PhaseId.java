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


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.faces.FacesException;


/**
 * <p><span class="changed_modified_2_2">Typesafe</span> enumeration of
 * the legal values that may be returned by the
 * <code>getPhaseId()</code> method of the {@link FacesEvent} interface.
 */

public class PhaseId implements Comparable {


    // ----------------------------------------------------------- Constructors


    /**
     * <p>Private constructor to disable the creation of new instances.</p>
     */
    private PhaseId(String newPhaseName) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // --------------------------------------------------------- Public Methods


    /**
     * <p>Compare this {@link PhaseId} instance to the specified one.
     * Returns a negative integer, zero, or a positive integer if this
     * object is less than, equal to, or greater than the specified object.</p>
     *
     * @param other The other object to be compared to
     */
    @Override
    public int compareTo(Object other) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the ordinal value of this {@link PhaseId} instance.</p>
     *
     * @return the ordinal
     */
    public int getOrdinal() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return a String representation of this {@link PhaseId} instance.</p>
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_2">Return the name of this phase.</p>
     * 
     * @since 2.2
     *
     * @return the name
     */

    public String getName() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">Return a <code>PhaseId</code>
     * representation of the arcument <code>phase</code>.</p>
     * 
     * @param phase the String for which the corresponding
     * <code>PhaseId</code> should be returned.
     *
     * @throws NullPointerException if argument <code>phase</code> is
     * <code>null</code>.
     *
     * @throws FacesException if the <code>PhaseId</code>
     * corresponding to the argument <code>phase</code> cannot be found.
     *
     * @since 2.2
     *
     * @return the phase id corresponding to the argument {@code phase}
     */
    
    public static PhaseId phaseIdValueOf(String phase) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------------ Create Instances


    /**
     * <p>Identifier that indicates an interest in events, no matter
     * which request processing phase is being performed.</p>
     */
    public static final PhaseId ANY_PHASE = new PhaseId("ANY");

    /**
     * <p>Identifier that indicates an interest in events queued for
     * the <em>Restore View</em> phase of the request
     * processing lifecycle.</p>
     */
    public static final PhaseId RESTORE_VIEW = new PhaseId("RESTORE_VIEW");

    /**
     * <p>Identifier that indicates an interest in events queued for
     * the <em>Apply Request Values</em> phase of the request
     * processing lifecycle.</p>
     */
    public static final PhaseId APPLY_REQUEST_VALUES = new PhaseId("APPLY_REQUEST_VALUES");

    /**
     * <p>Identifier that indicates an interest in events queued for
     * the <em>Process Validations</em> phase of the request
     * processing lifecycle.</p>
     */
    public static final PhaseId PROCESS_VALIDATIONS = new PhaseId("PROCESS_VALIDATIONS");

    /**
     * <p>Identifier that indicates an interest in events queued for
     * the <em>Update Model Values</em> phase of the request
     * processing lifecycle.</p>
     */
    public static final PhaseId UPDATE_MODEL_VALUES = new PhaseId("UPDATE_MODEL_VALUES");

    /**
     * <p>Identifier that indicates an interest in events queued for
     * the <em>Invoke Application</em> phase of the request
     * processing lifecycle.</p>
     */
    public static final PhaseId INVOKE_APPLICATION = new PhaseId("INVOKE_APPLICATION");

    /**
     * <p>Identifier for the <em>Render Response</em> phase of the
     * request processing lifecycle.</p>
     */
    public static final PhaseId RENDER_RESPONSE = new PhaseId("RENDER_RESPONSE");

    /**
     * <p>List of valid {@link PhaseId} instances, in ascending order
     * of their ordinal value.</p>
     */
    public static final List<PhaseId> VALUES =
            Collections.unmodifiableList(Arrays.asList(new PhaseId[] {ANY_PHASE, RESTORE_VIEW, APPLY_REQUEST_VALUES,
                    PROCESS_VALIDATIONS, UPDATE_MODEL_VALUES, INVOKE_APPLICATION, RENDER_RESPONSE}));

}
