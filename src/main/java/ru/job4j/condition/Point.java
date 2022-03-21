package ru.job4j.condition;

public class Point {

        public static double distance(int x1, int y1, int x2, int y2) {
            double argument1 = Math.pow((x2 - x1), 2);
            double argument2 = Math.pow((y2 - y1), 2);
            double rsl = Math.sqrt(argument1 + argument2);
            return rsl;
        }

        public static void main(String[] args) {
            double result = Point.distance(0, 0, 2, 0);
            System.out.println("result (0, 0) to (2, 0) " + result);
            double result2 = Point.distance(2, 0, -1, 3);
            System.out.println("result2 (2, 0) to (-1, 3) " + result2);
            double result3 = Point.distance(6, 3, -1, -5);
            System.out.println("result2 (6, 3) to (-1, -5) " + result3);
        }
}
