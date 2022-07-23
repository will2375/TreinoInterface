package Aves.AvesTerrestres;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Aves;
import Aves.interfaces.AvesQueNaoVoam;
import Aves.interfaces.Habitação;

public class Galinha implements Aves, AvesQueNaoVoam, Alimentação, Habitação {
    @Override
    public String bicar() {
        return "Animal bica";
    }

    @Override
    public String naoVoar() {
        return "Não pode voar";
    }

    @Override
    public String alimento() {
        return "Se alimenta com milho";
    }

    @Override
    public String habitacao() {
        return  "Habitação terrestre";
    }
    public void exibir(){
        System.out.println("Dados galinha:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(bicar());
        System.out.println(naoVoar());
    }
}
