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

package javax.faces.component;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.component.behavior.ClientBehavior;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEventListener;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;
import javax.faces.render.Renderer;

/**
 * <p>
 * <strong class="changed_modified_2_0 changed_modified_2_0_rev_a
 * changed_added_2_1">UIComponentBase</strong> is a convenience base class that implements the
 * default concrete behavior of all methods defined by {@link UIComponent}.
 * </p>
 *
 * <p>
 * By default, this class defines <code>getRendersChildren()</code> to find the renderer for this
 * component and call its <code>getRendersChildren()</code> method. The default implementation on
 * the <code>Renderer</code> returns <code>false</code>. As of version 1.2 of the JavaServer Faces
 * Specification, component authors are encouraged to return <code>true</code> from this method and
 * rely on the implementation of {@link #encodeChildren} in this class and in the Renderer
 * ({@link Renderer#encodeChildren}). Subclasses that wish to manage the rendering of their children
 * should override this method to return <code>true</code> instead.
 * </p>
 */
public abstract class UIComponentBase extends UIComponent {

    public UIComponentBase() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Map<String, Object> getAttributes() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Map<String, Object> getPassThroughAttributes(boolean create) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // -------------------------------------------------------------- Properties

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public String getClientId(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     */
    @Override
    public void setId(String id) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public UIComponent getParent() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void setParent(UIComponent parent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean isRendered() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void setRendered(boolean rendered) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public String getRendererType() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public void setRendererType(String rendererType) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public boolean getRendersChildren() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------- Tree Management Methods

    @Override
    public List<UIComponent> getChildren() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // Do not allocate the children List to answer this question
    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public UIComponent findComponent(String expression) {
       throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * {@inheritDoc}
     *
     * @throws NullPointerException {@inheritDoc}
     * @throws FacesException {@inheritDoc}
     * @since 1.2
     */
    @Override
    public boolean invokeOnComponent(FacesContext context, String clientId, ContextCallback callback) throws FacesException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }



    // ------------------------------------------------ Facet Management Methods


    @Override
    public Map<String, UIComponent> getFacets() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // Do not allocate the children List to answer this question
    @Override
    public int getFacetCount() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // Do not allocate the facets Map to answer this question
    @Override
    public UIComponent getFacet(String name) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    public Iterator<UIComponent> getFacetsAndChildren() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // -------------------------------------------- Lifecycle Processing Methods

    /**
     * @throws AbortProcessingException {@inheritDoc}
     * @throws IllegalStateException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void broadcast(FacesEvent event) throws AbortProcessingException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void decode(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void encodeChildren(FacesContext context) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws IOException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void encodeEnd(FacesContext context) throws IOException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // -------------------------------------------------- Event Listener Methods


    /**
     * <p>
     * Add the specified {@link FacesListener} to the set of listeners registered to receive event
     * notifications from this {@link UIComponent}. It is expected that {@link UIComponent} classes
     * acting as event sources will have corresponding typesafe APIs for registering listeners of
     * the required type, and the implementation of those registration methods will delegate to this
     * method. For example:
     * </p>
     *
     * <pre>
     * public class FooEvent extends FacesEvent {
     *   ...
     *   protected boolean isAppropriateListener(FacesListener listener) {
     *     return (listener instanceof FooListener);
     *   }
     *   protected void processListener(FacesListener listener) {
     *     ((FooListener) listener).processFoo(this);
     *   }
     *   ...
     * }
     *
     * public interface FooListener extends FacesListener {
     *   public void processFoo(FooEvent event);
     * }
     *
     * public class FooComponent extends UIComponentBase {
     *   ...
     *   public void addFooListener(FooListener listener) {
     *     addFacesListener(listener);
     *   }
     *   public void removeFooListener(FooListener listener) {
     *     removeFacesListener(listener);
     *   }
     *   ...
     * }
     * </pre>
     *
     * @param listener The {@link FacesListener} to be registered
     * @throws NullPointerException if <code>listener</code> is <code>null</code>
     */
    @Override
    protected void addFacesListener(FacesListener listener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws IllegalArgumentException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    protected FacesListener[] getFacesListeners(Class clazz) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");        
    }

    /**
     * <p>
     * Remove the specified {@link FacesListener} from the set of listeners registered to receive
     * event notifications from this {@link UIComponent}.
     *
     * @param listener The {@link FacesListener} to be deregistered
     * @throws NullPointerException if <code>listener</code> is <code>null</code>
     */
    @Override
    protected void removeFacesListener(FacesListener listener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");        
    }

    /**
     * @throws IllegalStateException {@inheritDoc}
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void queueEvent(FacesEvent event) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");        
    }

    /**
     * <p class="changed_added_2_1">
     * Install the listener instance referenced by argument <code>componentListener</code> as a
     * listener for events of type <code>eventClass</code> originating from this specific instance
     * of <code>UIComponent</code>. The default implementation creates an inner
     * {@link SystemEventListener} instance that wraps argument <code>componentListener</code> as
     * the <code>listener</code> argument. This inner class must call through to the argument
     * <code>componentListener</code> in its implementation of
     * {@link SystemEventListener#processEvent} and its implementation of
     * {@link SystemEventListener#isListenerForSource} must return true if the instance class of
     * this <code>UIComponent</code> is assignable from the argument to
     * <code>isListenerForSource</code>.
     * </p>
     *
     * @param eventClass the <code>Class</code> of event for which <code>listener</code> must be
     *            fired.
     * @param componentListener the implementation of
     *            {@link javax.faces.event.ComponentSystemEventListener} whose
     *            {@link javax.faces.event.ComponentSystemEventListener#processEvent} method must be
     *            called when events of type <code>facesEventClass</code> are fired.
     *
     * @throws NullPointerException if any of the arguments are <code>null</code>.
     *
     * @since 2.1
     */
    @Override
    public void subscribeToEvent(Class<? extends SystemEvent> eventClass, ComponentSystemEventListener componentListener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");        
    }

    /**
     * <p class="changed_added_2_1">
     * Remove the listener instance referenced by argument <code>componentListener</code> as a
     * listener for events of type <code>eventClass</code> originating from this specific instance
     * of <code>UIComponent</code>. When doing the comparison to determine if an existing listener
     * is equal to the argument <code>componentListener</code> (and thus must be removed), the
     * <code>equals()</code> method on the <em>existing listener</em> must be invoked, passing the
     * argument <code>componentListener</code>, rather than the other way around.
     * </p>
     *
     * @param eventClass the <code>Class</code> of event for which <code>listener</code> must be
     *            removed.
     * @param componentListener the implementation of {@link ComponentSystemEventListener} whose
     *            {@link ComponentSystemEventListener#processEvent} method must no longer be called
     *            when events of type <code>eventClass</code> are fired.
     *
     * @throws NullPointerException if any of the arguments are <code>null</code>.
     *
     * @since 2.1
     */
    @Override
    public void unsubscribeFromEvent(Class<? extends SystemEvent> eventClass, ComponentSystemEventListener componentListener) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_1">
     * Return the <code>SystemEventListener</code> instances registered on this
     * <code>UIComponent</code> instance that are interested in events of type
     * <code>eventClass</code>.
     * </p>
     *
     * @param eventClass the <code>Class</code> of event for which the listeners must be returned.
     *
     * @throws NullPointerException if argument <code>eventClass</code> is <code>null</code>.
     *
     * @since 2.1
     */
    @Override
    public List<SystemEventListener> getListenersForEventClass(Class<? extends SystemEvent> eventClass) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }


    // ------------------------------------------------ Lifecycle Phase Handlers

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processDecodes(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processValidators(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processUpdates(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public Object processSaveState(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * @throws NullPointerException {@inheritDoc}
     */
    @Override
    public void processRestoreState(FacesContext context, Object state) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }



    // ------------------------------------------------------- Protected Methods

    @Override
    protected FacesContext getFacesContext() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    @Override
    protected Renderer getRenderer(FacesContext context) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    // ---------------------------------------------- PartialStateHolder Methods

    /**
     * <p class="changed_added_2_0">
     * For each of the attached objects on this instance that implement {@link PartialStateHolder},
     * call {@link PartialStateHolder#markInitialState} on the attached object.
     * </p>
     *
     * @since 2.0
     */
    @Override
    public void markInitialState() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">
     * For each of the attached objects on this instance that implement {@link PartialStateHolder},
     * call {@link PartialStateHolder#clearInitialState} on the attached object.
     * </p>
     *
     * @since 2.0
     */
    @Override
    public void clearInitialState() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

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


    // -------------------------------------- Helper methods for state saving


    // --------- methods used by UIComponents to save their attached Objects.

    /**
     * <p class="changed_modified_2_0">
     * This method is called by {@link UIComponent} subclasses that want to save one or more
     * attached objects. It is a convenience method that does the work of saving attached objects
     * that may or may not implement the {@link StateHolder} interface. Using this method implies
     * the use of {@link #restoreAttachedState} to restore the attached objects.
     * </p>
     *
     * <p>
     * This method supports saving attached objects of the following type: <code>Object</code>s,
     * <code>null</code> values, and <code
     * class="changed_modified_2_0">Collection</code>s of these objects. If any contained objects
     * are not <code
     * class="changed_modified_2_0">Collection</code>s and do not implement {@link StateHolder},
     * they must have zero-argument public constructors. The exact structure of the returned object
     * is undefined and opaque, but will be serializable.
     * </p>
     *
     * @param context the {@link FacesContext} for this request.
     * @param attachedObject the object, which may be a <code>List</code> instance, or an Object.
     *            The <code>attachedObject</code> (or the elements that comprise
     *            <code>attachedObject</code> may implement {@link StateHolder}.
     *
     * @return The state object to be saved.
     * @throws NullPointerException if the context argument is null.
     */

    public static Object saveAttachedState(FacesContext context, Object attachedObject) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>
     * This method is called by {@link UIComponent} subclasses that need to restore the objects they
     * saved using {@link #saveAttachedState}. This method is tightly coupled with
     * {@link #saveAttachedState}.
     * </p>
     *
     * <p>
     * This method supports restoring all attached objects types supported by
     * {@link #saveAttachedState}.
     * </p>
     *
     * @param context the {@link FacesContext} for this request
     * @param stateObj the opaque object returned from {@link #saveAttachedState}
     *
     * @return the object restored from <code>stateObj</code>.
     *
     * @throws NullPointerException if context is null.
     * @throws IllegalStateException if the object is not previously returned by
     *             {@link #saveAttachedState}.
     */

    public static Object restoreAttachedState(FacesContext context, Object stateObj) throws IllegalStateException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">
     * This is a default implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#addClientBehavior}.
     * <code>UIComponent</code> does not implement the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} interface, but provides default
     * implementations for the methods defined by
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} to simplify subclass
     * implementations. Subclasses that wish to support the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} contract must declare that the
     * subclass implements {@link javax.faces.component.behavior.ClientBehaviorHolder}, and must
     * provide an implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getEventNames}.
     * </p>
     *
     * @param eventName the logical name of the client-side event to attach the behavior to.
     * @param behavior the {@link javax.faces.component.behavior.Behavior} instance to attach for
     *            the specified event name.
     *
     * @since 2.0
     */
    public void addClientBehavior(String eventName, ClientBehavior behavior) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">
     * This is a default implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getEventNames}.
     * <code>UIComponent</code> does not implement the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} interface, but provides default
     * implementations for the methods defined by
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} to simplify subclass
     * implementations. Subclasses that wish to support the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} contract must declare that the
     * subclass implements {@link javax.faces.component.behavior.ClientBehaviorHolder}, and must
     * override this method to return a non-Empty <code>Collection</code> of the client event names
     * that the component supports.
     * </p>
     *
     * @return the collection of event names.
     * @since 2.0
     */
    public Collection<String> getEventNames() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">
     * This is a default implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getClientBehaviors}.
     * <code>UIComponent</code> does not implement the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} interface, but provides default
     * implementations for the methods defined by
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} to simplify subclass
     * implementations. Subclasses that wish to support the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} contract must declare that the
     * subclass implements {@link javax.faces.component.behavior.ClientBehaviorHolder}, and must add
     * an implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getEventNames}.
     * </p>
     *
     * @return behaviors associated with this component.
     * @since 2.0
     */
    public Map<String, List<ClientBehavior>> getClientBehaviors() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_0">
     * This is a default implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getDefaultEventName}.
     * <code>UIComponent</code> does not implement the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} interface, but provides default
     * implementations for the methods defined by
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} to simplify subclass
     * implementations. Subclasses that wish to support the
     * {@link javax.faces.component.behavior.ClientBehaviorHolder} contract must declare that the
     * subclass implements {@link javax.faces.component.behavior.ClientBehaviorHolder}, and must
     * provide an implementation of
     * {@link javax.faces.component.behavior.ClientBehaviorHolder#getEventNames}.
     * </p>
     *
     * @return the default event name.
     */
    public String getDefaultEventName() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
