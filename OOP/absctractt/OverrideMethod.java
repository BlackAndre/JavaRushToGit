package OOP.absctractt;

public class OverrideMethod {
/*
Корова — тоже животное
*/

        public static void main(String[] args) {
        }

        public static abstract class Animal {
            public abstract String getName();
        }

        public static class Cow extends  Animal{ // Корова наследуется от класса Animal
            public String getName() { // переопределился метод getName;
                return "Корова";
            }
        }

    }
