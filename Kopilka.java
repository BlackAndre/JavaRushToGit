import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kopilka {
/*
Консоль-копилка
*/
public static void main(String[] args) throws Exception {
    int count = 0;

    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    while (true)
    {
        String s = buffer.readLine();

        if (s.equals("сумма"))
            break;
        int num = Integer.parseInt(s);
        count += num;
    }
    System.out.println(count);

}
}