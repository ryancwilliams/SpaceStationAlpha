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
package com.github.ryancwilliams.SpaceStationAlpha.graphics;

import org.newdawn.slick.Graphics;

/**
 * This interface is used render all objects that are Renderable.
 *
 * @author ryancwilliams
 */
public interface Renderable {

    /**
     * This method is used to initialize this Renderable so it can be rendered.
     */
    public void initialize();

    /**
     * This method is used to render this Renderable.
     *
     * @param g The graphics context that can be used to render. However, normal
     * rendering routines can also be used.
     * @param x The x coordinate on the screen to render this Renderable at.
     * @param y The y coordinate on the screen to render this Renderable at.
     */
    public void render(Graphics g, int x, int y);
}
