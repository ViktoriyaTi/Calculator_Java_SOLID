public class Div extends ArithmeticOperation {
    Calculations calc = new Calculations();

    public Rational divide(Rational one, Rational two) {
        numerator = calc.getNum(one) * calc.getDenom(two);
        denominator = calc.getNum(two) * calc.getDenom(one);
        gcdResult = calc.gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }
}
