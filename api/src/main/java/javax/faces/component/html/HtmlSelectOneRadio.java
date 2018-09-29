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
import javax.faces.component.UISelectOne;

/**
 * <p><span
 * class="changed_modified_2_0_rev_a">Represents</span> a
 * single-selection component that is rendered as a set of HTML
 * <code>input</code> elements of type
 * <code>radio</code>.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Radio</code>".
REPLACE_WITH_EXCEPTION;
 */
public class HtmlSelectOneRadio extends UISelectOne implements ClientBehaviorHolder {





    public HtmlSelectOneRadio() {

REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlSelectOneRadio";


    protected enum PropertyKeys {
        accesskey,
        border,
        dir,
        disabled,
        disabledClass,
        enabledClass,
        group,
        label,
        lang,
        layout,
        onblur,
        onchange,
        onclick,
        ondblclick,
        onfocus,
        onkeydown,
        onkeypress,
        onkeyup,
        onmousedown,
        onmousemove,
        onmouseout,
        onmouseover,
        onmouseup,
        onselect,
        readonly,
        role,
        style,
        styleClass,
        tabindex,
        title,
;
        String toString;
        PropertyKeys(String toString) { this.toString = toString; }
        PropertyKeys() { }
        public String toString() {
            return ((toString != null) ? toString : super.toString());
        }
}

    /**
     * <p>Return the value of the <code>accesskey</code> property.</p>
     * @return the property value
     * <p>Contents: Access key that, when pressed, transfers focus
     * to this element.
     */
    public java.lang.String getAccesskey() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>accesskey</code> property.</p>
     * @param accesskey the new property value
     */
    public void setAccesskey(java.lang.String accesskey) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>border</code> property.</p>
     * @return the property value
     * <p>Contents: Width (in pixels) of the border to be drawn
     * around the table containing the options list.
     * This attribute is ignored when "group" attribute is specified.
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
     * <p>Return the value of the <code>disabled</code> property.</p>
     * @return the property value
     * <p>Contents: Flag indicating that this element must never receive focus or
     * be included in a subsequent submit.  A value of false causes
     * no attribute to be rendered, while a value of true causes the
     * attribute to be rendered as disabled="disabled".
     */
    public boolean isDisabled() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>disabled</code> property.</p>
     * @param disabled the new property value
     */
    public void setDisabled(boolean disabled) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>disabledClass</code> property.</p>
     * @return the property value
     * <p>Contents: CSS style class to apply to the rendered label
     * on disabled options.
     * This attribute is ignored when "group" attribute is specified.
     */
    public java.lang.String getDisabledClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>disabledClass</code> property.</p>
     * @param disabledClass the new property value
     */
    public void setDisabledClass(java.lang.String disabledClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>enabledClass</code> property.</p>
     * @return the property value
     * <p>Contents: CSS style class to apply to the rendered label
     * on enabled options.
     * This attribute is ignored when "group" attribute is specified.
     */
    public java.lang.String getEnabledClass() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>enabledClass</code> property.</p>
     * @param enabledClass the new property value
     */
    public void setEnabledClass(java.lang.String enabledClass) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>group</code> property.</p>
     * @return the property value
     * <p>Contents: Specifies the name of the radio button group. Radio button components
     * having the same group within a <code>UIForm</code> parent will uncheck
     * all others when being checked. If the <code>value</code> attribute is
     * absent then the one from first component of the group will be used. If
     * the <code>UISelectItem</code> child is absent then the one from first
     * component of the group will be used. When specified, the
     * <code>group</code> attribute disables the default rendering of the
     * "table" element and any attribute related to the rendering of the
     * "table" element, such as "border", is ignored.
     */
    public java.lang.String getGroup() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>group</code> property.</p>
     * @param group the new property value
     */
    public void setGroup(java.lang.String group) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>label</code> property.</p>
     * @return the property value
     * <p>Contents: A localized user presentable name for this component.
     */
    public java.lang.String getLabel() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>label</code> property.</p>
     * @param label the new property value
     */
    public void setLabel(java.lang.String label) {
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
     * <p>Return the value of the <code>layout</code> property.</p>
     * @return the property value
     * <p>Contents: Orientation of the options list to be created.
     * Valid values are "pageDirection" (list is laid
     * out vertically), or "lineDirection" (list is
     * laid out horizontally).  If not specified, the
     * default value is "lineDirection".
     * This attribute is ignored when "group" attribute is specified.
     */
    public java.lang.String getLayout() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>layout</code> property.</p>
     * @param layout the new property value
     */
    public void setLayout(java.lang.String layout) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>onblur</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when this element loses focus.
     */
    public java.lang.String getOnblur() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onblur</code> property.</p>
     * @param onblur the new property value
     */
    public void setOnblur(java.lang.String onblur) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>onchange</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when this element loses focus
     * and its value has been modified since gaining focus.
     */
    public java.lang.String getOnchange() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onchange</code> property.</p>
     * @param onchange the new property value
     */
    public void setOnchange(java.lang.String onchange) {
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
     * <p>Return the value of the <code>onfocus</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when this element receives focus.
     */
    public java.lang.String getOnfocus() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onfocus</code> property.</p>
     * @param onfocus the new property value
     */
    public void setOnfocus(java.lang.String onfocus) {
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
     * <p>Return the value of the <code>onselect</code> property.</p>
     * @return the property value
     * <p>Contents: Javascript code executed when text within this
     * element is selected by the user.
     */
    public java.lang.String getOnselect() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>onselect</code> property.</p>
     * @param onselect the new property value
     */
    public void setOnselect(java.lang.String onselect) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>readonly</code> property.</p>
     * @return the property value
     * <p>Contents: Flag indicating that this component will prohibit changes by
     * the user.  The element may receive focus unless it has also
     * been disabled.  A value of false causes
     * no attribute to be rendered, while a value of true causes the
     * attribute to be rendered as readonly="readonly".
     */
    public boolean isReadonly() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>readonly</code> property.</p>
     * @param readonly the new property value
     */
    public void setReadonly(boolean readonly) {
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
     * <p>Return the value of the <code>tabindex</code> property.</p>
     * @return the property value
     * <p>Contents: Position of this element in the tabbing order
     * for the current document.  This value must be
     * an integer between 0 and 32767.
     */
    public java.lang.String getTabindex() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>tabindex</code> property.</p>
     * @param tabindex the new property value
     */
    public void setTabindex(java.lang.String tabindex) {
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


    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur","change","click","valueChange","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup","select"));

    public Collection<String> getEventNames() {
        return EVENT_NAMES;    }


    public String getDefaultEventName() {
        return "valueChange";    }



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
