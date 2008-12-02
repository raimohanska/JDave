/*
 * Copyright 2007 the original author or authors.
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
package jdave.wicket;

import jdave.junit4.JDaveRunner;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.junit.runner.RunWith;

/**
 * @author Joni Freeman
 */
@RunWith(JDaveRunner.class)
public class GenerifiedComponentSpec extends ComponentSpecification<GenerifiedComponent<Void>> {
    public class Any {
        public void startComponentDoesNotThrowExceptionBugFix() {
            startComponent();
        }
    }
    
    @Override
    protected <M> GenerifiedComponent<Void> newComponent(String id, IModel<M> model) {
        return new GenerifiedComponent<Void>(id);
    }
}

class GenerifiedComponent<T> extends WebMarkupContainer {
    public GenerifiedComponent(String id) {
        super(id);
    }
}