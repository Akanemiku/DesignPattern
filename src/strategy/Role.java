package strategy;

public abstract class Role {
    private Weapon weapon;
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void toUseWeapon(){
        weapon.useWeapon();
    }

    public abstract void display();
}
