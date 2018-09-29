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

import javax.faces.application.FacesMessage;
import javax.faces.component.PartialStateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolation;
import javax.validation.MessageInterpolator;
import javax.validation.ValidatorContext;
import javax.validation.ValidatorFactory;


/**
 * <p class="changed_added_2_0"><span
 * class="changed_modified_2_0_rev_a changed_modified_2_3">A Validator</span> that delegates
 * validation of the bean property to the Bean Validation API.</p>
 * @since 2.0
 */
public class BeanValidator implements Validator, PartialStateHolder {

    /**
     * <p class="changed_added_2_0">The standard validator id for this
     * validator, as defined by the JSF specification.</p>
     */
    public static final String VALIDATOR_ID = "javax.faces.Bean";
    
    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * a constraint failure is found.  The message format string for
     * this message may optionally include the following placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the interpolated message from Bean Validation.</li>
     * <li><code>{1}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     * <p>The message format string provided by the default implementation should be a the placeholder {0},
     * thus fully delegating the message handling to Bean Validation. A developer can override this message
     * format string to make it conform to other JSF validator messages (i.e., by including the component label)</p>
     */
    public static final String MESSAGE_ID = "javax.faces.validator.BeanValidator.MESSAGE";

    /**
     * <p class="changed_added_2_0">The name of the servlet context
     * attribute which holds the object used by JSF to obtain Validator
     * instances.  If the servlet context attribute is missing or
     * contains a null value, JSF is free to use this servlet context
     * attribute to store the ValidatorFactory bootstrapped by this
     * validator.</p>
     */
    public static final String VALIDATOR_FACTORY_KEY = "javax.faces.validator.beanValidator.ValidatorFactory";

    /**
     * <p class="changed_added_2_0">The delimiter that is used to
     * separate the list of fully-qualified group names as strings.</p>
     */
    public static final String VALIDATION_GROUPS_DELIMITER = ",";

    /**
     * <p class="changed_added_2_0">The regular expression pattern that
     * identifies an empty list of validation groups.</p>
     */
    public static final String EMPTY_VALIDATION_GROUPS_PATTERN = "^[\\W" + VALIDATION_GROUPS_DELIMITER + "]*$";
    
    /**
     * <p class="changed_added_2_0">If this param is defined, and
     * calling <code>toLowerCase().equals(&#8220;true&#8221;)</code> on a 
     * <code>String</code> representation of its value returns 
     * <code>true</code>, the runtime must not automatically add the
     * validator with validator-id equal to the value of the symbolic
     * constant {@link #VALIDATOR_ID} to the list of default validators.  
     * Setting this parameter to <code>true</code> will have the effect 
     * of disabling the automatic installation of Bean Validation to 
     * every input component in every view in the application, though 
     * manual installation is still possible.</p>
     * 
     */
    public static final String DISABLE_DEFAULT_BEAN_VALIDATOR_PARAM_NAME =
            "javax.faces.validator.DISABLE_DEFAULT_BEAN_VALIDATOR";
    
    /**
     * <p class="changed_added_2_3">If this param is set, and calling 
     * toLowerCase().equals("true") on a
     * String representation of its value returns {@code true} take
     * the additional actions relating to <code>&lt;validateWholeBean /&gt;</code>
     * specified in {@link #validate}.</p>
     * 
     * @since 2.3
     */
    public static final String ENABLE_VALIDATE_WHOLE_BEAN_PARAM_NAME = 
            "javax.faces.validator.ENABLE_VALIDATE_WHOLE_BEAN";
    
    //----------------------------------------------------------- multi-field validation
    
    /**
     * <p class="changed_added_2_0">A comma-separated list of validation
     * groups which are used to filter which validations get checked by
     * this validator. If the validationGroupsArray attribute is omitted or
     * is empty, the validation groups will be inherited from the branch
     * defaults or, if there are no branch defaults, the {@link
     * javax.validation.groups.Default} group will be used.</p>
     *
     * @param validationGroups comma-separated list of validation groups
     * (string with only spaces and commas treated as null)
     */

    public void setValidationGroups(String validationGroups) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">Return the validation groups passed
     * to the Validation API when checking constraints.  If the
     * validationGroupsArray attribute is omitted or empty, the validation
     * groups will be inherited from the branch defaults, or if there
     * are no branch defaults, the {@link
     * javax.validation.groups.Default} group will be used.</p>
     * 
     * @return the value of the {@code validatinGroups} attribute.
     */
    public String getValidationGroups() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0"><span class="changed_modified_2_3">Verify</span>
     * that the value is valid according to the Bean Validation constraints.</p>
     *
     * <div class="changed_added_2_0">

     * <p>Obtain a {@link ValidatorFactory} instance by calling {@link
     * javax.validation.Validation#buildDefaultValidatorFactory}.</p>

     * <p>Let <em>validationGroupsArray</em> be a <code>Class []</code>
     * representing validator groups set on the component by the tag
     * handler for this validator.  The first search component
     * terminates the search for the validation groups value.  If no
     * such value is found use the class name of {@link
     * javax.validation.groups.Default} as the value of the validation
     * groups.</p>

     * <p>Let <em>valueExpression</em> be the return from calling {@link
     * UIComponent#getValueExpression} on the argument
     * <em>component</em>, passing the literal string
     * &#8220;value&#8221; (without the quotes) as an argument.  If this
     * application is running in an environment with a Unified EL
     * Implementation for Java EE6 or later, obtain the
     * <code>ValueReference</code> from <em>valueExpression</em> and let
     * <em>valueBaseClase</em> be the return from calling
     * <code>ValueReference.getBase()</code> and <em>valueProperty</em>
     * be the return from calling
     * <code>ValueReference.getProperty()</code>.  If an earlier version
     * of the Unified EL is present, use the appropriate methods to
     * inspect <em>valueExpression</em> and derive values for
     * <em>valueBaseClass</em> and <em>valueProperty</em>.</p>

     * <p>If no <code>ValueReference</code> can be obtained, take no
     * action and return.</p>

     * <p>If <code>ValueReference.getBase()</code> return
     * <code>null</code>, take no action and return.</p>

     * <p>Obtain the {@link ValidatorContext} from the {@link
     * ValidatorFactory}.</p>

     * <p>Decorate the {@link MessageInterpolator} returned from {@link
     * ValidatorFactory#getMessageInterpolator} with one that leverages
     * the <code>Locale</code> returned from {@link
     * javax.faces.component.UIViewRoot#getLocale}, and store it in the
     * <code>ValidatorContext</code> using {@link
     * ValidatorContext#messageInterpolator}.</p>

     * <p>Obtain the {@link javax.validation.Validator} instance from
     * the <code>validatorContext</code>.</p>

     * <p>Obtain a <code>javax.validation.BeanDescriptor</code> from the
     * <code>javax.validation.Validator</code>.  If
     * <code>hasConstraints()</code> on the <code>BeanDescriptor</code>
     * returns false, take no action and return.  Otherwise proceed.</p>

     * <p>Call {@link javax.validation.Validator#validateValue}, passing
     * <em>valueBaseClass</em>, <em>valueProperty</em>, the
     * <em>value</em> argument, and <em>validatorGroupsArray</em> as
     * arguments.</p>

     * <p>If the returned <code>Set&lt;{@link
     * ConstraintViolation}&gt;</code> is non-empty, for each element in
     * the <code>Set</code>, create a {@link FacesMessage} where the
     * summary and detail are the return from calling {@link
     * ConstraintViolation#getMessage}.  Capture all such
     * <code>FacesMessage</code> instances into a
     * <code>Collection</code> and pass them to {@link
     * ValidatorException#ValidatorException(java.util.Collection)}.
     * <span class="changed_added_2_3">If the {@link
     * #ENABLE_VALIDATE_WHOLE_BEAN_PARAM_NAME} application parameter is
     * enabled and this {@code Validator} instance has validation groups
     * other than or in addition to the {@code Default} group, record
     * the fact that this field failed validation so that any 
     * <code>&lt;f:validateWholeBean /&gt;</code> component later in the tree
     * is able to skip class-level validation for the bean for which this 
     * particular field is a property.  Regardless of
     * whether or not {@link #ENABLE_VALIDATE_WHOLE_BEAN_PARAM_NAME} is
     * set, throw the new exception.</span></p>
     * 
     * <p class="changed_added_2_3">If the returned {@code Set} is
     * empty, the {@link #ENABLE_VALIDATE_WHOLE_BEAN_PARAM_NAME}
     * application parameter is enabled and this {@code Validator}
     * instance has validation groups other than or in addition to the
     * {@code Default} group, record the fact that this field passed
     * validation so that any <code>&lt;f:validateWholeBean /&gt;</code> component later in the tree
     * is able to allow class-level validation for the bean for which this particular
     * field is a property.</p>
     * 
     * </div>
     * 
     * @param context {@inheritDoc}
     * @param component {@inheritDoc}
     * @param value {@inheritDoc}
     *
     * @throws ValidatorException   {@inheritDoc}
     */
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {
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

    @Override
    public boolean isTransient() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void setTransient(boolean transientValue) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
