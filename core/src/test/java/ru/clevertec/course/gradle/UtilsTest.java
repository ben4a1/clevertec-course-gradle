package ru.clevertec.course.gradle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.clevertec.course.gradle.Utils.isAllPositiveNumbers;

class UtilsTest {

    @Test
    void isAllPositiveNumbersTest() {
        Assertions.assertTrue(isAllPositiveNumbers("2", "15"));
        Assertions.assertFalse(isAllPositiveNumbers("11", "six"));

    }
}