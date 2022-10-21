package Animals;

abstract public class Bird { // When we do abstract we cannot create more birds with the class Bird

//    private String name;
    protected String name;  // I change it from Private to protected, so we can use it on parrot class

    //  Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }


    // Method

    public void makeNoise(){
        System.out.println("caw caw");
    }

    // Polymorphic argument definition:
    public static void birdSounds(Bird[] birdsArray){
        for (Bird bird : birdsArray){
            bird.makeNoise();
        }
    }


    // Constructor

//    public Bird(){
//        System.out.println("A bird was constructed");
//    }

    public Bird() {
        this.name = name;
    }





} // End of Bird
