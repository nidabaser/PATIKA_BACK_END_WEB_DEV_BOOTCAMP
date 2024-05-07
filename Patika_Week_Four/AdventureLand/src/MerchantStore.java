import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author Nida Başer
 * March 2024
 */
public class MerchantStore extends NormalLocation{
    public MerchantStore(Player player) {
        super(player, "Merchant Store");
    }

    @Override
    public boolean onLocation(){
        boolean showMenu = true;
        while(showMenu){
            System.out.println("*| WELCOME TO THE MERCHANT STORE ! |*");
            System.out.println("1. Weapons");
            System.out.println("2. Armors");
            System.out.println("3. Exit Store");
            System.out.print("What is your choice: ");
            int selectCase = Location.s.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.print("Invalid Choice, try again: ");
                selectCase = s.nextInt();
            }
            switch(selectCase){
                case 1:
                    printWeapons();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Thanks sir! We wait again!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapons(){
        System.out.println("\n---WEAPONS---\n");
        for(Weapon w : Weapon.weapons() ){
            System.out.println(w.getId() + ".Weapon: " + w.getWeaponName() + " < Price : " + w.getPrice() + ", Damage: " + w.getDamage() + " >");
        }
        System.out.println("ENTER (0) FOR EXIT");
    }

    public void buyWeapon(){
        System.out.print("Select your weapon: ");
        int selectWeapon = s.nextInt();
        while (selectWeapon < 0 || selectWeapon > Weapon.weapons().length) {
            System.out.print("Invalid Choice, try again: ");
            selectWeapon = s.nextInt();
        }

        if (selectWeapon != 0) {
            Weapon selectedWeapon = Weapon.getSelectedWeaponById(selectWeapon);
            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getCoin()){
                    System.out.println("Insufficient Coins !");
                } else {
                    System.out.println("You bought " + selectedWeapon.getWeaponName() + " weapon");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining coins: " + this.getPlayer().getCoin());
                    System.out.println("Your old weapon: " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Your new weapon: " + this.getPlayer().getInventory().getWeapon().getWeaponName());
                }
            }
        }

    }

    public void printArmors(){
        System.out.println("\n---ARMORS---\n");
        for(Armor a : Armor.armors() ){
            System.out.println(a.getId() + ".Armor: " + a.getArmorName() + " < Price : " + a.getPrice() + ", Block Damage: " + a.getBlockDamage() + " >");
        }
        System.out.println("ENTER (0) FOR EXIT");
    }

    public void buyArmor() {
        System.out.print("Select your armor: ");
        int selectArmor = s.nextInt();
        while (selectArmor < 0 || selectArmor > Armor.armors().length) {
            System.out.print("Invalid Choice, try again: ");
            selectArmor = s.nextInt();
        }
        if (selectArmor != 0) {
            Armor selectedArmor = Armor.getSelectedArmorById(selectArmor);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("Insufficient Coins !");
                } else {
                    System.out.println("You bought " + selectedArmor.getArmorName());
                    int balance = this.getPlayer().getCoin() - selectedArmor.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining coins: " + this.getPlayer().getCoin());
                    System.out.println("Your old armor: " + this.getPlayer().getInventory().getArmor().getArmorName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Your new armor: " + this.getPlayer().getInventory().getArmor().getArmorName());
                }
            }
        }
    }

}
