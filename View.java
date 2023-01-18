import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    long denoOne;
    long denoTwo;
    String s1 = "Введите числитель и знаменатель первого числа";
    String s2 = "Введите числитель и знаменатель второго числа";

    public int menu() {
        System.out.println(
                "Введите число для выбора операции, 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int value = input.nextInt();
        while (4 < value || value < 1) {
            System.out.println(
                    "Введено неверное значение! Введите число от 1 до 4!");
            value = input.nextInt();
        }
        return value;
    }

    public void error() {
        System.out.println(
                "Введено неверное значение! Повторите попытку снова!");

    }

    public void viewNonZeroDeno() {
        System.out.println(
                "Знаменатель не может быть равен 0,введите знаменатель первого числа повторно");

    }

    public Rational getValueNumber(String s) {
        System.out.println(s);
        long num = input.nextLong();
        long deno = input.nextLong();
        while (deno == 0) {
            viewNonZeroDeno();
            deno = input.nextLong();
        }
        return new Rational(num, deno);
    }

    public void printSum(Rational a, Rational b, Rational c) {
        System.out.println(a + " + " + b + " = " + c);

    }

    public void printSub(Rational a, Rational b, Rational c) {
        System.out.println(a + " - " + b + " = " + c);

    }

    public void printMult(Rational a, Rational b, Rational c) {
        System.out.println(a + " * " + b + " = " + c);

    }

    public void printDiv(Rational a, Rational b, Rational c) {
        System.out.println(a + " / " + b + " = " + c);

    }

}
