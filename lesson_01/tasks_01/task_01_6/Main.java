package lesson_01.tasks_01.task_01_6;

/*
Написать программу, которая переворачивает (реверсирует) семизначное число N
(к примеру, число 1234567 реверсируется в число 7654321)
 */

public class Main {
    public static void main(String[] args) {
        print(1234567);
    }

    public static int inverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    public static void print(int value) {
        System.out.println("value = " + value + "; inversion value= " + inverse(value));
    }
}
