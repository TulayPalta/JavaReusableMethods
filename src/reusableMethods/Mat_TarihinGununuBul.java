package reusableMethods;

import java.util.Calendar;
import java.util.Locale;

public class Mat_TarihinGununuBul {
    public static void main(String[] args) {
        int day=4;
        int month=2;
        int year=1992;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.YEAR, year);
        System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
                Locale.getDefault()).toUpperCase());
    }
}
