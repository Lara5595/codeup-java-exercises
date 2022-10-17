public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Hunter";
        dog.sound = "Woof woof";
        dog.makeNoise();
        dog.randomNoise();


        Animal cat = new Animal();
        cat.name = "Simba";
        cat.sound = "Meow";
        cat.makeNoise();
    }
}




//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.