package com.longapi.core.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    public static final String FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_ZONE = "GMT+7";


    public static String dateToString(Date date, String strFormat) {
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strFormat);
            return simpleDateFormat.format(date);
        } else
            return null;
    }

    public static Date stringToDate(String dateString, String strFormat) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strFormat);
            return simpleDateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean isDate(String strSource, DateFormat fmt) {
        try {
            if (fmt.parse(strSource) == null)
                return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static Date add(Date dt, int iValue, int iType) {
        Calendar cld = Calendar.getInstance();
        cld.setTime(dt);
        cld.add(iType, iValue);
        return cld.getTime();
    }

    public static Date addDay(Date dt, int iValue) {
        return add(dt, iValue, Calendar.DATE);
    }

    public static Integer dateDiff(Date d1, Date d2, int type) {
        if (d1 == null || d2 == null) {
            return null;
        }
        long diffMiliseconds = d1.getTime() - d2.getTime();
        switch (type) {
            case 1://days
                return (int) (diffMiliseconds / (24 * 60 * 60 * 1000));
            case 2://hours
                return (int) (diffMiliseconds / (60 * 60 * 1000));
            case 3://minutes
                return (int) (diffMiliseconds / (60 * 1000));
            case 4://seconds
                return (int) (diffMiliseconds / 1000);
            default:
                return (int) diffMiliseconds;
        }
    }

    public static boolean isWeekend(java.util.Date d) {
        Calendar c = new GregorianCalendar();
        c.setTime(d);
        if (Calendar.SATURDAY == c.get(c.DAY_OF_WEEK) || Calendar.SUNDAY == c.get(c.DAY_OF_WEEK)) {
            return true;
        } else {
            return false;
        }
    }


}
