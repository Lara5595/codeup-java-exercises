package Game;

import java.util.Random;
import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {

        // System Objects
        // System.in is for input
        Scanner in = new Scanner(System.in);

        // This is our random number generator
        Random rand = new Random();

        // Game variables
        // This is our enemy characters
        String[] enemies = {"Skeleton", "Zombie","Warrior", "Assassin"};
        int maxEnemyHealth = 75;
        int enemyAttackDamage = 25;

        // Player Variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChange = 50; // Percentage

        boolean running = true;

        System.out.println("Welcome to the Dungeon!");

        // GAME labels our while loop
        GAME:
        while (running) {
            System.out.println("------------------------------------------------");

            int enemyHealth = rand.nextInt(maxEnemyHealth); // Setting the enemy health at random
            String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " appeared! #\n");
            //          # Skeleton has appeared ^^

            while (enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + " 's HP: " + enemyHealth);
                System.out.println("\n\t What would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = in.nextLine();
                if (input.equals("1")){
                    int damageDealt = rand.nextInt(attackDamage);
                    int damageTaken = rand.nextInt(enemyAttackDamage);

                    // Enemy Health
                    enemyHealth -= damageDealt;
                    // Player Health
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage ");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                    // If health is less than 1 you lose
                    if (health < 1) {
                        System.out.println("\t> You have taken too much damage, you are too weak to go on!");
                    }
                } else if (input.equals("2")){
                    if (numHealthPotions > 0) {
                        // This adds health potion to your health
                        health += healthPotionHealAmount;
                        // If you use a potion is decrements
                        numHealthPotions--;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "\n\t> You now have " + health + " HP." + "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    } else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for a change to get one!");
                    }

                } else if (input.equals("3")){
                    if (GameMethods.runAwayChance()){
                        System.out.println("\t You run away from the " + enemy + "!");
                        continue GAME;
                        // by continue Game it breaks out and continues the while Game loop
                    } else {
                        System.out.println("You couldn't escape the " + enemy + "!");
                    }

                } else {
                    System.out.println("\tInvalid command! ");
                }



            } // end of 2nd while loop



            // check if player is dead
            if (health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle.");
                break;
            }

            System.out.println("--------------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");

            // Random healthpotions
            if (rand.nextInt(100) < healthPotionDropChange) {
                numHealthPotions++;
                System.out.printf("The %s dropped a health potion", enemy);
                System.out.println(" # You now have " + numHealthPotions + " health potion (s). # ");
            }

            // Once enemy is defeated there is another while
            System.out.println("-------------------------------------------------");
            System.out.println("What would you like to do now? ");
            System.out.println("1. Continue fighting");
            System.out.println(" 2. Exit dungeon");

            String input = in.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid command!");
                input = in.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            } else if (input.equals("2")) {
                System.out.println("You exit the dungeon successfully from your adventures");
                break;
            }
        } // end of while

        System.out.println("####################");
        System.out.println("# THANKS FOR PLAYING #");
        System.out.println("####################");


    } // end of main
}
