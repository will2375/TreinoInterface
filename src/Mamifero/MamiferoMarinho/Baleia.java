package Mamifero.MamiferoMarinho;

import ChamarAnimais.Interfaces.MamiferoMarinho;
import ChamarAnimais.Interfaces.Mamiferos;

public class Baleia implements Mamiferos, MamiferoMarinho {
    @Override
    public String sonar() {
        System.out.println("Possui sonar");
        return null;
    }

    @Override
    public String mamar() {
        System.out.println("Mama");
        return null;
    }

    @Override
    public String locomocao() {
        System.out.println("Nadar");
        return null;
    }

    @Override
    public String Habitacao() {
        System.out.println("Mar aberto");
        return null;
    }
}
