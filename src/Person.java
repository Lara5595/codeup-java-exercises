import java.util.Arrays;

public class Person {

    private String name;

// Getter
    public String getName(){
//TODO: return the person's name
        return name;
    }
// Setter
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    // Methods


    // We need Person[] because we need to tell  it's an array, and then we name it addPerson. It needs two parameters Person[] old array to get the old array, and one for the person we are adding. We create our new array for the copy and then use Array.copyof the old array to the new array with a length of +1, so it has a bigger array. Then we set the new array to a -1 to add the person in the end and return the new person.
    public static Person[] addPerson(Person[] oldArray, Person newPerson) {
        Person[] copyPersonArray = Arrays.copyOf(oldArray,oldArray.length+1);
        copyPersonArray[copyPersonArray.length-1] = newPerson;
        return copyPersonArray;
    }

    // or
//    public static Person[] addPerson(Person[] oldArray, Person newPerson){
//        Person [] newPeopleArray;
//        newPeopleArray = new Person[oldArray.length + 1];
//        for (int i = 0; i <= oldArray.length - 1; i++){
//           newPeopleArray[i] = oldArray[i];
//        }
//    }


    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + getName());
    }

    // We need this so we dont get hex code when we return the array
    public String toString(){
        return name;
    }


    //When creating a overload constructor is best to also create a constructor with no args
    public Person(){

    }

    //Constructor
    public Person(String name){
        this.name = name;
    }




}



