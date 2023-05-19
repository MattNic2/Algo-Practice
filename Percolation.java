/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    // creates n-by-n grid, with all sites initially blocked
    // a site is blocked if it contains a 0 and is open if it contains a 1.

    private int[][] grid;
    private int[] id;
    private int size;
    private int open = 1;
    private int closed = 0;
    private int full = 2;

    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be greater than 0");
        }
        size = n;
        grid = new int[n][n];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                grid[i][j] = closed;
            }
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validateIndices(row, col);
        int adjustedRow = row - 1;
        int adjustedCol = col - 1;

        grid[adjustedRow][adjustedCol] = open;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validateIndices(row, col);
        int adjustedRow = row - 1;
        int adjustedCol = col - 1;
        return grid[adjustedRow][adjustedCol] == open;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validateIndices(row, col);
        int adjustedRow = row - 1;
        int adjustedCol = col - 1;
        return grid[adjustedRow][adjustedCol] == full;
    }

    public void validateIndices(int row, int col) {
        if (row < 1 || col < 1 || row > size || col > size) {
            throw new IllegalArgumentException("Row or column is outside the allowed range");
        }
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        int openSites = 0;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (grid[i][j] == open) {
                    openSites++;
                }
            }
        }
        return openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        if (WeightedQuickUnionUF.connected())
    }

    // test client (optional)
    public static void main(String[] args) {

    }


}
