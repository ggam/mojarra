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


import java.util.Locale;
import java.util.TimeZone;

import javax.faces.component.PartialStateHolder;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * <p><span class="changed_modified_2_0_rev_a changed_modified_2_3">{@link Converter}</span>
 * implementation for <code>java.util.Date</code> values.</p>
 *
 * <p>The <code>getAsObject()</code> method parses a String into a
 * <code>java.util.Date</code>, according to the following algorithm:</p>
 * <ul>
 * <li>If the specified String is null, return
 * a <code>null</code>.  Otherwise, trim leading and trailing
 * whitespace before proceeding.</li>
 * <li>If the specified String - after trimming - has a zero length,
 * return <code>null</code>.</li>
 * <li>If the <code>locale</code> property is not null,
 * use that <code>Locale</code> for managing parsing.  Otherwise, use the
 * <code>Locale</code> from the <code>UIViewRoot</code>.</li>
 *
 * <li>If a <code>pattern</code> has been specified, its syntax must
 * conform the rules specified by
 * <code>java.text.SimpleDateFormat</code> <span
 * class="changed_added_2_3">or {@code
 * java.time.format.DateTimeFormatter}.  Which of these two formatters
 * is used depends on the value of {@code type}.</span> Such a pattern
 * will be used to parse, and the <code>type</code>,
 * <code>dateStyle</code>, and <code>timeStyle</code> properties will be
 * ignored, <span class="changed_added_2_3">unless the value of {@code
 * type} is one of the {@code java.time} specific values listed in
 * {@link #setType}.  In this case, {@code DateTimeFormatter.ofPattern(String, Locale)}
 * must be called, passing the value of {@code pattern} as the first argument and 
 * the current {@code Locale} as the second argument, 
 * and this formatter must be used to parse the incoming value.</span></li>
 *
 * <li>If a <code>pattern</code> has not been specified, parsing will be
 * based on the <code>type</code> property, which expects a date value,
 * a time value, both, <span class="changed_added_2_3">or one of several
 * values specific to classes in {@code java.time} as listed in {@link
 * #setType}.</span> Any date and time values included will be parsed in
 * accordance to the styles specified by <code>dateStyle</code> and
 * <code>timeStyle</code>, respectively.</li> <li>If a
 * <code>timezone</code> has been specified, it must be passed to the
 * underlying <code>DateFormat</code> instance.  Otherwise the "GMT"
 * timezone is used.</li> <li>In all cases, parsing must be non-lenient;
 * the given string must strictly adhere to the parsing format.</li>
 * </ul>
 * 
 * <p>The <code>getAsString()</code> method expects a value of type
 * <code>java.util.Date</code> (or a subclass), and creates a formatted
 * String according to the following algorithm:</p>
 * <ul>
 * <li>If the specified value is null, return a zero-length String.</li>
 * <li>If the specified value is a String, return it unmodified.</li>
 * <li>If the <code>locale</code> property is not null,
 * use that <code>Locale</code> for managing formatting.  Otherwise, use the
 * <code>Locale</code> from the <code>UIViewRoot</code>.</li>
 * <li>If a <code>timezone</code> has been specified, it must be passed
 * to the underlying <code>DateFormat</code> instance.  Otherwise
 * the "GMT" timezone is used.</li>

 * <li>If a <code>pattern</code> has been specified, its syntax must
 * conform the rules specified by
 * <code>java.text.SimpleDateFormat</code> <span
 * class="changed_added_2_3">or {@code
 * java.time.format.DateTimeFormatter}.  Which of these two formatters
 * is used depends on the value of {@code type}.</span> Such a pattern
 * will be used to format, and the <code>type</code>,
 * <code>dateStyle</code>, and <code>timeStyle</code> properties will be
 * ignored, <span class="changed_added_2_3">unless the value of {@code
 * type} is one of the {@code java.time} specific values listed in
 * {@link #setType}.  In this case, {@code
 * DateTimeFormatter.ofPattern(String, Locale)} must be called, passing
 * the value of {@code pattern} as the first argument and the current
 * {@code Locale} as the second argument, and this formatter must be
 * used to format the outgoing value.</span></li>

 * <li>If a <code>pattern</code> has not been specified, formatting will be
 * based on the <code>type</code> property, which includes a date value,
 * a time value, both or into the formatted String.  Any date and time
 * values included will be formatted in accordance to the styles specified
 * by <code>dateStyle</code> and <code>timeStyle</code>, respectively.</li>
 * </ul>
 */

public class DateTimeConverter implements Converter, PartialStateHolder {

    // ------------------------------------------------------ Manifest Constants


    /**
     * <p>The standard converter id for this converter.</p>
     */
    public static final String CONVERTER_ID = "javax.faces.DateTime";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Date</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String DATE_ID =
         "javax.faces.converter.DateTimeConverter.DATE";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>Time</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String TIME_ID =
         "javax.faces.converter.DateTimeConverter.TIME";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion to <code>DateTime</code> fails.  The message format
     * string for this message may optionally include the following
     * placeholders:
     * <ul>
     * <li><code>{0}</code> replaced by the unconverted value.</li>
     * <li><code>{1}</code> replaced by an example value.</li>
     * <li><code>{2}</code> replaced by a <code>String</code> whose value
     * is the label of the input component that produced this message.</li>
     * </ul>
     */
    public static final String DATETIME_ID =
         "javax.faces.converter.DateTimeConverter.DATETIME";

    /**
     * <p>The message identifier of the {@link javax.faces.application.FacesMessage} to be created if
     * the conversion of the <code>DateTime</code> value to
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
     * <p>Return the style to be used to format or parse dates.  If not set,
     * the default value, <code>default</code>, is returned.</p>
     *
     * @return the style
     */
    public String getDateStyle() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the style to be used to format or parse dates.  Valid values
     * are <code>default</code>, <code>short</code>, <code>medium</code>,
     * <code>long</code>, and <code>full</code>.
     * An invalid value will cause a {@link ConverterException} when
     * <code>getAsObject()</code> or <code>getAsString()</code> is called.</p>
     *
     * @param dateStyle The new style code
     */
    public void setDateStyle(String dateStyle) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the <code>Locale</code> to be used when parsing or formatting
     * dates and times. If not explicitly set, the <code>Locale</code> stored
     * in the {@link javax.faces.component.UIViewRoot} for the current
     * request is returned.</p>
     *
     * @return the {@code Locale}
     */
    public Locale getLocale() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the <code>Locale</code> to be used when parsing or formatting
     * dates and times.  If set to <code>null</code>, the <code>Locale</code>
     * stored in the {@link javax.faces.component.UIViewRoot} for the current
     * request will be utilized.</p>
     *
     * @param locale The new <code>Locale</code> (or <code>null</code>)
     */
    public void setLocale(Locale locale) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the format pattern to be used when formatting and
     * parsing dates and times.</p>
     *
     * @return the pattern
     */
    public String getPattern() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the format pattern to be used when formatting and parsing
     * dates and times.  Valid values are those supported by
     * <code>java.text.SimpleDateFormat</code>.
     * An invalid value will cause a {@link ConverterException} when
     * <code>getAsObject()</code> or <code>getAsString()</code> is called.</p>
     *
     * @param pattern The new format pattern
     */
    public void setPattern(String pattern) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the style to be used to format or parse times.  If not set,
     * the default value, <code>default</code>, is returned.</p>
     *
     * @return the time style
     */
    public String getTimeStyle() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the style to be used to format or parse times.  Valid values
     * are <code>default</code>, <code>short</code>, <code>medium</code>,
     * <code>long</code>, and <code>full</code>.
     * An invalid value will cause a {@link ConverterException} when
     * <code>getAsObject()</code> or <code>getAsString()</code> is called.</p>
     *
     * @param timeStyle The new style code
     */
    public void setTimeStyle(String timeStyle) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the <code>TimeZone</code> used to interpret a time value.
     * If not explicitly set, the default time zone of <code>GMT</code>
     * returned.</p>
     *
     * @return the {@code TimeZone}
     */
    public TimeZone getTimeZone() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Set the <code>TimeZone</code> used to interpret a time value.</p>
     *
     * @param timeZone The new time zone
     */
    public void setTimeZone(TimeZone timeZone) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p>Return the type of value to be formatted or parsed.
     * If not explicitly set, the default type, <code>date</code>
     * is returned.</p>
     *
     * @return the type
     */
    public String getType() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    /**
     * <p><span class="changed_modified_2_3">Set</span> the type of
     * value to be formatted or parsed.  Valid values are
     * <code>both</code>, <code>date</code>, <code>time</code> <span
     * class="changed_added_2_3">{@code localDate}, {@code
     * localDateTime}, {@code localTime}, {@code offsetTime}, {@code
     * offsetDateTime}, or {@code zonedDateTime}. The values starting
     * with "local", "offset" and "zoned" correspond to Java SE 8 Date
     * Time API classes in package <code>java.time</code> with the name
     * derived by upper casing the first letter.  For example,
     * <code>java.time.LocalDate</code> for the value
     * <code>"localDate"</code>.</span> An invalid value will cause a {@link
     * ConverterException} when <code>getAsObject()</code> or
     * <code>getAsString()</code> is called.</p>
     *
     * @param type The new date style
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
