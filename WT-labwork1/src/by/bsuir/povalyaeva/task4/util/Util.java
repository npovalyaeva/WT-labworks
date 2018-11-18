package by.bsuir.povalyaeva.task4.util;
import java.util.List;
import java.util.ArrayList;

/*Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
Если да, то вывести номера этих элементов.*/

public class Util {
    public static Integer[] FindPrimeNumbers(int[] numbers) {
        List<Integer> positionsList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (PrimeNumber.isPrimeNumber(numbers[i]))
                positionsList.add(i);
        }
        return positionsList.toArray(new Integer[positionsList.size()]);
    }
}
