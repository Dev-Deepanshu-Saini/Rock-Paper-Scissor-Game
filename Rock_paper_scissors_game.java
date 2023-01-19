//This is made by "Deepanshu Saini"

import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissors_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

                System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
                int userInput = sc.nextInt();
                int computerInput = random.nextInt(3);
                if (userInput<=2){
                    if (userInput == computerInput) {
                        System.out.println("Draw");
                    }
                    else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                            || userInput == 2 && computerInput == 1) {
                        System.out.println("You Win!");
                    } else {
                        System.out.println("Computer Win!");
                    }
                    // System.out.println("Computer choice: " + computerInput);
                    if(computerInput==0){
                        System.out.println("Computer choice: Rock");
                    }
                    else if(computerInput==1){
                        System.out.println("Computer choice: Paper");
                    }
                    else if(computerInput==2){
                        System.out.println("Computer choice: Scissors");
                    }
                }
                else {
                    System.out.println("Please select between 0 to 2");
                }


    }
}
