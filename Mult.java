public class Mult extends ArithmeticOperation {
    Calculations calc = new Calculations();

    public Rational multiply(Rational one, Rational two) {
        numerator = calc.getNum(one) * calc.getNum(two);
        denominator = calc.getDenom(one) * calc.getDenom(two);
        gcdResult = calc.gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }
}
