import javax.sound.midi.Soundbank;
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
            String second_part = second_part(problem);
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
    public static String  second_part(String problem) { // open second_fraction
        int space = problem.indexOf(" ");
        String x2 = problem.substring(space + 3, problem.length());
        return x2;
    } // closer second_fraction

    public static String second_fraction(String second_part) {
        int space = second_part.indexOf(" ");
        String second = second_part.substring(0, space);
        return second;
    }

    public static String third_fraction (String second_part) {
        int space = second_part.indexOf(" ");
        String third = second_part.substring(space + 3, second_part.length());
        return third;
    }

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
        String second_fraction = second_fraction(second_part(problem));
        String third_fraction = third_fraction(second_part(problem));
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
            second_numerator_2 = second_whole * second_denominator + second_numerator;
        }
        int third_whole = whole(third_fraction);
        int third_numerator = numerator(third_fraction);
        int third_denominator = denominator(third_fraction);
        int third_numerator_2 = 0;
        if (third_whole < 0) {
            third_whole = third_whole * -1;
            third_numerator_2 = (third_whole * third_denominator + third_numerator) * -1;
        }
        else if (third_whole >= 0) {
            third_numerator_2 = (third_whole * third_denominator + third_numerator);
        }
        int space = problem.indexOf(" ");
        String symbol = problem.substring(space+1, space+2);
        System.out.println(symbol);

        int space_2 = second_part(problem).indexOf(" ");
        String symbol_2 = second_part(problem).substring(space_2 + 1, space_2 + 2);
        System.out.println(symbol_2);

        int final_numerator_1 = 0;
        int final_denominator_1 = 0;
        /**
         condition if symbol is +
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/
        if (symbol.equals("+")) { // open + condition
            final_numerator_1 = plus_numerator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
            final_denominator_1 = plus_denominator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);

        } // close + condition



        /**
         condition if symbol is -
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/
        if (symbol.equals("-")) { // open - condition
            final_numerator_1 = minus_numerator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
            final_denominator_1 = minus_denominator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
        }// close - condition



        /**
         condition if symbol is *
         third_numerator - final fraction numerator
         third_denominator - final fraction denominator
         third_ whole - final fraction  whole
         **/

        if (symbol.equals("*")) { // open * condition
            final_numerator_1 = multi_numerator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
            final_denominator_1 = multi_denominator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
        } // close * condition



        /**
         * condition if symbol is :
         * third_numerator - final fraction numerator
         * third_denominator - final fraction denominator
         * third_ whole - final fraction  whole
         */

        if (symbol.equals(":")) { // open : condition
            final_numerator_1 = divide_numerator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
            final_denominator_1 = divide_denominator(first_numerator_2, first_denominator, second_numerator_2, second_denominator);
        } // close : condition

        if (symbol_2.equals("+")) {
            int final_numerator_2 = plus_numerator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);
            int final_denominator_2 = plus_denominator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);

            int final_whole_2 = mix(final_numerator_2, final_denominator_2); //getting whole number
            final_numerator_2 = final_numerator_2 - final_denominator_2 * final_whole_2; // rewrite numerator
            if (final_denominator_2 == 1) { // checking if fractions is whole number
                System.out.println(final_whole_2);
                return "Hello";
            }
            if (final_numerator_2 == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (final_whole_2 == 0) { //checking if fraction is non mixed number
                System.out.println(final_numerator_2 + "/" + final_denominator_2);
                return "hello";
            }
            if (final_numerator_2 < 0) { // if fraction is negative I have to rewrite numerator
                final_numerator_2 = final_numerator_2 * -1;
            }
            System.out.println(final_whole_2 + "_" + final_numerator_2 + "/" + final_denominator_2);
        }

        if (symbol_2.equals("-")) {
            int final_numerator_2 = minus_numerator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);
            int final_denominator_2 = minus_denominator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);

            int final_whole_2 = mix(final_numerator_2, final_denominator_2); //getting whole number
            final_numerator_2 = final_numerator_2 - final_denominator_2 * final_whole_2; // rewrite numerator
            if (final_denominator_2 == 1) { // checking if fractions is whole number
                System.out.println(final_whole_2);
                return "Hello";
            }
            if (final_numerator_2 == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (final_whole_2 == 0) { //checking if fraction is non mixed number
                System.out.println(final_numerator_2 + "/" + final_denominator_2);
                return "hello";
            }
            if (final_numerator_2 < 0) { // if fraction is negative I have to rewrite numerator
                final_numerator_2 = final_numerator_2 * -1;
            }
            System.out.println(final_whole_2 + "_" + final_numerator_2 + "/" + final_denominator_2);
        }


        if (symbol_2.equals("*")) {
            int final_numerator_2 = multi_numerator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);
            int final_denominator_2 = multi_denominator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);

            int final_whole_2 = mix(final_numerator_2, final_denominator_2); //getting whole number
            final_numerator_2 = final_numerator_2 - final_denominator_2 * final_whole_2; // rewrite numerator
            if (final_denominator_2 == 1) { // checking if fractions is whole number
                System.out.println(final_whole_2);
                return "Hello";
            }
            if (final_numerator_2 == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (final_whole_2 == 0) { //checking if fraction is non mixed number
                System.out.println(final_numerator_2 + "/" + final_denominator_2);
                return "hello";
            }
            if (final_numerator_2 < 0) { // if fraction is negative I have to rewrite numerator
                final_numerator_2 = final_numerator_2 * -1;
            }
            System.out.println(final_whole_2 + "_" + final_numerator_2 + "/" + final_denominator_2);
        }

        if (symbol_2.equals(":")) {
            int final_numerator_2 = divide_numerator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);
            int final_denominator_2 = divide_denominator(final_numerator_1, final_denominator_1, third_numerator_2, third_denominator);

            int final_whole_2 = mix(final_numerator_2, final_denominator_2); //getting whole number
            final_numerator_2 = final_numerator_2 - final_denominator_2 * final_whole_2; // rewrite numerator
            if (final_denominator_2 == 1) { // checking if fractions is whole number
                System.out.println(final_whole_2);
                return "Hello";
            }
            if (final_numerator_2 == 0) { // checking if fraction equal zero
                System.out.println("0");
                return "hello";
            }
            if (final_whole_2 == 0) { //checking if fraction is non mixed number
                System.out.println(final_numerator_2 + "/" + final_denominator_2);
                return "hello";
            }
            if (final_numerator_2 < 0) { // if fraction is negative I have to rewrite numerator
                final_numerator_2 = final_numerator_2 * -1;
            }
            System.out.println(final_whole_2 + "_" + final_numerator_2 + "/" + final_denominator_2);
        }

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

    public static int plus_numerator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = (first_numerator_2 * second_denominator) + (second_numerator_2 * first_denominator);
        reduce(final_numerator_1, final_denominator_1);
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        return  final_numerator_1;
    }
    public static int plus_denominator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = (first_numerator_2 * second_denominator) + (second_numerator_2 * first_denominator);
        reduce(final_numerator_1, final_denominator_1);
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return  final_denominator_1;
    }




    public static int minus_numerator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = (first_numerator_2 * second_denominator) - (second_numerator_2 * first_denominator);
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return  final_numerator_1;
    }
    public static int minus_denominator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = (first_numerator_2 * second_denominator) - (second_numerator_2 * first_denominator);
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return  final_denominator_1;
    }

    public static int multi_numerator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = first_numerator_2 *  second_numerator_2;
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return final_numerator_1;
    }
    public static int multi_denominator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_denominator;
        int final_numerator_1 = first_numerator_2 *  second_numerator_2;
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return final_denominator_1;
    }

    public static int divide_numerator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_numerator_2;
        int final_numerator_1 = first_numerator_2 *  second_denominator;
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return final_numerator_1;
    }

    public static int divide_denominator (int first_numerator_2, int first_denominator, int second_numerator_2, int second_denominator) {
        int final_denominator_1 = first_denominator * second_numerator_2;
        int final_numerator_1 = first_numerator_2 *  second_denominator;
        int a = final_numerator_1;
        int b = final_denominator_1;
        final_numerator_1 = final_numerator_1 / reduce(a, b); // reduce numerator
        final_denominator_1 = final_denominator_1 / reduce(a, b); // reduce denominator
        return final_denominator_1;
    }
}// close class
