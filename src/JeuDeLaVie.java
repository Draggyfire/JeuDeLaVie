import java.util.Random;

public class JeuDeLaVie {
    private int hauteur;
    private int largeur;
    private boolean[][] grille;
    private Random rand = new Random();

    public JeuDeLaVie(int hauteur, int largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        grille = new boolean[hauteur][largeur];
    }

    public void initialisationAleatoire(int nb) {
        int compteur = 0;
        while (compteur < nb) {
            int ligne = rand.nextInt(hauteur);
            int colonne = rand.nextInt(largeur);
            if (!grille[ligne][colonne]) {
                grille[ligne][colonne] = true;
                compteur++;
            }
        }
    }

    private int nbVoisins(int ligne, int colonne) {
        int nbVoisins = 0;
        for (int i = ligne - 1; i <= ligne + 1; i++) {
            for (int j = colonne - 1; j <= colonne + 1; j++) {
                if (i >= 0 && i < hauteur && j >= 0 && j < largeur && !(i == ligne && j == colonne)) {
                    if (grille[i][j]) {
                        nbVoisins++;
                    }
                }
            }
        }
        return nbVoisins;
    }

    public void suivant() {
        boolean[][] nouvelleGrille = new boolean[hauteur][largeur];
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                int nbVoisins = nbVoisins(i, j);
                if (grille[i][j]) {
                    if (nbVoisins == 2 || nbVoisins == 3) {
                        nouvelleGrille[i][j] = true;
                    } else {
                        nouvelleGrille[i][j] = false;
                    }
                } else {
                    if (nbVoisins == 3) {
                        nouvelleGrille[i][j] = true;
                    }
                }
            }
        }
        grille = nouvelleGrille;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (grille[i][j]) {
                    str += "*";
                } else {
                    str += ".";
                }
            }
            str += "\n";
        }
        return str;
    }

    public void setGrille(boolean[][] grille) {
            this.grille = grille;
    }
}
