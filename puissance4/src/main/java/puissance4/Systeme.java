package puissance4;

import java.io.IOException;

import javax.swing.plaf.ToolBarUI;

class Systeme {
    public static void main(String[] args) {
        Player player1 = new Player("Antoine", "X");
        Player player2 = new Player("Pierric", "O");
        Grid grid = new Grid(8, 6);
        Partie game = new Partie(player1, player2, grid);
        game.Tours(player1, player2);
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
        return grid.gridIsFull();
    }

    public void Tours(Player player, Player player2){
        int PlayerInput = 0;
        //reload l'affichage de la Grid
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        try {
            PlayerInput = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    if (PlayerInput >= 1 && PlayerInput <= this.grid.length){
            int temp = 0;
            for (String y : this.grid.grid[PlayerInput]){
                temp++;
                if (this.grid.grid[PlayerInput][this.grid.height-1] != " ") {
                    this.Tours(player, player2);
                }else if (y != "X" || y != "Y"){
                    this.grid.grid[PlayerInput][temp] = player.symbole;
                }
            }
        }
        if (this.grid.gridIsFull() == true){
            //fin de game
        }else{
            this.Tours(player2, player);
        }
    }
}
