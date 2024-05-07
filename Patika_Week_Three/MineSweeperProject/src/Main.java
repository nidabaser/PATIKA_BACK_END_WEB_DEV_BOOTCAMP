/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" (*-*) Welcome to Mine Sweeper Game ! (*-*) ");

        // The user determining the size of the array // Evaluation Form 9
        System.out.print("Please enter the number of rows: ");
        int rowNum = scanner.nextInt();
        System.out.print("Please enter the number of columns: ");
        int colNum = scanner.nextInt();

        // Row and column numbers are must be at least 2
        while (rowNum < 2 || colNum < 2) { // User is given a chance to enter again
            System.out.print("Row number must be at least 2: ");
            rowNum = scanner.nextInt();
            System.out.print("Column number must be at least 2: ");
            colNum = scanner.nextInt();
        }

        System.out.println("NOTE: Row and column indexes start from 0 ");

        // Create object from MineSweeper class
        MineSweeper game = new MineSweeper(rowNum, colNum);
        // Start the game
        game.run();
    }
}