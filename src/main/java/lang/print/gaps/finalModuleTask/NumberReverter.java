package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        var hundreds = number / 100 % 10;
        var tens = number / 10 % 10;
        var ones = number % 10;

        var reversed = 100 * ones + 10 * tens + hundreds;

        System.out.println(reversed);
    }
}
