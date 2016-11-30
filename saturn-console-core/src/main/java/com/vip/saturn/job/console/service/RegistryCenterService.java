/**
 * Copyright 2016 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.saturn.job.console.service;

import com.vip.saturn.job.console.domain.RegistryCenterClient;
import com.vip.saturn.job.console.domain.RegistryCenterConfiguration;
import com.vip.saturn.job.console.domain.RequestResult;

import javax.servlet.http.HttpSession;
import java.util.Set;

public interface RegistryCenterService {
	
	RequestResult refreshRegCenter();
	
	void init() throws Exception;

    void add(RegistryCenterConfiguration config);
	
    RegistryCenterClient connect(String name);

    RegistryCenterClient connectByNamespace(String namespace);
    
    RegistryCenterConfiguration findActivatedConfig(HttpSession session);
    
    RegistryCenterConfiguration findConfig(String nameAndNamespace);

    RegistryCenterConfiguration findConfigByNamespace(String namespace);

    Set<RegistryCenterConfiguration> getConfigs();
    
}
