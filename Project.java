import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.LocalTime;



public class Project{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\suhai\\Desktop\\alarmproject\\mixkit-retro-game-emergency-alarm-1000.wav";

        while(alarmTime == null){
            try{
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + (alarmTime));
                
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid format. please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();



    }

{




    }

    
}
