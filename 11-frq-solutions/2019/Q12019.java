public class Q12019 {
    public static void main(String[] args) {

    }

    public static int  NumberOfLeapYears (int first_year, int last_year) {
        int n = 0;
        for (int i = first_year; i <= last_year; i++) {
            if (isLeapYear(i)) {
                n++;
            }
        }
        return n;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        else if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
