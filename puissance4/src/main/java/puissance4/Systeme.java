package puissance4;

import java.io.IOException;

import javax.swing.plaf.ToolBarUI;

class Systeme {
    public static void main(String[] args) {
        Player player1 = new Player("Antoine", "X");
        Player player2 = new Player("Pierric", "O");
        Grid grid = new Grid(8, 6);
        grid.createColonne();
        grid.createGrid();
        Partie game = new Partie(player1, player2, grid);
        game.Tours(player1, player2);
    }

    static public void display(Grid playForme){ 
        for (int y = playForme.height-1; y >= 0; y--) {
            System.out.print("#");
            for (int x = 0; x < playForme.length; x++) {
                System.out.print(playForme.grid[x][y]);
            }
            System.out.print("#\n");
            
            
        }
        System.out.print("##########\n");
        System.out.print(" 12345678 \n");
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

    private Boolean Egalite(Grid grid){
        return grid.gridIsFull();
    }

    public void Tours(Player player, Player player2){
        int PlayerInput = 0;
        //reload l'affichage de la Grid
        Systeme.display(this.grid);
        java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        try {
            PlayerInput = Integer.parseInt(br.readLine())-1;
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        if (PlayerInput >= 0 && PlayerInput <= this.grid.height){
            int temp = -1;
            for (String y : this.grid.grid[PlayerInput]){
                temp++;
                System.out.println("Tour numero : "+temp);
                if (this.grid.grid[PlayerInput][this.grid.height-1] != " ") {
                    System.out.println("Recommence!");
                    this.Tours(player, player2);
                    break;
                }else if (!y.equals("X") && !y.equals("O")){
                    this.grid.grid[PlayerInput][temp] = player.symbole;
                    break;
                }
            }
        }
        if (this.grid.gridIsFull() == false){
            //fin de game
        }else{
            this.Tours(player2, player);
        }
    }
}
