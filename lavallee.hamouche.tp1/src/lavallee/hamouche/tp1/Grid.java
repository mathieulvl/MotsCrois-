package lavallee.hamouche.tp1;

/**
 * Classe représentant une grille pour le TP1 de Mots Croisés.
 */
public class Grid{
    // Attributs
    private int height;  // Nombre de lignes
    private int width;   // Nombre de colonnes
    private String[][] array;  // Tableau 2D pour stocker les valeurs

    /**
     * Constructeur permettant d’obtenir une grille dotée d’un tableau
     * de dimensions conformes aux valeurs respectives de height et
     * de width, dont tous les éléments contiennent la valeur null.
     *
     * @param height Nombre de lignes (doit être >= 0)
     * @param width  Nombre de colonnes (doit être >= 0)
     * @pre height >= 0 et width >= 0
     */
    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
        this.array = new String[height][width];

    }

    // Getters
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    /**
     * Vérifie la validité des coordonnées.
     *
     * @param row    Ligne de la cellule
     * @param column Colonne de la cellule
     * @return true si les coordonnées sont valides, false sinon
     */
    public boolean correctCoords(int row, int column) {
        return row >= 0 && row < height && column >= 0 && column < width;
    }

    /**
     * Retourne la valeur de la cellule ayant pour coordonnées (row, column).
     *
     * @param row    Ligne de la cellule
     * @param column Colonne de la cellule
     * @return Valeur de la cellule
     * @pre correctCoords(row, column)
     */
    public String getCell(int row, int column) {
        if (!correctCoords(row, column)) {
            throw new IllegalArgumentException("Coordonnées invalides : (" + row + ", " + column + ").");
        }
        return array[row][column];
    }
    /**
     * Modifie la valeur de la cellule à la position donnée.
     *
     * @param row    Ligne de la cellule
     * @param column Colonne de la cellule
     * @param value  Nouvelle valeur
     * @pre correctCoords(row, column)
     */
    public void setCell(int row, int column, String value) {
        if (correctCoords(row, column)){
            array[row][column] = value;
        }
        else {
            throw new IllegalArgumentException("Coordonnées invalides.");
        }
    }

    /**
     * Retourne une représentation textuelle de la grille.
     *
     * @return Texte représentant la grille
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                sb.append(array[row][col] != null ? array[row][col] : " ");
                if (col < width - 1) sb.append("|");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
