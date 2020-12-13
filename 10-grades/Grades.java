import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades ");
        int a = scanner.nextInt(); // taking number of grades
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) { // fill our array of grades
            System.out.println("Type your grade ");
            arr[i] = scanner.nextInt();
        } // close array for loop
        arr = bubble_sort(arr);
        /**
         * sout every value
         */
        System.out.println(average(arr));
        System.out.println(median(arr));
        if (mode(arr, a) == -404) { // two cases if there is no mode 
            System.out.println("No mode");
        }
        else {
            System.out.println(mode(arr, a));
        }
    }

    /**
     * geting average grade
     * @param arr our set of grades
     * @return - return average
     */
    public static double average(int[] arr) { // open average
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / (arr.length);
    } // close average

    /**
     * getting median grade
     * @param arr our set of grades
     * @return - median value
     */
    public static double median(int arr[]) { // open median
        int length = arr.length;
        int middle = (length / 2);
        if (length % 2 == 0) {
            return Double.valueOf((arr[middle] + arr[middle - 1])) / 2;
        } else {
            return arr[middle];
        }
    } // close median

    /**
     *
     * @param arr - our set of grades
     * @param n - length array
     * @return - median value
     */
    public static int mode(int[] arr, int n) { // open mode
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) { // if two numbers the same 
                    count++;
                }

                if (count > maxCount) { // compare with previous counts 
                    maxCount = count;
                    maxValue = arr[i];
                }
            }
        }
        if (maxCount == 1) { // case if there is no mode 
            return -404;
        }
        return maxValue;
    } // close mod

    /**
     * sorting array 
     * @param arr - out set of grades 
     * @return - new array 
     */
    public static int[] bubble_sort(int[] arr) { // open bubble_sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) { // compare two numbers 
                    //if first more then second
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    } // close bubble_sort

}
