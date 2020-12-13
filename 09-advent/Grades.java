import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades ");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Type your grade ");
            arr[i] = scanner.nextInt();
        }
        arr = bubble_sort(arr);
        double avreage = average(arr);
        double median = median(arr);
        int mode = mode(arr, a);
        System.out.println(average(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr, a));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / (arr.length);
    }

    public static double median(int arr[]) {
        int length = arr.length;
        int middle = (length / 2);
        if (length % 2 == 0) {
            return Double.valueOf((arr[middle] + arr[middle - 1])) / 2;
        } else {
            return arr[middle];
        }
    }

    public static int mode(int[] arr, int n) {
        int maxValue = 0, maxCount = 1, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
            
        }
        return maxValue;
    }

    public static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        return arr;
    }

}
