package jeuDeDes;

import java.util.Random;

// Le class DE est lancé avec lancer(), il renvoie un nombre compris entre 1 et 6
public class De {
    private int valeur ;

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * Lance : crée des nombres aléatoires entre 1 et 6
     * @return int(1...6)
     */
    public int lancer() {
        Random random = new Random();
        return random.nextInt(1,6+1);
    }
}
