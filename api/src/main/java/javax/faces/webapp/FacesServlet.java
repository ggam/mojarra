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

package javax.faces.webapp;


import java.io.IOException;
import javax.faces.context.FacesContext;
import javax.faces.lifecycle.Lifecycle;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;

/**
 * <p>
 * <strong class="changed_modified_2_0 changed_modified_2_0_rev_a changed_modified_2_1
 * changed_modified_2_2 changed_modified_2_3">FacesServlet</strong> is a servlet that manages the
 * request processing lifecycle for web applications that are utilizing JavaServer Faces to
 * construct the user interface.
 * </p>
 *
 * <div class="changed_added_2_1">
 *
 * <p>
 * If the application is running in a Servlet 3.0 (and beyond) container, the runtime must provide
 * an implementation of the {@link javax.servlet.ServletContainerInitializer} interface that
 * declares the following classes in its {@link javax.servlet.annotation.HandlesTypes} annotation.
 * </p>
 * 
 * <ul>
 * 
 *   <li class="changed_added_2_3">{@link javax.faces.annotation.FacesConfig}</li>
 * 
 *   <li>{@link javax.faces.application.ResourceDependencies}</li>
 * 
 *   <li>{@link javax.faces.application.ResourceDependency}</li>
 * 
 *   <li>javax.faces.bean.ManagedBean</li>
 * 
 *   <li>{@link javax.faces.component.FacesComponent}</li>
 * 
 *   <li>{@link javax.faces.component.UIComponent}</li>
 * 
 *   <li>{@link javax.faces.convert.Converter}</li>
 * 
 *   <li>{@link javax.faces.convert.FacesConverter}</li>
 * 
 *   <li>{@link javax.faces.event.ListenerFor}</li>
 * 
 *   <li>{@link javax.faces.event.ListenersFor}</li>
 * 
 *   <li>{@link javax.faces.render.FacesBehaviorRenderer}</li>
 * 
 *   <li>{@link javax.faces.render.Renderer}</li>
 * 
 *   <li>{@link javax.faces.validator.FacesValidator}</li>
 * 
 *   <li>{@link javax.faces.validator.Validator}</li>
 * 
 * </ul>
 * 
 * <p>
 * This servlet must automatically be mapped if it is <strong>not</strong> explicitly mapped in
 * <code>web.xml</code> or <code>web-fragment.xml</code> and one or more of the following conditions
 * are true.
 * </p>
 * 
 * <ul>
 * 
 *   <li>
 *     <p>
 *     A <code>faces-config.xml</code> file is found in <code>WEB-INF</code>
 *   </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     A <code>faces-config.xml</code> file is found in the <code>META-INF</code> directory of a jar in
 *     the application's classpath.
 *   </p>
 * </li>
 * 
 *   <li>
 *     <p>
 *     A filename ending in <code>.faces-config.xml</code> is found in the <code>META-INF</code>
 *     directory of a jar in the application's classpath.
 *     </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     The <code>javax.faces.CONFIG_FILES</code> context param is declared in <code>web.xml</code> or
 *     <code>web-fragment.xml</code>.
 *     </p>
 *   </li>
 * 
 *   <li>
 *     <p>
 *     The <code>Set</code> of classes passed to the <code>onStartup()</code> method of the
 *     <code>ServletContainerInitializer</code> implementation is not empty.
 *     </p>
 *   </li>
 * 
 * </ul>
 * 
 * <p>
 * If the runtime determines that the servlet must be automatically mapped, it must be mapped to the
 * following &lt;<code>url-pattern</code>&gt; entries.
 * </p>
 * 
 * <ul>
 *   <li>/faces/*</li>
 *   <li>*.jsf</li>
 *   <li>*.faces</li>
 *   <li class="changed_added_2_3">*.xhtml</li>
 * </ul>
 * 
 * </div>
 *
 * <p class="changed_added_2_3">
 * Note that the automatic mapping to {@code *.xhtml} can be disabled with the context param
 * {@link #DISABLE_FACESSERVLET_TO_XHTML_PARAM_NAME}.
 * </p>
 * 
 * <div class="changed_added_2_2">
 *
 * <p>
 * This class must be annotated with {@code javax.servlet.annotation.MultipartConfig}. This causes
 * the Servlet container in which the JSF implementation is running to correctly handle multipart
 * form data.
 * </p>
 * 
 * <p>
 * <strong>Some security considerations relating to this class</strong>
 * </p>
 * 
 * <p>
 * The topic of web application security is a cross-cutting concern and every aspect of the
 * specification address it. However, as with any framework, the application developer needs to pay
 * careful attention to security. Please consider these topics among the rest of the security
 * concerns for the application. This is by no means a complete list of security concerns, and is no
 * substitute for a thorough application level security review.
 * </p>
 *
 * <blockquote>
 * 
 * <p>
 * <strong>Prefix mappings and the <code>FacesServlet</code></strong>
 * </p>
 * 
 * <p>
 * If the <code>FacesServlet</code> is mapped using a prefix <code>&lt;url-pattern&gt;</code>, such
 * as <code>&lt;url-pattern&gt;/faces/*&lt;/url-pattern&gt;</code>, something must be done to
 * prevent access to the view source without its first being processed by the
 * <code>FacesServlet</code>. One common approach is to apply a &lt;security-constraint&gt; to all
 * facelet files and flow definition files. Please see the <strong>Deployment Descriptor</strong>
 * chapter of the Java Servlet Specification for more information the use of
 * &lt;security-constraint&gt;.
 * </p>
 * 
 * <p>
 * <strong>Allowable HTTP Methods</strong>
 * </p>
 * 
 * <p>
 * The JSF specification only requires the use of the GET and POST http methods. If your web
 * application does not require any other http methods, such as PUT and DELETE, please consider
 * restricting the allowable http methods using the &lt;http-method&gt; and
 * &lt;http-method-omission&gt; elements. Please see the <strong>Security</strong> of the Java
 * Servlet Specification for more information the use of these elements.
 * </p>
 * 
 * 
 * </blockquote>
 *
 * </div>
 */
@MultipartConfig
public final class FacesServlet implements Servlet {

    /**
     * <p>
     * Context initialization parameter name for a comma delimited list of context-relative resource
     * paths (in addition to <code>/WEB-INF/faces-config.xml</code> which is loaded automatically if
     * it exists) containing JavaServer Faces configuration information.
     * </p>
     */
    public static final String CONFIG_FILES_ATTR = "javax.faces.CONFIG_FILES";

    /**
     * <p>
     * Context initialization parameter name for the lifecycle identifier of the {@link Lifecycle}
     * instance to be utilized.
     * </p>
     */
    public static final String LIFECYCLE_ID_ATTR = "javax.faces.LIFECYCLE_ID";

    /**
     * <p class="changed_added_2_3">
     * The <code>ServletContext</code> init parameter consulted by the runtime to tell if the
     * automatic mapping of the {@code FacesServlet} to the extension {@code *.xhtml} should be
     * disabled. The implementation must disable this automatic mapping if and only if the value of
     * this parameter is equal, ignoring case, to {@code true}.
     * </p>
     *
     * <p>
     * If this parameter is not specified, this automatic mapping is enabled as specified above.
     * </p>
     */
    public static final String DISABLE_FACESSERVLET_TO_XHTML_PARAM_NAME = "javax.faces.DISABLE_FACESSERVLET_TO_XHTML";
    
    /**
     * <p>
     * Acquire the factory instances we will require.
     * </p>
     *
     * @throws ServletException if, for any reason, the startup of this Faces application failed.
     *             This includes errors in the config file that is parsed before or during the
     *             processing of this <code>init()</code> method.
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p class="changed_modified_2_0">
     * <span class="changed_modified_2_2">Process</span> an incoming request, and create the
     * corresponding response according to the following specification.
     * </p>
     *
     * <div class="changed_modified_2_0">
     *
     * <p>
     * If the <code>request</code> and <code>response</code> arguments to this method are not
     * instances of <code>HttpServletRequest</code> and <code>HttpServletResponse</code>,
     * respectively, the results of invoking this method are undefined.
     * </p>
     *
     * <p>
     * This method must respond to requests that <span class="changed_modified_2_2">contain</span>
     * the following strings by invoking the <code>sendError</code> method on the response argument
     * (cast to <code>HttpServletResponse</code>), passing the code
     * <code>HttpServletResponse.SC_NOT_FOUND</code> as the argument.
     * </p>
     *
     * <pre>
     * <code>
     * /WEB-INF/
     * /WEB-INF
     * /META-INF/
     * /META-INF
     * </code>
     * </pre>
     * 
     * <p>
     * If none of the cases described above in the specification for this method apply to the
     * servicing of this request, the following action must be taken to service the request.
     * </p>
     * 
     * <p>
     * Acquire a {@link FacesContext} instance for this request.
     * </p>
     * 
     * <p>
     * Acquire the <code>ResourceHandler</code> for this request by calling
     * {@link javax.faces.application.Application#getResourceHandler}. Call
     * {@link javax.faces.application.ResourceHandler#isResourceRequest}. 
     * 
     * If this returns <code>true</code> call {@link javax.faces.application.ResourceHandler#handleResourceRequest}.
     * 
     * If this returns <code>false</code>, <span class="changed_added_2_2">call {@link javax.faces.lifecycle.Lifecycle#attachWindow} 
     * followed by </span> {@link javax.faces.lifecycle.Lifecycle#execute} followed by
     * {@link javax.faces.lifecycle.Lifecycle#render}. 
     * 
     * If a {@link javax.faces.FacesException} is thrown in either case, extract the cause from the <code>FacesException</code>.
     * 
     * If the cause is <code>null</code> extract the message from the <code>FacesException</code>, put it inside
     * of a new <code>ServletException</code> instance, and pass the <code>FacesException</code>
     * instance as the root cause, then rethrow the <code>ServletException</code> instance. 
     * If the cause is an instance of <code>ServletException</code>, rethrow the cause. 
     * If the cause is an instance of <code>IOException</code>, rethrow the cause. 
     * 
     * Otherwise, create a new <code>ServletException</code> instance, passing the message from the cause, as the first
     * argument, and the cause itself as the second argument.
     * </p>
     * 
     * <p class="changed_modified_2_0_rev_a">
     * The implementation must make it so {@link javax.faces.context.FacesContext#release} is called
     * within a finally block as late as possible in the processing for the JSF related portion of
     * this request.
     * </p>
     * 
     * </div>
     *
     * @param req The servlet request we are processing
     * @param resp The servlet response we are creating
     *
     * @throws IOException if an input/output error occurs during processing
     * @throws ServletException if a servlet error occurs during processing
     * 
     */
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws IOException, ServletException {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
    /**
     * <p>
     * Release all resources acquired at startup time.
     * </p>
     */
    @Override
    public void destroy() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>
     * Return the <code>ServletConfig</code> instance for this servlet.
     * </p>
     */
    @Override
    public ServletConfig getServletConfig() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

    /**
     * <p>
     * Return information about this Servlet.
     * </p>
     */
    @Override
    public String getServletInfo() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }

}
