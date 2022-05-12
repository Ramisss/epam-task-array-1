package epam.com.log4j.service;

import java.util.List;

public class ConvertService {
    public int[] arrayListToArray(List<Integer> integerList) {
        return integerList.stream().mapToInt(i -> i).toArray();
    }
}
