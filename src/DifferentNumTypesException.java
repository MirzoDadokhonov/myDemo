public class DifferentNumTypesException extends CalculatorException {
    public DifferentNumTypesException(Object x, Object y) {
        super(x.toString() + " and " + y.toString() + " are in different types");
    }
}
