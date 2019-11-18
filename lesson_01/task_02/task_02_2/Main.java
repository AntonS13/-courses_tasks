package lesson_01.task_02.task_02_2;

import java.util.Scanner;

/*
В молодом возрасте дракон каждый год отращивает по три головы, но после того,
как ему исполнится 200 лет – только по две, а после 300 лет – лишь по одной.
Предполагается, что дракон появляется на свет сразу с тремя головами.
Разработайте программу, которая высчитывала бы, сколько голов и глаз у дракона, которому N лет?
 */

public class Main {
    public static void main(String[] args) {
        dragonGen();
    }

    public static void dragonGen() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input count of dragons age: ");
        int countOfHeads = 3;
        int age = sc.nextInt();
        if(age <= 200) {
            countOfHeads = countOfHeads + age * 3;
        } else if(age <= 300) {
            countOfHeads = countOfHeads + 200 * 3 + (age-200) * 2;
        } else if(age > 300) {
            countOfHeads = countOfHeads + 200 * 3 + 100 * 2 + (age - 300) * 1;
        }
        System.out.println("The dragon have " + countOfHeads + " heads");
    }
}
