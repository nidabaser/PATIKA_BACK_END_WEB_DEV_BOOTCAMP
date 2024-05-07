import java.util.Scanner;

/**
 * @author Nida Başer
 * March 2024
 */
public abstract class Location {
    private Player player;
    private String locationName;
    public static Scanner s = new Scanner(System.in);

    public Location(Player player, String locationName) {
        this.player = player;
        this.locationName = locationName;
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
