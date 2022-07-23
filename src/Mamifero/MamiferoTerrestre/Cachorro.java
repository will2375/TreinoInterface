package Mamifero.MamiferoTerrestre;

import Aves.interfaces.Alimentação;
import Aves.interfaces.Habitação;
import Aves.interfaces.MamiferoTerrestre;
import Aves.interfaces.Mamiferos;

public class Cachorro implements Mamiferos, MamiferoTerrestre, Alimentação, Habitação {
    @Override
    public String qtdPatas() {
        return "Possui 4 patas";
    }

    @Override
    public String mamar() {
        return "animal mama";
    }

    @Override
    public String locomocao() {
        return "locomoção via caminhada";
    }

    @Override
    public String alimento() {
        return "Se alimenta com ração";
    }

    @Override
    public String habitacao() {
        return "Habitação terrestre";
    }

    public void exibir(){
        System.out.println("Dados cachorro:");
        System.out.println(habitacao());
        System.out.println(alimento());
        System.out.println(locomocao());
        System.out.println(mamar());
        System.out.println(qtdPatas());
    }
}
