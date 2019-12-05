package class_work;

import lesson_03.task_01.MyArray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] myMas = createArray(20);
        fillInArray(myMas);
        printArray(myMas);
        isMaxElement(myMas);
        isSumBetweenNulls(myMas);
    }

    // create array
    public static int[] createArray(int countOfElements) {
        return new int[countOfElements];
    }

    // fill in array
    public static void fillInArray(int[] myArray) {
        Random r = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = r.nextInt(11);
        }
    }

    // print array
    public static void printArray(int[] myArray) {
        System.out.print("My array: ");
        for (int myArrayElement:
             myArray) {
            System.out.print(myArrayElement + " ");
        }
    }

    // find maxElement in array
    public static void isMaxElement(int[] myArray) {
        int maxElement = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (maxElement < myArray[i]) {
                maxElement = myArray[i];
            }
        }
        System.out.println("The maximal element of the array is " + maxElement);
    }

    // find the sum of numbers between the first null and the second null
    public static void isSumBetweenNulls(int[] myArray) {
        // find index of two nulls
        int countOfNulls = 0;
        int indexOfFirstNull = 0;
        int indexOfSecondNull = 0;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0 & countOfNulls == 0) {
                indexOfFirstNull = i;
                countOfNulls++;
            } else if (myArray[i] == 0 & countOfNulls == 1) {
                indexOfSecondNull = i;
                countOfNulls++;
            }
        }

        //find sum
        if (countOfNulls == 0) {
            System.out.println("There are no nulls in this array");
        } else if (countOfNulls == 1) {
            System.out.println("There is only one null in this array");
        } else if (countOfNulls == 2){
            for (int i = 0; i < myArray.length; i++) {
                if (i > indexOfFirstNull & i < indexOfSecondNull) {
                    sum += myArray[i];
                }
            }
            System.out.println("The sum of numbers between the first null and the second null is " + sum);
        }
    }
}
