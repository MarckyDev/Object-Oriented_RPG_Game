package Items;

public abstract class Item {
    public String itemName;
    public int itemDefense, itemAttack, itemHealth;
    public ItemType itemType;

    public Item(String itemName, int itemDefense, int itemAttack, int itemHealth, ItemType itemType){
        this.itemName = itemName;
        this.itemDefense = itemDefense;
        this.itemAttack = itemAttack;
        this.itemHealth = itemHealth;
        this.itemType = itemType;
    }

}
