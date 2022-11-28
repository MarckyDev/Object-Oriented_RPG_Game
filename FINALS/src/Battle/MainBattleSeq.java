package Battle;

import Enemy.*;
import Formula.Formula;
import MC.Reese;
import Story.StoryFunc;

import java.util.Random;
import java.util.Scanner;

public class MainBattleSeq {
    Enemy ep = new Enemy();
    StoryFunc sf = new StoryFunc();
    public final String b1 = "\nYou attacked! ";
    public final String b2 = "\nThe enemy attacked ";
    public final String b2r = "\nReese: OW!";

    public final String deal_dmg = "\nYou dealt " + new Reese().getReeseAttack() + " Damage";
    public final String enemy_deal_dmg = "\nThe enemy dealt " + ep.getEnemyAttack() + " Damage";

    public final String to_do = """
            
            What will you do?
            [1] Attack\s
            [2] Run
            \n""";

    public Parity check_parity(int num){
        int check = num / 2;
        if (check == 0){
            return Parity.EVEN;
        } else{
            return Parity.ODD;
        }
    }

    private void attack(){
        sf.type(b1);
        new Formula().dmg_to_enemy(new Enemy().getEnemyDefense(), new Enemy().getEnemyHealth());
        sf.type(deal_dmg);
    }
    private void defend(){
        sf.type(b2);
        new Formula().dmg_to_reese(new Enemy().getEnemyAttack());
        sf.type(b2r);
        sf.type(enemy_deal_dmg);
    }

    private void decideTurn(int count, String enemyName){
        Parity counted = check_parity(count);
        if (counted == Parity.ODD){
            if (count > 1){
                System.out.println("Your Turn");
            }
            System.out.println("You go first!");
            //you go first!
            //even attack
            //odd, defend
            attack();
            defend();
        } else if (counted == Parity.EVEN){
            if (count > 1){
                System.out.println("Enemy goes first!");
            }
            System.out.println("\n" + enemyName + "'" + "s" + " Turn");
            //enemy goes first
            //if even, defend
            //if odd, attack
            defend();
            attack();
        }
    }

    public void mainSequence(String enemyName, Enemy constructor){
        for (int count = 1; ep.getEnemyHealth() >= 0 || new Reese().getReeseHealth() >= 0; count++) {
            constructor.display();
            if (ep.getEnemyHealth() <= 0 ){
                System.out.println("\nYou won against " + enemyName);
                break;
            } else if (new Reese().getReeseHealth() <= 0){
                System.out.println("\nYou lost against " + enemyName);
                break;
            }
            sf.pause(2000);
            sf.type(to_do);
            int inp = new Scanner(System.in).nextInt();
            int y = new Random().nextInt(1,2);
            sf.type("\nTurn " + count);
            if (inp == 1 && y == 1) {
                decideTurn(count, enemyName);
            } else if (inp == 1 && y == 2) {
                decideTurn(count, enemyName);
            } else if (inp == 2) {
                System.out.println("\nYou ran away");
                break;
            }

        }
    }

}
