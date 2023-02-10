package ru.clevertec.course.gradle;

import java.util.Arrays;

public class Utils {
    static public boolean isAllPositiveNumbers(String... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
