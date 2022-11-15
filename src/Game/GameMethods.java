package Game;

public class GameMethods {



///////////////////////////////////// Properties (Instance Variables) ////////////////////////////////


    public boolean loopLogic = true;

//////////////////////////////////////// Getters & Setters ////////////////////////////////////////////

    //// Get loopLogic
    public boolean isLoopLogic() {
        return loopLogic;
    }
    //// Set loopLogic
    public void setLoopLogic(boolean loopLogic) {
        this.loopLogic = loopLogic;
    }


/////////////////////////////////////////////// Methods //////////////////////////////////////////////

    // runAwayChance determines whether you successfully run from an enemy or not.
    public static boolean runAwayChance () {
        int randomChance = (int) Math.floor(Math.random() * 10);
        if (randomChance %2 ==0){
//            System.out.println(randomChance);
            return true;
        } else {
//            System.out.println(randomChance);
            return false;
        }
//        System.out.println(randomChance);
    } // End runAwayChance


    /////////////////////////////////////////// Constructors //////////////////////////////////////////

    // Default Constructor
    GameMethods(){}


    GameMethods(boolean loopLogic){
        this.loopLogic = loopLogic;
    }



} // End GameMethods Class
