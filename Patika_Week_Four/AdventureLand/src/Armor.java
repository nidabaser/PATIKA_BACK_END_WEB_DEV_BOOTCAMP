/**
 * @author Nida Başer
 * March 2024
 */
public class Armor {
    private int id;
    private String armorName;
    private int blockDamage;
    private int price;

    public Armor(int id, String armorName, int blockDamage, int price) {
        this.id = id;
        this.armorName = armorName;
        this.blockDamage = blockDamage;
        this.price = price;
    }

    public static Armor[] armors(){
        Armor[] armorList = new Armor[5];
        armorList[0] = new Armor(1,"Light Armor", 1,15);
        armorList[1] = new Armor(2,"Medium Armor", 3,25);
        armorList[2] = new Armor(3,"Heavy Armor", 5,40);
        armorList[3] = new Armor(4,"Chain Armor", 4,32);
        armorList[4] = new Armor(5,"Leather Armor", 2,20);
        return armorList;
    }

    public static Armor getSelectedArmorById(int id){
        for(Armor a : Armor.armors()){
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getBlockDamage() {
        return blockDamage;
    }

    public void setBlockDamage(int blockDamage) {
        this.blockDamage = blockDamage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
