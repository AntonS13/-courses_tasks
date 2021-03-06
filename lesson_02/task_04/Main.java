package lesson_02.task_04;

/*
Дру́жественные чи́сла — два различных натуральных числа, для которых сумма всех собственных делителей первого
числа равна второму числу и наоборот, сумма всех собственных делителей второго числа равна первому числу.
Дружественные числа были открыты последователями Пифагора, которые, однако,
знали только одну пару дружественных чисел – 220 и 284. Найдите все дружественные числа в заданном диапазоне.
 */

public class Main {
    public static void main(String args[]) {
        for(int i=2; i<=10000; i++) {
            for(int j=i+1; j<=10000; j++) {
                if(facSum(i)==j&&facSum(j)==i) {
                    System.out.println(i+" and "+j+" are Amicable!");
                }
            }
        }
    }
    public static int facSum(int a) {
        int c=0;
        for(int s=1; s<=a/2; s++) {
            if(a%s==0) {
                c+=s;
            }
        }
        return c;
    }
}
