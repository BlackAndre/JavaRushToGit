import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rectangle {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameM = reader.readLine();
        String nameN = reader.readLine();
        int m = Integer.parseInt(nameM);
        int n = Integer.parseInt(nameN);
        
        int i = 8;
        int countM;
        int countN;
        for (countM = 0; countM < m; countM += 1) {
          for (countN = 0; countN < n; countN +=1){
              System.out.print(i);
          }  System.out.println();
          countN = 0;
        }

    }
}