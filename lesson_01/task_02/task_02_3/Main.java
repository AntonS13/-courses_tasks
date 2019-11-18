package lesson_01.task_02.task_02_3;

/*
Напишите программу, которая бы определяла, является ли введённая буква (символ) гласной
(постарайтесь сделать минимум четырьмя способами, разрешается и больше).
 */

public class Main {
    public static void main(String[] args) {
        isVowel('ф');
    }

    public static char[] vowels = {'а', 'о', 'э', 'и', 'у', 'ы', 'е', 'ё', 'ю', 'я'};

    public static boolean isVowel(char c) {
        for (char vowel : vowels) {
            if (c == vowel) {
                System.out.println("This is vowel");
                return true;
            }
        }
        System.out.println("This is not vowel");
        return false;
    }
}
