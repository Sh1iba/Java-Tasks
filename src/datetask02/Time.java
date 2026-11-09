package datetask02;

//1970 Jan 01 00:00:00

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;


public class Time {
    String date = "";
    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss", Locale.ENGLISH);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        date = dateFormat.format(calendar.getTime());
        System.out.println(date);
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.getTime();
    }
}

