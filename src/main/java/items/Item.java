package items;

public class Item {

    private Loot loot;

    public Item(Loot loot){
        this.loot = loot;
    }

    public Loot lootType(){
        return this.loot;
    }

    public int lootValue(){
        return this.loot.getValue();
    }
}
