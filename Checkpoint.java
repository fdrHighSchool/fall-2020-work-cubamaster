import java.util.*;
public class
Checkpoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your problem");
        String problem = scanner.nextLine();
        produceAnswer(problem);
    }
    public static double produceAnswer(String problem) {
        int plus = problem.indexOf("+");
        String x1 = problem.substring(0, plus-1);
        System.out.printf("The first fraction is %s\n", x1);
        String x2 = problem.substring(plus+2, problem.length());
        System.out.printf("The second fraction is %s\n", x2);
        return 0;
    }
}