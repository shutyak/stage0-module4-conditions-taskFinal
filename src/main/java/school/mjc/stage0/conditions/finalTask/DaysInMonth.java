package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    private boolean isALeap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }

    public void printDays(int year, int month) {
        switch (month) {
            default:
                System.out.println("invalid date");
                break;
            case 2:
                if (isALeap(year)) System.out.println(29);
                else System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
        }

    }
}
