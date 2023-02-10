package ru.clevertec.course.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;



class StringUtilsTest {
    static String positiveNumber = "15";
    static String negativeNumber = "-15";
    static String positiveFloatNumber = "0.15f";
    static String notNumber = "one hundred thousand five hundred";

    @Test
    void isPositiveNumberTest() {
        Assertions.assertTrue(StringUtils.isPositiveNumber(String.valueOf(positiveNumber)));
        Assertions.assertTrue(StringUtils.isPositiveNumber(String.valueOf(positiveFloatNumber)));
        Assertions.assertFalse(StringUtils.isPositiveNumber(notNumber));
        Assertions.assertFalse(StringUtils.isPositiveNumber(String.valueOf(negativeNumber)));
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForIsPositiveNumberTest")
    void isPositiveNumberParameterizedTest(String maybePositiveNumber, boolean isPositiveNumber) {
        boolean isPositiveNumber1 = StringUtils.isPositiveNumber(maybePositiveNumber);
        Assertions.assertEquals(isPositiveNumber1, isPositiveNumber);
    }

    static Stream<Arguments> getArgumentsForIsPositiveNumberTest() {
        return Stream.of(
                Arguments.of(positiveNumber, true),
                Arguments.of(negativeNumber, false),
                Arguments.of(positiveFloatNumber, true),
                Arguments.of(notNumber, false));
    }
}