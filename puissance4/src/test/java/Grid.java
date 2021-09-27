class Grid {
    int height = 6;
    int length = 8;
    String[] line = new String[8];
    String[][] grid = new String[6][8];

    Grid(int x, int y){
        this.height = y;
        this.length = x;
    }

    public static void main(String[] args) {
        Grid playForme = new Grid(8, 6);
        playForme.createLine();
        playForme.createGrid();
        
        for (String[] descendre : playForme.grid) {
            System.out.print("#");
            for (String line : descendre) {
                System.out.print(line);
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

    public boolean gridIsFull(String[][] grid, int length, int height) {
        boolean isFull = false;
        int checkFull = 0;
        for (String[] i : grid) {
            for (String j : i) {
                if (j != "X" || j != "O") {
                    checkFull++;
                }
            }
        }
        if (checkFull == (length*height)){
            isFull = true;
        }
        return(isFull);
    }

}