package lambda.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); //ошибка деления на 0. Решение: проверять второй аргумент на равенство нулю

        calc.println.accept(c);

        boolean k = calc.isPositive.test(-137);

        calc.printlnBoolean.accept(k);
    }
}