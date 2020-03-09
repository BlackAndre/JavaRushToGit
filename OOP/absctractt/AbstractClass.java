package OOP.absctractt;
/*
Лисица — это такое животное

Лисица — это такое животное
1. Реализуй в классе Fox интерфейс Animal.
2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
3. Создавать дополнительные классы и удалять методы нельзя!


Требования:
1. Интерфейс Animal должен быть реализован в классе Fox.
2. В классе Fox должен быть реализован только один метод(getName).
3. В интерфейсе Animal должен быть объявлен метод getColor.
4. Дополнительные классы или интерфейсы создавать нельзя.
*/
public class AbstractClass {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {

        void getColor(); // убрал Color,вместо этого забил void
    }

    public abstract class Fox implements Animal{ // сделал класс Fox абстрактным,
                                                 // поэтому он не обязан наследовать все методы интерфейса!
        public String getName() {
            return "Fox";
        }
    }
}