import rpg.Monster;

import java.util.ArrayList;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {

        // ArrayList

        ArrayList<Monster> monsterArrayList = new ArrayList<>();   //This creates a empty array list
        Monster orc = new Monster(12, 15, 9, "Orc"); // This creates the monsters by using the monsters constructor
        Monster ogre = new Monster(11, 59, 13, "Ogre");

        // We created new monster to add them in a different way then just going one by one
        Monster blueDragon = new Monster(19, 225, 23, "Blue Dragon");
        Monster frostGiant = new Monster(15, 138 ,25, "Frost Giant");
        Monster goblin = new Monster(15, 7 ,5, "Goblin");
        Monster werewolf = new Monster(11, 58 ,7, "Werewolf");


        monsterArrayList.add(orc);      // This adds orc to the array
        System.out.println(monsterArrayList.size()); // Instead of .length property we have a .size property
        System.out.println(monsterArrayList.get(0).getName());    // If you want to get something from the array you use .get
        monsterArrayList.add(ogre); // This adds the ogre to the array list
        System.out.println(monsterArrayList.size()); // the size of the array is now 2
        System.out.println(monsterArrayList.get(1).getName());
        System.out.println(monsterArrayList); // This prints out the whole array  we can print it like this because we have a method on  monsters

        // How to add multiple objects to a new array list
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon,frostGiant, werewolf));
        System.out.println(newMonsterList); // We created a new array, but now we want to combine them

        // This adds all the monster from the new to the old array
//        monsterArrayList.addAll(newMonsterList);
//        newMonsterList = monsterArrayList; // You don't have to do this but this destroys the old list and makes the new list have all the monsters also
//        System.out.println(monsterArrayList);
//        System.out.println(newMonsterList.size()); // It updated the list to 6

        // OR you can do this to add monsters without creating the newArrayList and add them to the existing array list
        monsterArrayList.addAll(new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf))); // This is another way we can add monsters to the array


        // Loop over arrayLists
        // traditonal for loop
        // Gives you access to the index
        for (int i = 0; i < monsterArrayList.size(); i++) {      // you wont use length you will use .size now for for loop of an array
            if (i == monsterArrayList.size() - 1) {
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s,  ", monsterArrayList.get(i));
            }
        }


        // Enhanced for loop
        // Simpler syntax but no access to the index.

        for ( Monster monster : monsterArrayList ){
            System.out.println(monster.getHitPoints());
        }

    } // end of main
} // end of collection
