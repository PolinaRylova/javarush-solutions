/*
Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 31 2018"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date(date); // получаем время в милисекундах до переданной даты
        yearStartTime.setMonth(0);
        yearStartTime.setDate(0);

        Date checkableTime = new Date(date); // получаем количество милисекунд до переданной даты
        long msTimeDistance = checkableTime.getTime() - yearStartTime.getTime(); // вычисляем разницу между датами
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней

        return dayCount % 2 == 0 ? false : true;
    }
}
