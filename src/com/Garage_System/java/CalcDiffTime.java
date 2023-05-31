package com.Garage_System.java;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.util.Date;
public class CalcDiffTime {

    static long calc(Date d1,Date d2){
        long total=0;

        long time_difference = d2.getTime() - d1.getTime();
        long days_difference = TimeUnit.MILLISECONDS.toDays(time_difference) % 365;
        long years_difference = TimeUnit.MILLISECONDS.toDays(time_difference) / 365;
        long seconds_difference = TimeUnit.MILLISECONDS.toSeconds(time_difference) % 60;
        long minutes_difference = TimeUnit.MILLISECONDS.toMinutes(time_difference) % 60;
        long hours_difference = TimeUnit.MILLISECONDS.toHours(time_difference) % 24;
        total = total+days_difference*24;
        total=total+years_difference*365*24;
        total=total+hours_difference;
        if(minutes_difference>0)
            total=total+1;
        return total;
    }
}
