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
import javax.faces.component.UIGraphic;

/**
 * <p>Represents an HTML <code>img</code> element, used to retrieve
 * and render a graphical image.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Image</code>".
REPLACE_WITH_EXCEPTION;
 */
public class HtmlGraphicImage extends UIGraphic implements ClientBehaviorHolder {





    public HtmlGraphicImage() {

REPLACE_WITH_EXCEPTION;
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlGraphicImage";


    protected enum PropertyKeys {
        alt,
        dir,
        height,
        ismap,
        lang,
        longdesc,
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
        style,
        styleClass,
        title,
        usemap,
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
     * <p>Return the value of the <code>alt</code> property.</p>
     * @return the property value
     * <p>Contents: Alternate textual description of the
     * element rendered by this component.
     */
    public java.lang.String getAlt() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>alt</code> property.</p>
     * @param alt the new property value
     */
    public void setAlt(java.lang.String alt) {
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
     * <p>Return the value of the <code>height</code> property.</p>
     * @return the property value
     * <p>Contents: Override for the height of this image.
     */
    public java.lang.String getHeight() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>height</code> property.</p>
     * @param height the new property value
     */
    public void setHeight(java.lang.String height) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>ismap</code> property.</p>
     * @return the property value
     * <p>Contents: Flag indicating that this image is to be used as a server side
     * image map.  Such an image must be enclosed within a hyperlink
     * ("a").  A value of false causes no attribute to be rendered,
     * while a value of true causes the attribute to be rendered as
     * ismap="ismap".
     */
    public boolean isIsmap() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>ismap</code> property.</p>
     * @param ismap the new property value
     */
    public void setIsmap(boolean ismap) {
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
     * <p>Return the value of the <code>longdesc</code> property.</p>
     * @return the property value
     * <p>Contents: URI to a long description of the image
     * represented by this element.
     */
    public java.lang.String getLongdesc() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>longdesc</code> property.</p>
     * @param longdesc the new property value
     */
    public void setLongdesc(java.lang.String longdesc) {
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
     * <p>Return the value of the <code>usemap</code> property.</p>
     * @return the property value
     * <p>Contents: The name of a client side image map (an HTML "map"
     * element) for which this element provides the image.
     */
    public java.lang.String getUsemap() {
REPLACE_WITH_EXCEPTION;

    }

    /**
     * <p>Set the value of the <code>usemap</code> property.</p>
     * @param usemap the new property value
     */
    public void setUsemap(java.lang.String usemap) {
REPLACE_WITH_EXCEPTION;

    }


    /**
     * <p>Return the value of the <code>width</code> property.</p>
     * @return the property value
     * <p>Contents: Override for the width of this image.
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
