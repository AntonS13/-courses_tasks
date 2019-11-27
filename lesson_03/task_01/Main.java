package lesson_03.task_01;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
//        myArray.fillRandomValues(myArray.createArray());
        myArray.minElementOfArray(myArray.fillRandomValues(myArray.createArray()));
    }
}
