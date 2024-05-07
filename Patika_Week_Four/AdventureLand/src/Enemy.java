/**
 * @author Nida Başer
 * March 2024
 */
public class Enemy {
    private int id;
    private String enemyName;
    private int enemyDamage;
    private int enemyHealth;
    private int rewardCoins;
    private int originalHealth;

    public Enemy(int id, String enemyName, int enemyDamage, int enemyHealth, int rewardCoins) {
        this.id = id;
        this.enemyName = enemyName;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;
        this.originalHealth = enemyHealth;
        this.rewardCoins = rewardCoins;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        if (enemyHealth < 0) {
            enemyHealth = 0;
        }
        this.enemyHealth = enemyHealth;
    }

    public int getRewardCoins() {
        return rewardCoins;
    }

    public void setRewardCoins(int rewardCoins) {
        this.rewardCoins = rewardCoins;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
