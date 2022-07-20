package com.example.demo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class CalendarTest {
    public static void main(String args[]) {
        Date aDate;
        try {
            aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2020-01-15");
            Calendar aCalendar = Calendar.getInstance();
            aCalendar.setTime(aDate);
            System.out.print(aCalendar.get(Calendar.DAY_OF_MONTH) + "," + aCalendar.get(Calendar.MONTH));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate bDate = LocalDate.parse("2020-01-15", formatter);
            System.out.print(" " + bDate.getDayOfMonth() + "," + bDate.getMonthValue());

        } catch (ParseException ex) {
            System.out.println("ParseException " + ex);
        } catch (DateTimeParseException ex) {
            System.out.println(" DateTimeParseException " + ex);
        }
    }
}