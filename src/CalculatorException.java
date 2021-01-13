public class CalculatorException extends RuntimeException {
    public String instruction = "Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.\n" +
            "Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.\n" +
            "Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.\n" +
            "Калькулятор умеет работать только с целыми числами.\n" +
            "Калькулятор умеет работать только с арабскими или римскими цифрами одновременно, при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.\n" +
            "При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно, при вводе арабских - ответ ожидается арабскими.\n" +
            "При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.\n" +
            "При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.";
    // использовал текст на сайте как справку по использованию
    public CalculatorException(String message) {
        super(message);
        System.out.println(instruction);
    }


}
