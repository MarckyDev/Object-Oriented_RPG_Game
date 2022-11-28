package Story;

import static java.lang.Thread.sleep;

public class StoryFunc {

    //TYPE EFFECT//
    public void type(String text){
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

    //SYSTEM.PAUSE//
    public void pause(int millisec){
        try{
            sleep(millisec);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }


}
