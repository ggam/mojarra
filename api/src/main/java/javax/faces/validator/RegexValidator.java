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

package javax.faces.validator;

import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.PartialStateHolder;

/**
 * <p class="changed_added_2_0"><span
 * class="changed_modified_2_0_rev_a">A Validator</span> that checks
 * against a Regular Expression (which is the pattern property).  The
 * pattern must resolve to a String that follows the java.util.regex
 * standards.</p>
 * @since 2.0
 */
public class RegexValidator implements Validator, PartialStateHolder {

    /**
     * <p>The standard converter id for this converter.</p>
     */
    public static final String VALIDATOR_ID = "javax.faces.RegularExpression";

    /**
     * <p>The message identifier of the {@link
     * javax.faces.application.FacesMessage} to be created if the value
     * returned from {@link #getPattern} is <code>null</code> or the
     * empty String.</p>
     */
    public static final String PATTERN_NOT_SET_MESSAGE_ID =
         "javax.faces.validator.RegexValidator.PATTERN_NOT_SET";

    /**
     * <p>The message identifier of the {@link
     * javax.faces.application.FacesMessage} to be created if the act of
     * matching the value against the pattern returned from {@link
     * #getPattern} fails because the value does not match the
     * pattern.</p>
     */
    public static final String NOT_MATCHED_MESSAGE_ID =
         "javax.faces.validator.RegexValidator.NOT_MATCHED";

    /**
     * <p>The message identifier of the {@link
     * javax.faces.application.FacesMessage} to be created if the act of
     * matching the value against the pattern returned from {@link
     * #getPattern} fails because of a
     * <code>PatternSyntaxException</code>.</p>
     */
    public static final String MATCH_EXCEPTION_MESSAGE_ID =
         "javax.faces.validator.RegexValidator.MATCH_EXCEPTION";


    /**
     * <p>The Regular Expression property to validate against.</p>
     *
     * @param pattern a regular expression pattern
     */
    public void setPattern(String pattern) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Return the <code>ValueExpression</code> that yields the
     * regular expression pattern when evaluated.</p>
     *
     * @return the pattern
     */

    public String getPattern() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**

     * <p>Validate a String against a regular expression pattern.  The
     * full regex pattern must be matched in order to pass the
     * validation.</p>

     * @param context {@inheritDoc}
     * @param component {@inheritDoc}
     * @param value {@inheritDoc}

     * @throws NullPointerException {@inheritDoc}
     * @throws ValidatorException   {@inheritDoc}

     */
    @Override
    public void validate(FacesContext context,
                         UIComponent component,
                         Object value) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    // ----------------------------------------------------- StateHolder Methods


    @Override
    public Object saveState(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public void restoreState(FacesContext context, Object state) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean isTransient() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public void setTransient(boolean transientValue) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public void markInitialState() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean initialStateMarked() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void clearInitialState() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
