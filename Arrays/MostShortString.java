package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MostShortString {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            list.add(str);
        } int min = list.get(0).length();
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
            }
        }
    }
}
