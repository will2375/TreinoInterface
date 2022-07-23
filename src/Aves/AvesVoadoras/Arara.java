package Aves.AvesVoadoras;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Aves;
import Aves.interfaces.AvesQueVoam;
import Aves.interfaces.Habitação;

public class Arara implements Aves, AvesQueVoam, Alimentação, Habitação {
    @Override
    public String bicar() {
        System.out.println("Bicar");
        return null;
    }

    @Override
    public String voar() {
        return "Animal pode voar";
    }

    @Override
    public String alimento() {
        return "Se alimenta com frutas";
    }

    @Override
    public String habitacao() {
        return "Habitação arvores";
    }
    public void exibir(){
        System.out.println("Dados arara:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(bicar());
        System.out.println(voar());
    }
}
