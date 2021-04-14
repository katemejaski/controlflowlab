package com.tts;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class UserInput {

    public static void getInput() {

        Boolean carColor;
        String petName;
        int petAge;
        int luckyNumber;
        int jerseyNum;
        int carYear;
        String actName;
        int ranNum;

        int powerBallOne;
        int powerBallTwo;
        int powerBallThree;
        int powerBallFour;
        int powerBallFive;
        int magicBallNum;

        Random rand = new Random();
        int upperBound = 4;
        int randomNum = rand.nextInt(upperBound) + 1;


        Scanner nameScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String yourInput = nameScanner.next();

        System.out.println("Hello " + yourInput);

        System.out.println("Do you wish to continue to the interactive portion?");
        yourInput = nameScanner.next();

        if (yourInput.toLowerCase().equals("yes") || yourInput.toLowerCase().equals("y")) {
            do {
                System.out.println("Do you have a red car? (y/n)");
                yourInput = nameScanner.next();

                if (yourInput.toLowerCase().equals("y")) {
                    carColor = true;
                } else {
                    carColor = false;
                }

                System.out.println("What is the name of your favorite pet?");
                petName = nameScanner.next();

                System.out.println("What is the age of your favorite pet?");
                petAge = nameScanner.nextInt();

                System.out.println("What is your lucky number?");
                luckyNumber = nameScanner.nextInt();

                System.out.println("What is your favorite quarterback's jersey number?");
                jerseyNum = nameScanner.nextInt();

                System.out.println("What is the two digit model number of your car?");
                carYear = nameScanner.nextInt();

                System.out.println("What is the first name of your favorite actor or actress?");
                actName = nameScanner.next();

                System.out.println("Enter a random number between 1 and 50.");
                ranNum = nameScanner.nextInt();


                magicBallNum = luckyNumber * randomNum;

                if (magicBallNum > 75) {
                    do {
                        magicBallNum = magicBallNum / 2;
                    } while (magicBallNum > 75);

                    upperBound = 76;
                    magicBallNum = rand.nextInt(upperBound);
                } else if (magicBallNum == 0) {
                    magicBallNum = magicBallNum + 1;
                }

                powerBallOne = 42;

                powerBallTwo = carYear + luckyNumber;
                if (powerBallTwo > 65) {
                    do {
                        powerBallTwo = powerBallTwo / 2;
                    } while (powerBallTwo > 65);
                }
                powerBallThree = petName.charAt(2);
                if (powerBallThree > 65) {
                    do {
                        powerBallThree = powerBallThree / 2;
                    } while (powerBallThree > 65);
                }
                powerBallFour = actName.charAt(0);
                if (powerBallFour > 65) {
                    do {
                        powerBallFour = powerBallFour / 2;
                    } while (powerBallFour > 65);
                }

                powerBallFive = jerseyNum + petAge + carYear;
                if (powerBallFive > 65) {
                    do {
                        powerBallFive = powerBallFive / 2;
                    } while (powerBallFive > 65);
                }

                System.out.println("Lottery numbers: " + powerBallOne + " " + powerBallTwo + " " + powerBallThree + " " + powerBallFour + " " + powerBallFive + " Magic Number: " + magicBallNum);
                System.out.println("\n Would you like to generate another set of numbers? (y/n)");
                yourInput = nameScanner.next();

                if (yourInput.equals("y")) {
                    yourInput = "y";
                } else {
                    yourInput = "n";
                }
            } while (!yourInput.equals("n"));
        } else {
            System.out.println("Please return later to complete the survey!");
        }

    }
}
