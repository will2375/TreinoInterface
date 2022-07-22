package ChamarAnimais;

import Aves.AvesTerrestres.Avestruz;
import Aves.AvesVoadoras.Harpia;

public class ChamarAves {

    public static void main(String[] args) {

        Avestruz avestruz = new Avestruz();
        System.out.println("Açoes do avestruz");
        avestruz.bicar();
        avestruz.alimentar();
        avestruz.naoVoar();
        System.out.println("");
        Harpia harpia = new Harpia();
        System.out.println("Açoes da harpia");
        harpia.bicar();
        harpia.alimentar();
        harpia.voar();
    }
}
