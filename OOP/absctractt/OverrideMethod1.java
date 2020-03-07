package OOP.absctractt;

public class OverrideMethod1 {
/*
Все мы немного кошки…
*/

    public class Solution {
        public static void main(String[] args) {
            Pet pet = new Cat();

            System.out.println(pet.getName());
        }

        public static class Pet {
            public String getName() {
                return "Я - пушистик";
            }
        }

        public static class Cat extends Pet {
            public String getName() { // переопределение метода происходит здесь
                return "Я - кот";
            }
        }
    }
