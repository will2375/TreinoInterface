package Aves.AvesVoadoras;

import Aves.interfaces.Aves;
import Aves.interfaces.AvesQueVoam;

public class Aguia implements Aves, AvesQueVoam {
    @Override
    public String bicar() {
        System.out.println("Bicar");
        return null;
    }

    @Override
    public String alimentar() {
        System.out.println("Se alimentar");
        return null;
    }

    @Override
    public String voar() {
        System.out.println("Voando");
        return null;
    }
}
