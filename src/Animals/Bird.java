package Animals;

public class Bird {

    private String name;

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

    public Bird() {
        this.name = name;
    }




} // End of Bird
