package Aves.AvesVoadoras;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Aves;
import Aves.interfaces.AvesQueVoam;
import Aves.interfaces.Habitação;

public class Aguia implements Aves, AvesQueVoam, Alimentação, Habitação {
    @Override
    public String bicar() {
        return "animal bica";
    }

    @Override
    public String voar() {
        return "animal pode voar";
    }

    @Override
    public String alimento() {;
        return "Se alimenta com peixe";
    }

    @Override
    public String habitacao() {
        return "Habitação area";
    }

    public void exibir(){
        System.out.println("Dados aguia:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(bicar());
        System.out.println(voar());
    }
}
