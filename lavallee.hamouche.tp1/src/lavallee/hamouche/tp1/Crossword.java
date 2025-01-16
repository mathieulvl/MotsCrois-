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
        this.solution = new Grid(height, width);
        this.proposition = new Grid(height, width);
        this.horizontal=new Grid(height, width);
        this.vertical=new Grid(height, width);
    }

    /**
     * @return nombre de rangées
     */
    public int getHeight() {
        return solution.getHeight();
    }

    /**
     * @return nombre de colonnes
     */
    public int getWidth() {
        return solution.getWidth();
    }

    /**
     * Vérifier la validité des coordonnées
     * @return true si et seulement si (row, column) désignent une cellule existante de la grille
     */
    public boolean correctCoords(int row, int column) {
        return solution.correctCoords(row, column) ;
    }

    /**
     * @return true si la case est noire, false sinon
     * @pre correctCoords(row, column)
     */
    public boolean isBlackSquare(int row, int column) {
       return solution.getCell(row, column)==null;
    }

    /**
     * Déclarer la case (row, column) noire ou blanche.
     */
    public void setBlackSquare(int row, int column, boolean black) {
        if (correctCoords(row, column)) {
            String value;
            if (black) {
                value = null;
            } else {
                value = "";
            }
            solution.setCell(row, column, value);
            proposition.setCell(row, column, value);
        } else {
            throw new IllegalArgumentException("Coordonnées invalides.");
        }
    }

    /**
     * @return la solution dans la case (row, column)
     * @pre correctCoords(row, column) && !isBlackSquare(row, column)
     */
    public char getSolution(int row, int column) {
            // Vérifie les préconditions
    if (!correctCoords(row, column)) {
        throw new IllegalArgumentException("Coordonnées invalides : (" + row + ", " + column + ").");
    }
    if (isBlackSquare(row, column)) {
        throw new IllegalArgumentException("La case (" + row + ", " + column + ") est une case noire.");
    }
    String cellValue = this.solution.getCell(row, column);
    if (cellValue == null || cellValue.isEmpty()) {
        return ' ';
    }
    return cellValue.charAt(0);
}

    public void setSolution(int row, int column, char solution) {
        // Implémentation ici
    }

    public char getProposition(int row, int column) {
        return '0';
    }

    public void setProposition(int row, int column, char prop) {
        // Implémentation ici
    }

    /**
     * @return la définition horizontale ou verticale dans (row, column).
     * @pre correctCoords(row, column) && !isBlackSquare(row, column)
     */
    public String getDefinition(int row, int column, boolean horizontal) {
        return "a faire";
    }

    public void setDefinition(int row, int column, boolean horizontal, String definition) {
        // Implémentation ici
    }
}
