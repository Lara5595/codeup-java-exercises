package AssesmentPractice;

//        6. Create a PetDog class that inherits from Pet.

   abstract public class PetDog extends Pet implements Companion  {

    //        7. In PetDog, create a boolean instance variable, trained.

    public  boolean trained;

    //Methods
//        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
public boolean isTrained(){
    return this.trained;
}



    // Constructor


    //        8. Write a constructor for PetDog that sets its name, type, and trained properties.


    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }




} // End of Pet class


