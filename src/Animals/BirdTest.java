package Animals;
// inheritance and polymorphism
public class BirdTest {

//    public static String argumentativeOrnithologist(String classification, String newClassification){  // This wont work because we have a final
//        Parrot.order = classification;
//        classification = newClassification;
//        return oldName + " is now " + newClassification;
//    }

    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.setName("Dr, crow");
        System.out.print(crow.getName() + " goes ");
        crow.makeNoise();

        TweetyBird goldfinch = new TweetyBird();
        goldfinch.setName("Dr. goldfinch");
        System.out.print(goldfinch.getName() + " goes ");
        goldfinch.makeNoise();

        Parrot parrot = new Parrot();
        parrot.setName("Dr.Parrot");
        System.out.print(parrot.getName() + " goes ");
        parrot.makeNoise();
        parrot.echo("YEEEHAAWW!!");

        Bird parrot2 = new Parrot(); // Declared a Bird to a new Parrots instead of parrot to parrot
        parrot2.makeNoise();
       // parrot2.echo() // parrot cannot echo because it looses whats unique in its class it only has the birds method
        parrot2.setName("Parrot cant echo");
        System.out.println(parrot2.getName());

        // Example of polymorphism: a polymorphic array
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Lesser Goldfinch");
        birds[1] = new Parrot();
        birds[1].setName("Polly");
        birds[2] = new TweetyBird();
        birds[2].setName("Tweetybird");

        for (Bird bird : birds){
            bird.makeNoise();
        }
        // How to get the parrot's echo back
        Parrot backToParrot = (Parrot) birds[1];   // This gives the new parrot echo now
        System.out.print(backToParrot.getName() + " says ");
        backToParrot.echo("I can echo now");

        Bird.birdSounds(birds); // We created a method that returns the loop of sounds


        Parrot parrott2 = new Parrot(); // This makes it to say a bird was constructed and a parrot was constructed


        System.out.println(parrott2.order);

//        System.out.println(argumentativeOrnithologist("Pssittacifomres", "Sphenicsciformes")); // This wont work because we have a final

    } // end of main
}// BirdTest
