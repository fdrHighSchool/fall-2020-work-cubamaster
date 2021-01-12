import java.util.Arrays;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Murat", "206907610");
        System.out.println(student1);
        //System.out.println(student1.getName() + " " + student1.getOSIS());
        student1.addGrade(100);
        student1.addGrade(90);
        System.out.println(student1.getGrades());
        System.out.println(student1.calculateAverage());

    }
}
