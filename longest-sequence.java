/*
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 9, 12, 12, 14:  3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> nums = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            nums.add(Integer.parseInt(reader.readLine()));
        }

        int maxCount = 0;
        for (Integer num: nums){
            int count = 0;
            for (Integer nextNum: nums){
                if (num.equals(nextNum)) {
                    count++;
                    if (count > maxCount) maxCount = count;
                } else count = 0;
            }
        }

        System.out.println(maxCount);
    }
}