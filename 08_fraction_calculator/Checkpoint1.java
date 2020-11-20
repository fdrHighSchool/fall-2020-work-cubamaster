import java.util.*;
public class
Checkpoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your problem");
        String problem = scanner.nextLine();
        produceAnswer(problem);
        String second = produceAnswer(problem);
        System.out.println(second);
    }
    /*
     *
     *
     *
     *
     *
     */

    public static String  produceAnswer(String problem) {
        int plus = problem.indexOf("+");
        String x1 = problem.substring(0, plus-1);
        String x2 = problem.substring(plus+2, problem.length());
        return x2;
    }
}