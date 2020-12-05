import java.util.*;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades ");
        int a = scanner.nextInt();
        int [] arr = new int[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Type your grade ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(average(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr, a));
    }

    public static double average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/(arr.length);
    }

    public static int median (int arr[]) {
        int length = arr.length;
        if (length % 2 == 0) {
            return arr[length / 2 -1];
        }
        else {
            return arr[(length + 1) / 2 -1];
        }
    }

    static int mode(int arr[],int n) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < n; ++j) {
                if (arr[j] == arr[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}