package lesson_02.task_01;

import java.util.Random;
import java.util.Scanner;

public class Coin {

    public static int countOfHeads = 0;
    public static int countOfTails = 0;
    int numberOfTimes;

    // выбираем количество бросков
    public void chooseCountOfFlips() {
        do {
            System.out.println("Input a positive number");
            Scanner sc = new Scanner(System.in);
            numberOfTimes = sc.nextInt();
            sc.close();
        } while (numberOfTimes < 0);
    }

    // осуществление броска монеты
    public void flipCoin() {
        Random random = new Random();
        for (int i = 0; i < numberOfTimes; i++) {
            int sideOfCoin = random.nextInt(10) + 1;
            if (sideOfCoin >=1 && sideOfCoin <=5){
                countOfHeads = countOfHeads + 1;
            }
            if (sideOfCoin >=6 && sideOfCoin <=10){
                countOfTails = countOfTails +1;
            }
        }
    }

    // выводим количество выпадений монет
    public void printCount() {
        System.out.println("Heads: " + countOfHeads + "; tails: " + countOfTails);
    }
}