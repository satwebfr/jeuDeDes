package jeuDeDes;

import java.util.ArrayList;
import java.util.List;

public class Gobelet {
    De de = new De();
    private int valeur ;
    private int nb_des ;
    private List<Integer> des = new ArrayList<>(nb_des);

    // Constrecteur
    // Dans gobelet : génère le nombre de dies et les ajoute au tableau
    public Gobelet(int nb_des) {
        this.nb_des = nb_des;
    }

    // geter & setter
    // renvoie la valeur du gobelet
    public int getValeur(){
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getNb_des() { return nb_des; }

    public void setNb_des(int nb_des) { this.nb_des = nb_des; }

    public List<Integer> getDes() {
        return des;
    }

    public void setDes(List<Integer> des) {
        this.des = des;
    }

    // change la valeur des dés du gobelet ; met à jour la valeur du gobelet
    public void lancer(){
        for (int i = 0; i < this.nb_des; i++) {
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
