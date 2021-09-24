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
        Grid playForme = new Grid(6, 8);
        playForme.createLine();
        playForme.createGrid();
        
        for (String[] i : playForme.grid) {
            System.out.print("#");
            for (String j : i) {
                System.out.print(j);
            }
            System.out.print("#\n");
            
            
        }
        System.out.print("##########\n");
    }

    private  void createLine() {
        for (int i = 0; i <= this.height-1; i++){
            this.line[i] = " ";
        }
    }

    private  void createGrid() {
        for (int i = 0; i <= this.length -1; i++) {
            this.grid[i] = this.line;
        }
    }

}