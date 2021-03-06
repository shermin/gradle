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

package org.gradle.play.internal.twirl;

import org.gradle.play.platform.PlayPlatform;

public class TwirlCompileSpecFactory {
    public static VersionedTwirlCompileSpec create(TwirlCompileSpec spec, PlayPlatform playPlatform) {
        TwirlCompilerVersion version = TwirlCompilerVersion.parse(playPlatform.getTwirlVersion());
        switch (version) {
            case V_22X:
                return new TwirlCompileSpecV22X(spec.getSourceDirectory(), spec.getSources(), spec.getDestinationDir(), spec.getForkOptions(), spec.isJavaProject(), playPlatform.getTwirlVersion(), playPlatform.getScalaMainVersion());
            case V_10X:
                return new TwirlCompileSpecV10X(spec.getSourceDirectory(), spec.getSources(), spec.getDestinationDir(), spec.getForkOptions(), spec.isJavaProject(), playPlatform.getTwirlVersion(), playPlatform.getScalaMainVersion());
            default:
                throw new RuntimeException("Could not create Play Twirl compile spec for version: " + version);
        }
    }
}
