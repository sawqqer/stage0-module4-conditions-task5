package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;
        switch (year % 4) {
            case 0:
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    }
                } else {
                    isLeap = true;
                }
                break;
            default:
                isLeap = false;
                break;
        }
        if (isLeap) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
