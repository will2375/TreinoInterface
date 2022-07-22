package Mamifero.MamiferoTerrestre;

import ChamarAnimais.Interfaces.MamiferoTerrestre;
import ChamarAnimais.Interfaces.Mamiferos;

public class Cachorro implements Mamiferos, MamiferoTerrestre {
    @Override
    public String qtdPatas() {
        System.out.println("Possui 4 patas");
        return null;
    }

    @Override
    public String mamar() {
        System.out.println("Mama");
        return null;
    }

    @Override
    public String locomocao() {
        System.out.println("Caminha");
        return null;
    }

    @Override
    public String Habitacao() {
        System.out.println("Local terrestre");
        return null;
    }
}
