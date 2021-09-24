package puissance4;

import java.io.IOException;

class Systeme {
    public static void main(String[] args) {
        
    }
}

class Partie {
    Player player1;
    Player player2;
    Grille grille;

    public Partie(Player player1, Player player2, Grille grille){
        this.player1 = player1;
        this.player2 = player2;
        this.grille = grille;
    }

    private Player Victoire(Grille grille){
        return this.player1;
    }

    private Player Defaite(Grille grille){
        return this.player2;
    }

    private Boolean Egaliter(Grille grille){
        return grille.IsFull();
    }

    public void Tours(Player player){
        //reload la grille
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        try {
            String FirstName = br.readLine();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        // test si il choisi un emplacement valide
        //si oui
            //placer le symbole du player sur la grille
            //test victoire
                //si oui fin de la partie 
                //si non fin du tours et teste grille plein
        //si non
            //this.Tours(player);
            //afficher un msg d'erreur
    }

}

// class Tours {
//     public Tours(Player player) {
        
//     }
// }
