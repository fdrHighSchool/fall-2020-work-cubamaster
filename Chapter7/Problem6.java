import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n number");
        int n = scanner.nextInt();
        System.out.println("Write size of array");
        int size = 10;
        size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Write a number");
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean arePrimeFactors(int arr[], int n) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    return false;
                }
            }
            product *= arr[i];
        }
        if (product == n) {
            return true;
        }
        return false;
    }

}
