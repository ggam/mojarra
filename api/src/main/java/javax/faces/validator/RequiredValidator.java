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

/**
 * <p class="changed_added_2_0">A Validator that checks for an empty
 * value in the same way that UIInput checks for a value. In fact, this validator
 * is equivalent to setting the required attribute on the input component to true.</p>
 *
 * @since 2.0
 */
public class RequiredValidator implements Validator {

    /**
     * <p>The standard converter id for this converter.</p>
     */
    public static final String VALIDATOR_ID = "javax.faces.Required";

    /**

     * <p>Verify that the converted object value is not null.</p>

     * @param context {@inheritDoc}
     * @param component {@inheritDoc}
     * @param value {@inheritDoc}

     * @throws ValidatorException   {@inheritDoc}

     */
    @Override
    public void validate(FacesContext context,
                         UIComponent component,
                         Object value) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
