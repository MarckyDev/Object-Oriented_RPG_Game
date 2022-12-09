package Items;

public class Shield extends Item{
    public Shield(String itemName, int itemDefense, int itemHealth){
        super(itemName,
              itemDefense,
              1,
              itemHealth,
              ItemType.SHIELD);
    }

}
