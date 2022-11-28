package Story.Items;

public class Items implements Item_gen{
    String[] standard_items ={"Honey Shield", "Bee Charm", "Wax Sword"};
    int def, health, attack;
    Items(){
        def = 0;
        health = 0;
        attack = 0;
    }

    public void setDefItem(){

    }
    public void setAttackItem(){

    }
    public void setHealthItem(){

    }

    @Override
    public void give() {
        for(String given : standard_items){
        System.out.println("You received, " + given);}
    }
}
