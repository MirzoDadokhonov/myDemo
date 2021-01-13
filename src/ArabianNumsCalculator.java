public class ArabianNumsCalculator extends AbstractCalculator {

    public ArabianNumsCalculator(String x0, String y0, String op) {
        super(x0, y0, op);
        try {
            x = Integer.parseInt(x0);
            try {
                y = Integer.parseInt(y0);
            } catch (NumberFormatException e1) {
                throw new IncorrectNumberException(false, y0);
            }
        } catch (NumberFormatException e1) {
            throw new IncorrectNumberException(false, x0);
        }

        // то есть у меня 1.0 не считается правильным арабским числом, как и надо
    }

    @Override
    public void printAns() {
        System.out.println(ans);
    }

}
