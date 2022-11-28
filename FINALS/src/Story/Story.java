package Story;

import Enemy.*;
import java.util.*;

public class Story{
    StoryFunc sf = new StoryFunc();
    Enemy enemy = new EnemyProper();
    Enemy boss = new Boss();
    public int BOSS, NORMAL;

    //Main code of the story plus choice branches
    private final String Intro = """
            Long ago, the Kingdom of Anthophila was a rich, powerful and magnificent kingdom. It was filled with worker bees\s
            who are very dedicated at work. And there, Reese was born, a very magical bee who worked day and night all for \s
            the Queen! Then one day...
            """;

    private final String Intro1 = """
            \nYoung one, you have been the best worker bee around here, It is time to step up and look for better things!\s
            I, the Queen of this Kingdom, is in dire need of help, may I ask you a little favor in exchange for a gift?\s
            """;

    private final String DiaR1 = """

            Reese:Sure, my Queen, what is it that you desire?
            """;

    private final String DiaQ1 = """
            \nQueen: Reese! You have been dedicated to this kingdom ever since you were born,\s
            as a ruler of this Kingdom, I've heard bees complaining that the field nearby is\s
            not enough to supply us until winter. So, I humbly ask you, are you up for the job?\s
            """;

    private final String DiaR2 = """
            \nReese: Yes! My Queen, I will make sure that I will be able to find another field
            full of flowers!
            """;

    //choice
    private final String Explore = "Reese: " + "Now where do I start?";

    public void story(){
        /*sf.type(Intro);
        sf.pause(1000);
        sf.type(Intro1);
        sf.pause(1000);
        sf.type(DiaR1);
        sf.pause(1000);
        sf.type(DiaQ1);
        sf.pause(1000);
        sf.type(DiaR2);
        sf.pause(1000);
        sf.pause(3000);
        sf.cls();
        sf.type(Explore);*/
        String choice_1 = """

                [1] Nearby Flower Field
                [2] The Palace
                [3] Deep in to the forest
                [4] ACTIVATE HELL MODE
                """;
        sf.type(choice_1);
        int input = new Scanner(System.in).nextInt();
        //evaluates what you input
        chose(input);
        if (input == 2) {
            chose(input);
            System.out.println("NO ADVENTURE 4 U!!");
        }

    }
    public void chose(int text){
        switch (text) {
            case 1 -> branch_1();
            case 2 -> branch_2();
            case 3 -> branch_3();
            case 4 -> branch_4();
        }
    }
    private void branch_1(){
        NORMAL ++;
        //BRANCH 1//
        String case_1 = """
                Reese: The flowers are really wilted in this place...
                maybe I should explore more...
                """;
        sf.type(case_1);
        sf.pause(3000);
        sf.pause(100);
        enemy.fight(enemy.enemyName);
    }
    private void branch_2(){
        String case_2 = "Reese: " + "I" + "'" +
                "ve been here millions of times..."
                +"\nmaybe I should explore other places";
        sf.type(case_2);
        sf.pause(3000);
    }
    private void branch_3(){
        NORMAL ++;
        final String case_3 = """
                Reese: Eek!!! The birds look weird here...
                I feel uneasiness in this place, I think
                this might be related to the problems at the flower fields
                """;
        sf.type(case_3);
        sf.pause(3000);
        sf.pause(100);
        enemy.fight(enemy.setEnemyName(enemy.enemyName));
    }

    private void branch_4() {
        BOSS++;
        System.out.println("==========HELL MODE ACTIVATE============");
        sf.pause(3000);
        new Boss().generate();
        enemy.fight(boss.enemyName);
    }

}

