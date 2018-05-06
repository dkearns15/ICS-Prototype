/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flinsafeprototype;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Darragh Kearns (kear0057)
 * 
 * The Locations class is essentially a TreeMap of a subclass called Location
 * It is used so that coordinates can be found for a point on the MapWithPointsPanel
 * by passing in a String with the location name. Each location must be hardcoded.
 * 
 * Could be abstracted further to allow for building it for different images.
 */
public class HelperLocations {
    //A TreeMap stores a key and a value, the key can be used to retrieve the value.
    //In this case, the String is the key, and is used to retrieve a location with coordinate details
    TreeMap<String, Location> locs = new TreeMap();

    //Constructor automatically adds locations to the TreeMap
    public HelperLocations() {
        locs.put("hub", new Location("hub", 136, 100));
        locs.put("humanities", new Location("humanities", 184, 105));
        locs.put("engineering", new Location("engineering", 181, 312));
    }
    
    
    /*
    * Gets the X coordinate on the map image for a location specified by 
    * the string
    */
    public int getLocationX(String location){
        Location temp = locs.get(location); //Returns null if it doesn't find it
        if(temp != null){ 
            return temp.getXval();
        }else{
            return 0;
        }
        
    }
    
    /*
    * Gets the X coordinate on the map image for a location specified by 
    * the string
    */
    public int getLocationY(String location){
        Location temp = locs.get(location); //Returns null if it doesn't find it
        if(temp != null){
            return temp.getYval();
        }else{
            return 0;
        }
    }
    
    /*
    * Subclass for Locations
    * Represents an individual location with a place name and x and y coords
    */
    class Location{
        String name;
        int xval;
        int yval;

        public String getName() {
            return name;
        }

        public int getXval() {
            return xval;
        }

        public int getYval() {
            return yval;
        }

        public Location(String name, int xval, int yval) {
            this.name = name;
            this.xval = xval;
            this.yval = yval;
        }
    }
}
