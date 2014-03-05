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
import org.newdawn.slick.Image;

/**
 * A sprite that can be drawn.
 *
 * @author ryancwilliams
 */
public class Sprite implements Renderable {

    /**
     * The image of this sprite
     */
    private final Image sprite;

    /**
     * Creates a sprite from a image.
     *
     * @param image The image to create the sprite from
     */
    public Sprite(Image image) {
        this.sprite = image;
    }

    /**
     * Creates a sprite using a image extracted from a sprite sheet.
     *
     * @param spriteSheet The Sprite Sheet to extract from
     * @param x The x coordinate of the image on the sprite sheet.
     * @param y The y coordinate of the image on the sprite sheet.
     * @param width The width of the image on the sprite sheet.
     * @param height The height of the image on the sprite sheet.
     */
    public Sprite(SpriteSheet spriteSheet, int x, int y, int width, int height) {
        this(spriteSheet.extract(x, y, width, height));
    }

    /**
     * Gets the image of this sprite.
     *
     * @return the image of this sprite.
     */
    public Image getSprite() {
        return sprite;
    }

    /**
     * Gets the width of this sprite.
     *
     * @return the width of this sprite
     */
    public int getWidth() {
        return this.sprite.getWidth();
    }

    /**
     * Gets the height of this sprite.
     *
     * @return The height of this sprite.
     */
    public int getHeight() {
        return this.sprite.getHeight();
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(this.sprite, x, y);
    }
}
