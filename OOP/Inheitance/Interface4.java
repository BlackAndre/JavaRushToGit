package OOP.Inheitance;
/* Баг в initializeIdAndName
1. Подумать, что в программе неправильно.
2. Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Поправить программу, чтобы компилировалась и работала.


Требования:
1. Интерфейс DBObject должен содержать только объявление метода initializeIdAndName без реализации.
2. Реализуй метод initializeIdAndName в классе User.
3. Метод initializeIdAndName в классе User должен иметь тип возвращаемого значения User.
4. Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в
соответствии с переданными ему параметрами и возвращать этот объект.
 */
public class Interface4 {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        //заменил после "static" DBObject на User,
        // так как должен был создаться класс, а не интерфейс
        public static User NEO = new User().initializeIdAndName(1, "Neo");
        public static User TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        User initializeIdAndName(long id, String name); //у метода интерфейса должны быть переменные, но не дб реализации
    }

    static class User implements DBObject {
        long id;
        String name;

        public User initializeIdAndName(long id, String name) { // здесь тоже дб User
            this.id = id;
            this.name = name;
            return this; // идет возврат самого же класса, который вызвал метод,
                         // но уже с новыми параментрами (которые изменил метод main)
        }
        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

    }

}
