package puissance4;



public class Grid {
    int height = 8;
    int length = 6;
    String[] line = new String[8];
    String[][] grid = new String[6][];

    Grid(int x, int y){
        this.height = x;
        this.length = y;
    }

    public static void main(String[] args) {
        Grid grid = new Grid(6, 8);
        grid.createLine();
        grid.createGrid();
        System.out.println(grid);
    }

    private  void createLine() {
        for (int i = 0; i <= this.length; i++){
            this.line[i] = "5";
        }
        System.out.println(line);
    }

    private  void createGrid() {
        for (int i = 0; i <= this.height; i++) {
            this.grid[i] = this.line;
        }
    }

}
