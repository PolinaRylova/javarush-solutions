/* 
Максимум конструкторов

Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.


Требования:
1. У класса должно быть хотя бы три переменные.
2. У класса должен быть конструктор по умолчанию.
3. У класса должен быть хотя бы один конструктор.
4. У класса должно быть хотя бы два конструктора.
5. У класса должно быть хотя бы три конструктора.
6. У класса должно быть хотя бы четыре конструктора.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
       this.x = x;
       this.y = y;
       this.radius = radius;
    }
    
    public Circle(double x, double y) {
       this(x, y, 10);
    }
    
    public Circle() {
       this(5, 5, 10);
    }
    
    public Circle(Circle original) {
        this(original.x, original.y, original.radius);
    }
    
    public Circle(double x) {
        this.x = x;
        this.y = x;
        this.radius = x;
    }

    public static void main(String[] args) {

    }
}