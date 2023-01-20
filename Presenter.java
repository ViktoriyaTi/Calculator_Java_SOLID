import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Presenter {
    View view = new View();
    Calculations calc = new Calculations();
    Sum sum = new Sum();
    Sub sub = new Sub();
    Mult multy = new Mult();
    Div div = new Div();
    Scanner in = new Scanner(System.in);
    Logger logger;
    FileHandler fh;
    SimpleFormatter sFormat;

    public void buttonClick() throws IOException {
        logger = Logger.getLogger("CalculatorLog");
        fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int choice = view.menu();
        Rational inputOne = view.getValueNumber(view.s1);
        Rational inputTwo = view.getValueNumber(view.s2);
        if (choice == 1) {
            this.logger.log(Level.INFO, "Выбрана операция суммирования");
            Rational resultSum = sum.getSum(inputOne, inputTwo);
            view.printSum(inputOne, inputTwo, resultSum);
            // this.logger.log(Level.INFO, "Результат суммирования = " + resultSum);

        } else if (choice == 2) {
            this.logger.log(Level.INFO, "Выбрана операция вычитания");
            Rational resultSub = sub.subtract(inputOne, inputTwo);
            view.printSub(inputOne, inputTwo, resultSub);

        } else if (choice == 3) {
            this.logger.log(Level.INFO, "Выбрана операция умножения");
            Rational resultMult = multy.multiply(inputOne, inputTwo);
            view.printMult(inputOne, inputTwo, resultMult);
        } else {
            this.logger.log(Level.INFO, "Выбрана операция деления");
            Rational resultDiv = div.divide(inputOne, inputTwo);
            view.printDiv(inputOne, inputTwo, resultDiv);

        }
    }
}
