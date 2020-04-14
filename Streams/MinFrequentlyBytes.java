package Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class MinFrequentlyBytes {
        public static void main(String[] args) throws Exception {
            //аbstract
            ArrayList<Integer> list = new ArrayList();
            Map<Integer, Integer> mapOfFrequency = new HashMap<>();
            int countOfFrequency = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();

            FileInputStream inputStream = new FileInputStream(name);
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                list.add(data);
            }
            inputStream.close();

            int minFrequency = Collections.frequency(list, list.get(0));
            for (Integer frequencyByte : list) {
                countOfFrequency = Collections.frequency(list, frequencyByte);
                if (countOfFrequency <= minFrequency) {
                    minFrequency = countOfFrequency;
                    mapOfFrequency.put(frequencyByte, countOfFrequency );
                }
            }
            for (Map.Entry<Integer, Integer> printMax : mapOfFrequency.entrySet()) {
                if (printMax.getValue() == minFrequency) {

                    System.out.print(printMax.getKey() + " ");
                }
            }
        }
    }