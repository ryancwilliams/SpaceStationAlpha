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
package com.github.ryancwilliams.SpaceStationAlpha.resources;

import com.github.ryancwilliams.SpaceStationAlpha.graphics.Sprite;
import com.github.ryancwilliams.SpaceStationAlpha.graphics.SpriteSheet;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 *
 * @author ryancwilliams
 */
public class SpriteSheetLoader {

    public static List<Sprite> readSprites(InputStream xmlFile, SpriteSheet spriteSheet) {
        List<Sprite> sprites = new ArrayList<>();
        try {
            //Create a new XML inputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();

            //Set up a event reader
            XMLEventReader eventReader = inputFactory.createXMLEventReader(xmlFile);

        } catch (XMLStreamException ex) {
            Logger.getLogger(SpriteSheetLoader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sprites;
    }

    /**
     * Parses the XML file.
     *
     * @param eventReader The event reader to parse from.
     * @return A list of objects containing all entries in the XML file.
     */
    private static List<Sprite> parseXML(XMLEventReader eventReader, SpriteSheet spriteSheet)
            throws XMLStreamException {
        List<Sprite> sprites = new ArrayList<>();

        while (eventReader.hasNext()) {
            //Extract a event.
            XMLEvent event = eventReader.nextEvent();

            //Check if event is a start element
            if (event.isStartElement()) {
                StartElement startElement = event.asStartElement();
            }
        }

        return sprites;
    }
}
