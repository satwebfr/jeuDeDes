# Jeu de dés

Un jeu de dés classique dans lequel les joueurs jouent à tour de rôle en lançant un gobelet, qui contiendra des dés. Au bout d'un certain nombre de tour, On désigne le gagnant.
Le gagnant est le joueur qui a le score le plus élevé.

## Classes
### Class De
Le class dé est lancé avec lancer(), il renvoie un nombre compris entre 1 et 6

**lancer()** : crée des nombres aléatoires entre 1 et 6

<br>

### Class Gobelet
Il aura un certain nombre de dés, ce qui donnera une liste des résultats de chaque dé.

**lancer()**   change la valeur des dés du gobelet et met à jour la valeur du gobelet

**afficher_score()**  affiche le score en tant que valeur de gobelet pour chaque lancer() créé

<br>

### Class Partie
Après avoir reçu le nombre de joueurs, le nombre de parties et le nombre de dés, il lance le jeu.

**lanceJoue()** A chaque lancement -> le gobelet est lancé et le score puis le max est obtenu.

**afficher_gagnant()**  Enfin, obtenez le nom de jouer avec où le jeu (max) correspondant  et la valeur (max) obtenue à partir de lanceJouer() sont affichés.

<br>

### Class Run
Demander au lancement de la partie le nombre de dés,  le nombre de tours et  le nom des participants.
Puis initialiser avec nb_joueurs, puis lancerJoue.

<br><br>
> Cette application a été créée avec Java 18.1 et IntelliJ IDEA V.2022.1.3.
<br>

> #### Cette application est gratuite pour la modification de votre contribution et les commentaires et améliorations sont les bienvenus, n'hésitez pas à forl et à tirer. Merci.



 

