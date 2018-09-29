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
import javax.faces.component.UIOutput;

/**
 * <p>Represents an HTML <code>label</code> element, used to define
 * an accessible label for a corresponding input element.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Label</code>".
REPLACE_WITH_EXCEPTION;
 */
public class HtmlOutputLabel extends UIOutput implements ClientBehaviorHolder {





    public HtmlOutputLabel() {

REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlOutputLabel";


    protected enum PropertyKeys {
        accesskey,
        dir,
        escape,
        forVal("for"),
        lang,
        onblur,
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
     * <p>Return the value of the <code>escape</code> property.</p>
     * @return the property value
     * <p>Contents: Flag indicating that characters that are sensitive
     * in HTML and XML markup must be escaped.  If omitted, this
     * flag is assumed to be "true".
     */
    public boolean isEscape() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>escape</code> property.</p>
     * @param escape the new property value
     */
    public void setEscape(boolean escape) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>for</code> property.</p>
     * @return the property value
     * <p>Contents: <p class="changed_modified_2_3">Search expression to the component
     * for which this element is a label.</p>
     */
    public java.lang.String getFor() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>for</code> property.</p>
     * @param _for the new property value
     */
    public void setFor(java.lang.String _for) {
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


    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur","click","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup"));

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
