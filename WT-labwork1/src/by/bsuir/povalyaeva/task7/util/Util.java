package by.bsuir.povalyaeva.task7.util;

public class Util {
    private Util() {};

    public static double[] sortByShell(double[] array) {
        int increment = array.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(array, startIndex, increment);
            }
            increment = increment / 2;
        }
        return array;
    }

    private static void insertionSort (double[] array, int startIndex, int increment) {
        for (int i = startIndex; i < array.length - 1; i = i + increment)
            for (int j = Math.min(i + increment, array.length - 1); j - increment >= 0; j = j - increment)
                if (array[j - increment] > array[j]) {
                    double tmp = array[j];
                    array[j] = array[j - increment];
                    array[j - increment] = tmp;
                }
                else
                    break;
    }
}
