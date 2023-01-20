public class Sub extends ArithmeticOperation {
    Calculations calc = new Calculations();

    public Rational subtract(Rational one, Rational two) {
        numerator = calc.getNum(one) * calc.getDenom(two) - calc.getNum(two) * calc.getDenom(one);
        denominator = calc.getDenom(one) * calc.getDenom(two);
        long tempNum = numerator > 0 ? numerator : -numerator;
        gcdResult = calc.gcd(tempNum, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }
}
