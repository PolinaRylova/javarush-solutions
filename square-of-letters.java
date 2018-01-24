/* 
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        while (i < 101) {
            if (i % 10 == 0) {
                System.out.println("S");
            } else {
                System.out.print("S");
            }
            i++;
        }

    }
}