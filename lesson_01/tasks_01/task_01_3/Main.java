package lesson_01.tasks_01.task_01_3;

import java.util.Scanner;

/*
На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
Разработайте программу нахождения площади кольца, внешний радиус которого равен R1,
а внутренний радиус равен R2.
 */

public class Main {
    public static void main(String[] args) {
        squareCircle();
    }

    public static void squareCircle() {
        Scanner sc = new Scanner(System.in);
        double radiusR1;
        double radiusR2;
        do {
            System.out.println("Input squareCircle R1 (R1 > R2)");
            radiusR1 = sc.nextDouble();
            System.out.println("Input squareCircle R2");
            radiusR2 = sc.nextDouble();
        } while (radiusR1 < radiusR2);
        double squareR1 = Math.PI * Math.sqrt(radiusR1);
        double squareR2 = Math.PI * Math.sqrt(radiusR2);
        double squareR3 = squareR1 - squareR2;
        System.out.println(squareR3);
        sc.close();
    }

}
