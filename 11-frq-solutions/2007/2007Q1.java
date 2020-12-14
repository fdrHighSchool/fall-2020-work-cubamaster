import java.util.*;

public class SelfDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        if (SelfDivisorSout(number) == 100) {
            System.out.println("Not a selfDivisor");
        }
        else {
            System.out.println("This number is SelfDivisor");
        }
        System.out.println("Write a start number ");
        int start = scanner.nextInt();
        System.out.println("Write an amount number ");
        int num = scanner.nextInt();
        System.out.println(Arrays.toString(firstNumSelfDivisors(start, num)));
    }

    public static boolean isSelfDivisor(int number) {
        int current_number = number;
        int current_digit = 0;
        while (current_number > 0) {
            current_digit = current_number % 10;
            if (current_digit == 0) {
                return false;
            }
            if (number % current_digit != 0) {
                return false;
            }
            current_number = current_number / 10;
        }
        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num) {
        int [] arr = new int[num];
        int counter = 1;
        int current_number = start + 1;
        while (counter <= num) {
            if (isSelfDivisor(current_number)) {
                arr[counter-1] = SelfDivisorSout(current_number);
                counter++;
            }
            current_number++;
        }
        return arr;
    }

    public static int SelfDivisorSout (int number) {
        if (isSelfDivisor(number)) {
            return number;
        }
        return 100;
    }
}
