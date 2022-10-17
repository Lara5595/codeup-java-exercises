public class Animal {
    public String name;

    public String sound;

    public void makeNoise(){
        System.out.printf("%s goes %s%n",name,sound);
    }

    public void randomNoise(){
        System.out.printf("%s goes %s%n", name, Quote.RandomQuote());
    }
}


//    Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.

// Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.