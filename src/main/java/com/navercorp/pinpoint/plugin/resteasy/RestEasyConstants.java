/**
 * Copyright 2014 NAVER Corp.
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
package com.navercorp.pinpoint.plugin.resteasy;

import static com.navercorp.pinpoint.common.trace.ServiceTypeProperty.*;

import com.navercorp.pinpoint.common.trace.ServiceType;
import com.navercorp.pinpoint.common.trace.ServiceTypeFactory;

public final class RestEasyConstants {
    private RestEasyConstants() {}

    public static final String TYPE_NAME = "RESTEASY";
    public static final ServiceType RESTEASY = ServiceTypeFactory.of(1910, "RESTEASY", RECORD_STATISTICS);
    public static final ServiceType RESTEASY_METHOD = ServiceTypeFactory.of(1911, "RESTEASY_METHOD");
}
