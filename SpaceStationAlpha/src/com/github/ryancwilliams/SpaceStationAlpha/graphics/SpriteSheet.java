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

import org.newdawn.slick.Image;

/**
 * A sheet of sprites that can be converted to sprites to be drawn individually.
 * @author ryancwilliams
 */
public class SpriteSheet {
    
    /**
     * The image this sheet is based off of.
     */
    private Image source;
    
    /**
     * Extracts a sub-image from this sprite sheet.
     * @param x The x coordinate of the sub-image
     * @param y The y coordinate of the sub-image
     * @param width The width of the sub-image
     * @param height The height of the sub-image
     * @return The image represent of the selected sub-image.
     */
    public Image extract(int x, int y, int width, int height) {
        return this.source.getSubImage(x, y, width, height);
    }
}
