package Items;

public class Melee extends Item{

    public Melee(String itemName, int itemAttack){
        super(itemName,
              0,
              itemAttack,
              0,
              ItemType.SWORD);
    }
}
