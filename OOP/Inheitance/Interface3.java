package OOP.Inheitance;


/*
Четыре ошибки
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.


Требования:
1. Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
2. Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
3. Класс Hobby должен быть объявлен с модификатором доступа static.
4. Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
5. Объявления интерфейсов не изменять.
*/

public class Interface3 {

        public static void main(String[] args) {

            System.out.println(Dream.HOBBY.toString()); // вывод на экран результат метода toString через интерфейс Dream,
                                                        // который создает объект Hobby, которому применяется метод toString()
                                                        // который увеличивает переменную INDEX на 1, итого 1 + 1 = 2.

            System.out.println(new Hobby().toString()); // создается еще один объект Hobby и вызывается метод toString,
                                                        // который берет ту же переменную INDEX, которая с прошлого раза равна 2м.
                                                        // и добавляет еще 1, итого 3.

        }

        interface Desire {
        }

        interface Dream {
            public static Hobby HOBBY = new Hobby();
        }

        static class Hobby  implements Dream, Desire {
            public static int INDEX = 1; // переменная INDEX статичная, значит она уже будет
                                        // равняться 1 как только приложение будет запущено

            @Override
            public String toString() { // метод увеличивает переданную переменную на 1
                INDEX++;
                return "" + INDEX;
            }
        }

    }

