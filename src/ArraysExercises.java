import rpg.Monster;

import java.util.Arrays;

public class ArraysExercises {

    private String name;


    // Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    // Constructor
    public ArraysExercises(String name) {
        this.name = name;
    }


    // Method
    public String toString(){
        return name;
    }



} // End of ArrayExercises



   // We need Person[] because we need to tell it's an array, and then we name it addPerson. It needs two parameters Person[] old array to get the old array, and one for the person we are adding. We create our new array for the copy and then use Array.copyof the old array to the new array with a length of +1 so it has a bigger array. Then we set the new array to a -1 to add the person in the end and return the new person.

//    public static Person[] addPerson(Person[] oldArray, Person newPerson) {
//        Person[] copyPersonArray = Arrays.copyOf(oldArray,oldArray.length+1);
//        copyPersonArray[copyPersonArray.length-1] = newPerson;
//        return copyPersonArray;
//    }