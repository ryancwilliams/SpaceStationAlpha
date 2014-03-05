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
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

/**
 *
 * @author ryancwilliams
 */
public class Tile implements Renderable {
    
    /**
     * The image of this Tile.
     */
    private Image image;
    /**
     * The X coordinate on the tile grid.
     */
    private int coordX;
    /**
     * The Y coordinate on the tile grid.
     */
    private int coordY;

    /**
     * Creates a new Tile.
     * @param image The image to use for this tile
     * @param coordX The X coordinate of this tile on the tile grid. 
     * @param coordY The Y coordinate of this tile on the tile grid.
     */
    public Tile(Image image, int coordX, int coordY) {
        this.image = image;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void render(Graphics g, int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
