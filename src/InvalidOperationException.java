public class InvalidOperationException extends CalculatorException {
    public InvalidOperationException(String op) {
        super("Could not calculate operation: " + op);
    }
}
