/* ***************************************************************************
This is a comment about the NumberOfDaysInMonth class/methods.
*************************************************************************** */

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if ((year < 1) || (year > 9999)) {
            return false;
        } else return ((year % 4 == 0) && year % 100 != 0)
                || ((year % 100 == 0) && (year % 400 == 0));
    }
    public static int getDaysInMonth(int month, int year) {
        //
        if ((month < 1 || month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        } else if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (month == 1) {
            return 31;
        } else if (month == 2) {
            return 28;
        } else if (month == 3) {
            return 31;
        } else if (month == 4) {
            return 30;
        } else if (month == 5) {
            return 31;
        } else if (month == 6) {
            return 30;
        } else if (month == 7) {
            return 31;
        } else if (month == 8) {
            return 31;
        } else if (month == 9) {
            return 30;
        } else if (month == 10) {
            return 31;
        } else if (month == 11) {
            return 30;
        } else if (month == 12) {
            return 31;
        } else {
            return -1;
        }
    }
}

