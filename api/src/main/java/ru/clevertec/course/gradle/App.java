package ru.clevertec.course.gradle;

public class App {
    public static void main(String[] args) {
        boolean allPositiveNumbers = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(allPositiveNumbers);
    }
}
