/**
 * @author Nida Başer
 * March 2024
 */
public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    public boolean onLocation() {
        System.out.println("YOU ARE IN SAFE HOUSE NOW.\nYOUR HEALTH IS REGENERATE.");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }

}
