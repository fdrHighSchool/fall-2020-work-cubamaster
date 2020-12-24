import java.util.*;
public class Grades2d
{
    public static void main(String[] args) { // open main method
       int [][] arr =new int [30][10];
       arr = fillarray(arr);
       System.out.println("total average " + average(arr));
       top_average(arr);
    } // close main method

    /**
     * filling array for random integers from 55 to 100
     * @param arr our empty 2d array
     * @return new filled array
     */
    public static int [][] fillarray (int [][] arr) { // open fill array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (100 - 55 + 1) + 55);
            }
        }
        return arr;
    } // close fill array


    /**
     * get average of all students grades
     * @param arr - out not-empty 2d array
     * @return average integer
     */
    public static double average (int [][] arr) { // open average
        double total = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
                c++;
            }
        }
        return total / c;
    } // close average


    /**
     * print every student's GPA and sout first two highest GPA
     * @param arr
     * @return
     */
    public static double top_average (int [][] arr) { // open top_average
        double first = 0; // create first highest average
        double second = 0; // create second highest average
        for (int i = 0; i < arr.length; i++) {
            double total = 0;
            int c = 0;
            double current_average;
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
                c++;
            }
            current_average = total / c;
            System.out.println("Student" + i + " have GPA: " + current_average);
            if (current_average > second) {
                if (current_average > first) {
                    second = first;
                    first = current_average;
                }
                else {
                    second = current_average;
                }
            }
        }
        System.out.println("The top average is " + first);
        System.out.println("The second highest average is " + second);
        return 0;
    } // close top_average
}

