/*
Задача по алгоритмам

Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.

Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать три метода.
4. Метод main() должен вызывать метод sort().
5. Метод sort() должен вызывать метод isGreaterThan().
6. Выведенные слова должны быть отсортированы в алфавитном порядке.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) { // перебираем элементы с конца, исключая первый, так как с ним будем сравнивать во внутреннем цикле
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(array[j], array[i])) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
        /*
        compareTo() получает значение 0, если аргумент является строкой лексически равной данной строке;
        значение меньше 0, если аргумент является строкой лексически большей, чем сравниваемая строка;
        и значение больше 0, если аргумент является строкой лексически меньшей этой строки.
         */
    }
}
