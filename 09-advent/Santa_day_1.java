import java.util.Scanner;

public class Santa_day_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String parenthesis = " ";
        int floor = 0;
        parenthesis = scanner.nextLine();
        char a = ' ';
        for (int i = 0; i < parenthesis.length(); i++) {
            a = parenthesis.charAt(i);
            if (a == '(') {
                floor++;
            } else {
                floor--;
            }
        }
        System.out.println(floor);
    }
}
