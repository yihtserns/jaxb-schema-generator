/*
 * Copyright 2015 yihtserns.
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
package com.github.yihtserns.jaxb.schema.generator.ap;

import com.sun.tools.jxc.ap.SchemaGenerator;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;

/**
 *
 * @author yihtserns
 */
@SupportedAnnotationTypes("javax.xml.bind.annotation.*")
public class JaxbSchemaGenerator extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment re) {
        Map<String, File> namespaceUri2OutputFile = new HashMap<String, File>();
        Processor schemaGenerator = new SchemaGenerator(namespaceUri2OutputFile);
        schemaGenerator.init(processingEnv);

        return schemaGenerator.process(set, re);
    }
}
