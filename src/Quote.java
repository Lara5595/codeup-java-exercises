public class Quote {
    public static String RandomQuote() {
        int randomNumber = (int) (Math.random()*4) +1;
        switch (randomNumber) {
            case 1 : return "Time is money";
            case 2 : return "Howdy";
            case 3 : return "Woof I'm a dog";
            case 4 : return "MEOW I am a cat";
            default: return "Hola me llamo WEYWOT";
        }
    }
}
