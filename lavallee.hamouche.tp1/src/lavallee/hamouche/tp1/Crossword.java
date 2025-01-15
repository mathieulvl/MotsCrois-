package lavallee.hamouche.tp1;
/**
 * Classe Crossword servant de base à une application de mots croisés.
 * Utilise quatre instances de la classe Grid.
 */
public class Crossword {

    /**
     * Variables d’instance :
     * solution : la grille de solutions
     * proposition : la grille remplie par le joueur
     * horizontal : la grille contenant les définitions des mots horizontaux
     * vertical : la grille contenant les définitions des mots verticaux
     */
    private Grid solution;
    private Grid proposition;
    private Grid horizontal;
    private Grid vertical;

    /**
     * Constructeur créant une instance de Crossword
     * dotée de 4 instances de Grid, suivant les spécifications données.
     */
    public Crossword(int height, int width) {
        // Implémentation ici
    }

    /**
     * @return nombre de rangées
     */
    public int getHeight() {
        // Implémentation ici
    }

    /**
     * @return nombre de colonnes
     */
    public int getWidth() {
        // Implémentation ici
    }

    /**
     * Vérifier la validité des coordonnées
     * @return true si et seulement si (row, column) désignent une cellule existante de la grille
     */
    public boolean correctCoords(int row, int column) {
        // Implémentation ici
    }

    /**
     * @return true si la case est noire, false sinon
     * @pre correctCoords(row, column)
     */
    public boolean isBlackSquare(int row, int column) {
        // Implémentation ici
    }

    /**
     * Déclarer la case (row, column) noire ou blanche.
     */
    public void setBlackSquare(int row, int column, boolean black) {
        // Implémentation ici
    }

    /**
     * @return la solution dans la case (row, column)
     * @pre correctCoords(row, column) && !isBlackSquare(row, column)
     */
    public char getSolution(int row, int column) {
        // Implémentation ici
    }

    public void setSolution(int row, int column, char solution) {
        // Implémentation ici
    }

    public char getProposition(int row, int column) {
        // Implémentation ici
    }

    public void setProposition(int row, int column, char prop) {
        // Implémentation ici
    }

    /**
     * @return la définition horizontale ou verticale dans (row, column).
     * @pre correctCoords(row, column) && !isBlackSquare(row, column)
     */
    public String getDefinition(int row, int column, boolean horizontal) {
        // Implémentation ici
    }

    public void setDefinition(int row, int column, boolean horizontal, String definition) {
        // Implémentation ici
    }
}
