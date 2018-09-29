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


import javax.faces.context.ExceptionHandlerFactory;
import javax.faces.context.ExceptionHandler;
import javax.faces.application.FacesMessage;
import javax.faces.component.UpdateModelException;
import javax.faces.context.FacesContext;


/**
 * <p class="changed_added_2_0">This {@link ExceptionHandlerFactory} instance 
 * produces JSF 1.2 compatible
 * {@link ExceptionHandler} instances.  The {@link ExceptionHandler#handle} 
 * method of the <code>ExceptionHandler</code> produced by this factory must 
 * meet the following requirements</p>
 * <div class="changed_added_2_0">
 * 
 * <ul>
 * 
 * <li><p>Any
 * exceptions thrown before or after phase execution will be logged and 
 * swallowed.</p></li>
 * 
 * <li><p>The implementation must examine
 * the <code>Exception</code> within each of the unhandled exception
 * events.  If the <code>Exception</code> is an instance of
 * {@link UpdateModelException}, extract the {@link FacesMessage} from
 * the <code>UpdateModelException</code>.  Log a <code>SEVERE</code>
 * message to the log and queue the <code>FacesMessage</code> 
 * on the {@link FacesContext}, using the <code>clientId</code> of
 * the source component in a call to 
 * {@link FacesContext#addMessage(java.lang.String, javax.faces.application.FacesMessage)}</p></li>
 * 
 * </ul>
 * 
 * </div>
 *
 * @since 2.0
 */
public class PreJsf2ExceptionHandlerFactory extends ExceptionHandlerFactory {

    public PreJsf2ExceptionHandlerFactory() {
    }


    // ------------------------------------ Methods from ExceptionHandlerFactory


    /**
     * @return a new {@link ExceptionHandler} that behaves in a fashion compatible
     *  with specifications prior to JavaServerFaces 1.2
     */
    @Override
    public ExceptionHandler getExceptionHandler() {
        throw new UnsupportedOperationException("This is API for compile only purposes.");
    }
    
}
