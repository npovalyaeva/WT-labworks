package by.bsuir.povalyaeva.task6.util;

import by.bsuir.povalyaeva.DataScanner;

public class Util {

    public static String getSquareMatrix(double[] numbers) {
        int length = numbers.length;
        double[][] matrix = new double[length][length];

        // Предположим, что нужно получить массив 0 1 2 3 4
        //                                        1 2 3 4 0
        //                                        2 3 4 0 1
        //                                        3 4 0 1 2
        //                                        4 0 1 2 3

        // Первый этап: найдем следующую часть массива: 0 1 2 3 4
        //                                              1 2 3 4 -
        //                                              2 3 4 - -
        //                                              3 4 - - -
        //                                              4 - - - -

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < length - i)
                    matrix[i][j] = numbers[j + i];
                else
                    matrix[i][j] = numbers[j + i - length];
            }
        }

        // Второй этап: найдем вторую часть массива: - - - - -
        //                                           - - - - 0
        //                                           - - - 0 1
        //                                           - - 0 1 2
        //                                           - 0 1 2 3

        /*for (int i = (length - 1); i > 0; i--) {
            for (int j = (length - 1); j > 0; j--) {
                if (j >= length - i) {
                    matrix[i][j] = numbers[j + i - length];
                }
            }
        }*/

        String result = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                result += DataScanner.transformDoubleToUserFormat(matrix[i][j], "#.##") + " ";
            result += "\n";
        }
        return result;
    }
}
