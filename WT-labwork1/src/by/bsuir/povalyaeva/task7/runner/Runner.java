package by.bsuir.povalyaeva.task7.runner;

import by.bsuir.povalyaeva.task7.util.Util;

public class Runner {
    public static void main(String[] args) {
        double[] unsortedArray = new double[]{4, 7, 1.9, 4, 1.5, 7.23, 0.5, 1, 4, 9, 1.56};
        double[] sortedArray = Util.sortByShell(unsortedArray);
        for (double i: sortedArray)
            System.out.print(i + " ");
    }
}
