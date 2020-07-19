package exercise.Stefan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static Map<Integer, Location> locations = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("QUIT", "Q");

        int loc = 1;
        while (loc != 0) {
            System.out.println(locations.get(loc).getDescription());

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available directions are: ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");

                for (String i : words) {
                    if (vocabulary.containsKey(i)) {
                        direction = vocabulary.get(i);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction))
                loc = exits.get(direction);
            else
                System.out.println("You cannot go in that direction");
        }
    }

    /*private static String alternativeGetCharDirection () {
        String newDirection = null;
        String[] direction = scanner.nextLine().toUpperCase().split(" ");

        for (String i : direction) {
            if (i.equals("E") || i.equals("W") || i.equals("N") || i.equals("S") || i.equals("Q")) {
                newDirection = i;
                break;
            } else if (i.equals("EAST") || i.equals("WEST") || i.equals("NORTH") || i.equals("SOUTH") || i.equals("QUIT"))
                newDirection = String.valueOf(i.charAt(0));
        }

        return newDirection;
    }*/

}
