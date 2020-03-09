package OOP.absctractt;
/*
Большая лисица — это такая лисица
1. Исправь класс BigFox так, чтобы программа компилировалась.


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Класс BigFox должен быть потомком класса Fox.
*/
public class AbstractClassAndInterface {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        String getColor(); // метод в интерфейсе должен возвращать тоже значение, что и класс,
                            // который его будет использовать! (В данном случае класс BigFox
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }


    public static class BigFox extends Fox{ // нужно переопределить все методы из интерфейса и класса что бы класс не стал абстраактным
        public String getColor() {
            return "GRAY";
        }
        public String getName() {return "BigFox";}

    }
}
