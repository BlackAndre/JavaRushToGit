

/* 
Цена яблок
*/

public class PriceOfApple {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
           Apple.applesPrice = Apple.applesPrice + applesPrice;
           

        }
    }
}

           
/* 1) Создается объект  класа Apple
2)объект apple вызывает метод addPrice(50); куда передается параметр 50
Метод addPrice это счетчик       в нем  мы к  public static int applesPrice = 0; ( в методе вызывается через класс Аplle и обозначается  как Apple.applesPrice) прибавляем переданный параметр applesPrice= 50
            Apple.applesPrice=Apple.applesPrice + applesPrice
            Apple.applesPrice=0+50==50
То есть Apple.applesPrice - статическая переменная класса
а applesPrice параметр или аргумент метода addPrice
написаны одинаково- если назвать их разными словами станет понятней.

3) Создается еще один объект класса Apple
4)объект apple2 вызывает метод  addPrice(100); куда передается параметр 100
           Apple.applesPrice=50+100==150
Печатаем Apple.applesPrice==150
	*/

