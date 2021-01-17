import java.util.ArrayList;
import java.util.Scanner;

public class MyCalculator {
    public static int x;
    public static int y;
    public static String op;
    public static String x0;
    public static String y0;


    public static void main(String[] args) throws CalculatorException {
        Scanner sc = new Scanner(System.in);
        String[] args2 = sc.nextLine().split(" ");

        if (args2.length != 3) {
            throw new CalculatorException("Incorrect amount of arguments given!!!");
        } else {
            x0 = args2[0];
            y0 = args2[2];
            op = args2[1];
            Calculator calculator = checkData();
            calculator.calculate();
            calculator.printAns();
        }
    }
    protected static Calculator checkData() {
        try {
            x = (int) Double.parseDouble(x0);
            try {
                y = (int) Double.parseDouble(y0);
                return new ArabianNumsCalculator(x0, y0, op);
            } catch (NumberFormatException e2) {
                throw new DifferentNumTypesException(x0, y0);
            }
        } catch (NumberFormatException e) {
            try {
                y = (int) Double.parseDouble(y0);
                throw new DifferentNumTypesException(x0, y0);
            } catch (NumberFormatException e1) {
                return new RomanNumsCalculator(x0, y0, op);
            }
        }
    }
}
