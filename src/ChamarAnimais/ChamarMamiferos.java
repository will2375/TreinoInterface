package ChamarAnimais;

import Mamifero.MamiferoMarinho.Baleia;
import Mamifero.MamiferoTerrestre.Cachorro;

public class ChamarMamiferos {
    public static void main(String[] args) {
        System.out.println("Açoes Baleia");
        Baleia baleia = new Baleia();
        baleia.Habitacao();
        baleia.sonar();
        baleia.locomocao();
        baleia.mamar();
        System.out.println("");

        System.out.println("Açoes Cachorro");
        Cachorro cachorro= new Cachorro();
        cachorro.qtdPatas();
        cachorro.locomocao();
        cachorro.Habitacao();
        cachorro.mamar();
    }
}
