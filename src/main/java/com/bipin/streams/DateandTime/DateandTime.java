package com.bipin.streams.DateandTime;

//How will you get the current date and time using Java 8 Date and Time API?
public class DateandTime {
    public static void main(String[] args)
    {
        System.out.println("System Date    :" + java.time.LocalDate.now());
        System.out.println("System Time    :" + java.time.LocalTime.now());
        System.out.println("System DateTime:" + java.time.LocalDateTime.now());
    }
}
