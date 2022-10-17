public class Fighter {
    public String name;
    public int hitPoints;
    public int maxDamage;

    public void printStats() {
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }

    public void battleRoar() {
        System.out.printf("I am %s and I will destroy you%n", name);
    }

    public int attackRoll(){
    return D20.rolld20();   // we can call d20 and rolld20 because its a static
    }




}


