package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Duration;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class DateTime 
{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);
    
    public LocalDateTime currentTime()//Returns the user's entry time/date.
    {
        LocalDateTime entryTime = LocalDateTime.now();//Keep and displate the current date & time.
        System.out.println("Entry time (you can stay up to 24 Hours):" + entryTime.format(formatter));
        return entryTime;
    }
    
    public long totalHours(LocalDateTime entryTime)//Returns user's the total hours.
    {
        LocalDateTime departureTime=null;
        do{
            System.out.println("Enter departure time (yyyy-MM-dd HH:mm)");
            System.out.printf("y: Year, M: Month, d: Day, H: Hour, m: Minutes: ");
            String userInput = scanner.nextLine();
            try{
                departureTime=LocalDateTime.parse(userInput,formatter);
                if(departureTime.isBefore(entryTime))//Check if the departure time/date is after the entry time.
                {
                    System.out.print("Departure Time cannot be before entry time!!Try again:");
                    continue;
                }
                Duration dur1 = Duration.between(entryTime,departureTime);
                if (dur1.toHours() > 24)//Check if the totalHours is not more than 24 hours.
                {
                    System.out.print("You cant stay more than 24 hours!! Try Again:");
                    continue;
                }
                break;
            }catch(Exception e){System.out.print("Invalid departure time format. ");}
        }while(true);
        Duration dur = Duration.between(entryTime, departureTime);
        long totalHours = dur.toMinutes() % 60 == 0 ? dur.toHours() : dur.toHours() + 1;
        return totalHours;
    }
}
