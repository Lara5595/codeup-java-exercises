public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
//        fighter1.printStats(); // when there is not object where the value is called it will be null
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
        fighter1.battleRoar();

        int fighter1attackRoll = fighter1.attackRoll();
        System.out.printf("%s attacks and rolls a %d%n", fighter1.name, fighter1attackRoll);

        Fighter fighter2 = new Fighter();
        fighter2.name = "Sozalix";
        fighter2.hitPoints = 20;
        fighter2.maxDamage = 19;
        fighter2.printStats();
        fighter2.battleRoar();

        // we are getting  club from its cLASS
        System.out.println(Club.maxDamage);

        // This is a overload method
        Fighter fighter3 = new Fighter("Mason", 1, 500);
        fighter3.printStats();

    } // end of main
} // end of FighterTest



