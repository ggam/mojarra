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

package javax.faces.view.facelets;

import javax.faces.component.UIComponent;


/**
 * <p class="changed_added_2_0"><span
 * class="changed_modified_2_2">Public</span> base class for markup
 * element instances that map to {@link UIComponent} instances in the
 * view.</p>
 *
 * <div class="changed_added_2_0">
 *
 * <p><span class="changed_modified_2_2">Instances of this class are
 * created and passed to {@link
 * TagHandlerDelegateFactory#createComponentHandlerDelegate} when a tag
 * corresponding to this particular component is encountered in a
 * Facelet view.  A custom tag handler for a component, converter,
 * validator, or behavior must extend from this class.  In this way,
 * this instance acts as a delegate for the implementation private tag
 * handler.  Such a subclass may choose to override as many or as few
 * methods from this base class as desired.  If the subclass wants to
 * completely override the action of the implementation specific tag for
 * which this component is the delegate, it must override the
 * <code>apply()</code> method and make it take the following actions,
 * in this order.</span> These actions must only happen the first time
 * this facelet is applied for each user.  Subsequent applications must
 * take no action.</p>

 * <ol>

 * 	  <li><p>The <code>UIComponent</code> represented by this
 * 	  element is created with the appropriate
 * 	  <code>Application.createComponent()</code> method.  </p></li>

	  <li><p>Each attribute specified in the markup is correctly
	  applied to the component instance, as specified in the VDLDocs
	  for this element.  </p></li>

	  <li><p>If project stage is {@link javax.faces.application.ProjectStage#Development},
      Put the {@link javax.faces.view.Location} for this
	  element into the component attribute <code>Map</code> under
	  the key given by the value of the symbolic constant {@link
	  javax.faces.component.UIComponent#VIEW_LOCATION_KEY}.
	  </p></li>

	  <li><p>Set the id of the component.  If the id is specified
	  manually by the page author, that value must be set as the id.
	  Otherwise, the closest ancestor component that is an instance
	  of {@link javax.faces.component.UniqueIdVendor} must be
	  located and its {@link
	  javax.faces.component.UniqueIdVendor#createUniqueId} method
	  must be called to derive the id.  If no such instance can be
	  found, call {@link
	  javax.faces.component.UIViewRoot#createUniqueId} to derive the
	  id.</p></li>

	  <li><p>The rendererType property of the component is set properly.
	  </p></li>

	  <li><p>{@link #onComponentCreated} is called.
	  </p></li>

	  <li><p>{@link UIComponent#pushComponentToEL} is called on the
	  newly created component.</p></li>

	  <li><p>The next handler in the facelet chain is applied.  This
	  will cause the component to be populated with children.
	  </p></li>

	  <li><p>The component is added to its parent in the view.
	  </p></li>

	  <li><p>{@link UIComponent#popComponentFromEL} is called on the
	  newly created component.</p></li>

	  <li><p>Call {@link UIComponent#markInitialState}.
	  </p></li>

 * </ol>

 * <div class="changed_added_2_2">

 * <p>A common use case for extending this class is to gain access to
 * the process by which the Facelets runtime creates component instances
 * corresponding to markup in a Facelets view. These three methods are
 * useful in such cases.</p>

 * <ul>

 * <li><p>To control the instantiation of the <code>UIComponent</code>
 * instance, subclasses may override {@link #createComponent}.  If
 * this method is not overridden, the tag handler for which this
 * instance is the delegate will take the necessary action to
 * instantiate the <code>UIComponent</code>.</p></li>

 * <li><p>To be notified of creation of the
 * <code>UIComponent</code>instance, subclasses may override {@link
 * #onComponentCreated}.</p></li>

 * <li><p>To be notified that the freshly created
 * <code>UIComponent</code> instance has been populated with children as
 * a result of execution of child tag handlers, subclasses may override
 * {@link #onComponentPopulated}.</p></li>
 * </ul>
 * </div>

 * </div>
 *
 * @since 2.0
 */
public class ComponentHandler extends DelegatingMetaTagHandler {

    /**
     * <p class="changed_added_2_0">Leverage the {@link
     * TagHandlerDelegateFactory} provided by the implementation to create
     * an instance of {@link TagHandlerDelegate} designed for use with
     * <code>ComponentHandler</code>.</p>
     * 
     * @param config the configuration for this handler.
     *
     * @since 2.0
     */ 
    public ComponentHandler(ComponentConfig config) {
        super(config);
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    @Override
    protected TagHandlerDelegate getTagHandlerDelegate() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    public ComponentConfig getComponentConfig() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_added_2_2">Subclasses that wish to take over
     * the task of instantiating the <code>UIComponent</code> instance
     * corresponding to this tag handler my override this method to do
     * so.  A <code>null</code> return from this method will cause the
     * <code>TagHandlerDelegate</code> for instance to create the
     * component instead.</p>
     * 
     * @param ctx the <code>FaceletContext</code> for this view execution
     * 
     * @return the newly created {@link UIComponent}
     *
     * @since 2.2
     */
    
    public UIComponent createComponent(FaceletContext ctx) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    
    /**
     * <p class="changed_added_2_0">This method is guaranteed to be
     * called after the component has been created but before it has
     * been populated with children.</p>
     *
     * @param ctx the <code>FaceletContext</code> for this view execution

     * @param c the <code>UIComponent</code> that has just been created.
     *
     * @param parent the parent <code>UIComponent</code> of the
     * component represented by this element instance.
     *
     * @since 2.0
     */
    public void onComponentCreated(FaceletContext ctx, UIComponent c, 
            UIComponent parent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_0">This method is guaranteed to be
     * called after the component has been populated with children.</p>
     *
     * @param ctx the <code>FaceletContext</code> for this view execution

     * @param c the <code>UIComponent</code> that has just been
     * populated with children.
     *
     * @param parent the parent <code>UIComponent</code> of the
     * component represented by this element instance.
     *
     * @since 2.0
     */
    public void onComponentPopulated(FaceletContext ctx, UIComponent c, 
            UIComponent parent) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p class="changed_added_2_0">Determine if the passed component is 
     * not null and if it's new to the tree.  This operation can be used for determining if attributes
     * should be wired to the component.</p>
     * 
     * @param component the component you wish to modify
     * 
     * @return true if and only if the argument is not {@code null} and the 
     * component is new during this run of the lifecycle.
     * 
     * @since 2.0
     */
    public static boolean isNew(UIComponent component) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    
    

}
