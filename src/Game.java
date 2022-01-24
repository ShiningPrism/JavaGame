import java.util.Random;
import java.util.Scanner;

public class Game {
    /*
    Lvl
     */
    String easyStr = "/easy";
    String mediumStr = "/medium";
    String hardStr = "/hard";

    /*
    Mode
     */
    String sumStr = "/summation";
    String subStr = "/subtract";
    String mulStr = "/multiply";

    /*
    Commands
     */
    String menu = "/menu";
    String help = "/help";
    String settings = "/settings";

    /*
    Colors
     */
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_RESET = "\u001B[0m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_YELLOW = "\u001B[33m";

    /*
    Information about player
     */
    int points1;
    int points2;
    int points3;

    int right;
    int wrong;

    void eSumClass() {

        int mediumInt = 9;
        int hardInt = 9;
        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 11;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt + secondInt;

            System.out.println(firstInt + " + " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +2" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points1 = points1 + 2;
                    if (points1 >= 15) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points1 >= 35) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points1 = points1 - 1;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-1 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points1 >= 15) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points1 >= 35) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(sumStr)) {
                    youAreOnSummationMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    youAreOnEasyMode();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    if (points1 >= 15) {
                        switchToMediumMode();
                        newEquation();
                        mSumClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (15 - points1) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points1 >= 35) {
                        switchToHardMode();
                        newEquation();
                        hSumClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (35 - points1) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    if (points1 >= 70) {
                        switchToSubMode();
                        newEquation();
                        eSubClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (70 - points1) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points (2-nd tier) to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else {
                    newEquation();
                }
            }
        }
    }
    void mSumClass() {

        int hardInt = 9;
        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 26;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt + secondInt;

            System.out.println(firstInt + " + " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +4" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points1 = points1 + 4;
                    if (points1 >= 35) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points1 = points1 - 2;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-2 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points1 >= 35) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(sumStr)) {
                    youAreOnSummationMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eSumClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    youAreOnMediumMode();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points1 >= 35) {
                        switchToHardMode();
                        newEquation();
                        hSumClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (35 - points1) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    if (points1 >= 70) {
                        switchToSubMode();
                        newEquation();
                        eSubClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (70 - points1) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points (2-nd tier) to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else {
                    newEquation();
                }
            }
        }
    }
    void hSumClass() {

        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 41;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt + secondInt;

            System.out.println(firstInt + " + " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +6" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points1 = points1 + 6;
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points1 = points1 - 3;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-3 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points1 >= 70) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToSubtractMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(sumStr)) {
                    youAreOnSummationMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eSumClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    switchToMediumMode();
                    newEquation();
                    mSumClass();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    youAreOnHardMode();
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    if (points1 >= 70) {
                        /*
                        Message and Teleport to Subtract Easy Mode
                         */
                        switchToSubMode();
                        newEquation();
                        eSubClass();
                    } else {
                        /*
                        Message that you have not 50-points to Teleport Subtract Easy Mode
                         */
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (70 - points1) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points (2-nd tier) to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    /*
                    Teleport to Menu
                     */
                    menu();
                } else {
                    newEquation();
                }
            }
        }
    }

    void eSubClass() {

        int mediumInt = 9;
        int hardInt = 9;
        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 16;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt - secondInt;

            System.out.println(firstInt + " - " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +3" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points2 = points2 + 3;
                    if (points2 >= 20) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points2 >= 45) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points2 = points2 - 4;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-4 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points2 >= 20) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points2 >= 45) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(subStr)) {
                    youAreOnSubtractMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    youAreOnEasyMode();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    if (points2 >= 20) {
                        switchToMediumMode();
                        newEquation();
                        mSubClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (20 - points2) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points2 >= 45) {
                        switchToHardMode();
                        newEquation();
                        hSubClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (45 - points2) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else {
                    newEquation();
                }
            }
        }
    }
    void mSubClass() {

        int hardInt = 9;
        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 21;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt - secondInt;

            System.out.println(firstInt + " - " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +4" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points2 = points2 + 4;
                    if (points2 >= 45) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points2 = points2 - 5;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-5 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points2 >= 45) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(subStr)) {
                    youAreOnSubtractMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eSubClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    youAreOnMediumMode();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points2 >= 45) {
                        switchToHardMode();
                        newEquation();
                        hSubClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (45 - points2) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else {
                    newEquation();
                }
            }
        }
    }
    void hSubClass() {

        int newLvlInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 41;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt - secondInt;

            System.out.println(firstInt + " - " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +6" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points2 = points2 + 6;
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points2 = points2 - 7;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-7 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points2 >= 100) {
                        while (newLvlInt < 10) {
                            newLvlInt++;
                            accessToMultiply();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(subStr)) {
                    youAreOnSubtractMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eSubClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    switchToMediumMode();
                    newEquation();
                    mSubClass();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    youAreOnHardMode();
                } else if (scannedStr.equalsIgnoreCase(mulStr)) {
                    if (points2 >= 100) {
                        switchToMulMode();
                        newEquation();
                        eMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (100 - points2) + " points to switch Mode." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else {
                    newEquation();
                }
            }
        }
    }

    void eMulClass() {

        int mediumInt = 9;
        int hardInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 5;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt * secondInt;

            System.out.println(firstInt + " * " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +10" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points3 = points3 + 10;
                    if (points3 >= 110) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points3 >= 350) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points3 = points3 - 8;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-8 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points3 >= 110) {
                        while (mediumInt < 10) {
                            mediumInt++;
                            accessToMediumMode();
                        }
                    }
                    if (points3 >= 350) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(mulStr)) {
                    youAreOnMultiplyMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    youAreOnEasyMode();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    if (points3 >= 110) {
                        switchToMediumMode();
                        newEquation();
                        mMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (110 - points3) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points3 >= 340) {
                        switchToHardMode();
                        newEquation();
                        hMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (350 - points3) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    switchToSubMode();
                    newEquation();
                    eSubClass();
                } else {
                    newEquation();
                }
            }
        }
    }
    void mMulClass() {

        int hardInt = 9;

        while (true) {
            Random rand = new Random();

            int value = 7;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt * secondInt;

            System.out.println(firstInt + " * " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +15" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points3 = points3 + 15;
                    if (points3 >= 350) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points3 = points3 - 12;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-12 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    if (points3 >= 350) {
                        while (hardInt < 10) {
                            hardInt++;
                            accessToHardMode();
                        }
                    }
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(mulStr)) {
                    youAreOnMultiplyMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eMulClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    youAreOnMediumMode();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    if (points3 >= 340) {
                        switchToHardMode();
                        newEquation();
                        hMulClass();
                    } else {
                        morePoints();
                        System.out.println(ANSI_CYAN + "You need: " + ANSI_GREEN + (350 - points3) + " points to switch level." + ANSI_RESET);
                        newEquation();
                    }
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    switchToSubMode();
                    newEquation();
                    eSubClass();
                } else {
                    newEquation();
                }
            }
        }
    }
    void hMulClass() {
        while (true) {
            Random rand = new Random();

            int value = 11;
            int firstInt = rand.nextInt(value);
            int secondInt = rand.nextInt(value);

            int answer = firstInt * secondInt;

            System.out.println(firstInt + " * " + secondInt + " = ");
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                int scannedInt = scan.nextInt();
                if (scannedInt == answer) {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "All right!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You get" + ANSI_GREEN + " +20" + ANSI_CYAN + " points!" + ANSI_RESET);
                    points3 = points3 + 20;
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    right++;
                } else {
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    System.out.println(ANSI_RED + "Not correct :(" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Correct answer: " + ANSI_GREEN + answer + ANSI_RESET);
                    points3 = points3 - 15;
                    System.out.println(ANSI_CYAN + "You lost " + ANSI_RED + "-15 " + ANSI_CYAN + "point!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "---------------" + ANSI_RESET);
                    wrong++;
                }
            } else if (scan.hasNextLine()) {
                String scannedStr = scan.nextLine();
                if (scannedStr.equalsIgnoreCase(mulStr)) {
                    youAreOnMultiplyMode();
                } else if (scannedStr.equalsIgnoreCase(easyStr)) {
                    switchToEasyMode();
                    newEquation();
                    eMulClass();
                } else if (scannedStr.equalsIgnoreCase(mediumStr)) {
                    switchToMediumMode();
                    newEquation();
                    mMulClass();
                } else if (scannedStr.equalsIgnoreCase(hardStr)) {
                    youAreOnHardMode();
                } else if (scannedStr.equalsIgnoreCase(menu)) {
                    menu();
                } else if (scannedStr.equalsIgnoreCase(sumStr)) {
                    switchToSumMode();
                    newEquation();
                    eSumClass();
                } else if (scannedStr.equalsIgnoreCase(subStr)) {
                    switchToSubMode();
                    newEquation();
                    eSubClass();
                }
            }
        }
    }

    void menu() {
        pageMain1();
        while (true) {
            System.out.print("> ");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                System.out.println(ANSI_CYAN + "Sorry, but you entered numbers. Enter the page number." + ANSI_RESET);
                System.out.println(ANSI_CYAN + "Try this commands '/page 1' or '/page 2'.");
            } else if (scan.hasNextLine()) {
                String page = scan.nextLine();
                if (page.equalsIgnoreCase("/page 1")) {
                    pageMain1();
                } else if (page.equalsIgnoreCase("/page 2")) {
                    pageAC2();
                } else if (page.equalsIgnoreCase("/page 3")) {
                    pageAC3();
                } else if (page.equalsIgnoreCase("/back")) {
                    newEquation();
                    eSumClass();
                } else {
                    System.out.println(ANSI_CYAN + "Something went wrong... Try this commands '/page 1' or '/back'." + ANSI_RESET);
                }
            }
        }
    }

    void pageMain1() {
        System.out.println();
        System.out.println(ANSI_PURPLE + "-----===| [Menu] |===-----" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "         • Ranks •" + ANSI_RESET);
        System.out.print(ANSI_CYAN + "V.I.P. rank" + ANSI_PURPLE + " | " + ANSI_RESET);
        if (points3 >= 500) {
            System.out.print(ANSI_GREEN + "[Owned]" + ANSI_RESET);
        } else {
            System.out.print(ANSI_RED + "[Not owned yet]" + ANSI_RESET + ANSI_PURPLE + " | " + ANSI_CYAN + (500-points3) + " points 3-rd tier;");
        }
        System.out.println();
        System.out.print(ANSI_RED + "Admin" + ANSI_PURPLE + " | " + ANSI_RESET);
        if (right >= 150) {
            System.out.print(ANSI_GREEN + "[Owned]" + ANSI_RESET);
        } else {
            System.out.print(ANSI_RED + "[Not owned yet]" + ANSI_RESET + ANSI_PURPLE + " | " + ANSI_CYAN + (150-right) + " correct answers;");
        }
        System.out.println();
        System.out.println();
        System.out.println(ANSI_YELLOW + "        • Points •" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Points 1 tier: " + ANSI_GREEN + points1 + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Points 2 tier: " + ANSI_GREEN + points2 + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Points 3 tier: " + ANSI_GREEN + points3 + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_YELLOW + "      • Statistics •" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Correct decisions: " + ANSI_GREEN + right + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Wrong decisions: " + ANSI_RED + wrong + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_PURPLE + "-----===|" + ANSI_YELLOW + " /page 2 -> " + ANSI_PURPLE + "|===-----" + ANSI_RESET);
        System.out.println();
    }
    void pageAC2() {
        System.out.println();
        System.out.println(ANSI_PURPLE + "-----===| [Achievements] |===-----" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "        • Summation Mode •" + ANSI_RESET);
        acN1points1();
        acN2points2();
        acN3points3();
        System.out.println(ANSI_PURPLE + "-----===|" + ANSI_YELLOW + " <- /page 1 | /page 2 -> " + ANSI_PURPLE + "|===-----" + ANSI_RESET);
        System.out.println();
    }
    void pageAC3() {
        System.out.println();
        System.out.println(ANSI_PURPLE + "-----===| [Achievements] |===-----" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "        • Summation Mode •" + ANSI_RESET);
        acN4right();
        acN5wrong();
        acN6wrnAndRgh();
        System.out.println(ANSI_PURPLE + "-----===|" + ANSI_YELLOW + " <- /page 2 " + ANSI_PURPLE + "|===-----" + ANSI_RESET);
        System.out.println();
    }

    void acN1points1 () {
        int a = points1;
        float b;
        a = Math.round(a);
        b = (int) a;
        if (points1 <= 10) {
            System.out.print(ANSI_RED + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "The king of summation I: " + points1 + "/10 points 1-rs tier." + ANSI_RESET);
            System.out.println();
            if (points1 == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (points1 >= 11) {
            if (points1 <= 50) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "The king of summation II: " + points1 + "/50 points 1-rs tier." + ANSI_RESET);
                System.out.println();
                if (b / 50 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points1 >= 51) {
            if (points1 <= 200) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "The king of summation III: " + points1 + "/200 points 1-rs tier." + ANSI_RESET);
                System.out.println();
                if (b / 200 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points1 >= 201) {
            System.out.print(ANSI_GREEN + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "The king of summation IV!" + ANSI_PURPLE + " | " + ANSI_YELLOW + points1 + ANSI_CYAN + " points 1-rs tier!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }

        System.out.println();
    }
    void acN2points2 () {
        int a = points2;
        float b;
        a = Math.round(a);
        b = (int) a;
        if (points2 <= 10) {
            System.out.print(ANSI_RED + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of Subtraction I: " + points2 + "/10 points 2-nd tier." + ANSI_RESET);
            System.out.println();
            if (points2 == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (points2 >= 11) {
            if (points2 <= 50) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of Subtraction II: " + points2 + "/50 points 2-rs tier." + ANSI_RESET);
                System.out.println();
                if (b / 50 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points2 >= 51) {
            if (points2 <= 200) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of Subtraction III: " + points2 + "/200 points 2-nd tier." + ANSI_RESET);
                System.out.println();
                if (b / 200 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points2 >= 201) {
            System.out.print(ANSI_GREEN + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of Subtraction IV!" + ANSI_PURPLE + " | " + ANSI_YELLOW + points2 + ANSI_CYAN + " points 2-nd tier!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }

        System.out.println();
    }
    void acN3points3 () {
        int a = points3;
        float b;
        a = Math.round(a);
        b = (int) a;
        if (points3 <= 10) {
            System.out.print(ANSI_RED + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "I can do better! I: " + points3 + "/10 points 3-rd tier." + ANSI_RESET);
            System.out.println();
            if (points3 == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 10 * 100) + "%" + ANSI_RESET);
            } else if (b / 10 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (points3 >= 11) {
            if (points3 <= 50) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "I can do better! II: " + points3 + "/50 points 3-rd tier." + ANSI_RESET);
                System.out.println();
                if (b / 50 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 50 * 100) + "%" + ANSI_RESET);
                } else if (b / 50 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "•••••••••••••••••••• " + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points3 >= 51) {
            if (points3 <= 200) {
                System.out.print(ANSI_YELLOW + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "I can do better! III: " + points3 + "/200 points 3-rd tier." + ANSI_RESET);
                System.out.println();
                if (b / 200 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (b / 200 * 100) + "%" + ANSI_RESET);
                } else if (b / 200 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (points3 >= 201) {
            System.out.print(ANSI_GREEN + "\uD83D\uDC51" + ANSI_PURPLE + " | " + ANSI_CYAN + "I can do better IV!" + ANSI_PURPLE + " | " + ANSI_YELLOW + points2 + ANSI_CYAN + " points 3-rd tier!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }

        System.out.println();
    }

    void acN4right () {
        int x = right;
        float y;
        x = Math.round(x);
        y = (int) x;
        if (right <= 10) {
            System.out.print(ANSI_RED + "✔" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of the right answers I: " + right + "/10 right answers." + ANSI_RESET);
            System.out.println();
            if (right == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (y / 10 * 100) + "%" + ANSI_RESET);
            } else if (y / 10 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (right >= 11) {
            if (right <= 50) {
                System.out.print(ANSI_YELLOW + "✔" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of the right answers II: " + right + "/50 right answers." + ANSI_RESET);
                System.out.println();
                if (y / 50 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (y / 50 * 100) + "%" + ANSI_RESET);
                } else if (y / 50 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (right >= 51) {
            if (right <= 200) {
                System.out.print(ANSI_YELLOW + "✔" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of the right answers III: " + right + "/200 right answers." + ANSI_RESET);
                System.out.println();
                if (y / 200 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "••••••••••••••••••" + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (y / 200 * 100) + "%" + ANSI_RESET);
                } else if (y / 200 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (right >= 201) {
            System.out.print(ANSI_GREEN + "✔" + ANSI_PURPLE + " | " + ANSI_CYAN + "Lord of the right answers IV!" + ANSI_PURPLE + " | " + ANSI_GREEN + right + ANSI_CYAN + " right answers!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }

        System.out.println();
    }
    void acN5wrong () {
        int c = wrong;
        float d;
        c = Math.round(c);
        d = (int) c;
        if (wrong <= 10) {
            System.out.print(ANSI_RED + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "Do you even know how to count? I: " + wrong + "/10 wrong answers" + ANSI_RESET);
            System.out.println();
            if (wrong == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 10 * 100) + "%" + ANSI_RESET);
            } else if (d / 10 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (wrong >= 11) {
            if (wrong <= 50) {
                System.out.print(ANSI_YELLOW + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "Do you even know how to count? II: " + wrong + "/50 wrongs answers." + ANSI_RESET);
                System.out.println();
                if (d / 50 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 50 * 100) + "%" + ANSI_RESET);
                } else if (d / 50 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (wrong >= 51) {
            if (wrong <= 200) {
                System.out.print(ANSI_YELLOW + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "Do you even know how to count? III: " + wrong + "/200 wrong answers." + ANSI_RESET);
                System.out.println();
                if (d / 200 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "••••••••••••••••••" + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "••••••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 200 * 100) + "%" + ANSI_RESET);
                } else if (d / 200 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (wrong >= 201) {
            System.out.print(ANSI_GREEN + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "Do you even know how to count...? IV!" + ANSI_PURPLE + " | " + ANSI_RED + wrong + ANSI_CYAN + " wrong answers!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }
        System.out.println();
    }
    void acN6wrnAndRgh () {
        int c = wrong + right;
        float d;
        c = Math.round(c);
        d = (int) c;
        if (wrong+right <= 25) {
            System.out.print(ANSI_RED + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "The Choice Is Yours I: " + (wrong+right) + "/25 answers" + ANSI_RESET);
            System.out.println();
            if (wrong+right == 0) {
                System.out.println("Progress: " + ANSI_RED + "•••••••••••••••••••• " + ANSI_RED + "0%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 10) {
                System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 20) {
                System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 30) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 40) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 50) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 60) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 70) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 80) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 <= 90) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 25 * 100) + "%" + ANSI_RESET);
            } else if (d / 25 * 100 >= 100) {
                System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
            }
        }

        if (wrong+right >= 26) {
            if (wrong+right <= 100) {
                System.out.print(ANSI_YELLOW + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "The Choice Is Yours II: " + (wrong+right) + "/100 answers." + ANSI_RESET);
                System.out.println();
                if (d / 100 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "•••••••••••••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "•••••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 100 * 100) + "%" + ANSI_RESET);
                } else if (d / 100 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (wrong+right >= 101) {
            if (wrong+right <= 300) {
                System.out.print(ANSI_YELLOW + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "The Choice Is Yours III: " + (wrong+right) + "/300 answers." + ANSI_RESET);
                System.out.println();
                if (d / 300 * 100 <= 10) {
                    System.out.println("Progress: " + ANSI_GREEN + "••" + ANSI_RED + "••••••••••••••••••" + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 20) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••" + ANSI_RED + "•••••••••••••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 30) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••" + ANSI_RED + "•••••••••••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 40) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••" + ANSI_RED + "•••••••••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 50) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••" + ANSI_RED + "••••••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 60) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••" + ANSI_RED + "•••••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 70) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••" + ANSI_RED + "•••••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 80) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••" + ANSI_RED + "•••• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 <= 90) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••" + ANSI_RED + "•• " + ANSI_YELLOW + (d / 300 * 100) + "%" + ANSI_RESET);
                } else if (d / 300 * 100 >= 100) {
                    System.out.println("Progress: " + ANSI_GREEN + "••••••••••••••••••••" + ANSI_GREEN + "100%" + ANSI_RESET);
                }
            }
        }

        if (wrong+right >= 301) {
            System.out.print(ANSI_GREEN + "✘" + ANSI_PURPLE + " | " + ANSI_CYAN + "The Choice Is Yours IV!" + ANSI_PURPLE + " | " + ANSI_RED + (wrong+right) + ANSI_CYAN + " answers!" + ANSI_RESET);
            System.out.println();
            System.out.println("Progress: " + ANSI_PURPLE + "•••••••••••••••••••• " + ANSI_GREEN + "Completed!" + ANSI_RESET);
        }
        System.out.println();
    }

    /*
    Template messages \/
     */

    void youAreOnEasyMode () {
        System.out.println(ANSI_RED + "You are on Easy level now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void youAreOnMediumMode () {
        System.out.println(ANSI_RED + "You are on Medium level now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void youAreOnHardMode () {
        System.out.println(ANSI_RED + "You are on Hard level now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void youAreOnSummationMode () {
        System.out.println(ANSI_RED + "You are on Summation mode now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void youAreOnSubtractMode () {
        System.out.println(ANSI_RED + "You are on Subtract mode now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void youAreOnMultiplyMode () {
        System.out.println(ANSI_RED + "You are on Multiply mode now!" + ANSI_RESET);
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
    void accessToMediumMode () {
        System.out.println(ANSI_CYAN + "You have access to Medium level! Enter '/medium'." + ANSI_RESET);
    }
    void accessToHardMode () {
        System.out.println(ANSI_CYAN + "You have access to Hard level! Enter '/hard'." + ANSI_RESET);
    }
    void accessToSubtractMode () {
        System.out.println(ANSI_CYAN + "You have access to Medium level! Enter '/subtract'." + ANSI_RESET);
    }
    void accessToMultiply () {
        System.out.println(ANSI_CYAN + "You have access to Medium level! Enter '/multiply'." + ANSI_RESET);
    }
    void switchToEasyMode () {
        System.out.println(ANSI_GREEN + "You switched to Easy level!" + ANSI_RESET);
    }
    void switchToMediumMode () {
        System.out.println(ANSI_GREEN + "You switched to Medium level!" + ANSI_RESET);
    }
    void switchToHardMode () {
        System.out.println(ANSI_GREEN + "You switched to Hard level!" + ANSI_RESET);
    }
    void switchToSumMode () {
        System.out.println(ANSI_GREEN + "You switched to Summation Mode!" + ANSI_RESET);
    }
    void switchToMulMode () {
        System.out.println(ANSI_GREEN + "You switched to Multiply Mode!" + ANSI_RESET);
    }
    void switchToSubMode () {
        System.out.println(ANSI_GREEN + "You switched to Subtract Mode!" + ANSI_RESET);
    }
    void morePoints () {
        System.out.println(ANSI_RED + "You need some more points!" + ANSI_RESET);
    }
    void newEquation () {
        System.out.println(ANSI_RED + "New equation:" + ANSI_RESET);
    }
}