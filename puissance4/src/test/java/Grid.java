class Grid {
    int height =6;
    int length = 8;
    String[] line = new String[length];
    String[][] grid = new String[height][length];

    Grid(int x, int y){
        this.height = y;
        this.length = x;
    }

    public static void main(String[] args) {
        Grid playForme = new Grid(8, 6);
        playForme.createLine();
        playForme.createGrid();
        //int test = 0;
        
        for (String[] descendre : playForme.grid) {
            System.out.print("#");
            for (String line : descendre) {
                //test++;
                System.out.print(line /*+ test*/);
            }
            System.out.print("#\n");
            
            
        }
        System.out.print("##########\n");
        System.out.print(" 12345678 \n");
    }

    private  void createLine() {
        for (int i = 0; i <= this.length-1; i++){
            this.line[i] = " ";
        }
    }

    private  void createGrid() {
        for (int i = 0; i <= this.height -1; i++) {
            this.grid[i] = this.line;
        }
    }

    public boolean gridIsFull() {
        boolean isFull = false;
        int checkFull = 0;
        for (String[] i : this.grid) {
            for (String j : i) {
                if (j == "X" || j == "O") {
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
        int nbrO = 0;
        int nbrX = 0;
        for (int i = 0; i <this.length; i++) {
            if (this.grid[1][i] != " ") {
                switch (this.grid[1][i]) {
                    case "O":
                        nbrO++;
                        nbrX = 0;
                        break;
                    case "X":
                        nbrX++;
                        nbrO = 0;
                        break;
                }
                if (nbrO == 4) {
                    System.out.println("player 1 win");
                    return (true);
                } else if (nbrX == 4){
                    System.out.println("player 2 win");
                    return (true);
                }
            } 
        }
        return(false);
    }
}