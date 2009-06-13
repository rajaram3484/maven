package org.apache.maven.project.inheritance;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.model.Build;
import org.apache.maven.model.Model;

/**
 * @author Jason van Zyl
 * @version $Id$
 * @deprecated
 */
@Deprecated
public interface ModelInheritanceAssembler
{
    String ROLE = ModelInheritanceAssembler.class.getName();

    void assembleBuildInheritance( Build childBuild, Build parentBuild, boolean handleAsInheriance );

    void copyModel( Model dest, Model source );
}