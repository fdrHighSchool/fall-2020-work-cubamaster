import java.util.*;
public class
Checkpoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input scanner method
        System.out.println("Write your problem. If you want to stop, write quit ");
        String problem = " ";
        boolean check = true;
        while (check) {
            problem = scanner.nextLine();
            if (problem.contains("+") || problem.contains("-") || problem.contains("*") || problem.contains("/")) {
                System.out.println("OK");
                check = false;
            }
            else if (problem.equals("quit")) {
                return;
            }
            else {
                System.out.println("Your input incorrect, try again");
            }
        }
        String second = second_fraction(problem); // take second fraction as a string
        String first = first_fraction(problem);
        System.out.println(first);
        System.out.println(second);
        produceAnswer(problem);
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
    public static String  second_fraction(String problem) {
        int space = problem.indexOf(" "); // only what I use is "+" symbol
        String x2 = problem.substring(space+3, problem.length()); // second fraction
        return x2;
    } // close produceAnswer
    public static String first_fraction(String problem) {
        int space = problem.indexOf(" ");
        String x1 = problem.substring(0, space);
        return x1;
    }
    public static String produceAnswer(String problem){
        String first_fraction = first_fraction(problem);
        String second_fraction = second_fraction(problem);
        int first_whole = whole(first_fraction);
        int first_numerator = numerator(first_fraction);
        int first_denominator = denominator(first_fraction);
        int first_numerator_2 = first_whole * first_denominator + first_numerator;
        int second_whole = whole(second_fraction);
        int second_numerator = numerator(second_fraction);
        int second_denominator = denominator(second_fraction);
        int second_numerator_2 = second_whole * second_denominator + second_numerator;
        int space = problem.indexOf(" ");
        String symbol = problem.substring(space+1, space+2);
        System.out.println(symbol);
        if (symbol.equals("+")) {
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = (first_numerator_2 * second_denominator) + (second_numerator_2 * first_denominator);
            System.out.println(third_numerator + "/" + third_denominator);
        }
        if (symbol.equals("-")) {
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = (first_numerator_2 * second_denominator) - (second_numerator_2 * first_denominator);
            System.out.println(third_numerator + "/" + third_denominator);
        }
        if (symbol.equals("*")) {
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = first_numerator_2 *  second_numerator_2;
            System.out.println(third_numerator + "/" + third_denominator);
        }
        if (symbol.equals(":")) {
            int third_denominator = first_denominator * second_numerator_2;
            int third_numerator = first_numerator_2 *  second_denominator;
            System.out.println(third_numerator + "/" + third_denominator);
        }
        return "Hello";
    }
    /*
    whole/numerator/denominator is functions from checkpoint#2
     */
    public static int whole(String fraction) {
        int underscore = fraction.indexOf("_");
        int division = fraction.indexOf("/");
        String x1;
        if (underscore == -1) {
            x1 = fraction.substring(0, fraction.length());
            if (division != -1) {
                x1 = "0";
                return Integer.parseInt(x1);
            }
            return Integer.parseInt(x1);
        }
        x1 = fraction.substring(0, underscore);
        return Integer.parseInt(x1);
    }// close whole
    public static int numerator(String fraction) {
        int underscore = fraction.indexOf("_");
        int division = fraction.indexOf("/");
        String x2;
        if (underscore == -1 && division == -1 ) {
            x2 = "0";
            return Integer.parseInt(x2);
        }
        if (underscore == -1) {
            x2 = fraction.substring(0, division);
            return Integer.parseInt(x2);
        }
        x2 = fraction.substring(underscore + 1, division);
        return Integer.parseInt(x2);
    }// close numeration
    public static int denominator(String fraction) {
        int division = fraction.indexOf("/");
        String x3;
        if (division == -1) {
            x3 = "1";
            return Integer.parseInt(x3);
        }
        x3 = fraction.substring(division+1, fraction.length());
        return Integer.parseInt(x3);
    }// close denominator
}// close class