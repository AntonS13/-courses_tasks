package lesson_02.task_02;

import java.util.Random;
import java.util.Scanner;

public class MagicNumbers {

    // найти наибольшую цифру натурального числа;
    public void isLargestNaturalNumber() {
        int minimumNumber = 10;
        int maximumNumber = 99;
        Random r = new Random();
        int randomNumber = minimumNumber + r.nextInt(maximumNumber - minimumNumber);
        int maximumValue = 0;
        int digit;

        System.out.println(randomNumber);

        do {
            digit = randomNumber%10;
            if ( digit > maximumValue ) maximumValue=digit;

            randomNumber = randomNumber/10;

        } while (randomNumber > 0);
        System.out.println(maximumValue);
    }


    // проверить, является ли заданное натуральное число палиндромом;
    public void isPalindrome() {
        String inputString, reversedString = "";
        int stringLength;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        inputString = sc.nextLine();
        sc.close();
        stringLength = inputString.length();

        for (int x = stringLength -1; x>=0; x--) {
            reversedString = reversedString + inputString.charAt(x);
        }

        if(inputString.equals(reversedString)) {
            System.out.println("The entered value is a palindrome");
        } else {
            System.out.println("The entered value is not a palindrome");
        }
    }

    // определить является ли заданное натуральное число простым;
    public void isPrime() {
        int temp, number;
        boolean numberIsPrime = true;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        for (int x = 2; x<= number /2; x++) {
            int tempNumber = number %x;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }

        if(numberIsPrime) {
            System.out.println(number + " is a prime");
        } else {
            System.out.println(number + " is not a prime");
        }
    }


    // найти все простые делители заданного натурального числа;
    public void isPrimeDiv() {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            if ((number % i) == 0){
                System.out.print(i + " ");
            }
        }
    }

    // найти НОД и НОК двух натуральных чисел a и b;
    public int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }

    public int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    // найти количество различных цифр у заданного натурального числа;
    public void ddd() {
        int differentNumberCount = 0;
        int[] numberCount = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        while (n!=0) {
            numberCount[(int)(n%10)]++;
            n/=10;
        }
        for (int i = 0; i < 10; i++) {
            if (numberCount[i] > 0) differentNumberCount++;
        }
        System.out.println(differentNumberCount);
    }
}
