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


import com.github.ryancwilliams.SpaceStationAlpha.*;
import com.github.ryancwilliams.SpaceStationAlpha.graphics.Sprite;
import com.github.ryancwilliams.SpaceStationAlpha.graphics.SpriteSheet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 *
 * @author ryancwilliams
 */
public class TestGame extends org.newdawn.slick.BasicGame {

    /**
     * Default Game name.
     */
    public static final String GAME_NAME = "Space Station Alpha";
    /**
     * Width of the game.
     */
    private static int width = 640;
    /**
     * Height of the game.
     */
    private static int height = 480;
    /**
     * Game is full screen.
     */
    private static boolean fullscreen = false;
    /**
     * FPS counter is enabled.
     */
    private static boolean fpsCounter = false;

    public TestGame(String title) {
        super(title);
    }

    public static void main(String[] args) {
        TestGame.loadGame();
    }

    /**
     * Load the game in a new game window.
     */
    public static void loadGame() {
        //Create a new game
        TestGame game = new TestGame(TestGame.GAME_NAME);

        try {
            //Create a game container
            AppGameContainer gameContainer = new AppGameContainer(game);
            //Set up the game display
            gameContainer.setDisplayMode(TestGame.width, TestGame.height, TestGame.fullscreen);

            //Set up FPS counter
            gameContainer.setShowFPS(TestGame.fpsCounter);
            
            //Start the game
            gameContainer.start();
        } catch (SlickException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadResources() throws SlickException {
        SpriteSheet sheet1 = new SpriteSheet("res/test.png");
        
        sprite1 = new Sprite(sheet1, 0, 0, 32, 16);
    }

    Sprite sprite1;
    
    @Override
    public void init(GameContainer container) throws SlickException {
        
        loadResources();
        
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(GameContainer container, Graphics g) throws SlickException {
        g.scale(2, 2);
        sprite1.render(g, 25, 25);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
