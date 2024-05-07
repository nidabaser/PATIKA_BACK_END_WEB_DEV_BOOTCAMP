/**
 * @author Nida Başer
 * March 2024
 */
public class Weapon {
    private String weaponName;
    private int id;
    private int damage;
    private int price;

    public Weapon(String weaponName, int id, int damage, int price) {
        this.weaponName = weaponName;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[5];
        weaponList[0] = new Weapon("Gun", 1,2,15);
        weaponList[1] = new Weapon("Sword", 2,3,20);
        weaponList[2] = new Weapon("Rifle", 3,7,25);
        weaponList[3] = new Weapon("Bow&Arrow", 4,5,10);
        weaponList[4] = new Weapon("Mace", 5,6,30);
        return weaponList;
    }

    public static Weapon getSelectedWeaponById(int id){
        for(Weapon w : Weapon.weapons()){
            if(w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
