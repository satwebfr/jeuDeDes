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
        System.out.println(de.lancer());

        Gobelet gobelet = new Gobelet(5);
        gobelet.lancer();
        gobelet.afficher_score();

        Partie partie = new Partie(3,4);

        partie.joueurs = new ArrayList<String>(3);
        partie.joueurs.add("Ben");
        partie.joueurs.add("Adale");
        partie.joueurs.add("Kenny");

        partie.initialiser(3);
        partie.lancerJoue();
        partie.afficher_gagnant();

    }
}
