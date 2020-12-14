import java.util.*;
public class Problem5 {
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

    public static boolean areFactors(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
