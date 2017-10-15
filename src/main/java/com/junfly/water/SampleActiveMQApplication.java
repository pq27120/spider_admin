/*
 * Copyright 2012-2015 the original author or authors.
 *
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
 */

package com.junfly.water;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SampleActiveMQApplication {

//	@Bean(name = "water_trail.queue")
//	public Queue queue() {
//		return new ActiveMQQueue("water_trail.queue");
//	}
//
//	@Bean(name = "water_level.queue")
//	public Queue waterWarnQueue() {
//		return new ActiveMQQueue("water_level.queue");
//	}

	public static void main(String[] args) {
		SpringApplication.run(SampleActiveMQApplication.class, args);
	}
}