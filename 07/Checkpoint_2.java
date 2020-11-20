import java.util.*;
public class
Checkpoin_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input scanner method
        System.out.println("Write your problem");
        String problem = scanner.nextLine(); // take problem from console
        String second = produceAnswer(problem); // take second fraction as a string
        //System.out.println(second); // sout second fraction
        System.out.println("Whole: " + whole(second));
        System.out.println("Numeration: "+ numerator(second));
        System.out.println("Denominator: " + denominator(second));
    }// close main
    /*
    * main - main function
    * produceAnswer - Function where I determine first and second fraction
    * x1- first one
    * x2 - second
     */
    /*
    produceAnswer is function which take second fraction as String
     */
    public static String  produceAnswer(String problem) {
        int plus = problem.indexOf("+"); // only what I use is "+" symbol
        String x1 = problem.substring(0, plus-1); // first fraction
        String x2 = problem.substring(plus+2, problem.length()); // second fraction
        return x2;
    } // close produceAnswer
    /*
    produceAnswer1 is just my test function
     */
    public static String produceAnswer1(String second_fraction) {
        int underscore = second_fraction.indexOf("_");
        int division = second_fraction.indexOf("/");
        String x1 = second_fraction.substring(0, underscore);
        System.out.println(x1);
        String x2 = second_fraction.substring(underscore + 1, division);
        System.out.println(x2);
        String x3 = second_fraction.substring(division+1, second_fraction.length());
        System.out.println(x3);
        return x1;
    }// close produce answer 1

    /*
    whole/numerator/denominator is functions from checkpoint#2
     */
    public static String whole(String fraction) {
        int underscore = fraction.indexOf("_");
        String x1 = fraction.substring(0, underscore);
        return x1;
    }// close whole
    public static String numerator(String fraction) {
        int underscore = fraction.indexOf("_");
        int division = fraction.indexOf("/");
        String x2 = fraction.substring(underscore + 1, division);
        return x2;
    }// close numeration
    public static String denominator(String fraction) {
        int division = fraction.indexOf("/");
        String x3 = fraction.substring(division+1, fraction.length());
        return x3;
    }// close denominator
}// close class