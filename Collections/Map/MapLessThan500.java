package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapLessThan500 {
        public static Map<String, Integer> createMap() {
            Map<String, Integer> people = new HashMap<>(); // создается массив имен
            for (int i = 0; i < 10; i++) {
                people.put("Зиновьева", 155000);
                people.put("Иванов", 1550);
                people.put("Сидоров", 155000);
                people.put("Иванова", 155000);
                people.put("Муудаков", 15000);
                people.put("Жура", 1500);
                people.put("Муха", 1560);
                people.put("Бульдогов", 400);
                people.put("Широков", 700);
                people.put("Воробьев", 880);
            }
            return people;
        }

        public static void removeItemFromMap(Map<String, Integer> map) {
            Map<String, Integer> copy = new HashMap<>(map);
            for (Map.Entry<String, Integer> pair : copy.entrySet()) {
                if ((int) pair.getValue()  < 500) {
                    map.remove(pair.getKey());
                }
            }
        }


        public static void main(String[] args) {

        }
    }
