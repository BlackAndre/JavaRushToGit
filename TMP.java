import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeDate.getMonth;

public class TMP {
    public static void main(String[] args) throws ParseException  {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2011"));
        int month = (int) getMonth("MAY 1 2011");
        System.out.println(month);
    }
}