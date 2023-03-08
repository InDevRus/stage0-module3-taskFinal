package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        var digit1 = number / 1000 % 100;
        var digit2 = number / 100 % 10;
        var digit3 = number / 10 % 10;
        var digit4 = number % 10;

        var digitSum = digit1 + digit2 + digit3 + digit4;

        System.out.println(digitSum);
    }
}
