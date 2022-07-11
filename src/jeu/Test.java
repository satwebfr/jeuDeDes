package jeu;

import jeuDeDes.Gobelet;

public class Test {
    public static void main(String[] args) {

        //De de = new De();
        //System.out.println(de.lancer());

        Gobelet gobelet = new Gobelet(5);
        gobelet.lancer();
        gobelet.afficher_score();



    }
}
