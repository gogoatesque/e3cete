public class Coordonnees {


/**
 * La classe Coordonnees représente les coordonnées (i,j) d'une Carte sur la Table
 * ou i représenta la ligne et j la colonne
 * Cette classe est utilisée uniquement pour intéragir avec l'utilisateur
 *  */
    private int ligne;
    private int colonne;

    /**
     * Pre-requis : x,y>=0
     * Action : Construit des Coordonnées ayant x comme numéro de ligne et y comme numéro de colonne
     */
    public Coordonnees(int x, int y) {
        this.ligne = x;
        this.colonne = y;
    }

    /**
     * Pre-requis : input est sous la forme  suivante : int,int
     * Action : Construit des Coordonnées ayant x comme numéro de ligne et y comme numéro de colonne
     */
    public Coordonnees(String input) {
        if (formatEstValide(input)) {
            String[] splitted = input.split(",");
            //splitted est un tableau de String qui contient les sous chaines de caracteres contenues dans input et séparées par ','
            this.ligne = Integer.valueOf(splitted[0]);
            this.colonne = Integer.valueOf(splitted[1]);
        }
    }

    /**
     * Action : Retourne le numéro de la ligne
     */
    public int getLigne() {
        return this.ligne;
    }

    /**
     * Action : Retourne le numéro de la colonne
     */
    public int getColonne() {
        return this.colonne;
    }

    /**
     * Pre-requis : aucun
     * Action : Retourne vrai si la variable input est dans un format valide à savoir int,int
     * Aide : On peut utiliser Ut.estNombre pour vérifier qu'une chaîne de caractères est bien un nombre.
     */
    public static boolean formatEstValide(String input) {
        String[] splitted = input.split(",");
        String nb1 = splitted[0];
        String nb2 = splitted[1];
        return (Ut.estNombre(nb1) && Ut.estNombre(nb2) && Integer.valueOf(nb1) >= 0 && Integer.valueOf(nb2) >= 0);
    }
}
