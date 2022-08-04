package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int i = number / 1000;
        int i1 = number % 1000;
        int i2 = i1 / 100;
        int i3 = i1 % 100;
        int i4 = i3 / 10;
        int i5 = i3 % 10;
        System.out.println(i + i2 + i4+ i5);
    }
}
