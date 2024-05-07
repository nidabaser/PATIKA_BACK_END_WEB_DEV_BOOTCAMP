/**
 * @author Nida Başer
 * March 2024
 */
public class Quarry extends BattleLocation{
    public Quarry(Player player) {
        super(player, "Quarry", new Wendigo(), "Money||Weapon||Armor", 5);
    }
}
