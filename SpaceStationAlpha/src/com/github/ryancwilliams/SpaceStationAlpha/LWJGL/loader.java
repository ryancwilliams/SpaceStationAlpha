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

package com.github.ryancwilliams.SpaceStationAlpha.LWJGL;

import java.io.File;
import org.lwjgl.LWJGLUtil;
import org.newdawn.slick.util.Log;

/**
 * This class is used to load resources required to run the LWJGL library.
 * @author ryancwilliams
 */
public class loader {
    
    /**
     * Relative path to the library.
     */
    private static final String RELATIVE_LIBARY_PATH = "lib";
    
    /**
     * Path to native directory relative to the Library Path.
     */
    private static final String NATIVE_SUB_PATH = "native";
    
    /**
     * Path to Linux natives directory relative to the native directory.
     */
    private static final String LINUX_NATIVE_SUB_PATH = "linux";
    
    /**
     * Path to Mac OS X natives directory relative to the native directory.
     */
    private static final String MACOSX_NATIVE_SUB_PATH = "maxosx";
    
    /**
     * Path to Windows natives directory relative to the native directory.
     */
    private static final String WINDOWS_NATIVE_SUB_PATH = "windows";
    
    /**
     * Loads the Libraries required for LWJGL.
     */
    public static void loadLibrary() {
        
        String nativePath = loader.getPath(LWJGLUtil.getPlatform());
        
        loader.addToLibraryPath(nativePath);
        
        Log.info("Added to java.library.path: " + nativePath);
        
    }
    
    /**
     * Creates a path to the natives directory based on the provided platform.
     * @param platform The integer returned from LWJGLUtil.getPlatform()
     * @return the path to this platforms natives.
     */
    private static String getPath(int platform) {
        // Create platform path varable
        String platformNativeSubPath = null;
        
        // Select platform path
        switch(platform) {
            case LWJGLUtil.PLATFORM_LINUX :
                platformNativeSubPath = loader.LINUX_NATIVE_SUB_PATH;
                break;
            case LWJGLUtil.PLATFORM_MACOSX :
                platformNativeSubPath = loader.MACOSX_NATIVE_SUB_PATH;
                break;
            case LWJGLUtil.PLATFORM_WINDOWS :
                platformNativeSubPath = loader.WINDOWS_NATIVE_SUB_PATH;
                break;
            default :
                throw new IllegalStateException(
                        "Encountered an unknown platform while " 
                        + "loading native libraries");
        }
        
        // create the full path
        String fullPath = new File(loader.RELATIVE_LIBARY_PATH).getAbsolutePath() 
                + File.separator + loader.NATIVE_SUB_PATH
                + File.separator + platformNativeSubPath;
        
        //Return the full path
        return fullPath;
    }
    
    /**
     * Adds the provided item to the class path.
     * @param item The item to add to the class path.
     */
    private static void addToClassPath(String item) {
        
        //The current class path
        String classPath = System.getProperty("java.class.path");
        
        //The platform class path separator
        String pathSeparator = System.getProperty("path.separator");
        
        //The new class path
        String newPath = classPath + pathSeparator + item;
        
        //Set the class path to the new class path
        System.setProperty("java.class.path", newPath);
    }
    
    /**
     * Adds the provided item to the library path.
     * @param item The item to add to the class path.
     */
    private static void addToLibraryPath(String item) {
        
        //The current class path
        String classPath = System.getProperty("java.library.path");
        
        //The platform class path separator
        String pathSeparator = System.getProperty("path.separator");
        
        //The new class path
        String newPath = classPath + pathSeparator + item;
        
        //Set the class path to the new class path
        System.setProperty("java.library.path", newPath);
    }
}
