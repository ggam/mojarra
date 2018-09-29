/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
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
package javax.faces.component.html;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.faces.component.behavior.ClientBehaviorHolder;
import javax.el.ValueExpression;
import javax.faces.component.UIPanel;

/**
 * <p>Renders child components in a table, starting a new
 * row after the specified number of columns.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Grid</code>".
REPLACE_WITH_EXCEPTION;
 */
public class HtmlPanelGrid extends UIPanel implements ClientBehaviorHolder {





    public HtmlPanelGrid() {

REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlPanelGrid";


    protected enum PropertyKeys {
        bgcolor,
        bodyrows,
        border,
        captionClass,
        captionStyle,
        cellpadding,
        cellspacing,
        columnClasses,
        columns,
        dir,
        footerClass,
        frame,
        headerClass,
        lang,
        onclick,
        ondblclick,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        role,
        rowClass,
        rowClasses,
        rules,
        style,
        styleClass,
        summary,
        title,
        width,
;
        String toString;
        PropertyKeys(String toString) { this.toString = toString; }
        PropertyKeys() { }
        public String toString() {
            return ((toString != null) ? toString : super.toString());
        }
}

    /**
     * <p>Return the value of the <code>bgcolor</code> property.</p>
     * @return the property value
     * <p>Contents: Name or code of the background color for this table.
     */
    public java.lang.String getBgcolor() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>bgcolor</code> property.</p>
     * @param bgcolor the new property value
     */
    public void setBgcolor(java.lang.String bgcolor) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>bodyrows</code> property.</p>
     * @return the property value
     * <p>Contents: Comma separated list of row indices for which a new
     * "tbody" element should be started (and any
     * previously opened one should be ended).
     */
    public java.lang.String getBodyrows() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>bodyrows</code> property.</p>
     * @param bodyrows the new property value
     */
    public void setBodyrows(java.lang.String bodyrows) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>border</code> property.</p>
     * @return the property value
     * <p>Contents: Width (in pixels) of the border to be drawn
     * around this table.
     */
    public int getBorder() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>border</code> property.</p>
     * @param border the new property value
     */
    public void setBorder(int border) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>captionClass</code> property.</p>
     * @return the property value
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any caption generated for this table.
     */
    public java.lang.String getCaptionClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>captionClass</code> property.</p>
     * @param captionClass the new property value
     */
    public void setCaptionClass(java.lang.String captionClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>captionStyle</code> property.</p>
     * @return the property value
     * <p>Contents: CSS style(s) to be applied when this caption is rendered.
     */
    public java.lang.String getCaptionStyle() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>captionStyle</code> property.</p>
     * @param captionStyle the new property value
     */
    public void setCaptionStyle(java.lang.String captionStyle) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>cellpadding</code> property.</p>
     * @return the property value
     * <p>Contents: Definition of how much space the user agent should
     * leave between the border of each cell and its contents.
     */
    public java.lang.String getCellpadding() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>cellpadding</code> property.</p>
     * @param cellpadding the new property value
     */
    public void setCellpadding(java.lang.String cellpadding) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>cellspacing</code> property.</p>
     * @return the property value
     * <p>Contents: Definition of how much space the user agent should
     * leave between the left side of the table and the
     * leftmost column, the top of the table and the top of
     * the top side of the topmost row, and so on for the
     * right and bottom of the table.  It also specifies
     * the amount of space to leave between cells.
     */
    public java.lang.String getCellspacing() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>cellspacing</code> property.</p>
     * @param cellspacing the new property value
     */
    public void setCellspacing(java.lang.String cellspacing) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>columnClasses</code> property.</p>
     * @return the property value
     * <p>Contents: Comma-delimited list of CSS style classes that will be applied
     * to the columns of this table.  A space separated list of
     * classes may also be specified for any individual column.  If
     * the number of elements in this list is less than the number of
     * actual column children of the UIData, no "class"
     * attribute is output for each column greater than the number of
     * elements in the list.  If the number of elements in the list
     * is greater than the number of actual column children of the
     * UIData, the elements at the posisiton in the list
     * after the last column are ignored.
     */
    public java.lang.String getColumnClasses() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>columnClasses</code> property.</p>
     * @param columnClasses the new property value
     */
    public void setColumnClasses(java.lang.String columnClasses) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>columns</code> property.</p>
     * @return the property value
     * <p>Contents: The number of columns to render before
     * starting a new row.
     */
    public int getColumns() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>columns</code> property.</p>
     * @param columns the new property value
     */
    public void setColumns(int columns) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>dir</code> property.</p>
     * @return the property value
     * <p>Contents: Direction indication for text that does not inherit directionality.
     * Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).
     * These attributes are case sensitive when rendering to XHTML, so
     * care must be taken to have the correct case.
     */
    public java.lang.String getDir() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>dir</code> property.</p>
     * @param dir the new property value
     */
    public void setDir(java.lang.String dir) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>footerClass</code> property.</p>
     * @return the property value
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any footer generated for this table.
     */
    public java.lang.String getFooterClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>footerClass</code> property.</p>
     * @param footerClass the new property value
     */
    public void setFooterClass(java.lang.String footerClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>frame</code> property.</p>
     * @return the property value
     * <p>Contents: Code specifying which sides of the frame surrounding
     * this table will be visible.  Valid values are:
     * none (no sides, default value); above (top side only);
     * below (bottom side only); hsides (top and bottom sides
     * only); vsides (right and left sides only); lhs (left
     * hand side only); rhs (right hand side only); box
     * (all four sides); and border (all four sides).
     */
    public java.lang.String getFrame() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>frame</code> property.</p>
     * @param frame the new property value
     */
    public void setFrame(java.lang.String frame) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>headerClass</code> property.</p>
     * @return the property value
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any header generated for this table.
     */
    public java.lang.String getHeaderClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>headerClass</code> property.</p>
     * @param headerClass the new property value
     */
    public void setHeaderClass(java.lang.String headerClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>lang</code> property.</p>
     * @return the property value
     * <p>Contents: Code describing the language used in the generated markup
     * for this component.
     */
    public java.lang.String getLang() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>lang</code> property.</p>
     * @param lang the new property value
     */
    public void setLang(java.lang.String lang) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onclick</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * clicked over this element.
     */
    public java.lang.String getOnclick() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onclick</code> property.</p>
     * @param onclick the new property value
     */
    public void setOnclick(java.lang.String onclick) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>ondblclick</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * double clicked over this element.
     */
    public java.lang.String getOndblclick() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>ondblclick</code> property.</p>
     * @param ondblclick the new property value
     */
    public void setOndblclick(java.lang.String ondblclick) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onkeydown</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a key is
     * pressed down over this element.
     */
    public java.lang.String getOnkeydown() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onkeydown</code> property.</p>
     * @param onkeydown the new property value
     */
    public void setOnkeydown(java.lang.String onkeydown) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onkeypress</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a key is
     * pressed and released over this element.
     */
    public java.lang.String getOnkeypress() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onkeypress</code> property.</p>
     * @param onkeypress the new property value
     */
    public void setOnkeypress(java.lang.String onkeypress) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onkeyup</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a key is
     * released over this element.
     */
    public java.lang.String getOnkeyup() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onkeyup</code> property.</p>
     * @param onkeyup the new property value
     */
    public void setOnkeyup(java.lang.String onkeyup) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onmousedown</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * pressed down over this element.
     */
    public java.lang.String getOnmousedown() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onmousedown</code> property.</p>
     * @param onmousedown the new property value
     */
    public void setOnmousedown(java.lang.String onmousedown) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onmousemove</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * moved within this element.
     */
    public java.lang.String getOnmousemove() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onmousemove</code> property.</p>
     * @param onmousemove the new property value
     */
    public void setOnmousemove(java.lang.String onmousemove) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onmouseout</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * moved away from this element.
     */
    public java.lang.String getOnmouseout() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onmouseout</code> property.</p>
     * @param onmouseout the new property value
     */
    public void setOnmouseout(java.lang.String onmouseout) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onmouseover</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * moved onto this element.
     */
    public java.lang.String getOnmouseover() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onmouseover</code> property.</p>
     * @param onmouseover the new property value
     */
    public void setOnmouseover(java.lang.String onmouseover) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onmouseup</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when a pointer button is
     * released over this element.
     */
    public java.lang.String getOnmouseup() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onmouseup</code> property.</p>
     * @param onmouseup the new property value
     */
    public void setOnmouseup(java.lang.String onmouseup) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>role</code> property.</p>
     * @return the property value
     * <p>Contents: <p class="changed_added_2_2">Per the WAI-ARIA spec and its
     * relationship to HTML5 (Section title ARIA Role Attriubute),
     * every HTML element may have a "role" attribute whose value
     * must be passed through unmodified on the element on which it
     * is declared in the final rendered markup.  The attribute, if
     * specified, must have a value that is a string literal that is,
     * or an EL Expression that evaluates to, a set of
     * space-separated tokens representing the various WAI-ARIA roles
     * that the element belongs to.
     * </p>
     * 
     * <p class="changed_added_2_2">It is the page author's
     * responsibility to ensure that the user agent is capable of
     * correctly interpreting the value of this attribute.</p>
     */
    public java.lang.String getRole() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>role</code> property.</p>
     * @param role the new property value
     */
    public void setRole(java.lang.String role) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>rowClass</code> property.</p>
     * @return the property value
     * <p>Contents: <div class="changed_added_2_3">
     * 
     * <p>Assigns one or more space-separated CSS class names to each
     * "tr"</p>
     * 
     * </div>
     */
    public java.lang.String getRowClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>rowClass</code> property.</p>
     * @param rowClass the new property value
     */
    public void setRowClass(java.lang.String rowClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>rowClasses</code> property.</p>
     * @return the property value
     * <p>Contents: Comma-delimited list of CSS style classes that will be applied
     * to the rows of this table.  A space separated list of classes
     * may also be specified for any individual row.  Thes styles are
     * applied, in turn, to each row in the table.  For example, if
     * the list has two elements, the first style class in the list
     * is applied to the first row, the second to the second row, the
     * first to the third row, the second to the fourth row, etc.  In
     * other words, we keep iterating through the list until we reach
     * the end, and then we start at the beginning again.
     */
    public java.lang.String getRowClasses() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>rowClasses</code> property.</p>
     * @param rowClasses the new property value
     */
    public void setRowClasses(java.lang.String rowClasses) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>rules</code> property.</p>
     * @return the property value
     * <p>Contents: Code specifying which rules will appear between cells
     * within this table.  Valid values are:  none (no rules,
     * default value); groups (between row groups); rows
     * (between rows only); cols (between columns only); and
     * all (between all rows and columns).
     */
    public java.lang.String getRules() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>rules</code> property.</p>
     * @param rules the new property value
     */
    public void setRules(java.lang.String rules) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>style</code> property.</p>
     * @return the property value
     * <p>Contents: CSS style(s) to be applied when this component is rendered.
     */
    public java.lang.String getStyle() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>style</code> property.</p>
     * @param style the new property value
     */
    public void setStyle(java.lang.String style) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>styleClass</code> property.</p>
     * @return the property value
     * <p>Contents: Space-separated list of CSS style class(es) to be applied when
     * this element is rendered.  This value must be passed through
     * as the "class" attribute on generated markup.
     */
    public java.lang.String getStyleClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>styleClass</code> property.</p>
     * @param styleClass the new property value
     */
    public void setStyleClass(java.lang.String styleClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>summary</code> property.</p>
     * @return the property value
     * <p>Contents: Summary of this table's purpose and structure, for
     * user agents rendering to non-visual media such as
     * speech and Braille.
     */
    public java.lang.String getSummary() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>summary</code> property.</p>
     * @param summary the new property value
     */
    public void setSummary(java.lang.String summary) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>title</code> property.</p>
     * @return the property value
     * <p>Contents: Advisory title information about markup elements generated
     * for this component.
     */
    public java.lang.String getTitle() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>title</code> property.</p>
     * @param title the new property value
     */
    public void setTitle(java.lang.String title) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>width</code> property.</p>
     * @return the property value
     * <p>Contents: Width of the entire table, for visual user agents.
     */
    public java.lang.String getWidth() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>width</code> property.</p>
     * @param width the new property value
     */
    public void setWidth(java.lang.String width) {
REPLACE_WITH_EXCEPTION;

    }


    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("click","dblclick","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup"));

    public Collection<String> getEventNames() {
        return EVENT_NAMES;    }


    public String getDefaultEventName() {
        return null;    }



        List<String> setAttributes = (List<String>) this.getAttributes().get("javax.faces.component.UIComponentBase.attributesThatAreSet");
        if (setAttributes == null) {
            String cname = this.getClass().getName();

                setAttributes = new ArrayList<String>(6);
                this.getAttributes().put("javax.faces.component.UIComponentBase.attributesThatAreSet", setAttributes);
            }
        }
        if (setAttributes != null) {
            if (value == null) {
                ValueExpression ve = getValueExpression(name);
                if (ve == null) {
                    setAttributes.remove(name);
                }
            } else if (!setAttributes.contains(name)) {
                setAttributes.add(name);
            }
        }
    }

}
