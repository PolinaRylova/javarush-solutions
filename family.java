/*
Собираем семейство

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human daugther = new Human("Алёнка", false, 16);
        Human son = new Human("Павлик", true, 12);
        Human baby = new Human("Пузожитель", true, 0);
        ArrayList<Human> parentChildren = new ArrayList<Human>();
        parentChildren.add(daugther);
        parentChildren.add(son);
        parentChildren.add(baby);

        Human mother = new Human("Ирина", false, 36, parentChildren);
        Human father = new Human("Максим", true, 39, parentChildren);

        ArrayList<Human> grandy1children = new ArrayList<Human>();
        grandy1children.add(mother);
        ArrayList<Human> grandy2children = new ArrayList<Human>();
        grandy2children.add(father);

        Human grandFather1 = new Human("Степан", true, 67, grandy1children);
        Human grandMother1 = new Human("Марина", false, 65, grandy1children);
        Human grandFather2 = new Human("Фёдор", true, 66, grandy2children);
        Human grandMother2 = new Human("Анна", false, 64, grandy2children);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(daugther);
        System.out.println(son);
        System.out.println(baby);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
