// floodFill.java
// fall 2023 (updated fall 2025)
// Prof. Lehman
// Demonstrates recursive algorithm to "flood fill"
// an ASCII graphic

class Main {
    public static void main(String[] args) {

        // grid represents a graphic image
        char grid[][] = { { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' },
                { 'g', 'g', ' ', 'g', 'g', ' ', ' ', ' ', 'g' },
                { 'g', 'g', ' ', ' ', ' ', 'g', 'g', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'g' },
                { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' } };

        display(grid);

        floodFill(grid, 5, 3, 'r', 'g'); // fill with r
        display(grid);

        // floodFill(grid, 5, 3, ' ', 'g'); // fill back with space
        // display(grid);
    }

    // flood fill 2D char array
    public static void floodFill(char temp[][], int row, int col, char fillColor, char borderColor) {

        // base case is when position is already filled or hit border
        if (temp[row][col] != fillColor && temp[row][col] != borderColor) {

            // set current to fill color
            temp[row][col] = fillColor;

            // recursive calls to fill
            floodFill(temp, row, col - 1, fillColor, borderColor); // fill left
            floodFill(temp, row, col + 1, fillColor, borderColor); // fill right

            floodFill(temp, row + 1, col, fillColor, borderColor); // fill down

        }

    }

    // display array
    public static void display(char temp[][]) {
        for (int r = 0; r < temp.length; r++) {
            for (int c = 0; c < temp[r].length; c++) {
                System.out.print(temp[r][c]);
            }
            System.out.println();
        }
        System.out.println();
    }

}