import java.util.*;
public class
FracCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input scanner method
        String problem = " ";
        boolean check = true;
        while (check) {
            System.out.println("Write your problem. If you want to stop, write quit ");
            problem = scanner.nextLine();
            if (problem.contains("+") || problem.contains("-") || problem.contains("*") || problem.contains(":")) {
                System.out.println("OK");
                produceAnswer(problem);
            }
            else if (problem.equals("quit")) {
                check = false;
                break;
            }
            else {
                System.out.println("Your input incorrect, try again");
            }
        }
    }// close main

    /**
     * Take second fraction from user's problem
     * @param problem
     * @return
     */
    public static String  second_fraction(String problem) { // open second_fraction
        int space = problem.indexOf(" "); // only what I use is "+" symbol
        String second = problem.substring(space+3, problem.length()); // second fraction
        return second;
    } // closer second_fraction

    /**
     * Take first fraction from user's problem
     * @param problem
     * @return
     */
    public static String first_fraction(String problem) {
        int space = problem.indexOf(" ");
        String first = problem.substring(0, space);
        return first;
    }

    /**
     * do all main things
     * @param problem
     * problem is that what we took from user (Scanner)
     * @return
     */
    public static String produceAnswer(String problem){ // open produceAnswer
        String first_fraction = first_fraction(problem);
        String second_fraction = second_fraction(problem);
        int first_whole = whole(first_fraction);
        int first_numerator = numerator(first_fraction);
        int first_denominator = denominator(first_fraction);
        int first_numerator_2 = 0;
        if (first_whole < 0) {
            first_whole = first_whole * -1;
            first_numerator_2 = (first_whole * first_denominator + first_numerator) * -1;
        }
        else if (first_whole >= 0) {
            first_numerator_2 = first_whole * first_denominator + first_numerator;
        }
        int second_whole = whole(second_fraction);
        int second_numerator = numerator(second_fraction);
        int second_denominator = denominator(second_fraction);
        int second_numerator_2 = 0;
        if (second_whole < 0) {
            second_whole = second_whole * -1;
            second_numerator_2 = (second_whole * second_denominator + second_numerator) * -1;
        }
        else if (second_whole >= 0) {
            second_numerator_2 = (second_whole * second_denominator + second_numerator);
        }
        int space = problem.indexOf(" ");
        String symbol = problem.substring(space+1, space+2);

        /**
         condition if symbol is +
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/
        if (symbol.equals("+")) { // open + condition
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = (first_numerator_2 * second_denominator) + (second_numerator_2 * first_denominator);
            reduce(third_numerator, third_denominator);
            int a = third_numerator;
            int b = third_denominator;
            third_numerator = third_numerator / reduce(a, b); // reduce numerator
            third_denominator = third_denominator / reduce(a, b); // reduce denominator
            int third_whole = mix(third_numerator, third_denominator); // getting whole number
            third_numerator = third_numerator - third_denominator * third_whole; // rewrite numerator
            if (third_denominator == 1) { // checking if fractions is whole number
                System.out.println(third_whole);
                return "Hello";
            }
            if (third_numerator == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (third_whole == 0) { // checking if fraction is non mixed number
                System.out.println(third_numerator + "/" + third_denominator);
                return "hello";
            }
            if (third_numerator < 0) { // if fraction is negative I have to rewrite numerator
                third_numerator = third_numerator * -1;
            }
            System.out.println(third_whole + "_"+third_numerator + "/" + third_denominator);
        } // close + condition

        /**
         condition if symbol is -
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/
        if (symbol.equals("-")) { // open - condition
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = (first_numerator_2 * second_denominator) - (second_numerator_2 * first_denominator);
            int a = third_numerator;
            int b = third_denominator;
            third_numerator = third_numerator / reduce(a, b); // reduce numerator
            third_denominator = third_denominator / reduce(a, b); // reduce denominator
            int third_whole = mix(third_numerator, third_denominator); //getting whole number
            third_numerator = third_numerator - third_denominator * third_whole; // rewrite numerator
            if (third_denominator == 1) { // checking if fractions is whole number
                System.out.println(third_whole);
                return "Hello";
            }
            if (third_numerator == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (third_whole == 0) { //checking if fraction is non mixed number
                System.out.println(third_numerator + "/" + third_denominator);
                return "hello";
            }
            if (third_numerator < 0) { // if fraction is negative I have to rewrite numerator
                third_numerator = third_numerator * -1;
            }
            System.out.println(third_whole + "_" + third_numerator + "/" + third_denominator);
        }// close - condition

        /**
         condition if symbol is *
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/

        if (symbol.equals("*")) { // open * condition
            int third_denominator = first_denominator * second_denominator;
            int third_numerator = first_numerator_2 *  second_numerator_2;
            int a = third_numerator;
            int b = third_denominator;
            third_numerator = third_numerator / reduce(a, b); // reduce numerator
            third_denominator = third_denominator / reduce(a, b); // reduce denominator
            int third_whole = mix(third_numerator, third_denominator); //getting whole number
            third_numerator = third_numerator - third_denominator * third_whole; // rewrite numerator
            if (third_denominator == 1) { // checking if fractions is whole number
                System.out.println(third_numerator);
                return "Hello";
            }
            if (third_numerator == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (third_whole == 0) { //checking if fraction is non mixed number
                System.out.println(third_numerator + "/" + third_denominator);
                return "hello";
            }
            if (third_numerator < 0) { // if fraction is negative I have to rewrite numerator
                third_numerator = third_numerator * -1;
            }
            System.out.println(third_whole + "_" + third_numerator + "/" + third_denominator);
        } // close * condition

        /**
         * condition if symbol is :
         * third_numerator - final fraction numerator
         * third_denominator - final fraction denominator
         * third_ whole - final fraction  whole
         */

        if (symbol.equals(":")) { // open : condition
            int third_denominator = first_denominator * second_numerator_2;
            int third_numerator = first_numerator_2 *  second_denominator;
            int a = third_numerator;
            int b = third_denominator;
            third_numerator = third_numerator / reduce(a, b); // reduce numerator
            third_denominator = third_denominator / reduce(a, b);// reduce denominator
            int third_whole = mix(third_numerator, third_denominator); //getting whole number
            third_numerator = third_numerator - third_denominator * third_whole; // rewrite numerator
            if (third_denominator == 1) { // checking if fractions is whole number
                System.out.println(third_whole);
                return "Hello";
            }
            if (third_numerator == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (third_whole == 0) { //checking if fraction is non mixed number
                System.out.println(third_numerator + "/" + third_denominator);
                return "hello";
            }
            if (third_numerator < 0) { // if fraction is negative I have to rewrite numerator
                third_numerator = third_numerator * -1;
            }
            System.out.println(third_whole + "_" + third_numerator + "/" + third_denominator);
        } // close : condition
        return "Hello";
    } // close produceAnswer

    /**
     * whole - getting whole from fraction
     * @param fraction
     * @return
     */
    public static int whole(String fraction) { //open whole
        int underscore = fraction.indexOf("_"); // getting underscore and division from fraction
        int division = fraction.indexOf("/");
        String x1;
        if (underscore == -1) { // checking if fraction is just an integer
            x1 = fraction.substring(0, fraction.length());
            if (division != -1) {  // checking if fraction not have a whole part
                x1 = "0";
                return Integer.parseInt(x1);
            }
            return Integer.parseInt(x1);
        }
        x1 = fraction.substring(0, underscore);
        return Integer.parseInt(x1);
    }// close whole

    /**
     * numerator  - getting numerator from fraction
     * @param fraction
     * @return
     */
    public static int numerator(String fraction) { //open numerator
        int underscore = fraction.indexOf("_"); // getting underscore and division from fraction
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

    /**
     * denominator  - getting denominator from fraction
     * @param fraction
     * @return
     */
    public static int denominator(String fraction) { // open denominator
        int division = fraction.indexOf("/");
        String x3;
        if (division == -1) {
            x3 = "1";
            return Integer.parseInt(x3);
        }
        x3 = fraction.substring(division+1, fraction.length());
        return Integer.parseInt(x3);
    }// close denominator
    /**
     * a - the numerator
     *  b - the denominator
     *  min - minimum number between a and b
     *  i going trough the all number between 1 and min and checking division
     * c - the maximum one of i
     **/
    public static int reduce(int a, int b) { // simplification method
        if (a < 0) {
            a = a * -1;
        }
        if (b < 0) {
            b = b * -1;
        }
        int min = Math.min(a, b);
        int c = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        return c;
    }

    /**
     * returning whole from fraction
     * @param numerator
     * @param denominator
     * @return
     */
    public static int mix(int numerator, int denominator) {
        int whole = 0;
        whole = numerator / denominator;
        return whole;
    }
}// close class