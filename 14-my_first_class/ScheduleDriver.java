import java.util.Scanner;

public class ScheduleDriver {
    public static void main(String[] args) {
        Schedule schedule1 = new Schedule();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < schedule1.getSubjects().length; i++) {
            System.out.println("Please write your period " + (i+1) + " subject");
            String subject = scanner.nextLine();
            schedule1.addSubject(subject);
        }
        schedule1.getSubjectsSchedule();


        for (int i = 0; i < schedule1.getBell().length; i++) {
            System.out.println("Please write your period " + (i+1) + " bell");
            String subject = scanner.nextLine();
            schedule1.addBell(subject);
        }
        schedule1.getBellSchedules();
    }
}
