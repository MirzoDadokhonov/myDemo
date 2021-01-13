public class DivisionByZeroException extends CalculatorException {
    public DivisionByZeroException(int x) {
        super("Cannot divide " + x + " by Zero!!!");
    }
}
