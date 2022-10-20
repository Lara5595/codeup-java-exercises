package Animals;
// since tweety bird extend bird we can call the methods on bird

public class TweetyBird extends Bird {
    // overriding: a subclass redefines one of its inherited methods when it needs to change or extend the behavior of that method
    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

}
