/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.executor.sql.fixture;

import org.apache.shardingsphere.infra.executor.kernel.model.ExecutionGroup;
import org.apache.shardingsphere.infra.executor.sql.prepare.ExecutionPrepareDecorator;
import org.apache.shardingsphere.infra.route.context.RouteContext;
import org.apache.shardingsphere.test.fixture.infra.rule.MockedRule;

import java.util.Collection;
import java.util.Collections;

public final class FixtureExecutionPrepareDecorator implements ExecutionPrepareDecorator<Object, MockedRule> {
    
    @Override
    public Collection<ExecutionGroup<Object>> decorate(final RouteContext routeContext, final MockedRule rule, final Collection<ExecutionGroup<Object>> executionGroups) {
        return Collections.emptyList();
    }
    
    @Override
    public int getOrder() {
        return 0;
    }
    
    @Override
    public Class<MockedRule> getTypeClass() {
        return MockedRule.class;
    }
}
