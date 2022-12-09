package Game;

import static Items.ItemType.SHIELD;
import static Items.ItemType.SWORD;

public class Story {

    private void act_1(){
        Helpers.cls();
        Helpers.printTitle("ACT 1\n");
        Helpers.type("""
                  Long ago, the Kingdom of Anthophila was a rich, powerful and magnificent kingdom. It was filled with worker\s\040
                  bees who were very dedicated at work. And there, Reese was born, a very magical bee who worked day and night\s
                  all for the Queen! Then one day...
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("""
                  Queen: Young one, you have been the best worker bee around here, It is time to step up and look for better things!\s
                  I, the Queen of this Kingdom, is in dire need of help, may I ask you a little favor?\s
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("""
                  Reese: Sure my Queen, what is it that you desire?
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("""
                  Queen: Reese! You have been dedicated to this kingdom ever since you were born,\s
                  as a ruler of this Kingdom, I've heard bees complaining that the field nearby is\s
                  not enough to supply us until winter. So, I humbly ask you, are you up for the job?\s
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("""
                  Reese: Yes! My Queen, I will make sure that I will be able to find another field
                  full of flowers!
                  """);

        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("Reese: " + "Now where do I start?");
        Helpers.type("""
                                  
                  [1] Nearby Flower Field
                  [2] The Palace
                  [3] Deep in to the forest
                                  
                  """);
        int input = Helpers.readInp("->", 4);
        //evaluates what you input
        switch (input) {
            case 1 -> branch_1();
            case 2 -> branch_2();
            case 3 -> branch_3();
        }
        Helpers.cls();
        //whether the battle ends or you just ran away it's going to go here // :)
        //or if you checked the second option :/
        Helpers.type("""
                  Reese: Hmm... I feel like I have something missing...
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("**checks her surroundings**\n");
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("Reese: Ahk!\n");
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("A golden mirage hit Reese across the face blinding her slightly...");
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("Reese: A Shield and a Sword??");
        Helpers.enterToContinue();
        Helpers.cls();
        Helpers.type("Reese: This will come in handy!");
        //gives the sword item//
        GameLogic.give("Honey Sword", 20, 0, 0, SWORD);
        //gives the shield item//
        GameLogic.give("Wax Shield", 0, 20, 50, SHIELD);
        Helpers.type("To be Continued...");
        Helpers.enterToContinue();
        Helpers.cls();
    }

    public void story() {
        Helpers.enterToContinue();
        act_1();
    }

    ////BRANCH FUNCTIONS START////
    private void branch_1() {
        //BRANCH 1//
        Helpers.type("""
                  Reese: The flowers are really wilted in this place...
                  maybe I should explore more...
                  """);
        //enemy encounter
        GameLogic.battle();
    }

    private void branch_2() {
        Helpers.type("""
                  Reese: I've been here millions of times....""");
        Helpers.type("maybe I should explore more.");
    }

    private void branch_3() {
        Helpers.type("""
                  Reese: Eek!!! The birds look weird here...
                  I feel uneasiness in this place, I think
                  this might be related to the problems at the flower fields
                  """);
        Helpers.enterToContinue();
        Helpers.cls();
        //encounter
        GameLogic.battle();
    }
    ////BRANCH FUNCTIONS END////
}

