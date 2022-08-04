package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        if (number < 0){
            System.out.println(false);
         } else if (number == 0) {
            System.out.println(0);
        } else{
            System.out.println(true);
        }
    }
}
