package jeuDeDes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
    public List<String> joueurs;
    Gobelet gobelet ;
    private int nb_tours ;
    public int nb_des ;
    private int nb_joueurs ;
    //Gobelet gobelet = new Gobelet(nb_des);
    public int max ;
    public String gagnant ;

    // Constructeur
    public Partie(int nb_tours, int nb_des) {
        this.nb_tours = nb_tours;
        this.nb_des = nb_des;
    }

    // Geeter & Setter
    public int getNb_joueurs() {
        return this.nb_joueurs;
    }
    public void setNb_joueurs(int nb_joueurs) {
        this.nb_joueurs = nb_joueurs;
    }

    public int getNb_tours() {
        return this.nb_tours;
    }
    public void setNb_tours(int nb_tours) {
        this.nb_tours = nb_tours;
    }

    // Inscrire des joueurs dans la partie
    public void initialiser(int nomjus) {
        setNb_joueurs(nomjus);
    }

    public void lancerJoue() {

        System.out.println("\n--------Le jeu commence----------");
        for (int i = 0; i < this.getNb_tours(); i++) {
            System.out.println("===== Tour 0" + i+1 + " ======");

            for (int j = 0; j < this.getNb_joueurs(); j++) {
                gobelet = new Gobelet(nb_des);
                System.out.println("Jouer : " + joueurs.get(j) );
                gobelet.lancer();
                gobelet.afficher_score();
                // set tha max value
                if (gobelet.getValeur() > max) {
                    max = gobelet.getValeur();
                    gagnant = joueurs.get(j);
                }
            }
        }
    }

    public void afficher_gagnant() {
        System.out.println("\n Gagnant :: "+"\033[0;1m"+ gagnant + " avec " + max + " points!");
    }


}
