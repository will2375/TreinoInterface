package Mamifero.MamiferoTerrestre;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Habitação;
import Aves.interfaces.MamiferoTerrestre;
import Aves.interfaces.Mamiferos;

public class Canguru implements Mamiferos, MamiferoTerrestre, Alimentação, Habitação {
    @Override
    public String qtdPatas() {
        return "Possui 4 patas";
    }

    @Override
    public String mamar() {
        return "Animal mama";
    }

    @Override
    public String locomocao() {
        return "locomoçao via saltos";
    }

    @Override
    public String alimento() {
        return "Se alimenta com ração";
    }

    @Override
    public String habitacao() {
        return "habitação terrestre";
    }

    public void exibir(){
        System.out.println("Dados canguru:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(locomocao());
        System.out.println(mamar());
        System.out.println(qtdPatas());
    }
}
