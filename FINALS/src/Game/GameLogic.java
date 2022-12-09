package Game;

import Character.*;
import Items.*;
import java.util.ArrayList;

public class GameLogic {
    static Reese reese = new Reese();
    public static boolean isRunning = true;
    protected static final String[] enemies = {"Ant", "Moth", "Beetle", "Mite", "Bird"};
    private static final String enemyName = enemies[(int) (Math.random()*enemies.length)];
    static private final ArrayList<String> inventory = new ArrayList<> ();
    static Enemy enemy = new Enemy(enemyName);

    //MAIN MENU FOR THE MAIN GAME
    public static void menu(){
        Helpers.type("Main Menu\n");
        Helpers.separate(20);
        Helpers.type("[1] START!\n");
        Helpers.type("[2] EXIT\n");
        Helpers.type("[3] SANDBOX MODE\n");
    }

    //MENU FOR SANDBOX MODE
    private static void sandBoxMenu(){
        Helpers.printTitle("SANDBOX MODE\n");
        Helpers.type("""
                     [1] Item and Inventory Test
                     [2] Battle System Test
                     [3] Back
                     """);
    }

    //ITEM AND INVENTORY TEST//
    private static void itemTest(){
        Helpers.printTitle("Item and Inventory Test\n");
        Helpers.type("""
                     [1] Add Item
                     [2] Check Inventory
                     [3] Remove Items
                     [4] Back
                     """);
        int input = Helpers.readInp("->", 4);
        if (input == 1) {
            while(true){
            int yeNo = Helpers.readInp("->", 2);
            if(yeNo == 1) {
                Helpers.type("Please fill up the following...\n");
                Helpers.type("itemName, itemAttack, itemDefense, itemHealth, itemType\n");
                Helpers.type("""
                             itemName = any name
                             itemAttack = any integer
                             itemDefense = any integer
                             itemHealth = any integer
                             itemType = [MUST BE IN ALL CAPS]  SWORD or SHIELD
                             """);
                System.out.println("Item Name");
                String name = Helpers.scanner.next();
                System.out.println("Item Attack");
                int attack = Helpers.scanner.nextInt();
                System.out.println("Item Defense");
                int defense = Helpers.scanner.nextInt();
                System.out.println("Item Health");
                int health = Helpers.scanner.nextInt();
                System.out.println("Item Type ");
                System.out.println("[SWORD only Take the Item Attack Value]\n" +
                                   "[SHIELD only take the Health, and Defense Value]");
                ItemType type = ItemType.valueOf(Helpers.scanner.next());
                give(name, attack, defense, health, type);
                Helpers.cls();
                System.out.println("You Added:" + name +
                                   "\nwith an Attack value of: " + attack +
                                   "\nwith a Defense value of: " + defense +
                                   "\nwith a health value of: " + health +
                                   "\nand a type of: " + type);
                System.out.println("to your Inventory!");
                Helpers.cls();
                Helpers.type("Would you like to add an item?");
                Helpers.type("\n[1] Yes, [2] No\n");
            } else if (yeNo == 2){
                break;
            }
            }
        }else if (input == 2) {
            Helpers.printTitle("INVENTORY\n");

            System.out.println(inventory);
            Helpers.enterToContinue();
        }else if (input == 3){
            inventory.clear();
            Helpers.printTitle("Inventory Cleared!");
            Helpers.enterToContinue();
            Helpers.cls();
        }
        else {
            inventory.clear();
            sandBoxMenu();
        }
        }

    //SAND BOX MODE FOR TESTING
    private static void sandBoxMode(){
        sandBoxMenu();
        int input = Helpers.readInp("->", 3);
        if (input == 1) {
            itemTest();
        }else if (input == 2) {
            Helpers.type("You selected Battle System Test");
            battle();
        }else
            menu();

    }

    //GIVES AN ITEM TO THE PLAYER//
    public static void give(String itemName, int itemAttack, int itemDefense, int itemHealth, ItemType itemType){
        if(itemType == ItemType.SWORD){

            new Melee(itemName, itemAttack);
            reese.attack += itemAttack;
            Helpers.type("\nYou Obtained " + itemName);
            System.out.println();
            inventory.add(itemName);
        }else if(itemType == ItemType.SHIELD){
            new Shield(itemName, itemDefense, itemHealth);
            reese.health += itemHealth;
            reese.defense += itemDefense;
            Helpers.type("\nYou Obtained " + itemName);
            System.out.println();
            inventory.add(itemName);
        }
        Helpers.printTitle("INVENTORY\n");
        System.out.println(inventory);
        Helpers.enterToContinue();
    }

    private static void reeseDead(){
        System.out.println("You Died!");
    }

    public static void battle(){
        Helpers.cls();
        System.out.println("You encountered " + enemy.name);
        Helpers.enterToContinue();

        while(true){
            Helpers.cls();
            Helpers.printTitle(enemy.name + "\nHealth " + enemy.health + "/" + enemy.maxHealth + "\n");
            System.out.println();
            Helpers.printTitle(reese.name + "\nHealth " + reese.health + "/" + reese.maxHealth + "\n");
            System.out.println("What will you do?");
            System.out.println("[1] Attack\n[2] Run");

            int choice = Helpers.readInp("\n->", 2);
            if (choice == 1){
                Helpers.type("\nYou attacked! ");
                int dmgTaken = enemy.attack() - reese.defend();
                int dmg = reese.attack() - enemy.defend();

                //checks if the damage is negative
                //if dmg is negative then the damage will be equated to zero
                if (dmgTaken < 0){
                    dmgTaken = 0;
                }
                if(dmg < 0) {
                    dmg = 0;
                }
                //deals dmg to both players
                reese.health -= dmgTaken;
                enemy.health -= dmg;

                Helpers.type("\nYou dealt " + dmg + " Damage");
                Helpers.type("\nThe enemy attacked! ");
                Helpers.type("\nReese: OW!");
                Helpers.type("\nThe enemy dealt " + dmgTaken + " Damage\n");
                //display current state of the player and the enemy
                Helpers.printTitle(enemy.name + "\nHealth " + enemy.health + "/" + enemy.maxHealth + "\n");
                Helpers.printTitle(reese.name + "\nHealth " + reese.health + "/" + reese.maxHealth + "\n");
                Helpers.enterToContinue();

                if (enemy.health <= 0){
                    Helpers.cls();
                    System.out.println("You won against " + enemy.name);
                    Helpers.enterToContinue();
                    break;
                }else if(reese.health <= 0){
                    System.out.println(enemy.name + "has defeated you");
                    reeseDead();
                    isRunning = false;
                    Helpers.enterToContinue();
                }

            }if (choice == 2){
                System.out.println("You ran away from: " + enemy.name);
                Helpers.enterToContinue();
                break;
            }

        }
        }


    //Initializes the game
    public static void startGame(){
        new Story().story();
    }

    //GAME LOOP
    public static void game(){
        while(isRunning){
            Helpers.printTitle("ADVENTURES OF REESE!\n");
            menu();
            int input = Helpers.readInp(">", 3);
            if (input == 1)
                startGame();
            else if (input == 2)
                isRunning = false;
            else if (input == 3)
                sandBoxMode();
        }
    }



}
