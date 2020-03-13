package OOP.Inheitance;
/*
Том, Джерри и Спайк
Том, Джерри и Спайк
1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.


*/
public class InterfaceOfTomAndJerry { //  нужно не забывать о переопределении всех методов из интрефейса от которого наследуется класс
    public static void main(String[] args) {
    }

    public interface Movable {
        void move();
    }

    public interface Edible {
        void beEaten();
    }

    public interface Eat {
        void eat();
    }
    public class Cat implements Movable, Edible, Eat {
        public void move() {}
        public void beEaten() {}
        public void eat() {}
    }

    public class Mouse implements Movable, Edible {
        public void move() {}
        public void beEaten() {}
    }
    public class Dog implements Movable, Eat {
        public void move() {}
        public void eat() {}
    }
}