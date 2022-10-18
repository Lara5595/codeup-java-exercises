public class Fighter {
    // Instance Variables
    public String name;

    //set to private
    private int hitPoints;

    // setter -- set to public
    public void setHitPoints(int hitPoints){
        // if (hitPoints > 0) {..set hitpoints}
        this.hitPoints = hitPoints;
    }

    // getter -- set to public
    public  int getHitPoints() {
        return hitPoints;
    }

    public int maxDamage;

    // Instance methods
    public void printStats() {
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar() {
        System.out.printf("I am %s and I will destroy you%n", name);
    }

    // This is a instance method for any given fighter
    // All class roles are capitalize like D20
    public int attackRoll(){
        return D20.rolld20();   // we can call d20 and rolld20 because it's a static
    }

    // No-arg constructor
    public Fighter(){

    }


    // Overloaded constructor
    // this helps for us not to be calling 1 by 1
    public Fighter(String name, int hitPoints, int maxDamage){
        System.out.println("A new fighter has emerged!");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }


}

