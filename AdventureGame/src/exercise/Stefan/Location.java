package exercise.Stefan;

import java.util.HashMap;
import java.util.Map;

final class Location {

    private final int locationID;
    private final String descriptionOfLocation;
    private final Map<String, Integer> exits;

    Location(int locationID, String descriptionOfLocation, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.descriptionOfLocation = descriptionOfLocation;
        if (exits != null)
            this.exits = new HashMap<>(exits);
        else
            this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

//    void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    String getDescription() {
        return descriptionOfLocation;
    }

    Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }


}
