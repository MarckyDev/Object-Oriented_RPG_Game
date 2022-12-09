package Game;

import static java.lang.Thread.sleep;
import java.util.Scanner;
public class Helpers {
    //HELPER METHODS TO GIVE FX FOR THE STORY//
    static Scanner scanner = new Scanner(System.in);
    //TYPE EFFECT//
    public static void type(String text){
        for(int i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                sleep(10);//0.05s pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    //CLEAR SCREEN//
    public static void cls(){
        for (int j=0;j<1000;j++) {
            System.out.println();
        }
    }

    //enter to continue
    public static void enterToContinue(){
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }

    //condition to read user input
    public static int readInp(String inp, int choices){
        int input;
        do{
            System.out.print(inp);
            try{
                input = Integer.parseInt(scanner.next());
            }catch (Exception e){
                input = -1;
                System.out.println("Only numbers please! ");
            }
        }while(input < 1 || input > choices);
        return input;
    }

    public static void separate(int n){
        for (int i = 0; i <n ; i++)
            System.out.print("=");
        System.out.println();
    }

    public static void printTitle (String title){
        separate(30);
        type(title);
        separate(30);
    }
}
