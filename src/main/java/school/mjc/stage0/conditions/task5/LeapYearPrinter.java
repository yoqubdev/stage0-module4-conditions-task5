package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;
        if (!is_leap_year)
            System.out.println("leap");
        else
            System.out.println("not leap");
    }
    }

