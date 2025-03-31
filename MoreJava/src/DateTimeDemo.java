

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");

// DATE
        LocalDate date = LocalDate.now();
        System.out.println("Java Time 'LocalDate' is displayed as:  " + date); //Current Date in format: Year-Month-Day
//TIME
        LocalTime time = LocalTime.now();
        System.out.println("Java Time 'LocalTime' is displayed as:  " + time); //Current Time in format: Hour:Minute:Second.millisecond
//DATE & TIME
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Java Time 'LocalDateTime' is both latter separated by \"T\":  " + dateTime); //Both Date & Time at once, separated by "T" character.

        System.out.println("We can do better, with DateTimeFormatter :");

//Date & Time Formatter v1
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formattedDate = dateTime.format(formatter);
        System.out.println("Setting dd-MM-yyy HH:mm:ss se aprecia así: " + formattedDate);
//Date & Time Formatter v2
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE+S, MMMM dd yyyy, HH:mm a");
        String formattedDate2 = dateTime.format(formatter2);
        System.out.println("Setting dd-MM-yyy HH:mm:ss se aprecia así: " + formattedDate2);
//Date & Time Formatter v3
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd yyyy, HH:mm a");
        String formattedDate3 = dateTime.format(formatter3);
        System.out.println(formattedDate3);

        System.out.println("------------------------------------------------------");
    }
}
