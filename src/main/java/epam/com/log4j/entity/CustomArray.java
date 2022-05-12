package epam.com.log4j.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {

     private int [] customArray;

    public CustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    public int[] getCustomArray() {
        return customArray;
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray numberArr = (CustomArray) o;

        return Arrays.equals(customArray, numberArr.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
    }
}
