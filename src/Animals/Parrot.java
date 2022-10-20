package Animals;

public class Parrot extends  Bird {
    public void makeNoise() {
        super.makeNoise();
        System.out.println(" When torrential water tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is becuase of timing. Thus the momentum of one skilled in war is overwhelming, thier attack precisely regulated . Their potential is that of a fully drawn crossbow; their timing, the release of the trigger.");


    }

    // We are not putting echo on the bird class because its specific for parrots
    public void echo(String input){
        System.out.println(input);
    }

} // end of parrot