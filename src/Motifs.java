public class Motifs {
    public static JeuDeLaVie createBloc() {
        int hauteur=10;
        int largeur=10;
        JeuDeLaVie jeu = new JeuDeLaVie(hauteur, largeur);
        boolean[][] grille = new boolean[hauteur][largeur];
        for (int i = 4; i < 6; i++) {
            for (int j = 4; j < 6; j++) {
                grille[i][j] = true;
            }
        }
        jeu.setGrille(grille);
        return jeu;
    }

    public static JeuDeLaVie createGrenouille() {
        int hauteur=10;
        int largeur=10;
        JeuDeLaVie jeu = new JeuDeLaVie(hauteur, largeur);
        boolean[][] grille = new boolean[hauteur][largeur];
        grille[4][4]=true;
        grille[4][5]=true;
        grille[4][6]=true;

        grille[5][3]=true;
        grille[5][4]=true;
        grille[5][5]=true;
        jeu.setGrille(grille);
        return jeu;
    }

    public static JeuDeLaVie createPlaneur() {
        int hauteur=10;
        int largeur=10;
        JeuDeLaVie jeu = new JeuDeLaVie(hauteur, largeur);
        boolean[][] grille = new boolean[hauteur][largeur];
        grille[3][4]=true;

        grille[4][4]=true;
        grille[4][6]=true;

        grille[5][4]=true;
        grille[5][5]=true;
        jeu.setGrille(grille);
        return jeu;
    }

    public static JeuDeLaVie createCanon(int hauteur, int largeur) {
        JeuDeLaVie jeu = new JeuDeLaVie(hauteur, largeur);
        boolean[][] grille = new boolean[hauteur][largeur];
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if(i == 0 && j == largeur-1) grille[i][j] = true;
                else if(i == 1 && j == largeur-2) grille[i][j] = true;
                else if(i == 2 && j == largeur-4) grille[i][j] = true;
                else if(i == 2 && j == largeur-3) grille[i][j] = true;
                else if(i == 3 && j == largeur-4) grille[i][j] = true;
                else if(i == 3 && j == largeur-3) grille[i][j] = true;
                else if(i == 4 && j == 0) grille[i][j] = true;
                else if(i == 4 && j == 1) grille[i][j] = true;
                else if(i == 5 && j == 0) grille[i][j] = true;
                else if(i == 5 && j == 1) grille[i][j] = true;
                else if(i == 7 && j == 2) grille[i][j] = true;
                else if(i == 7 && j == 3) grille[i][j] = true;
                else if(i == 8 && j == 2) grille[i][j] = true;
                else if(i == 8 && j == 3) grille[i][j] = true;
                else if(i == 9 && j == 4) grille[i][j] = true;
                else grille[i][j] = false;
            }
        }
        jeu.setGrille(grille);
        return jeu;
    }
}
