package rooms;

import behaviours.IBadGuy;
import behaviours.IPlayer;
import characters.baddudes.Werehouse;
import characters.totallyniceguys.Knight;
import com.sun.tools.javac.jvm.Items;
import items.Item;
import items.Loot;

import java.util.ArrayList;

public class Rooms {

    private ArrayList<Item> loot;
    private ArrayList<IBadGuy> badGuys;
    private IPlayer player;
//    private boolean status;

    public Rooms()
    {
        this.loot = new ArrayList<>();
        this.badGuys = new ArrayList<>();
        this.player = null;
//        this.status  = false;
    }

    public void addPlayerToRoom(IPlayer player){
        this.player = player;
    }

    public IPlayer getPlayer(){
        return this.player;
    }

    public ArrayList getLoot()
    {
        return this.loot;
    }

    public ArrayList getBadGuys()
    {
        return badGuys;
    }

//    public boolean getStatus()
//    {
//        return this.status;
//    }
//
//    public void setStatus(boolean status)
//    {
//        this.status = status;
//    }

    public void addLoot(Item loot)
    {
        this.loot.add(loot);
    }

    public void setBadGuys(IBadGuy badGuy)
    {
        this.badGuys.add(badGuy);
    }

    public void fight(){
        IBadGuy baddie = this.badGuys.remove(0);
        if (baddie instanceof Werehouse){
            int playerattack = ((Werehouse) baddie).getAttack();
            int badGuyhp = ((Werehouse) baddie).getHp();
        }
        IPlayer player = this.player;
        if(player instanceof Knight){
            int playerattack = ((Knight) player).getAttackStrength();
            int playerhp = ((Knight) player).getHp();
        }

    }






}
