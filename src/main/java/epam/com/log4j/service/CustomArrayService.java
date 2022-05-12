package epam.com.log4j.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArrayService {
    static Logger logger = LogManager.getLogger(CustomArrayService.class);

    public int findMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public int findMinValue(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }


    public int findSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int findAvg(int[] arr) {
        int sum = findSum(arr);
        int avg = sum / arr.length;
        return avg;
    }

    public  void separatePositiveAndNegative(int[] numbers) {

        // variables
        int posCount = 0;
        int negCount = 0;
        int positive[] = null;
        int negative[] = null;

        for (int i : numbers) {
            if (i >= 0)
                ++posCount;
            else
                ++negCount;
        }


        // create positive and negative array
        positive = new int[posCount];
        negative = new int[negCount];

        // check element and insert
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num >= 0) {
                positive[i++] = num;
            } else {
                negative[j++] = num;
            }
        }

        logger.log(Level.INFO,"NEGATIVE  " + Arrays.toString(negative));
        logger.log(Level.INFO,"POSITIVE  " + Arrays.toString(positive));


//        System.out.println("Negative numbers = "
//                + Arrays.toString(negative));
//        System.out.println("Positive numbers = "
//                + Arrays.toString(positive));
    }

}
