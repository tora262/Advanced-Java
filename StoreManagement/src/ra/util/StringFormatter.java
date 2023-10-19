package ra.util;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.TemporalField;
import java.util.Date;

public class StringFormatter {
    private static int orderCount = 1;

    public static String formatOrderId(String prefix) {
        StringBuilder orderIdBuilder = new StringBuilder();
        orderIdBuilder.append(prefix)
            .append(getCurrentYearMoth())
            .append(String.format("%02d", orderCount++));

        return orderIdBuilder.toString();
    }

    private static String getCurrentYearMoth() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYMM");
        return simpleDateFormat.format(date);
    }
}
