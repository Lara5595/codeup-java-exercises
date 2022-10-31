package AssesmentPractice;

//        6. Create a PetDog class that inherits from Pet.

    public class PetDog extends Pet implements Companion  {

    //        7. In PetDog, create a boolean instance variable, trained.

      boolean trained;

    //Methods
//        9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
public boolean isTrained(){
    return trained;
}

public void setTrained(boolean trained){
    this.trained = trained;
}

        // This is #10
        @Override
        public String snuggle() {
            return getName() + " wants to snuggle";
        }

    // Constructor


    //        8. Write a constructor for PetDog that sets its name, type, and trained properties.

    public PetDog(boolean trained){
    this.trained = trained;
    }

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }






    } // End of Pet class


