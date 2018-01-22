/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = Integer.toString(number);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Integer.parseInt(Character.toString(c));
        }

        return sum;
    }
}