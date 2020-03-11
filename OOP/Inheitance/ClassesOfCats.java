package OOP.Inheitance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Коты
Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.

Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные после ввода пустой строки.
3. Программа должна выводить на экран описание каждого кота (cat.toString).
4. Программа должна создавать объект класса Cat для каждого введенного имени кота(строки считанной с клавиатуры) c помощью метода getCatByKey
*/
public class ClassesOfCats {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // открывается поток
        while(true) { //создается цикл
            String name = reader.readLine(); //ВНУТРИ цикла считывается строка
            if (!name.isEmpty()) { // если строка не ПУСТАЯ
                System.out.println(CatFactory.getCatByKey(name)); //выводится на экран метод класса CatFactory,
                                                                   // который создает класс, проверяет какой класс
                                                                    //( Male или Famale) нужно вывести, если имя не подходит
                                                                    // ни к кому, то просто Cat
            }
            else {break;}
        }
    }

    static class CatFactory { // это было написано заранее, основной класс
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat { // обязательно нужно наследоваться от класса Cat
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

