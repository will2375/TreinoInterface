package ChamarAnimais;

import Mamifero.MamiferoMarinho.Baleia;
import Mamifero.MamiferoMarinho.Focas;
import Mamifero.MamiferoTerrestre.Cachorro;

public class ChamarMamiferos {
    public static void main(String[] args) {
        Focas focas = new Focas();
        focas.exibir();

        Cachorro cachorro = new Cachorro();
        cachorro.exibir();
    }
}
