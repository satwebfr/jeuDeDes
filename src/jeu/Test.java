package jeu;

import jeuDeDes.De;
import jeuDeDes.Gobelet;
import jeuDeDes.Partie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        De de = new De();
        Gobelet gobelet = new Gobelet(5);
        gobelet.lancer();

        System.out.println();
        Partie partie = new Partie(2, 3);
        partie.initialiser(2);
        partie.joueurs = new ArrayList<String>();
        partie.joueurs.add("Ben");
        partie.joueurs.add("kenny");

        partie.lancerJoue();
        partie.afficher_gagnant();

    }
}
