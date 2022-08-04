package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int i = number / 100;
        int i1 = (number / 10) % 10;
        int i2 = number % 10;
        System.out.println(i2 * 100 + i1 * 10 + i);
    }
}
