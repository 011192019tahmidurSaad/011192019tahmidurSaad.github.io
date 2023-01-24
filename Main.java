import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNum=0;
        System.out.println("Here we start a mini game :The guessing Number ");
        System.out.println("You can choose a number between 0 to 100");
        System.out.println("If you want to quit the game , just enter: -1");

        do {
            System.out.print("Guess The Number :");
            userNum = sc.nextInt();

            if(userNum>=number+10 && userNum<=100)
                System.out.println("Your number is too high.");
            else if (userNum<number+10 && userNum>number)
                System.out.println("Your number is a little high.");
            else if (userNum==number) {
                System.out.println("Yes,you guess the correct number.");
                break;
            } else if (userNum+10<=number && userNum>=0) {
                System.out.println("Your number is too low");
            } else if (userNum+10>number && number>userNum) {
                System.out.println("Your number is a little low");
            } else if (userNum==-1) {
                System.out.println("Quit the game");
                break;
            }
            else
                System.out.println("You guess the wrong number.");


        }
        while (true);
        System.out.println("Thank You");
    }
}