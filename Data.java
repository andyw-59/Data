public class Data {  
public static final int MAX = (int) (Math.random() * Integer.MAX_VALUE);  
private int[][] grid; 

public Data(int[][] arr) {
    grid = arr;
}

public String toString() {
    String s = "";
    for (int[] row : grid) {
        for (int col : row) {
            s += col + " ";
        }
        s += "\n";
    }
    return s;
}

public void repopulate() { 
    for (int row = 0; row < grid.length; row++ ) {
        for (int col = 0; col < grid[0].length; col++) {
            int val = 0;
            while (val % 10 != 0 || val % 100 == 0) {
                val = (int) (Math.random() * MAX + 1);
            }
            grid[row][col] = val;
        }
    }
}  

public int countIncreasingCols() {
    int count = 0;
    if (grid.length == 1) return 1;
    for (int col = 0; col < grid[0].length; col++) {
        boolean increase = true;
        for (int row = 1; row < grid.length; row++) {
            if (grid[row][col] < grid[row - 1][col]) {
                increase = false;
            }
        }
        if (increase == true) count++;
    }
    return count;
}  

}  
