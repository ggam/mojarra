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

import javax.el.MethodExpression;
import javax.el.MethodNotFoundException;
import javax.faces.context.FacesContext;
import javax.faces.component.StateHolder;

/**
 * <p><strong><span class="changed_modified_2_0
 * changed_modified_2_0_rev_a
 * changed_modified_2_2">MethodExpressionValueChangeListener</span></strong>
 * is a {@link ValueChangeListener} that wraps a {@link
 * MethodExpression}. When it receives a {@link ValueChangeEvent}, it
 * executes a method on an object identified by the {@link
 * MethodExpression}.</p>
 */

public class MethodExpressionValueChangeListener implements ValueChangeListener,
    StateHolder {

    public MethodExpressionValueChangeListener() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

   /**
     * <p><span class="changed_modified_2_0">Construct</span> a {@link
     * ValueChangeListener} that contains a {@link
     * MethodExpression}.<span
     * class="changed_added_2_0">To accommodate method expression targets
     * that take no arguments instead of taking a {@link
     * ValueChangeEvent} argument</span>, the implementation of this
     * class must take the argument <code>methodExpressionOneArg</code>,
     * extract its expression string, and create another
     * <code>MethodExpression</code> whose expected param types match
     * those of a zero argument method.  The usage requirements for both
     * of these <code>MethodExpression</code> instances are described in
     * {@link #processValueChange}.</p>
     *
     * @param methodExpressionOneArg a <code>MethodExpression</code>
     * that points to a method that returns <code>void</code> and takes
     * a single argument of type {@link ValueChangeEvent}.
     */
    public MethodExpressionValueChangeListener(MethodExpression methodExpressionOneArg) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

   /**
     * <p>Construct a {@link ValueChangeListener} that contains a {@link MethodExpression}.</p>
     *
     * @param methodExpressionOneArg a method expression that takes one argument
     * @param methodExpressionZeroArg a method expression that takes zero arguments
     */
    public MethodExpressionValueChangeListener(MethodExpression methodExpressionOneArg,
            MethodExpression methodExpressionZeroArg) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------------- Event Method

    /**
     * <p><span
     * class="changed_modified_2_0 changed_modified_2_2">Call</span>
     * through to the {@link MethodExpression} passed in our
     * constructor.  <span class="changed_added_2_0">First, try to
     * invoke the <code>MethodExpression</code> passed to the
     * constructor of this instance, passing the argument {@link
     * ValueChangeEvent} as the argument.  If a {@link
     * MethodNotFoundException} is thrown, call to the zero argument
     * <code>MethodExpression</code> derived from the
     * <code>MethodExpression</code> passed to the constructor of this
     * instance.  <span class="changed_deleted_2_2">If that fails
     * for any reason, throw an {@link AbortProcessingException},
     * including the cause of the failure.</span></span></p>
     * 
     * @throws NullPointerException if the argument valueChangeEvent is null.
     * @throws AbortProcessingException {@inheritDoc}     
     */ 
    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------ Methods from StateHolder


    /**
     * <p class="changed_modified_2_0">Both {@link MethodExpression}
     * instances described in the constructor must be saved.</p>
     */
    @Override
    public Object saveState(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p class="changed_modified_2_0">Both {@link MethodExpression}
     * instances described in the constructor must be restored.</p>
     */
    @Override
    public void restoreState(FacesContext context, Object state) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public boolean isTransient() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    @Override
    public void setTransient(boolean newTransientValue) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
}
