/*
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String firstSmallest = strings.get(0);
        String firstBiggest = strings.get(0);
        int smallestIndex = 0;
        int biggestIndex = 0;

        for (int i = 1; i < strings.size(); i++) {
            String currentItem = strings.get(i);
            if (currentItem.length() < firstSmallest.length()) {
                firstSmallest = currentItem;
                smallestIndex = i;
            } else if (currentItem.length() > firstBiggest.length()) {
                firstBiggest = currentItem;
                biggestIndex = i;
            }
        }

        int firstInputtedIndex = 0; // если все введенные строки одной длины, то возвращаем первую введенную

        if (smallestIndex < biggestIndex) {
            firstInputtedIndex = smallestIndex;
        } else if (biggestIndex < smallestIndex) {
            firstInputtedIndex = biggestIndex;
        }

        System.out.println(strings.get(firstInputtedIndex));
    }
}