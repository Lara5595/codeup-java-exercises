import rpg.Monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_CollectionsLecture {
    public static void main(String[] args) {
        // DATA STRUCTURES
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
        // traditional for loop
        // Gives you access to the index
//        for (int i = 0; i < monsterArrayList.size(); i++) {      // you wont use length you will use .size now for a for loop of an array
//            if (i == monsterArrayList.size() - 1) {
//                System.out.printf("%s%n", monsterArrayList.get(i));
//            } else {
//                System.out.printf("%s,  ", monsterArrayList.get(i));
//            }
//        }


        // Enhanced for loop
        // Simpler syntax but no access to the index.

//        for ( Monster monster : monsterArrayList ){
//            System.out.println(monster.getHitPoints());
//        }


        // When creating an ArrayList of primitive data types, use the corresponding Object wrapper. ArrayLists can only contain objects
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1, 89, 34, -67, 98, 23));
        System.out.println(myNumbers);
        Collections.sort(myNumbers);  // collections.sort mutates the array it does not return a new one .sort, sorts the numbers from min to max
        System.out.println(myNumbers);

        ArrayList<String> randomWords = new ArrayList<>(List.of("version", "suntan", "rate", "defeat", "bond", "later"));
        Collections.sort(randomWords);
        System.out.println(randomWords); // sorts the array from a-z

        randomWords.sort(Collections.reverseOrder()); // This reverses the order
        System.out.println(randomWords);


        // Sorting monstersObjects
        // We use the Comparator class util


        // If you want to compare custom objects rahter than numbers or strings,
        // A simple method is to call .sort() on the list and pass it
        // Comparator.comparing(NameOfObject::getterForWhatYouWantToCompare)
        // so to compare monsters by hit points, I use Monster::getHitPoints
        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints));
        System.out.println(monsterArrayList);  // It orders it from the least hit points to greater hit points

        // If i want to sort custom objects by properties in reverse order, it's
        // a little more complex. One technique is to implement Comparator in the class
        // and override the compare() method (see code in Monster Class)

        //To use the compare() method that we wrote in the Monster calls
        //we use the sort method and pass it a no-arg Constructor
        monsterArrayList.sort(new Monster());
        System.out.println(monsterArrayList);






    } // end of main
} // end of collection
