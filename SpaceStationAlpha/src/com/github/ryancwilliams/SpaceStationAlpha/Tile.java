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

import com.github.ryancwilliams.SpaceStationAlpha.graphics.Renderable;
import com.github.ryancwilliams.SpaceStationAlpha.graphics.Sprite;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 * A basic Tile
 *
 * @author ryancwilliams
 */
public class Tile implements Renderable {

    /**
     * The sprite that is displayed when this is rendered.
     */
    protected Sprite sprite;
    /**
     * The X coordinate on the tile grid.
     */
    private int coordX;
    /**
     * The Y coordinate on the tile grid.
     */
    private int coordY;
    /**
     * The width of this tile on the tile grid.
     */
    private final int WIDTH;
    /**
     * The height of this tile on the tile grid.
     */
    private final int HEIGHT;

    /**
     * Creates a new Tile.
     *
     * @param sprite The sprite to use for this tile
     * @param coordX The X coordinate of this tile on the tile grid
     * @param coordY The Y coordinate of this tile on the tile grid
     * @param width The width of this tile on the tile grid
     * @param height he height of this tile on the tile grid
     */
    public Tile(Sprite sprite, int coordX, int coordY, int width, int height) {
        this.sprite = sprite;
        this.coordX = coordX;
        this.coordY = coordY;
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    /**
     * Creates a new 1 by 1 Tile.
     *
     * @param sprite The sprite to use for this tile
     * @param coordX The X coordinate of this tile on the tile grid
     * @param coordY The Y coordinate of this tile on the tile grid
     */
    public Tile(Sprite sprite, int coordX, int coordY) {
        this(sprite, coordX, coordY, 1, 1);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void render(Graphics g, int x, int y) {
        sprite.render(g, x, y);
    }
}
