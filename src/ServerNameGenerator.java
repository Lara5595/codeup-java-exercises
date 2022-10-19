import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    String [] adjectives = {"goofy", "purring", "gratis", "nutty", "glossy", "youthful", "heady", "heady", "impossible", "pumped"};

    String [] nouns = {"arm", "month", "roof", "thumb", "branch", "potato", "adjustment", "kitty", "soap", "whip" };

        private String name;

        // Getter
        public String getName(){
            return name;
        }

        // Methods
        public String toString(){
            return name;
        }

        public static String getRandomElement(String[] array){
            Random generator = new Random();
            int randomIndex = generator.nextInt(array.length);
            return array[randomIndex];
        }


        // constructor
        public ServerNameGenerator(){
            String adjective = getRandomElement(adjectives);  // get a random value from adjective array
            String noun = getRandomElement(nouns);
            String combined = adjective + "-" + noun;
            this.name = combined;
        }







} // end of serverNameGenerator


// 2. Server Name Generator
// We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user

