package ru.clevertec.course.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {
    static int positiveNumber = 15;
    static int negativeNumber = -15;
    static float positiveFloatNumber = 0.15f;
    static String notNumber = "one hundred thousand five hundred";

    @Test
    void isPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber(String.valueOf(positiveNumber)));
        Assertions.assertTrue(StringUtils.isPositiveNumber(String.valueOf(positiveFloatNumber)));
        Assertions.assertFalse(StringUtils.isPositiveNumber(notNumber));
        Assertions.assertFalse(StringUtils.isPositiveNumber(String.valueOf(negativeNumber)));
    }
}