package Mamifero.MamiferoMarinho;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Habitação;
import Aves.interfaces.MamiferoMarinho;
import Aves.interfaces.Mamiferos;

public class Baleia implements Mamiferos, MamiferoMarinho, Alimentação, Habitação {
    @Override
    public String sonar() {
        System.out.println("Possui sonar");
        return null;
    }

    @Override
    public String mamar() {
        return "animal mama";
    }

    @Override
    public String locomocao() {
        return "locomoção a nado";
    }

    @Override
    public String alimento() {
        return "Se alimenta com peixes";
    }

    @Override
    public String habitacao() {
        return "Habitação mar aberto";
    }
    public void exibir(){
        System.out.println("Dados baleia:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(locomocao());
        System.out.println(mamar());
        System.out.println(sonar());
    }

}
