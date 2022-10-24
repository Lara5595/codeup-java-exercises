package rpg;

import java.util.Comparator;

public class Monster implements Comparator<Monster> {  // we added the implements comparator<monster>

        // Createad private classes so we can use em then we cretede getters and setters for each one
        private int armorClass;
        private int hitPoints;
        private int damage;
        private String name;

        // Getter
        public int getArmorClass() {
            return armorClass;
        }
        // Setter
        public void setArmorClass(int armorClass) {
            this.armorClass = armorClass;
        }

        // Getter
        public int getHitPoints() {
            return hitPoints;
        }

       // Setter
        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        //Getter
        public int getDamage() {
            return damage;
        }

        //Setter
        public void setDamage(int damage) {
            this.damage = damage;
        }

        //Getter
        public String getName() {
            return name;
        }

        //Setter
        public void setName(String name) {
            this.name = name;
        }

        // Methods We created toString to use it on our array when we call it
        public String toString(){
            return name;
        }

        // To create a custom comparison method, we implement Comparable<objectClass>
        // In the object calls. We can use this syntax:
        public int compare(Monster m1, Monster m2){
            return Integer.compare(m2.getHitPoints(), m1.getHitPoints());
        }


        // Constructors
        public Monster(){}

        public Monster(int armorClass, int hitPoints, int damage, String name) {
            this.armorClass = armorClass;
            this.hitPoints = hitPoints;
            this.damage = damage;
            this.name = name;
        }
    }

