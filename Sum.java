public class Sum extends ArithmeticOperation {
    Calculations calc = new Calculations();

    public Rational getSum(Rational one, Rational two) {
        numerator = calc.getNum(one) * calc.getDenom(two) + calc.getNum(two) * calc.getDenom(one);
        denominator = calc.getDenom(one) * calc.getDenom(two);
        gcdResult = calc.gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }
}
