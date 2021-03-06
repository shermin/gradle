/*
 * Copyright 2014 the original author or authors.
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

package org.gradle.play.platform;

import org.gradle.api.JavaVersion;
import org.gradle.platform.base.Platform;

/**
 * Defines and configures a Play Framework environment including versions of Play, Scala and Java.
 * */
public interface PlayPlatform extends Platform {

    public String getPlayVersion();

    public String getScalaVersion();

    public String getScalaMainVersion();

    public String getTwirlVersion();

    public JavaVersion getJavaVersion();
}
