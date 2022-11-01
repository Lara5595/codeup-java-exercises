package AssesmentPractice;
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.

import java.util.ArrayList;
import java.util.List;

public class PetDogTest {

    public static void main(String[] args) {
        PetDog petDog = new PetDog("Grinch", "Cavalier King Charles", true);
        System.out.println(petDog.snuggle());


        // #12b

        PetDog petDog1 = new PetDog("Daisy", "English Mastiff", true);
        PetDog petDog2 = new PetDog("Rex", "Pit Bull", true);
        ArrayList<PetDog> petDogs = new ArrayList<>(List.of(petDog, petDog1, petDog2));

        PetDog.allSnuggle(petDogs);



        // java quiz
        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }


    }
}
