package fr.jeuDeDes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gobelet {
    De de = new De();
    private int valeur ;
    public int nb_des ;
    private List<Integer> des ;

    // Dans gobelet : génère le nombre de dés nécessaires à la partie et les ajoute au tableau
    public Gobelet(int nb_des) {
        des = new ArrayList<Integer>(nb_des);
        this.nb_des = nb_des;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    // renvoie la valeur du gobelet
    public int getValeur(){
        return valeur;
    }

    public List<Integer> getDes() {
        return des;
    }

    public void setDes(List<Integer> des) {
        this.des = des;
    }

    // change la valeur des dés du gobelet ; met à jour la valeur du gobelet
    public void lancer(){
        for (int i = 0; i < nb_des; i++) {
            des.add(de.lancer());
            valeur += des.get(i);
        }
        //System.out.println("Valeur du gobelet : " + getValeur());
        //System.out.println("valeur des des : " + getDes());
    }

    public void afficher_score(){
        System.out.println("Score : " + getValeur());
    }


}
