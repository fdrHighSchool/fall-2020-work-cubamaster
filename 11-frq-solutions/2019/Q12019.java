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

    private static int firstDayOfYear(int year) {
        return 0;
    }

    private static int dayOfYear(int day, int month, int year) {
        return 0;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int first = firstDayOfYear(year);
        int current_date = dayOfYear(month, day, year) - 1;
        return (first + current_date) % 7;
    }

}
