package characters.baddudes;

import characters.Avatar;
import items.WeaponType;

public class MsWhitby extends Avatar {

    private WeaponType weapon;

    public MsWhitby(String name, WeaponType weapon) {
        super(name);
        this.weapon = weapon;
        setStats();
        setStatus();
    }

    protected void setStats(){
        this.name = "Ms Whitby. A nonagenarian murder powerhouse.";
        this.hp -= 50;
        this.attack += 10;
        this.defence += 10;
    }

    public void setStatus(){
        this.badGuy = true;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }
}
