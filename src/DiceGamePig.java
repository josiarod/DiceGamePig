import java.util.Random;
import java.util.Scanner;

public class DiceGamePig {
    public static void main(String[] args){
        int  dice1, dice2, score = 0;
        Random roll = new Random();
        System.out.println("Welcome! Let's Play Roll Dice! ");
        Scanner keyboard = new Scanner(System.in);


         String again = "yes";
        while(again.equalsIgnoreCase("yes")){

             dice1 = 1 + roll.nextInt(6);
             dice2 = 1 + roll.nextInt(6);

             if(dice1 == 1 && dice2 == 1){
                 score += 25;
             }else if(dice1 == 1 || dice2 == 1){
                 score += 0;
             }else{
                 score += dice1 + dice2;
             }

             if(score > 99){
                 System.out.println("Your rolls " +dice1+ " & "+dice2);
                 System.out.println("Score: "+score);
                 System.out.println("You have scored over 100");
                 System.out.println("Thank you for playing!");
                 break;
             }


            System.out.println("Your rolls " +dice1+ " & "+dice2);
            System.out.println("Score: "+score);
            System.out.println("Roll again?");
            again =  keyboard.next();
            if(again.equalsIgnoreCase("no")){
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
