package Collections.Map;

import java.util.*;
/*
Нам повторы не нужны
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/
public class MapWithoutRepeats {
        public static Map<String, String> createMap() {
            Map<String, String> people = new HashMap<>(); // создается массив имен
            for (int i = 0; i < 10; i++) {
                people.put("Залупова", "Андрей");
                people.put("Иванов", "Дима");
                people.put("Сидоров", "Сергей");
                people.put("Иванова", "Ваня");
                people.put("Муудаков", "Андрей");
                people.put("Сиськов", "Мудень");
                people.put("Педиков", "Педик");
                people.put("Бульдогов", "Сиська");
                people.put("Сосисков", "Бульдог");
                people.put("Залупов", "Сосиcка");
            }
            return people;

        }

        public static void removeTheFirstNameDuplicates(Map<String, String> map) {
            List<String> firstNames = new ArrayList(); // перегоняем map в list
            for (Map.Entry<String, String> pair : map.entrySet()) {
                firstNames.add(pair.getValue()); //в list записываем только имена(value из map)
            }
            Collections.sort(firstNames); // СОРТИРУЕМ LIST по алфавиту(?)
            for (int i = 1; i < firstNames.size(); i++) {
                if (firstNames.get(i).equals(firstNames.get(i - 1))) { //проверяем есть ли подряд повторы
                    removeItemFromMapByValue(map, firstNames.get(i)); // если есть вызываем метод
                                                                        // который уже была написан разрабами и он удаляет
                                                                        // ключ привязанный к значению
                }
            }

        }

        public static void removeItemFromMapByValue(Map<String, String> map, String value) {
            Map<String, String> copy = new HashMap<>(map);
            for (Map.Entry<String, String> pair : copy.entrySet()) {
                if (pair.getValue().equals(value)) {
                    map.remove(pair.getKey());
                }
            }
        }

        public static void main(String[] args) {

        }
    }
