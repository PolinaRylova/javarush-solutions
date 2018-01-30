/*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Stallone", "Sylvester");
        map.put("Willis", "Bruce");
        map.put("Norris", "Chuck");
        map.put("Van Damme", "Jean-Claude");
        map.put("Rourke", "Mickey");
        map.put("Schwarzenegger", "Arnold");
        map.put("Seagal", "Steven");
        map.put("Eastwood", "Clint");
        map.put("Lee", "Bruce");
        map.put("Chan", "Jackie");

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        // создаём копию для итерации по словарю, так как модифицировать сам словарь во время итераций по нему нельзя 
        Map<String, String> copy = new HashMap<>(map); 
        // создаём пустой словарь, чтобы складывать в него по мере итерации ключи-значения для дальнейшей проверки на повторяющиеся значения
        Map<String, String> nonDublicates = new HashMap<>();
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String currentPairValue = pair.getValue();
            if (dublicates.containsValue(currentPairValue)) { // если в nonDuplicates уже есть пара с таки значением, 
               removeItemFromMapByValue(map, currentPairValue); // то передаем в функцию удаления оригинальный словарь и значение
            } else {
                dublicates.put(pair.getKey(), currentPairValue); // если такого значения нет в nonDuplicates, то записываем в него пару ключ-значение
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey()); // если текущее значение в паре соответствует переданному в функцию параметру, то удаляем пару
        }
    } // т.о, данный метод удаляет все пары, содержащие значение, переданное во втором параметре

    public static void main(String[] args) {

    }
}