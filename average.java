import java.io.*;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 1.0;
        double dNum = 0.0;
        int numCount = -1;

        while (dNum != -1) {
           dNum = Double.parseDouble(reader.readLine());
           sum += dNum;
           numCount++;
        }
        
        System.out.println(sum / numCount);
    }
}