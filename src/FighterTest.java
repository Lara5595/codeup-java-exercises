public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
//        fighter1.printStats(); // when there is not object where the value is called it will be null
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
        fighter1.battleRoar();


        Fighter fighter2 = new Fighter();
        fighter2.name = "Sozalix";
        fighter2.hitPoints = 20;
        fighter2.maxDamage = 19;
        fighter2.printStats();
        fighter2.battleRoar();



    } // end of main
} // end of FighterTest



