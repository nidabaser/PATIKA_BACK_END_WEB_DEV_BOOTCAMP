/**
 * @author Nida Başer
 * March 2024
 */
public abstract class NormalLocation extends Location{

    public NormalLocation(Player player, String locationName) {
        super(player, locationName);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
