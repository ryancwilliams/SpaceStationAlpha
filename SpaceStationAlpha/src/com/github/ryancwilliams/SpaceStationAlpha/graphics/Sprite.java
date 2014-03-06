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
 * A sprite that can be drawn. Sprites have names attached to them to make
 * working with a registry easer. Sprites without names are given the name of
 * null and can not be loaded into a registry.
 *
 * @author ryancwilliams
 */
public class Sprite implements Renderable {

    /**
     * The image of this sprite
     */
    private final Image SPRITE;
    /**
     * The name of this sprite
     */
    private final String NAME;

    /**
     * Creates a named sprite from a image.
     *
     * @param name The name of this sprite.
     * @param image The image to create the sprite from
     */
    public Sprite(String name, Image image) {
        this.NAME = name;
        this.SPRITE = image;
    }

    /**
     * Creates a sprite from a image. This sprite will be nameless so it can not
     * be loaded into a registry.
     *
     * @param image The image to create the sprite from
     */
    public Sprite(Image image) {
        this(null, image);
    }

    /**
     * Creates a named sprite using a image extracted from a sprite sheet.
     *
     * @param name The name of this sprite.
     * @param spriteSheet The Sprite Sheet to extract from
     * @param x The x coordinate of the image on the sprite sheet.
     * @param y The y coordinate of the image on the sprite sheet.
     * @param width The width of the image on the sprite sheet.
     * @param height The height of the image on the sprite sheet.
     */
    public Sprite(String name, SpriteSheet spriteSheet,
            int x, int y, int width, int height) {
        this(name, spriteSheet.extract(x, y, width, height));
    }

    /**
     * Creates a sprite using a image extracted from a sprite sheet. This sprite
     * will be nameless so it can not be loaded into a registry.
     *
     * @param spriteSheet The Sprite Sheet to extract from
     * @param x The x coordinate of the image on the sprite sheet.
     * @param y The y coordinate of the image on the sprite sheet.
     * @param width The width of the image on the sprite sheet.
     * @param height The height of the image on the sprite sheet.
     */
    public Sprite(SpriteSheet spriteSheet, int x, int y, int width, int height) {
        this(null, spriteSheet, x, y, width, height);
    }

    /**
     * Gets the image of this sprite.
     *
     * @return the image of this sprite.
     */
    public Image getSprite() {
        return SPRITE;
    }

    /**
     * Gets the width of this sprite.
     *
     * @return the width of this sprite
     */
    public int getWidth() {
        return this.SPRITE.getWidth();
    }

    /**
     * Gets the height of this sprite.
     *
     * @return The height of this sprite.
     */
    public int getHeight() {
        return this.SPRITE.getHeight();
    }

    @Override
    public void initialize() {

    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(this.SPRITE, x, y);
    }
}
