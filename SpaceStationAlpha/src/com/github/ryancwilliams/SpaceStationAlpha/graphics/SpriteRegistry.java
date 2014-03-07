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

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * A Registry of the sprites loaded in the game.
 *
 * @author ryancwilliams
 */
public class SpriteRegistry {

    /**
     * The Map representing the Registry.
     */
    private static final Map<String, Sprite> SPRITES = new TreeMap<>();
    /**
     * The null sprite. This sprite is displayed in place of a sprite that can
     * not be loaded.
     */
    private static final Sprite NULL_SPRITE;
    /**
     * The reference to the null sprite in the file system.
     */
    private static final String NULL_REF = "res/null.png";

    static {
        //Create a holdeing varable
        Sprite nullSprite = null;
        // Load the Null Sprite
        try {
            //Load the Null Sprite into the holding varable 
            nullSprite = new Sprite(new Image(NULL_REF));
        } catch (SlickException ex) {
            Logger.getLogger(SpriteRegistry.class.getName())
                    .log(Level.SEVERE, "Can not access res/null.png", ex);
        }
        //Store the holding varable to the NULL_SPRITE constent
        NULL_SPRITE = nullSprite;
    }

    /**
     * Adds the sprite to the registry.
     *
     * @param sprite The sprite to add to the registry.
     */
    public static void addSprite(Sprite sprite) {
        //Extract the key
        String key = sprite.getName();

        //Check if the key is regestered
        if (SPRITES.containsKey(key)) {
            //The key is regestered
            throw new IllegalArgumentException("A sprite with the name \""
                    + key + "\" is already regestered.");
        } else {
            //The key is not regestered
            SPRITES.put(key, sprite);
        }
    }

    /**
     * Gets the sprite from the registry with the provided name.
     *
     * @param name The name of the sprite to get.
     * @return The sprite requested OR the NULL_SPRITE if the sprite requested
     * is not registered.
     */
    public static Sprite getSprite(String name) {
        //Check if the sprite is in the Registry.
        if (spriteIsRegistered(name)) {
            //The Sprite is registered.
            return SPRITES.get(name);
        } else {
            //The Sprite is not registered.
            org.newdawn.slick.util.Log.error("A sprite with the name \""
                    + name + "\" is not regestered.");
            return NULL_SPRITE;
        }
    }

    /**
     * Checks if a sprite is in the Registry.
     *
     * @param name The name of the sprite to check.
     * @return TRUE if this sprite is in the Registry.
     */
    public static boolean spriteIsRegistered(String name) {
        return SPRITES.containsKey(name);
    }

    /**
     * Gets the null sprite. This is the sprite is displayed in place of a
     * sprite that can not be loaded.
     *
     * @return The null sprite.
     */
    public static Sprite getNullSprite() {
        return NULL_SPRITE;
    }

    /**
     * Gets the number of sprites in the Registry.
     *
     * @return the number of sprites in the Registry.
     */
    public static int getSpriteCount() {
        return SPRITES.size();
    }
}
