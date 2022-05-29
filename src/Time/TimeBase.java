/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Time;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Administrator
 */
public class TimeBase {

    public static final String DD__MM__YYYY = "dd-MM-yyyy";
    public static final String HH_MM_SS = "HH:mm:ss";
    public static final String SIMPLE_DATE_TIME = "yyyy-MM-dd hh:mm:ss";
    public static final int UTC7 = 7;
    public static final int UTC = 0;
    private static final String CUSTOMENT_SERVER = "http://10.90.0.15:8000/auth/login//";
    private static final String WEB_SERVER = "http://time.windows.com";

    public String SimpleDateTimeFormat(Object time, String format) {

        String dateStr = "";
        try {
            SimpleDateFormat simFormat = new SimpleDateFormat(format);
            dateStr = simFormat.format(time);
        } catch (Exception e) {
        }
        return dateStr;
    }

    public String getTimeZone() {
        TimeZone tz = Calendar.getInstance().getTimeZone();
        return tz.getID();
    }

    public String getDateTime(int timeZone, String fomat) {
        try {
            if (outOfRange(timeZone)) {
                timeZone = 0;
            }
            Calendar cal = Calendar.getInstance();
            cal.setTime(cal.getTime());
            cal.add(Calendar.HOUR, timeZone);
            String dateByFormat = SimpleDateTimeFormat(cal.getTime(), fomat);
            return dateByFormat;
        } catch (Exception ex) {
            return "";
        }

    }

    private boolean outOfRange(int timeZone) {
        return Math.abs(timeZone) > 12;
    }

    public Date getWebsiteDatetime(final String URL) {
        try {
//            System.out.println(String.format("Get time from : %s", URL));
            URL url = new URL(URL);
            URLConnection uc = url.openConnection();
            uc.connect();
            long ld = uc.getDate();
            Date date = new Date(ld);
            return date;
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return null;
    }

    public long getCurrentMillis() {
        return System.currentTimeMillis();
    }

    public String getSimpleDateTime() {
        return getDateTime(TimeBase.UTC, TimeBase.SIMPLE_DATE_TIME);
    }

    public double mathCycleTimeS(long startTime) {
        return ((double) mathCycleTimeMs(startTime)) / 1000.0;
    }

    public long mathCycleTimeMs(long startTime) {
        if (startTime < 0) {
            startTime = 0;
        }
        return (this.getCurrentMillis() - startTime);
    }

    public String getDate() {
        return getDateTime(TimeBase.UTC, TimeBase.DD__MM__YYYY);
    }
}
