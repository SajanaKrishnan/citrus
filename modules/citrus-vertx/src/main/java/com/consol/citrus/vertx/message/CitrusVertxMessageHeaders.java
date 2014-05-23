/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.consol.citrus.vertx.message;

import com.consol.citrus.message.CitrusMessageHeaders;

/**
 * @author Christoph Deppisch
 * @since 1.4.1
 */
public abstract class CitrusVertxMessageHeaders {

    /**
     * Prevent instantiation.
     */
    private CitrusVertxMessageHeaders() {
    }

    /** Special header prefix for http transport headers in SOAP message sender */
    public static final String VERTX_PREFIX = CitrusMessageHeaders.PREFIX + "vertx_";

    public static final String VERTX_ADDRESS = VERTX_PREFIX + "address";

    public static final String VERTX_REPLY_ADDRESS = VERTX_PREFIX + "reply_address";
}