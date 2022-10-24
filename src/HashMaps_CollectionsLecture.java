import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class HashMaps_CollectionsLecture {
    public static void main(String[] args) {
        // Created Monster Objects
        Monster orc = new Monster(12, 15, 9, "Orc"); // This creates the monsters by using the monsters constructor
        Monster ogre = new Monster(11, 59, 13, "Ogre");
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138 ,25, "Frost Giant");
        Monster goblin = new Monster(15, 7 ,5, "Goblin");
        Monster werewolf = new Monster(11, 58 ,7, "Werewolf");

        // Created new orcChief to replace the regular orc
        Monster orcWarChief = new Monster(16, 93, 15, "Orc War Chief");

        // Create a new HashMap defining the key and value data type between angle brackets
        HashMap<String, Monster> monsterHashMap = new HashMap<>(); // creating the hashmap

        // Add a key-value pair to the hashmap using .put()
        monsterHashMap.put("orc", orc);   // This creates the org with key and value
        // Access a value in the hashmap using .get() with the key
        System.out.println(monsterHashMap.get("orc"));  // This gets the orc's name
        System.out.println(monsterHashMap.get("orc").getHitPoints());  // this gets the hit points

        // Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // To add Multiple objects to a hashmap at once
        // use Map.ofEntries
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );
        monsterHashMap.putAll(intermediateMap);  // This puts all the objects in monsterHashMap
        System.out.println(monsterHashMap.get("frost giant")); // you can now call a object with .get and their key
        System.out.printf("The frost giant has %d hit points%n", frostGiant.getHitPoints()); // This how you would get the hitpoints
//        System.out.println(monsterHashMap.get("frost giant").getHitPoints());


        // Looping over HashMaps. Technique 1:
        // use .entrySet to derive a set of entries
        // Each Entry is represented as a Map.Entry<DataTypeOfKey, DataTypeOfValue>
        // Once you have an entrySet you can use an enhanced for loop to loop over it.
        for (Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();  // we created this variable, so we can you just monster instead of monster.getValue() everytime
            System.out.printf("The %s has %d hit points, an armor class of %d%n", monster, monster.getHitPoints(), monster.getArmorClass());
        }

        // To create a list of specific properties in the objects
        // stored as HashMap values, we can use .keySet().stream().toList()

        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        // Once I've got a list, I can sort it and do other List things to it
        Collections.sort(monsterNames);
        System.out.println(monsterNames);



    } // end of main
}// End of hash maps
