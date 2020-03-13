import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SwitchPlanets {
    public static void main(String[] args) throws IOException { // пробросил исключение, иначе не проходил readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //считывание с клавы
        int result = 0; // планета, которая передасться в метод getAtmosphereOfPlanet
        while(true) { // бесконечный цикл чтобы всегда принимался ввод с клавиуатуры
            String name = reader.readLine(); // считвание строки с клавиатуры
            result = Integer.parseInt(name); // перевод в число
            System.out.println(getAtmosphereOfPlanet(result)); // вывод на экран итога
        }
    }
    public static List<String> getAtmosphereOfPlanet(int num) { // метод определения атмосферы по номеру планеты
        List<String> score = new ArrayList(); // создается массив
        switch (num) {  // оператор switch для отработки сценариев
            case 1:
                score.add("Водород");
                break; // нужен break иначе пройдет по всем вариантам.
            case 2:
            case 3:
                score.add("Углекислый газ");
                break;
            case 4:
                score.add("Даже не планета, нет состава");
                break;
            default: score.add("Не найдено"); // если будет другой вариант(вместо else в блоках if-else)

            break;
        }
        return score; // возврат массива итога.
    }
}

