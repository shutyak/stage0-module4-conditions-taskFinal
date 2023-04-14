package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result;
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        } else {
            result = dividend / divider;
        }
        int product = result * divider;
        if (product == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}
