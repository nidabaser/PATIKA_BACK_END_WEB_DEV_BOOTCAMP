/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Random;
import java.util.Scanner;
public class MineSweeper { // Evaluation Form 5

    // Two-dimensional arrays to store the game board and mine map
    String[][] mineMap;
    String[][] gameBoard;

    // Variables for number of rows and columns
    int rowNum, colNum;

    // Number of mines, whether the game continues and number of cells without mines.
    int minesNum;
    boolean isContinue;
    int countDown;

    // Constructor of the MineSweeper class
    MineSweeper(int rowNum, int colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.minesNum = (rowNum * colNum) / 4; // Number of mines set as one-fourth of the board
        this.countDown = rowNum * colNum - minesNum; // The number of non-mine cells
        this.gameBoard = new String[rowNum][colNum];
        this.mineMap = new String[rowNum][colNum];
        this.isContinue = true;
    }

    // Method to start the game
    public void run() { // Evaluation Form 6
        createBoard();
        placeMines();
        showMineBoard();  // If you want to see mines locations in the beginning
        showGameBoard();

        Scanner s = new Scanner(System.in);

        // Evaluation Form 9
        // Take user input for the row and column coordinates they want to mark as long as the game continues
        while (isContinue) {
            System.out.print("Choose row number: ");
            int row = s.nextInt();
            System.out.print("Choose column number: ");
            int col = s.nextInt();

            // Evaluation Form 10
            // Check whether the point chosen by the user is within the bounds of the array
            while (row < 0 || row >= rowNum || col < 0 || col >= colNum) {

                // If not, a warning message is displayed
                System.out.println("Invalid move, pay attention to game board boundaries!");

                // User is prompted for input again.
                System.out.print("Choose row number again: ");
                row = s.nextInt();
                System.out.print("Choose column number again: ");
                col = s.nextInt();
            }

            makeMove(row, col);
            calculateNeighborMinesNum(row, col);

            if (!isContinue || countDown == 0) {
                break;
            }

            showGameBoard(); // Evaluation Form 11
        }
    }

    // Method to create the game board
    public void createBoard() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                mineMap[i][j] = "-";
                gameBoard[i][j] = "-";
            }
        }
    }

    // Method to place mines on the board randomly
    public void placeMines() {
        // Evaluation Form 10
        Random rand = new Random();
        for (int i = 0; i < this.minesNum; i++) {
            int randRow = rand.nextInt(this.rowNum);
            int randCol = rand.nextInt(this.colNum);

            // If there is already a mine in the selected cell, choose again
            if (this.mineMap[randRow][randCol].equals("*")) {
                i--;
            } else {
                this.mineMap[randRow][randCol] = "*";
            }
        }
    }

    // Method that takes a 2-dimensional array as a parameter to print boards
    private void printBoard(String[][] board) {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Display game board using printBoard method
    public void showGameBoard() {
        System.out.println("-----Game Board-----");
        printBoard(gameBoard);
    }

    // Display mine board using printBoard method
    public void showMineBoard() {
        System.out.println("---Mines Locations---");
        printBoard(mineMap);
    }

    // Method to check the player's move
    public void makeMove(int row, int col) {

        if (!gameBoard[row][col].equals("-")) {
            System.out.println("Already been moved in this area!");
            countDown++;
        }

        if (mineMap[row][col].equals("*")) { // Evaluation Form 13
            gameBoard[row][col] = "0";
            isContinue = false;
            showMineBoard();
            System.out.println("A mine was found in " + row + ", " + col + " !!!");
            System.out.println("GAME OVER..."); // Evaluation Form 15
        } else {
            countDown--;
            if (countDown == 0) { // Evaluation Form 14
                System.out.println("YOU WIN!!!"); // Evaluation Form 15
            }
        }
    }

    // Method to calculate the number of neighboring mines
    public void calculateNeighborMinesNum(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i >= this.rowNum) {
                continue;
            }
            for (int j = col - 1; j <= col + 1; j++) {
                if (!(j < 0 || j >= this.colNum)) {
                    if (this.mineMap[i][j].equals("*")) {
                        count++; // Number of neighboring mines
                    }
                }
            }
        }

        // Update the game board and mine map with neighboring mines
        this.gameBoard[row][col] = String.valueOf(count); // Evaluation Form 12
        this.mineMap[row][col] = String.valueOf(count); // Evaluation Form 12
    }
}