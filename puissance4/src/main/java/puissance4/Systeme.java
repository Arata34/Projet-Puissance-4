package puissance4;

import java.io.IOException;

class Systeme {
    public static void main(String[] args) {
        
    }
}

class Partie {
    Player player1;
    Player player2;
    Grid grid;

    public Partie(Player player1, Player player2, Grid grid){
        this.player1 = player1;
        this.player2 = player2;
        this.grid = grid;
    }

    private Player Victoire(Grid grid){
        return this.player1;
    }

    private Player Defaite(Grid grid){
        return this.player2;
    }

    private Boolean Egaliter(Grid grid){
        return Grid.IsFull();
    }

    public void Tours(Player player){
        int PlayerInput = 0;
        //reload la Grid
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        try {
            PlayerInput = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        if (PlayerInput >= 1 && PlayerInput <= this.grid.length){
            for (String[] x : this.grid.grid){
                for (String y : x){
                    if (y != "X" || x != "Y"){

                    }
                }
            }
        }
        // test si il choisi un emplacement valide
        //si oui
            //placer le symbole du player sur la Grid
            //test victoire
                //si oui fin de la partie 
                //si non fin du tours et teste Grid plein
        //si non
            //this.Tours(player);
            //afficher un msg d'erreur
    }

}

// class Tours {
//     public Tours(Player player) {
        
//     }
// }
