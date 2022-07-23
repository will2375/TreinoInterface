package Mamifero.MamiferoMarinho;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Habitação;
import Aves.interfaces.MamiferoMarinho;
import Aves.interfaces.Mamiferos;

public class Focas implements Mamiferos, MamiferoMarinho, Alimentação, Habitação {
    @Override
    public String sonar() {
        return "Possui sonar";
    }

    @Override
    public String mamar() {
        return "animal mama";
    }

    @Override
    public String locomocao() {
        return "locomoçao a nado";
    }

    @Override
    public String alimento() {
        return "Se alimenta com peixes";
    }

    @Override
    public String habitacao() {
        return "Habitaçao terrestre";
    }

    public void exibir(){
        System.out.println("Dados foca:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(locomocao());
        System.out.println(mamar());
        System.out.println(sonar());
    }
}
