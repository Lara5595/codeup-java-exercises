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

    } // end of main
}// BirdTest
