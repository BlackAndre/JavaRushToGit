import java.util.ArrayList;

public class TMP {
         public static void main(String[] args) {
            ArrayList<String> list = new ArrayList();
            String str = "именно";
            list.add("мама");
            list.add(str);
            list.add("мыла");
            list.add(str);
            list.add("раму");
            list.add(str);
            for (int i = 0; i < 6; i++) {
                System.out.println(list.get(i));
            }
        }
    }
