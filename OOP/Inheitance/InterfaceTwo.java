package OOP.Inheitance;

public class InterfaceTwo {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker { // создаем интерфейс
        void askForMore(String message); // прописываем методы интерфейса

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker { // этот интерфейс наследует Drinker интерфейс
        boolean READY_TO_GO_HOME = false; // переменная которая будет передаваться в метод isReadyToGoHome();

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic { //класс наследует интерфейс Alcoholic
        //далее нужно переопределить ВСЕ методы из обоих интерфейсов, все должны быть public

        public void askForMore(String message) {
            System.out.println(message);
        }
        public void sayThankYou() {
            System.out.println("ThankYou");
        }
        public boolean isReadyToGoHome() { // в этот метод передается переменная из Alcoholic
            return READY_TO_GO_HOME;
        }
        public void sleepOnTheFloor() {
            System.out.println("spat");
        }
    }
}
