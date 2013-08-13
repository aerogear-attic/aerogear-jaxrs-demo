/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.aerogear.controller.demo;

import org.jboss.aerogear.security.auth.AuthenticationManager;
import org.picketlink.idm.model.sample.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.logging.Logger;

@Stateless
public class Login {

    private static final Logger LOGGER = Logger.getLogger(Login.class.getSimpleName());

    @Inject
    private AuthenticationManager authenticationManager;

    public void index() {
        LOGGER.info("Login page!");
    }

    /**
     * User registration
     *
     *
     * @param user represents a simple implementation that holds user's credentials.
     * @param password
     * @return HTTP response and the session ID
     */
    public User login(final User user, String password) {

        authenticationManager.login(user, password);
        return user;
    }

    public void logout() {
        LOGGER.info("User logout!");
        authenticationManager.logout();
    }
}
