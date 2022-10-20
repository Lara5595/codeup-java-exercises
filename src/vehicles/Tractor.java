package vehicles;

public class Tractor extends Vehicles {



    public void makeNoise(){
        System.out.println("HOOOOOOOOOOOONK!!!!!!!");
    }


    public void breakDown() {
        super.makeNoise();
        System.out.println("krrcckkklunnnnk");
    }


}

