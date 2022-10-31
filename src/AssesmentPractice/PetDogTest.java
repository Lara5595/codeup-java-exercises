package AssesmentPractice;
//        11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.

public class PetDogTest {

    public static void main(String[] args) {
        PetDog petDog = new PetDog("Grinch", "Cavalier King Charles", true);

        System.out.println(petDog.snuggle());
    }
}
