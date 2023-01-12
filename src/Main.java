public class Main {
    public static void main(String[] args) {
        // motif de bloc

        JeuDeLaVie bloc = Motifs.createBloc();
        System.out.println("Bloc :");
        for (int i = 0; i < 5; i++) {
            System.out.println(bloc);
            bloc.suivant();
        }

        // motif de grenouille
        JeuDeLaVie grenouille = Motifs.createGrenouille();
        System.out.println("Grenouille :");
        for (int i = 0; i < 5; i++) {
            System.out.println(grenouille);
            grenouille.suivant();
        }

        // motif de planeur
        JeuDeLaVie planeur = Motifs.createPlaneur();
        System.out.println("Planeur :");
        for (int i = 0; i < 5; i++) {
            System.out.println(planeur);
            planeur.suivant();
        }

        JeuDeLaVie canon = Motifs.createCanon(10,50);
        System.out.println("Canon :");
        for (int i = 0; i < 5; i++) {
            System.out.print("\033[H\033[2J");
            System.out.println(canon);
            canon.suivant();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
