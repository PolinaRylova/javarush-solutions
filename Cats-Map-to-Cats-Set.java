/*
Десять котов

Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен создавать новый объект HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catsMap = new HashMap<>();
        catsMap.put("Tom", new Cat("Tom")); // 1
        catsMap.put("Silvester", new Cat("Silvester")); // 2
        catsMap.put("Butch", new Cat("Butch")); // 3
        catsMap.put("Toodles", new Cat("Toodles")); // 4
        catsMap.put("Topsy", new Cat("Topsy")); // 5
        catsMap.put("Leopold", new Cat("Leopold")); // 6
        catsMap.put("Matroskin", new Cat("Matroskin")); // 7
        catsMap.put("Garfield", new Cat("Garfield")); // 8
        catsMap.put("Cheshire", new Cat("Cheshire")); // 9
        catsMap.put("Gav", new Cat("Gav")); // 10

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catsSet = new HashSet<>();

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            catsSet.add(pair.getValue());
        }

        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

}