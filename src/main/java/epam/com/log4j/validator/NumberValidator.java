package epam.com.log4j.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidator {

    public boolean checkNegativeAndPositiveNumber(String number) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }


    // вопрос в matches
    public boolean checkNegativeNumber(String number) {
        if (number.matches("-?\\d+")) {
            return true;
        } else return false;
    }

}

