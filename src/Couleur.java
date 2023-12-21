public enum Couleur {

    /**
     * Représente la couleur d'une Carte : jaune, rouge ...
     * En plus de donner une liste énumérative des couleurs possibles,
     * cette enumération doit permettre à la méthode toString d'une Carte de réaliser un affichage en couleur.
     */
    ROUGE("\033[91m"), 
    VERTE("\033[92m"), 
    BLEUE("\033[94m");

    private String couleur;

    private Couleur (String c) {
        this.couleur = c;
    }

    public String toString() {
        return this.couleur;
    }
}
