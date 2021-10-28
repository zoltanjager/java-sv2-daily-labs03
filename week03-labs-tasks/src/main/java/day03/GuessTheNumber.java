package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int numberOfAttempts = 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess my number!");

        for (int i = 0; i < 6; i++) {
            System.out.println( i + 1 + ".attempt: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber == randomNumber){
                System.out.println("You win!");
                i=7;
            } else if (inputNumber > randomNumber) {
                System.out.println("My number is lesser!");
                numberOfAttempts--;
            } else if (inputNumber < randomNumber){
                System.out.println("My number is greater!");
                numberOfAttempts--;
            }
        }

        if (numberOfAttempts == 0) {
            System.out.println("You lost!");
            System.out.println("My number was: " + randomNumber);
        }


    }
}
