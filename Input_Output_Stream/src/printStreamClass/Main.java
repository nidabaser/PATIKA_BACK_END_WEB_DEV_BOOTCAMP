/**
 * @author Nida Başer
 * March 2024
 */
package printStreamClass;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.print("123" + 4567);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
