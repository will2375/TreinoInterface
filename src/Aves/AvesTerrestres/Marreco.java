package Aves.AvesTerrestres;

import Aves.interfaces.Aves;
import Aves.interfaces.AvesQueNaoVoam;

public class Marreco implements Aves, AvesQueNaoVoam {
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
    public String naoVoar() {
        System.out.println("Não pode voar");
        return null;
    }
}
