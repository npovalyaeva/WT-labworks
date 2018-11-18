package by.bsuir.povalyaeva.task3.util;

public class Util {

    public static void PrintTable(float a, float b, float h) {
        while (a <= b) {
            System.out.print(a + "    " + Math.tan(a) + "\n");
            a += h;
        }

    }
}
