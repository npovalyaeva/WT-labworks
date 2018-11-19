package by.bsuir.povalyaeva.task4.util;
import java.util.List;
import java.util.ArrayList;

/*Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
Если да, то вывести номера этих элементов.*/

public class Util {
    public static String FindPrimeNumbers(int[] numbers) {
        List<String> positionsList = new ArrayList<String>();

        for (int i = 0; i < numbers.length; i++) {
            if (PrimeNumber.isPrimeNumber(numbers[i]))
                positionsList.add(String.valueOf(i));
        }
        //return positionsList.toArray(new Integer[positionsList.size()]);
        return String.join(" ", positionsList);
    }
}
