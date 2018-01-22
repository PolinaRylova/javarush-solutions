/* 
Метод, который на вход принимает количество секунд, которые прошли с начала суток, 
а выдает число секунд, которые прошли с начала текущего часа.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int result = seconds % (60 * 60);
        return result;
    }
}