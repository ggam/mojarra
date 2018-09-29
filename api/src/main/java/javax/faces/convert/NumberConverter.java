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

package javax.faces.convert;


import javax.faces.component.UIComponent;
import javax.faces.component.PartialStateHolder;
import javax.faces.context.FacesContext;
import java.util.Locale;


/**
 * <p><span class="changed_modified_2_0_rev_a">{@link Converter}</span>
 * implementation for <code>java.lang.Number</code> values.</p>
 *
 * <p>The <code>getAsObject()</code> method parses a String into an
 * <code>java.lang.Double</code> or <code>java.lang.Long</code>, according
 * to the following algorithm:</p>
 * <ul>
 * <li>If the specified String is null, return
 * a <code>null</code>.  Otherwise, trim leading and trailing
 * whitespace before proceeding.</li>
 * <li>If the specified String - after trimming - has a zero length,
 * return <code>null</code>.</li>
 * <li>If the <code>locale</code> property is not null,
 * use that <code>Locale</code> for managing parsing.  Otherwise, use the
 * <code>Locale</code> from the <code>UIViewRoot</code>.</li>
 * <li>If a <code>pattern</code> has been specified, its syntax must conform
 * the rules specified by <code>java.text.DecimalFormat</code>.  Such
 * a pattern will be used to parse, and the <code>type</code> property
 * will be ignored.</li>
 * <li>If a <code>pattern</code> has not been specified, parsing will be based
 * on the <code>type</code> property, which expects a currency, a number,
 * or a percent.  The parse pattern for currencies, numbers, and
 * percentages is determined by calling the
 * <code>getCurrencyInstance()</code>, <code>getNumberInstance()</code>,
 * or <code>getPercentInstance()</code> method of the
 * <code>java.text.NumberFormat</code> class, passing in the selected
 * <code>Locale</code>.</li>
 * <li>If the <code>integerOnly</code> property has been set to true, only
 * the integer portion of the String will be parsed.  See the JavaDocs
 * for the <code>setParseIntegerOnly()</code> method of the
 * <code>java.text.NumberFormat</code> class for more information.</li>
 * </ul>
 * 
 * <p>The <code>getAsString()</code> method expects a value of type
 * <code>java.lang.Number</code> (or a subclass), and creates a formatted
 * String according to the following algorithm:</p>
 * <ul>
 * <li>If the specified value is null, return a zero-length String.</li>
 * <li>If the specified value is a String, return it unmodified.</li>
 * <li>If the <code>locale</code> property is not null,
 * use that <code>Locale</code> for managing formatting.  Otherwise, use the
 * <code>Locale</code> from the <code>FacesContext</code>.</li>
 * <li>If a <code>pattern</code> has been specified, its syntax must conform
 * the rules specified by <code>java.text.DecimalFormat</code>.  Such
 * a pattern will be used to format, and the <code>type</code> property
 * (along with related formatting options described in the next paragraph)
 * will be ignored.</li>
 * <li>If a <code>pattern</code> has not been specified, formatting will be
 * based on the <code>type</code> property, which formats the value as a
 * currency, a number, or a percent.  The format pattern for currencies,
 * numbers, and percentages is determined by calling the
 * percentages is determined by calling the
 * <code>getCurrencyInstance()</code>, <code>getNumberInstance()</code>,
 * or <code>getPercentInstance()</code> method of the
 * <code>java.text.NumberFormat</code> class, passing in the selected
 * <code>Locale</code>.  In addition, the following properties will be
 * applied to the format pattern, if specified:
 * <ul>
 * <li>If the <code>groupingUsed</code> property is <code>true</code>, the
 * <code>setGroupingUsed(true)</code> method on the corresponding
 * <code>NumberFormat</code> instance will be called.</li>
 * <li>The minimum and maximum number of digits in the integer and
 * fractional portions of the result will be configured based on
 * any values set for the <code>maxFractionDigits</code>,
 * <code>maxIntegerDigits</code>, <code>minFractionDigits</code>,
 * and <code>minIntegerDigits</code> properties.</li>
 * <li>If the type is set to <code>currency</code>, it is also possible
 * to configure the currency symbol to be used, using either the
 * <code>currencyCode</code> or <code>currencySymbol</code> properties.
 * If both are set, the value for <code>currencyCode</code> takes
 * precedence on a JDK 1.4 (or later) JVM; otherwise, the value
 * for <code>currencySymbol</code> takes precedence.</li>
 * </ul></li>
 * </ul>
 */

public class NumberConverter implements Converter, PartialStateHolder {

    // ------------------------------------------------------ Manifest Constants


    /**
     * <p>The standard converter id for this converter.</p>
     */
    public static final String CONVERTER_ID = "javax.faces.Number";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Number</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String CURRENCY_ID =
         "javax.faces.converter.NumberConverter.CURRENCY";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Number</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String NUMBER_ID =
         "javax.faces.converter.NumberConverter.NUMBER";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Number</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String PATTERN_ID =
         "javax.faces.converter.NumberConverter.PATTERN";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Number</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String PERCENT_ID =
         "javax.faces.converter.NumberConverter.PERCENT";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion of the <code>Number</code> value to
     * <code>String</code> fails.   The message format string for this message
     * may optionally include the following placeholders:
     * <ul>
     * <li><code>{0}</code> relaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String STRING_ID =
         "javax.faces.converter.STRING";

    // -------------------------------------------------------------- Properties


    /**
     * <p>Return the ISO 4217 currency code used by <code>getAsString()</code>
     * with a <code>type</code> of <code>currency</code>.  If not set,
     * the value used will be based on the formatting <code>Locale</code>.</p>
     *
     * @return the currency code
     */
    public String getCurrencyCode() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the ISO 4217 currency code used by <code>getAsString()</code>
     * with a <code>type</code> of <code>currency</code>.</p>
     *
     * @param currencyCode The new currency code
     */
    public void setCurrencyCode(String currencyCode) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the currency symbol used by <code>getAsString()</code>
     * with a <code>type</code> of <code>currency</code>.  If not set,
     * the value used will be based on the formatting <code>Locale</code>.</p>
     * 
     * @return the currency symbol
     */
    public String getCurrencySymbol() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the currency symbol used by <code>getAsString()</code>
     * with a <code>type</code> of <code>currency</code>.</p>
     *
     * @param currencySymbol The new currency symbol
     */
    public void setCurrencySymbol(String currencySymbol) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return <code>true</code> if <code>getAsString</code> should include
     * grouping separators if necessary.  If not modified, the default value
     * is <code>true</code>.</p>
     *
     * @return whether or not grouping is used
     */
    public boolean isGroupingUsed() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the flag indicating whether <code>getAsString()</code> should
     * include grouping separators if necessary.</p>
     *
     * @param groupingUsed The new grouping used flag
     */
    public void setGroupingUsed(boolean groupingUsed) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return <code>true</code> if only the integer portion of the given
     * value should be returned from <code>getAsObject()</code>.  If not
     * modified, the default value is <code>false</code>.</p>
     * 
     * @return whether or not this is integer only
     */
    public boolean isIntegerOnly() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set to <code>true</code> if only the integer portion of the given
     * value should be returned from <code>getAsObject()</code>.</p>
     *
     * @param integerOnly The new integer-only flag
     */
    public void setIntegerOnly(boolean integerOnly) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the maximum number of digits <code>getAsString()</code> should
     * render in the fraction portion of the result.</p>
     *
     * @return the maximum fraction digits
     */
    public int getMaxFractionDigits() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the maximum number of digits <code>getAsString()</code> should
     * render in the fraction portion of the result.  If not set, the number of
     * digits depends on the value being converted.</p>
     *
     * @param maxFractionDigits The new limit
     */
    public void setMaxFractionDigits(int maxFractionDigits) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the maximum number of digits <code>getAsString()</code> should
     * render in the integer portion of the result.</p>
     *
     * @return the max integer digits
     */
    public int getMaxIntegerDigits() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the maximum number of digits <code>getAsString()</code> should
     * render in the integer portion of the result.  If not set, the number of
     * digits depends on the value being converted.</p>
     *
     * @param maxIntegerDigits The new limit
     */
    public void setMaxIntegerDigits(int maxIntegerDigits) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the minimum number of digits <code>getAsString()</code> should
     * render in the fraction portion of the result.</p>
     * 
     * @return the min fraction digits
     */
    public int getMinFractionDigits() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the minimum number of digits <code>getAsString()</code> should
     * render in the fraction portion of the result.  If not set, the number of
     * digits depends on the value being converted.</p>
     *
     * @param minFractionDigits The new limit
     */
    public void setMinFractionDigits(int minFractionDigits) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the minimum number of digits <code>getAsString()</code> should
     * render in the integer portion of the result.</p>
     *
     * @return the minimum integer digits
     */
    public int getMinIntegerDigits() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the minimum number of digits <code>getAsString()</code> should
     * render in the integer portion of the result.  If not set, the number of
     * digits depends on the value being converted.</p>
     *
     * @param minIntegerDigits The new limit
     */
    public void setMinIntegerDigits(int minIntegerDigits) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the <code>Locale</code> to be used when parsing numbers.
     * If this value is <code>null</code>, the <code>Locale</code> stored
     * in the {@link javax.faces.component.UIViewRoot} for the current request
     * will be utilized.</p>
     *
     * @return the {@code Locale} for this converter
     */
    public Locale getLocale() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the <code>Locale</code> to be used when parsing numbers.
     * If set to <code>null</code>, the <code>Locale</code> stored in the
     * {@link javax.faces.component.UIViewRoot} for the current request
     * will be utilized.</p>
     *
     * @param locale The new <code>Locale</code> (or <code>null</code>)
     */
    public void setLocale(Locale locale) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the format pattern to be used when formatting and
     * parsing numbers.</p>
     *
     * @return the pattern
     */
    public String getPattern() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the format pattern to be used when formatting and parsing
     * numbers.  Valid values are those supported by
     * <code>java.text.DecimalFormat</code>.
     * An invalid value will cause a {@link ConverterException} when
     * <code>getAsObject()</code> or <code>getAsString()</code> is called.</p>
     *
     * @param pattern The new format pattern
     */
    public void setPattern(String pattern) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the number type to be used when formatting and parsing numbers.
     * If not modified, the default type is <code>number</code>.</p>
     *
     * @return the type
     */
    public String getType() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the number type to be used when formatting and parsing numbers.
     * Valid values are <code>currency</code>, <code>number</code>, or
     * <code>percent</code>.
     * An invalid value will cause a {@link ConverterException} when
     * <code>getAsObject()</code> or <code>getAsString()</code> is called.</p>
     *
     * @param type The new number style
     */
    public void setType(String type) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ------------------------------------------------------- Converter Methods

    /**
     * @throws ConverterException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
                              String value) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws ConverterException   {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component,
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
    public void setTransient(boolean transientFlag) {
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
