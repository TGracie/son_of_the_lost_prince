import behaviours.IBadGuy;
import behaviours.IPlayer;
import characters.baddudes.Werehouse;
import characters.totallyniceguys.Knight;
import items.Item;
import items.Loot;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import rooms.Rooms;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Rooms room;
    Item item;
    IBadGuy baddie;
    IPlayer player;


    @Before
    public void before(){
        room = new Rooms();
        item = new Item(Loot.DIAMOND);
        baddie = new Werehouse("");
        player = new Knight("Bob", WeaponType.BroadSword);
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.getBadGuys().size());
        assertEquals(0, room.getLoot().size());
        assertEquals(null, room.getPlayer());
    }

    @Test
    public void canAddLootToRoom(){
        room.addLoot(item);
        assertEquals(1, room.getLoot().size());
    }

    @Test
    public void canAddBadGuyToRoom(){
        room.setBadGuys(baddie);
        assertEquals(1, room.getBadGuys().size());
    }

    @Test
    public void canSetPlayer(){
        room.addPlayerToRoom(player);
        assertEquals(player, room.getPlayer());
    }

    @Test
    public void fightTest(){
        room.fight();
        assertEquals();
    }
}
