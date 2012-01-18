/*
 * Copyright 2011 the original author or authors.
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
package org.gradle.api.artifacts.cache;

import java.util.concurrent.TimeUnit;

/**
 * Command methods for controlling dependency resolution via the DSL.
 */
public interface ResolutionControl {
    /**
     * States that the cached value should be used if it is no older than the specified duration.
     * @param value The number of units
     * @param units The time units
     */
    void cacheFor(int value, TimeUnit units);

    /**
     * States that the cached value should be used regardless of age.
     * If not cachedResult is available, resolution should fail.
     */
    void useCachedResult();

    /**
     * States that any cached value should be ignored, forcing a fresh resolve.
     */
    void refresh();
}
