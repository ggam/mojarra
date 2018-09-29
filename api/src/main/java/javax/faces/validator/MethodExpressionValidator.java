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

import javax.el.MethodExpression;
import javax.faces.component.StateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * <p><strong
 * class="changed_modified_2_0_rev_a">MethodExpressionValidator</strong>
 * is a {@link Validator} that wraps a {@link MethodExpression}, and it
 * performs validation by executing a method on an object identified by
 * the {@link MethodExpression}.</p>
 */

public class MethodExpressionValidator implements Validator, StateHolder {
    
    public MethodExpressionValidator() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>Construct a {@link Validator} that contains a {@link MethodExpression}.</p>
     *
     * @param methodExpression the expression to wrap
     */
    public MethodExpressionValidator(MethodExpression methodExpression) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------------- Validator Methods

    /**
     * @throws NullPointerException {@inheritDoc}
     * @throws ValidatorException   {@inheritDoc}
     */
    @Override
    public void validate(FacesContext context,
                         UIComponent component,
                         Object value) throws ValidatorException {
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

}
