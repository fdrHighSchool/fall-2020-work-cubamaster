import java.io.*;
import java.net.URI;
import java.util.*;
public class day_1_2019 {
    public static void main(String[] args) {
        int fuel = 0;
        try {
            Scanner scanner = new Scanner(new File("/Users/muratkhidoyatov/Desktop/APCSA/fall-2020-work-cubamaster/09-advent/2019/test.txt"));
            while (scanner.hasNext()) {
                int a = Integer.parseInt(scanner.next());
                int c = a / 3 -2;
                fuel += c;
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(fuel);


    }
}
