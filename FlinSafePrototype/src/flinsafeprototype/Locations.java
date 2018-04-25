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
 */
public class Locations {
    //ArrayList<Location> locs = new ArrayList();
    TreeMap<String, Location> locs = new TreeMap();

    public Locations() {
        locs.put("hub", new Location("hub", 136, 100));
        locs.put("humanities", new Location("humanities", 184, 105));
        locs.put("engineering", new Location("engineering", 181, 312));
    }
    
    public int getLocationX(String location){
        Location temp = locs.get(location);
        if(temp != null){
            return temp.getXval();
        }else{
            return 0;
        }
        
    }
    
    public int getLocationY(String location){
        Location temp = locs.get(location);
        if(temp != null){
            return temp.getYval();
        }else{
            return 0;
        }
    }
    

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
