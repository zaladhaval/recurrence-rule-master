/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.calendar.recurrence;
/**
 * The FREQ rule part identifies the type of recurrence rule.
 * <blockquote>This rule part MUST be specified in the recurrence rule.
 * <ul>
 * 	<li>DAILY： to specify repeating based on an interval of a day</li>
 * 	<li>WEEKLY： to specify repeating based on an interval of a week</li>
 * 	<li>MONTHLY： to specify repeating based on an interval of a month</li>
 * </blockquote>
 * @author <a href="mailto:raindy.ye@outlook.com">Raindy, Ye</a>
 *
 */
public enum Frequency {
	// in order of increasing length
	DAILY, WEEKLY, MONTHLY,YEARLY;
}