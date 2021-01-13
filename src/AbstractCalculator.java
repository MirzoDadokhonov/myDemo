import java.util.Map;

public abstract class AbstractCalculator implements Calculator {
    protected final String x0;
    protected final String y0;
    protected int x;
    protected int y;
    protected final String op;

    protected int ans;

    public AbstractCalculator(String x0, String y0, String op) { // нулевым индексом обозначил его первоначальный вид
        this.x0 = x0;
        this.y0 = y0;
        this.op = op;
    }



    public void calculate() {
        if (!(x >= 1 && x <= 10 &&
                y >= 1 && y <= 10)) {
            throw new CalculatorException("numbers are not in range 1,.., 10 !!!");
        }

        switch (op) {
            case "+" -> ans = x + y;
            case "-" -> ans = x - y;
            case "*" -> ans = x * y;
            case "/" -> {
                if (y == 0) {
                    throw new DivisionByZeroException(x);
                }
                ans = x / y;
            }
            default -> throw new InvalidOperationException(op);
        }
    }

    public abstract void printAns();
}
