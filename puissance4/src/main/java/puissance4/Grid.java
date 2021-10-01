package puissance4;

class Grid {
    int height = 6;
    int length = 8;
    String[] Colonne = new String[6];
    String[][] grid = new String[8][6];

    Grid(int x, int y){
        this.height = y;
        this.length = x;
    }

    public static void main(String[] args) {
        Grid playForme = new Grid(8, 6);
        playForme.createColonne();
        playForme.createGrid();
        
        for (String[] descendre : playForme.grid) {
            System.out.print("#");
            for (String Colonne : descendre) {
                System.out.print(Colonne);
            }
            System.out.print("#\n");
            
            
        }
        System.out.print("##########\n");
        System.out.print(" 12345678 \n");
    }

    public  void createColonne() {
        for (int i = 0; i <= this.height-1; i++){
            this.Colonne[i] = " ";
        }
    }

    public  void createGrid() {
        for (int i = 0; i <= this.length -1; i++) {
            String[] ColonneCopie = new String[6];
            for(int j = 0; j < 6; j++){
                ColonneCopie[j] = " "; 
            }
            this.grid[i] = ColonneCopie;
        }
    }

    public boolean gridIsFull() {
        boolean isFull = false;
        int checkFull = 0;
        for (String[] i : this.grid) {
            for (String j : i) {
                if (j != "X" || j != "O") {
                    checkFull++;
                }
            }
        }
        if (checkFull == (this.length*this.height)){
            isFull = true;
        }
        return(isFull);
    }

    public boolean victory() {
        boolean victory = false;
        for (int i = 0; i <this.length; i++) {}
        return(victory);
    }
}