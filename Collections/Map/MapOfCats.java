package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapOfCats {

    public static void main(String[] args) throws Exception {
        // Создается массив
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = addCatsToMap(cats); // создается коллекция Map с методом addCatsToMap();

        // через цикл for-each просматривается вся созданная коллекция
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

        // метод для добавления массива String[] Cats в коллекцию Map
    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> map = new HashMap(); // создание еще одной коллекции внутри метода
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i])); // прогон по всем елементам массива cats для записи в коллекцию
        }
        return map;

    }

        // класс Cat получает имя из массива cats и возвращает это имя большим шрифтом
    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

