package lesson_01.task_02.task_02_1;

/*
На прямоугольной декартовой системе координат на плоскости заданы три точки
с соответствующими координатами в виде пары значений (x,y).
Определить, являются ли данные точки вершинами треугольника.
И если да, то дополнительно определить, является ли данный треугольник прямоугольным.
 */

public class Main {
    public static void main(String[] args) {
        checkRec();
    }

    public static void checkRec() {
        int x1, x2, x3, y1, y2, y3;
        double sqab, sqbc, sqac;

        x1 = genNumber();
        x2 = genNumber();
        x3 = genNumber();

        y1 = genNumber();
        y2 = genNumber();
        y3 = genNumber();

        if ( (x1-x3)*(y2-y3) == (x2-x3)*(y1-y3) )  {
            System.out.println("This is not a triangle, all vertices lie on one straight line.");
        } else {
            System.out.println("It's a triangle");
        }

        sqab = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        sqbc = (x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
        sqac = (x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);

        if (sqab==sqac+sqbc || sqac==sqab+sqbc || sqbc==sqab+sqac) {
            System.out.println("The triangle is rectangular");
        } else {
            System.out.println("The triangle is not rectangular");
        }
    }

    public static int genNumber() {
        int x = 1 + (int) (Math.random() * 5);
        return x;
    }
}
