/*
 * Copyright 2014 ryancwilliams.
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

package com.github.ryancwilliams.SpaceStationAlpha;

/**
 * This interface is used render all objects that are Renderable.
 * @author ryancwilliams
 */
public interface Renderable {
    /**
     * This method contains the code used to initialize 
     * this Renderable so it can be rendered.
     */
    public void initialize();
    /**
     * This method contains the code used to render this Renderable.
     */
    public void render();
}
