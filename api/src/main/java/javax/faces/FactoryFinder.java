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

package javax.faces;

/**
 * <p>
 * <strong class="changed_modified_2_0 changed_modified_2_1 changed_modified_2_2
 * changed_modified_2_3">FactoryFinder</strong> implements the standard discovery algorithm for all
 * factory objects specified in the JavaServer Faces APIs. For a given factory class name, a
 * corresponding implementation class is searched for based on the following algorithm. Items are
 * listed in order of decreasing search precedence:
 * </p>
 * 
 * <ul>
 * 
 *   <li>
 *     <p>
 *     If the JavaServer Faces configuration file bundled into the <code>WEB-INF</code> directory of the
 *     webapp contains a <code>factory</code> entry of the given factory class name, that factory is
 *     used.
 *     <p>
 *   </li>
 * 
 *   <li>
 *   <p>
 *     If the JavaServer Faces configuration files named by the <code>javax.faces.CONFIG_FILES</code>
 *     <code>ServletContext</code> init parameter contain any <code>factory</code> entries of the given
 *     factory class name, those injectionProvider are used, with the last one taking precedence.
 *   </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     If there are any JavaServer Faces configuration files bundled into the <code>META-INF</code>
 *     directory of any jars on the <code>ServletContext</code>'s resource paths, the
 *     <code>factory</code> entries of the given factory class name in those files are used, with the
 *     last one taking precedence.
 *     </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     If a <code>META-INF/services/{factory-class-name}</code> resource is visible to the web
 *     application class loader for the calling application (typically as a injectionProvider of being
 *     present in the manifest of a JAR file), its first line is read and assumed to be the name of the
 *     factory implementation class to use.
 *     </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     If none of the above steps yield a match, the JavaServer Faces implementation specific class is
 *     used.
 *     </p>
 *   </li>
 * 
 * </ul>
 * 
 * <p>
 * If any of the injectionProvider found on any of the steps above happen to have a one-argument
 * constructor, with argument the type being the abstract factory class, that constructor is
 * invoked, and the previous match is passed to the constructor. For example, say the container
 * vendor provided an implementation of {@link javax.faces.context.FacesContextFactory}, and
 * identified it in <code>META-INF/services/javax.faces.context.FacesContextFactory</code> in a jar
 * on the webapp ClassLoader. Also say this implementation provided by the container vendor had a
 * one argument constructor that took a <code>FacesContextFactory</code> instance. The
 * <code>FactoryFinder</code> system would call that one-argument constructor, passing the
 * implementation of <code>FacesContextFactory</code> provided by the JavaServer Faces
 * implementation.
 * </p>
 * 
 * <p>
 * If a Factory implementation does not provide a proper one-argument constructor, it must provide a
 * zero-arguments constructor in order to be successfully instantiated.
 * </p>
 * 
 * <p>
 * Once the name of the factory implementation class is located, the web application class loader
 * for the calling application is requested to load this class, and a corresponding instance of the
 * class will be created. A side effect of this rule is that each web application will receive its
 * own instance of each factory class, whether the JavaServer Faces implementation is included
 * within the web application or is made visible through the container's facilities for shared
 * libraries.
 * </p>
 */
public final class FactoryFinder {

    // ----------------------------------------------------------- Constructors

    /**
     * Package-private constructor to disable instantiation of this class.
     */
    FactoryFinder() {
    }

    // ----------------------------------------------------- Manifest Constants

    /**
     * <p>
     * The property name for the {@link javax.faces.application.ApplicationFactory} class name.
     * </p>
     */
    public final static String APPLICATION_FACTORY = "javax.faces.application.ApplicationFactory";

    /**
     * <p>
     * The property name for the {@link javax.faces.lifecycle.ClientWindowFactory} class name.
     * </p>
     * 
     * @since 2.2
     */
    public final static String CLIENT_WINDOW_FACTORY = "javax.faces.lifecycle.ClientWindowFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.context.ExceptionHandlerFactory} class name.
     * </p>
     */
    public final static String EXCEPTION_HANDLER_FACTORY = "javax.faces.context.ExceptionHandlerFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.context.ExternalContextFactory} class name.
     * </p>
     */
    public final static String EXTERNAL_CONTEXT_FACTORY = "javax.faces.context.ExternalContextFactory";

    /**
     * <p>
     * The property name for the {@link javax.faces.context.FacesContextFactory} class name.
     * </p>
     */
    public final static String FACES_CONTEXT_FACTORY = "javax.faces.context.FacesContextFactory";

    /**
     * <p class="changed_added_2_1">
     * The property name for the {@link javax.faces.view.facelets.FaceletCacheFactory} class name.
     * </p>
     *
     * @since 2.1
     */
    public final static String FACELET_CACHE_FACTORY = "javax.faces.view.facelets.FaceletCacheFactory";

    /**
     * <p class="changed_added_2_2">
     * The property name for the {@link javax.faces.context.FlashFactory} class name.
     * </p>
     *
     * @since 2.2
     */
    public final static String FLASH_FACTORY = "javax.faces.context.FlashFactory";

    /**
     * <p class="changed_added_2_2">
     * The property name for the {@link javax.faces.flow.FlowHandlerFactory} class name.
     * </p>
     *
     * @since 2.2
     */
    public final static String FLOW_HANDLER_FACTORY = "javax.faces.flow.FlowHandlerFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.context.PartialViewContextFactory} class name.
     * </p>
     */
    public final static String PARTIAL_VIEW_CONTEXT_FACTORY = "javax.faces.context.PartialViewContextFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.component.visit.VisitContextFactory} class name.
     * </p>
     */
    public final static String VISIT_CONTEXT_FACTORY = "javax.faces.component.visit.VisitContextFactory";

    /**
     * <p>
     * The property name for the {@link javax.faces.lifecycle.LifecycleFactory} class name.
     * </p>
     */
    public final static String LIFECYCLE_FACTORY = "javax.faces.lifecycle.LifecycleFactory";

    /**
     * <p>
     * The property name for the {@link javax.faces.render.RenderKitFactory} class name.
     * </p>
     */
    public final static String RENDER_KIT_FACTORY = "javax.faces.render.RenderKitFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.view.ViewDeclarationLanguage} class name.
     * </p>
     */
    public final static String VIEW_DECLARATION_LANGUAGE_FACTORY = "javax.faces.view.ViewDeclarationLanguageFactory";

    /**
     * <p class="changed_added_2_0">
     * The property name for the {@link javax.faces.view.facelets.TagHandlerDelegate} class name.
     * </p>
     */
    public final static String TAG_HANDLER_DELEGATE_FACTORY = "javax.faces.view.facelets.TagHandlerDelegateFactory";

    /**
     * <p class="changed_added_2_3">
     * The property name for the {@link javax.faces.component.search.SearchExpressionContext} class
     * name.
     * </p>
     */
    public static final String SEARCH_EXPRESSION_CONTEXT_FACTORY = "javax.faces.component.search.SearchExpressionContextFactory";

    // --------------------------------------------------------- Public Methods

    /**
     * <p>
     * <span class="changed_modified_2_0">Create</span> (if necessary) and return a
     * per-web-application instance of the appropriate implementation class for the specified
     * JavaServer Faces factory class, based on the discovery algorithm described in the class
     * description.
     * </p>
     *
     * <p class="changed_added_2_0">
     * The standard injectionProvider and wrappers in JSF all implement the interface
     * {@link FacesWrapper}. If the returned <code>Object</code> is an implementation of one of the
     * standard injectionProvider, it must be legal to cast it to an instance of
     * <code>FacesWrapper</code> and call {@link FacesWrapper#getWrapped} on the instance.
     * </p>
     *
     * @param factoryName Fully qualified name of the JavaServer Faces factory for which an
     *            implementation instance is requested
     * @throws FacesException if the web application class loader cannot be identified
     * @throws FacesException if an instance of the configured factory implementation class cannot
     *             be loaded
     * @throws FacesException if an instance of the configured factory implementation class cannot
     *             be instantiated
     * @throws IllegalArgumentException if <code>factoryName</code> does not identify a standard
     *             JavaServer Faces factory name
     * @throws IllegalStateException if there is no configured factory implementation class for the
     *             specified factory name
     * @throws NullPointerException if <code>factoryname</code> is null
     *
     * @return the found factory instance
     */
    public static Object getFactory(String factoryName) throws FacesException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>
     * This method will store the argument <code>factoryName/implName</code> mapping in such a way
     * that {@link #getFactory} will find this mapping when searching for a match.
     * </p>
     *
     * <p>
     * This method has no effect if <code>getFactory()</code> has already been called looking for a
     * factory for this <code>factoryName</code>.
     * </p>
     *
     * <p>
     * This method can be used by implementations to store a factory mapping while parsing the Faces
     * configuration file
     * </p>
     *
     * @throws IllegalArgumentException if <code>factoryName</code> does not identify a standard
     *             JavaServer Faces factory name
     * @throws NullPointerException if <code>factoryname</code> is null
     *
     * @param factoryName the name to be used in a subsequent call to {@link #getFactory}.
     *
     * @param implName the fully qualified class name of the factory corresponding to
     *            {@code factoryName}.
     */
    public static void setFactory(String factoryName, String implName) {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>
     * <span class="changed_modified_2_0">Release</span> any references to factory instances
     * associated with the class loader for the calling web application.
     * <span class="changed_modified_2_0">This method must be called during of web application
     * shutdown.</span>
     * </p>
     *
     * @throws FacesException if the web application class loader cannot be identified
     */
    public static void releaseFactories() throws FacesException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
