/**
 * @author Nida Başer
 * March 2024
 */
import java.util.Scanner;
public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int coin;
    private String characterName;
    private String playersName;
    private Inventory inventory;
    private Scanner s = new Scanner(System.in);

    public Player(String playersName){
        this.playersName = playersName;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        CharacterClass[] characterClasses = {new Samurai(), new Archer(), new Knight(), new HunterRanger(), new Paladin()};
        System.out.println("-----------------------------------------------------");
        for (CharacterClass c : characterClasses) {
            System.out.println("ID: " + c.getId() + "\tClass: " + c.getCharacterName() + " --> "
                    + "\tDamage: " + c.getDamage()
                    + "\tHealth: " + c.getHealth()
                    + "\tCoin: " + c.getCoin());
        }
        System.out.println("-----------------------------------------------------");
        System.out.print("SELECT YOUR CLASS ID TO START THE GAME: ");
        int selectChar = s.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            case 4:
                initPlayer(new HunterRanger());
                break;
            case 5:
                initPlayer(new Paladin());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(CharacterClass characterClass){
        this.setDamage(characterClass.getDamage());
        this.setHealth(characterClass.getHealth());
        this.setOriginalHealth(characterClass.getHealth());
        this.setCoin(characterClass.getCoin());
        this.setCharacterName(characterClass.getCharacterName());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getPlayersName() {
        return playersName;
    }

    public void setPlayersName(String playersName) {
        this.playersName = playersName;
    }

    public void printPlayerInfo(){
        System.out.println("Your Weapon: " + this.getInventory().getWeapon().getWeaponName() + " | "
                + "Damage: " + this.getTotalDamage() + " | "
                + "Your Armor: " + this.getInventory().getArmor().getArmorName() + " | "
                + "Block Damage: " + this.getInventory().getArmor().getBlockDamage() + " | "
                + "Health: " + this.getHealth() + " | "
                + "Coin: " + this.getCoin());
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
