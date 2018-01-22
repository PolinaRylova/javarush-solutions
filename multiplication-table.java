/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a < 11) {
            while (b < 11) {
                if (b == 10) {
                   System.out.println(a * b);
                } else {
                   System.out.print(a * b + " ");
                }
                b++;  
            }
            b = 1;
            a++;
        }
    }
}