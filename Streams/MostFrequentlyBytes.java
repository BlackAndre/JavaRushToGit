package Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/*Самые частые байты
        Ввести с консоли имя файла.
        Найти байт или байты с максимальным количеством повторов.
        Вывести их на экран через пробел.
        Закрыть поток ввода-вывода.


        Требования:
        1. Программа должна считывать имя файла с консоли.
        2. Для чтения из файла используй поток FileInputStream.
        3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
        4. Данные в консоль должны выводится в одну строку.
        5. Поток чтения из файла должен быть закрыт */


public class MostFrequentlyBytes {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList();
        Map<Integer, Integer> mapOfFrequency = new HashMap<>();
        int countOfFrequency = 0;
        int maxFrequency = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        inputStream.close();

        for (Integer frequencyByte : list) {
            countOfFrequency = Collections.frequency(list, frequencyByte);
            if (countOfFrequency >= maxFrequency) {
                maxFrequency = countOfFrequency;
                mapOfFrequency.put(frequencyByte, countOfFrequency );
            }


        }
        // System.out.println("Макс повторение " + maxFrequency);
        for (Map.Entry<Integer, Integer> printMax : mapOfFrequency.entrySet()) {
            if (printMax.getValue() == maxFrequency) {
                // System.out.println("printMax.getKey() это " + printMax.getKey());
                //  System.out.println("printMax.getValue() это " + printMax.getValue());
                System.out.print(printMax.getKey() + " ");
            }
        }
    }
}
