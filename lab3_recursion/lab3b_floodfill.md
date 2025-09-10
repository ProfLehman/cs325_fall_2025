# Lab #3 Part B - Flood Fill
- CS325 Data Structures  
- 9 points
- Due **Wednesday**, September 10th at 5:00 pm

---

## Purpose

The purpose of this assignment is to understand a **recursive** algorithm that
implements the floodfill.

---

## Requirements
0. Add your first and last names to the comments
1. Modify `lab3b.java` to make recursive calls to **fill up and down, as well as diagonally**.
   - Hint: you will have x8 recursive calls
3. Modify `lab3b.java` to add a **base case** that stops if the row or column is out of bounds. 
    - Hint: row <0, col < 0, row >= temp.length, or col >= temp[0].length
    - Hint: another way to look at the problem is to only continue if row >= 0 and row < temp.length and col >= 0 and col < temp[0].length
4. Demonstrate filling within border
    - add function call to fill, then display board
    - Hint: see sample output
5. Demonstrate filling the border
    - add function call to fill the border, then display board

---
## Sample Output

```text
Original

ggggggggg
gg gg   g
gg    g g
g       g
g    g  g
g    g  g
g       g
ggggggggg


After flood fill with r

ggggggggg
ggrggrrrg
ggrrrrgrg
grrrrrrrg
grrrrgrrg
grrrrgrrg
grrrrrrrg
ggggggggg


After flood filling border with i

iiiiiiiii
iiriirrri
iirrrrgri
irrrrrrri
irrrrgrri
irrrrgrri
irrrrrrri
iiiiiiiii

```


## Starter Code

```java
// lab3b.java
// fall 2025
// Prof. Lehman
// Demonstrates recursive algorithm to "flood fill"
// an ASCII graphic

class lab3b {
    public static void main(String[] args) {

        // grid represents a graphic image
        char grid[][] = { { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' },
                { 'g', 'g', ' ', 'g', 'g', ' ', ' ', ' ', 'g' },
                { 'g', 'g', ' ', ' ', ' ', ' ', 'g', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', 'g', ' ', ' ', 'g' },
                { 'g', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'g' },
                { 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g', 'g' } };

        // show starting grid
        display(grid);

        // fill open space ' ' with 'r'
        floodFill(grid, 5, 3, 'r', 'g');
        display(grid);

        // fill same space with 'b'
        floodFill(grid, 5, 3, 'b', 'g');
        display(grid);
    } // main

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

    } // floodFill

    // display array
    public static void display(char temp[][]) {
        for (int r = 0; r < temp.length; r++) {
            for (int c = 0; c < temp[r].length; c++) {
                System.out.print(temp[r][c]);
            }
            System.out.println();
        }
        System.out.println();
    } // display

} // class
```

---
## Submitting your assignment

Your program must be called **lab3b.java**

Host `lab3b.java` on your GitHub account and **upload a link to your code in Moodle**

-- end --
