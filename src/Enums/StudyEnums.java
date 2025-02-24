package Enums;

import java.util.Arrays;

public class StudyEnums {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        int x = 10, y = 5;

        System.out.println("Hôm nay là: " + today);
        Season thisSeason = Season.SUMMER;
        System.out.println("This season is: " + thisSeason);
        System.out.println("Mùa nay là: " + thisSeason.getVietnameseName());
        for (Season s : Season.values()) {
            System.out.println("Các mùa này là: " + s.getVietnameseName());
        }
        System.out.println(x + " + " + y + " = " + Operation.ADD.apply(x, y));
        System.out.println(x + " - " + y + " = " + Operation.SUBTRACT.apply(x, y));
        System.out.println(x + " * " + y + " = " + Operation.MULTIPLY.apply(x, y));
        System.out.println(x + " / " + y + " = " + Operation.DIVIDE.apply(x, y));
    }
}
