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
 * <p>Represents an HTML <code>a</code> (hyperlink) element that may be
 * used to link to an arbitrary URL defined by the <code>value</code>
 * property.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Link</code>".
REPLACE_WITH_EXCEPTION;
 */
public class HtmlOutputLink extends UIOutput implements ClientBehaviorHolder {





    public HtmlOutputLink() {

REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlOutputLink";


    protected enum PropertyKeys {
        accesskey,
        charset,
        coords,
        dir,
        disabled,
        fragment,
        hreflang,
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
        rel,
        rev,
        role,
        shape,
        style,
        styleClass,
        tabindex,
        target,
        title,
        type,
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
     * <p>Return the value of the <code>charset</code> property.</p>
     * @return the property value
     * <p>Contents: The character encoding of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getCharset() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>charset</code> property.</p>
     * @param charset the new property value
     */
    public void setCharset(java.lang.String charset) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>coords</code> property.</p>
     * @return the property value
     * <p>Contents: The position and shape of the hot spot on the screen
     * (for use in client-side image maps).
     */
    public java.lang.String getCoords() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>coords</code> property.</p>
     * @param coords the new property value
     */
    public void setCoords(java.lang.String coords) {
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
     * <p>Contents: Flag indicating that this element must never
     * receive focus or be included in a subsequent
     * submit.
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
     * <p>Return the value of the <code>fragment</code> property.</p>
     * @return the property value
     * <p>Contents: The identifier of the page fragment which should
     * be brought into focus when the target page is
     * rendered. The value of this attribute is appended
     * to the end of target URL following a hash (#) mark.
     * This notation is part of the standard URL syntax.
     */
    public java.lang.String getFragment() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>fragment</code> property.</p>
     * @param fragment the new property value
     */
    public void setFragment(java.lang.String fragment) {
REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>Return the value of the <code>hreflang</code> property.</p>
     * @return the property value
     * <p>Contents: The language code of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getHreflang() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>hreflang</code> property.</p>
     * @param hreflang the new property value
     */
    public void setHreflang(java.lang.String hreflang) {
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
     * <p>Return the value of the <code>rel</code> property.</p>
     * @return the property value
     * <p>Contents: The relationship from the current document
     * to the anchor specified by this hyperlink.
     * The value of this attribute is a space-separated
     * list of link types.
     */
    public java.lang.String getRel() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>rel</code> property.</p>
     * @param rel the new property value
     */
    public void setRel(java.lang.String rel) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>rev</code> property.</p>
     * @return the property value
     * <p>Contents: A reverse link from the anchor specified
     * by this hyperlink to the current document.
     * The value of this attribute is a space-separated
     * list of link types.
     */
    public java.lang.String getRev() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>rev</code> property.</p>
     * @param rev the new property value
     */
    public void setRev(java.lang.String rev) {
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
     * <p>Return the value of the <code>shape</code> property.</p>
     * @return the property value
     * <p>Contents: The shape of the hot spot on the screen
     * (for use in client-side image maps).  Valid
     * values are:  default (entire region); rect
     * (rectangular region); circle (circular region);
     * and poly (polygonal region).
     */
    public java.lang.String getShape() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>shape</code> property.</p>
     * @param shape the new property value
     */
    public void setShape(java.lang.String shape) {
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
     * <p>Return the value of the <code>target</code> property.</p>
     * @return the property value
     * <p>Contents: Name of a frame where the resource
     * retrieved via this hyperlink is to
     * be displayed.
     */
    public java.lang.String getTarget() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>target</code> property.</p>
     * @param target the new property value
     */
    public void setTarget(java.lang.String target) {
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
     * <p>Return the value of the <code>type</code> property.</p>
     * @return the property value
     * <p>Contents: The content type of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getType() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>type</code> property.</p>
     * @param type the new property value
     */
    public void setType(java.lang.String type) {
REPLACE_WITH_EXCEPTION;

    }


    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur","click","action","dblclick","focus","keydown","keypress","keyup","mousedown","mousemove","mouseout","mouseover","mouseup"));

    public Collection<String> getEventNames() {
        return EVENT_NAMES;    }


    public String getDefaultEventName() {
        return "action";    }



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
