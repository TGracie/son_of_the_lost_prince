package characters.baddudes;

import behaviours.IBadGuy;
import characters.Avatar;
import items.WeaponType;

public class Werehouse extends Avatar implements IBadGuy {

    public Werehouse(String name) {
        super(name);
        setStats();
        setStatus();
    }

    protected void setStats(){
        this.name = "A Lycanthropic storage facility";
        this.hp += 900;
        this.attack -=10;
        this.defence -= 10;
    }

    public void setStatus(){
        this.badGuy = true;
    }
}
