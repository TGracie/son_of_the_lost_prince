import characters.totallyniceguys.Barbarian;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Kronk", WeaponType.BattleAxe);
    }

    @Test
    public void hasName(){
        assertEquals("Kronk",barbarian.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(150,barbarian.getHp());
    }

    @Test
    public void hasAttack(){
        assertEquals(15,barbarian.getAttack());
    }

    @Test
    public void hasDefence(){
        assertEquals(8,barbarian.getDefence());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.BattleAxe, barbarian.getWeapon());
    }
}
