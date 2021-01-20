import java.util.Scanner;

public class ScheduleDriver {
    public static void main(String[] args) {
        Schedule schedule1 = new Schedule();
        Scanner scanner = new Scanner(System.in);

        schedule1.addSubject("AP CSA");
        schedule1.addSubject("English");
        schedule1.addSubject("History");
        schedule1.addSubject("Wellness");
        schedule1.addSubject("Art");
        schedule1.addSubject("Chemistry");
        schedule1.addSubject("Pre-calculus");
        schedule1.getSubjectsSchedule();
        System.out.println("");
        schedule1.getSubjectsSchedule();
        System.out.println("");
        schedule1.changeSubject("Physics",6);
        schedule1.getSubjectsSchedule();
        System.out.println("");


        for (int i = 0; i < schedule1.getBell().length; i++) {
            System.out.println("Please write your period " + (i+1) + " bell");
            String subject = scanner.nextLine();
            schedule1.addBell(subject);
        }
        schedule1.getBellSchedules();
    }
}
