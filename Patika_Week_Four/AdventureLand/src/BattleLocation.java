/*
 * @author Nida Başer
 * March 2024
 */
import java.util.Random;
public abstract class BattleLocation extends Location{
    private Enemy enemy;
    private String reward;
    private int maxEnemy;

    public BattleLocation(Player player, String locationName, Enemy enemy, String reward, int maxEnemy) {
        super(player, locationName);
        this.enemy = enemy;
        this.reward = reward;
        this.maxEnemy = maxEnemy;
    }

    @Override
    public boolean onLocation(){
        int enemyNumber = this.randomEnemyNumber();
        System.out.println("\n------>> You are now in the "
                + this.getLocationName()
                + ", YES ! There is "
                + this.getReward()
                + " ! But wait...");
        System.out.println("------>> There is a "
                + enemyNumber + " "
                + this.getEnemy().getEnemyName()
                + " in here ! Be Careful "
                + this.getPlayer().getPlayersName() + " !");
        System.out.print("------>> <F>IGHT OR <R>UN: ");
        String selectToDo = s.nextLine().toUpperCase();
        if (selectToDo.equals("F") && combat(enemyNumber)){
                System.out.println("You have defeat all enemies ! ");
                return true;
        }
        if (this.getPlayer().getHealth() <= 0){
            System.out.println("YOU DIED...");
            return false;
        }
        return true;
    }

    public boolean combat(int enemyNumber){
        for (int i=1; i<= enemyNumber; i++) {
            this.getEnemy().setEnemyHealth(this.getEnemy().getOriginalHealth());
            playerStats();
            enemyStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getEnemy().getEnemyHealth() > 0){
                System.out.print("------>> <H>IT or <R>UN: ");
                String selectCombat = s.nextLine().toUpperCase();
                if (selectCombat.equals("H")){
                    System.out.println("You hit !");
                    this.getEnemy().setEnemyHealth(this.getEnemy().getEnemyHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getEnemy().getEnemyHealth() > 0) {
                        System.out.println("\nEnemy hits you !");
                        int enemyDamage = this.getEnemy().getEnemyDamage() - this.getPlayer().getInventory().getArmor().getBlockDamage();
                        if (enemyDamage < 0){
                            enemyDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - enemyDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (this.getEnemy().getEnemyHealth() < this.getPlayer().getHealth()) {
                System.out.println("You have defeat the enemy");
                System.out.println("Your reward: " + this.getEnemy().getRewardCoins() + " coins");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getEnemy().getRewardCoins());
                System.out.println("Your current coins: " + this.getPlayer().getCoin());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.getEnemy().getId() + ". " + this.getEnemy().getEnemyName() + " 's Health: " + this.getEnemy().getEnemyHealth());
    }

    public void playerStats(){
        System.out.println("Player Stats: \n");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Coins: " + this.getPlayer().getCoin());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getWeaponName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getArmorName());
        System.out.println("Block Damage: " + this.getPlayer().getInventory().getArmor().getBlockDamage());
    }

    public void enemyStats(int i){
        System.out.println("\n" + i + ". " + this.getEnemy().getEnemyName() + " Stats: \n");
        System.out.println("Health: " + this.getEnemy().getEnemyHealth());
        System.out.println("Damage: " + this.getEnemy().getEnemyDamage());
        System.out.println("Rewards: " + this.getEnemy().getRewardCoins());
    }

    public int randomEnemyNumber(){
        Random rand = new Random();
        return rand.nextInt(this.getMaxEnemy()) + 1;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public int getMaxEnemy() {
        return maxEnemy;
    }

    public void setMaxEnemy(int maxEnemy) {
        this.maxEnemy = maxEnemy;
    }
}