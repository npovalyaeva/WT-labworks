package by.bsuir.povalyaeva.task6.runner;

import by.bsuir.povalyaeva.DataScanner;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Double> userNumbersList = new ArrayList<Double>();
        System.out.println("Enter all your numbers and then write \"end\": ");
        while (!DataScanner.isEnd())
            userNumbersList.add(DataScanner.enterDoubleNumber());
    }
}
