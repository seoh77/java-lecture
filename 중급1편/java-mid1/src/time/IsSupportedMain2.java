package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);

        if(supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);     // Unsupported field 에러 발생
            System.out.println("minute = " + minute);
        }
    }
}
