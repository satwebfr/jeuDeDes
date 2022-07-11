package jeu;

import jeuDeDes.De;
import jeuDeDes.Gobelet;
import jeuDeDes.Partie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        De de = new De();
//        System.out.println(de.lancer());
//
//        Gobelet gobelet = new Gobelet(5);
//        gobelet.lancer();
//        gobelet.afficher_score();

        // demander au lancement de la partie le nombre de dés,
        // le nombre de tours et
        // le nom des participants
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre des tours : ");
        int nb_tours = scanner.nextInt();

        System.out.print("Nombre des des : ");
        int nb_des = scanner.nextInt();


        System.out.print("Nombre des joueurs : ");
        int nb_joueurs = scanner.nextInt();


        Partie partie = new Partie(nb_tours, nb_des);
        partie.joueurs = new ArrayList<String>(nb_joueurs);
        for (int i = 0; i < nb_joueurs; i++) {
            System.out.print(" Nom de jouer : ");
            partie.joueurs.add(scanner.next());
        }

        partie.initialiser(nb_joueurs);
        partie.lancerJoue();
        partie.afficher_gagnant();

    }
}
