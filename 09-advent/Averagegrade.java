import java.util.*;

public class Averagegrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades ");
        int a = scanner.nextInt();
        int [] arr = new int[a];
        double sum = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Type your grade ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println(sum/a);
    }
}