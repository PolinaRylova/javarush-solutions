/*
Задача: Программа определяет, какая семья (фамилия) живёт в указанном городе.

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода: Абрамовичи


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //map of towns and families
        Map<String, String> townsAndFamilies = new HashMap<>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();
            townsAndFamilies.put(town, family);
        }

        //read town
        String townName = reader.readLine();

        System.out.println(townsAndFamilies.get(townName));
    }
}
