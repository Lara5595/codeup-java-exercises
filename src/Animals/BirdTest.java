package Animals;

public class BirdTest {
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
        Parrot backToParrot = (Parrot) birds[1];   // This gives the new parrot echo now
        System.out.print(backToParrot.getName() + " says ");
        backToParrot.echo("I can echo now");

    } // end of main
}// BirdTest
