package fr.jeuDeDes;

import java.util.Random;

public class De {
    private int valeur ;

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int lancer() {
        Random random = new Random();
        return random.nextInt(1,6+1);
    }
}
