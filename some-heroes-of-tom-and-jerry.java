/*
Том и Джерри

Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.

Требования:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse muslMouse = new Mouse("Musl", 14, 6);
        Cat tomCat = new Cat("Tom", 6, "gray");
        Cat butchCat = new Cat("Butch", 5, "black");
        Cat toodlesCat = new Cat("Toodles", 4, "cream");
        Dog spikeDog = new Dog("Spike", 45, 70);
        Dog tykeDog = new Dog("Tyke", 12, 20);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int weight;
        String color;

        public Cat(String name, int weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }

    public static class Dog {
        String name;
        int weight;
        int height;

        public Dog(String name, int weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
        }
    }
}