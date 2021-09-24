package puissance4;

import java.util.ArrayList;

public class Grid {
    int height = 8;
    int length = 6;
    static ArrayList<String> border = new ArrayList<String>();
    String[] grid = new String[6];

    Grid(int x, int y){
        this.height = x;
        this.length = y;
    }

    private static void createLine(int length) {
        for (int i = 0; i <= length+1; i++){
            if (i == 0 || i  == length+1) {
            border.add("#");
            } else{
                border.add(" ");
            }
        }
        System.out.println(border);
    }

    private static void createGrille(int height, int length, String[] grid) {
        for (int i = 0; i <= height+1; i++) {
            if (i ==0) {
                for (int j = 0; j <= length; j++) {
                    grid[j] = "#";
                }
            }
        }
    }

}
