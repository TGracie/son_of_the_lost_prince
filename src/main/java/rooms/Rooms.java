package rooms;

import behaviours.IBadGuy;
import behaviours.IPlayer;
import items.Loot;

import java.util.ArrayList;

public class Rooms {

    private ArrayList<Loot> loot;
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

    public void addLoot(Loot loot)
    {
        this.loot.add(loot);
    }

    public void setBadGuys(IBadGuy badGuy)
    {
        this.badGuys.add(badGuy);
    }






}
