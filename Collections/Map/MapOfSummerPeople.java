package Collections.Map;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;



/*
Добрая Зинаида и летние каникулы
*/

public class MapOfSummerPeople {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2011"));
        map.put("Гир", dateFormat.parse("MAY 1 2018"));
        map.put("Николас", dateFormat.parse("JULY 4 2010"));
        map.put("терминатор", dateFormat.parse("JUNE 1 2012"));
        map.put("Иван", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сидор", dateFormat.parse("MAY 1 2012"));
        map.put("Шкура", dateFormat.parse("MAY 4 2012"));
        map.put("ОЛОЛО", dateFormat.parse("MAY 7 2012"));
        map.put("Путин", dateFormat.parse("MAY 10 2012"));
        map.put("Топ Гир", dateFormat.parse("MAY 15 2012"));
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copyOfmap = new HashMap<String, Date>(map); //создается копия множества map
        for (Map.Entry<String, Date> pair : copyOfmap.entrySet()) { //проходим по каждому елементу map
            Date value = pair.getValue(); //берем значение чтобы из него потом достать месяц
            String key = pair.getKey(); //берем ключ чтобы по нему потом удалить
            int valueInt = (int) value.getMonth(); // достаем месяц
            if (valueInt == 5 || valueInt == 6 || valueInt == 7) { //проверяем месяц июнь, июль или август
                map.remove(key); //удаляем по ключу
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
        System.out.println(createMap());
    }

}