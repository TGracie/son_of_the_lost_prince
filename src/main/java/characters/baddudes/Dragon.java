package characters.baddudes;

import behaviours.IBadGuy;
import characters.Avatar;
import items.SpellType;
import items.WeaponType;

public class Dragon extends Avatar implements IBadGuy {
    private SpellType spell;
    private WeaponType weapon;

    public Dragon(String name, WeaponType weapon, SpellType spell) {
        super(name);
        this.weapon = weapon;
        this.spell = spell;
        setStats();
        setStatus();
    }

    protected void setStats(){
        this.name = "Adorable baby dragon";
        this.hp -= 90;
        this.attack -= 5;
        this.defence -= 8;
    }

    public void setStatus(){
        this.badGuy = true;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon;
    }
}
