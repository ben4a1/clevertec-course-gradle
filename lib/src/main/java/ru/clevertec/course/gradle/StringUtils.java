/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ru.clevertec.course.gradle;

import org.apache.commons.lang3.math.NumberUtils;


public class StringUtils {
    static public boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && (Double.parseDouble(str) > 0);
    }
}
