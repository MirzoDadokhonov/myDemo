public class IncorrectNumberException extends CalculatorException {
    public IncorrectNumberException(boolean type, String num) {
        super("No such" + (type ? " roman " : " arabian ") +"number in range 1,.., 10: " + num + " !!!");
    }
}
