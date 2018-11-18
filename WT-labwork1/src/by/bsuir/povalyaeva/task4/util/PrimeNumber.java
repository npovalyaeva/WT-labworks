package by.bsuir.povalyaeva.task4.util;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {
        if (number % 2 == 0) return false;
        for(int i = 3; Math.pow(i, 2) <= number; i += 2) {
            if (number %i==0) return false;
        }
        return true;
    }
}