/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Scanner;
public class Game {
    private Scanner s = new Scanner(System.in);

    public void start() {
        System.out.println("   _    ___  __   __ ___  _  _  _____  _   _  ___  ___   _       _    _  _  ___\n" +
                "  /_\\  |   \\ \\ \\ / /| __|| \\| ||_   _|| | | || _ \\| __| | |     /_\\  | \\| ||   \\\n" +
                " / _ \\ | |) | \\ V / | _| | .` |  | |  | |_| ||   /| _|  | |__  / _ \\ | .` || |) |\n" +
                "/_/ \\_\\|___/   \\_/  |___||_|\\_|  |_|   \\___/ |_|_\\|___| |____|/_/ \\_\\|_|\\_||___/\n");
        System.out.println("*-* | WELCOME TO ADVENTURE LAND ! | *-*");
        System.out.print("Please enter your character's name: ");
        String playerName = s.nextLine();

        Player player = new Player(playerName);
        System.out.println("\nWELCOME TO THIS DARK AND FOGY ISLAND " + "<< " + player.getPlayersName() + " >>" + "\nWILL YOU SURVIVE ON THE ISLAND AS A MIGHTY WARRIOR?\nOR ARE YOU EASY PREY? WE'LL SEE...");
        player.selectChar();
        System.out.println();

        while (true) {
            player.printPlayerInfo();
            Location locations = null;
            System.out.println("-----------------------------------------------------");
            System.out.println("LOCATIONS TO GO:" +
                    "\t1. CANDLEKEEP INN (Safe)" +
                    "\t2. MERCHANT STORE" +
                    "\t3. CAVE" +
                    "\t4. FOREST" +
                    "\t5. RIVER" +
                    "\t0. EXIT GAME");
            System.out.println("-----------------------------------------------------");
            System.out.print("SELECT A LOCATION TO GO: ");
            int selectLoc = s.nextInt();
            switch (selectLoc) {
                case 0:
                    locations = null;
                    break;
                case 1:
                    locations = new SafeHouse(player);
                    break;
                case 2:
                    locations = new MerchantStore(player);
                    break;
                case 3:
                    locations = new Cave(player);
                    break;
                case 4:
                    locations = new Forest(player);
                    break;
                case 5:
                    locations = new River(player);
                    break;
                default:
                    System.out.println("Please enter valid location!");
            }
            if (locations == null){
                System.out.println("*****************\nGOODBYE FOR NOW\n*****************");
                break;
            }
            if(!locations.onLocation()) {
                System.out.println("GAME OVER EASY PREY...");
                break;
            }
        }
    }
}
