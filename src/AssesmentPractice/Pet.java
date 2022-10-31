package AssesmentPractice;
//        4. Create a class called Pet with two String instance variables, name and type.

 public class Pet {

    private String name;
    private String type;


    //        5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getType() {
        return type;
    }

    // Setter
    public void setType(String type) {
        this.type = type;
    }




    // Constructor

      public Pet(){};


    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }



} // End of PET




