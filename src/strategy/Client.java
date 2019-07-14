package strategy;

public class Client {
    public static void main(String[] args){
        Role role = new Knight();
        Weapon weapon = new Sword();
        role.setWeapon(weapon);
        role.display();role.toUseWeapon();
    }
}
