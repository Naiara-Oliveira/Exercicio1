package Bootcamp;

import Bootcamp.model.Gato;

public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato("Léo", "preto", 11);
        gato.setNome( "Mel" );
        System.out.println(gato);
    }
}
