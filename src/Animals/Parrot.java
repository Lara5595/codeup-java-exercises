package Animals;

public class Parrot extends Bird implements Pet {   // We added implement pet to parrot class

    public final static String order = "Psittaciformes";  // Final is for when you dont want anyone to change the name it is FINAL

    public void setName(String parrotName){   // It was red because we need to change private to protected on bird class
        super.name = parrotName;
    }

    public void makeNoise() {
        super.makeNoise();
        System.out.println(" When torrential water tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is becuase of timing. Thus the momentum of one skilled in war is overwhelming, thier attack precisely regulated . Their potential is that of a fully drawn crossbow; their timing, the release of the trigger.");
    }

    public void beCute(){
        System.out.println("Human goes AWwWwWw");
    }


    // We are not putting echo on the bird class because its specific for parrots
    public void echo(String input){
        System.out.println(input);
    }


    public Parrot(){
        super();
        System.out.println("A new parrot just got contructed");
    }


} // end of parrot