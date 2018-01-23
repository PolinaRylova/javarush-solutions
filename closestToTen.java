/* 
Ближайшее к 10
Метод closeToTen должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Метод public static int abs(int a) возвращает абсолютную величину числа.
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int closest;
        if ( (abs(10 - a)) < (abs(10 - b)) ) {
            closest = a;
        } else {
            closest = b;
        }
        System.out.println(closest);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}