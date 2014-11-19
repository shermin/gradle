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

package org.gradle.play.integtest.fixtures.app

import org.gradle.integtests.fixtures.SourceFile
import org.gradle.test.fixtures.file.TestFile

abstract class PlayApp {
    List<SourceFile> getAllFiles() {
        return appSources + testSources + viewSources + assetSources + confSources
    }

    abstract List<SourceFile> getAppSources();
    abstract List<SourceFile> getViewSources();
    abstract List<SourceFile> getTestSources();
    abstract List<SourceFile> getAssetSources();
    abstract List<SourceFile> getConfSources();

    protected SourceFile sourceFile(String path, String name, String content) {
        return new SourceFile(path, name, content);
    }

    void writeSources(TestFile sourceDir) {
        for (SourceFile srcFile : allFiles) {
            srcFile.writeToDir(sourceDir)
        }
    }
}