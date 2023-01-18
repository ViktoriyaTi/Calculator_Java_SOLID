public class Calculator {
    long numerator = 0, denominator = 1;
    long gcdResult = 1;

    public long gcd(long a, long b) {
        long temp = 1;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while (temp != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public long getGcd(Rational n) {
        return gcd(n.getNumerator(), n.getDenomimator());
    }

    public long getNum(Rational n) {
        long numeratorOne = n.getNumerator() / getGcd(n);
        return numeratorOne;
    }

    public long getDenom(Rational n) {
        long denominatorOne = n.getDenomimator() / getGcd(n);
        return denominatorOne;
    }

    public Rational sum(Rational one, Rational two) {
        numerator = getNum(one) * getDenom(two) + getNum(two) * getDenom(one);
        denominator = getDenom(one) * getDenom(two);
        gcdResult = gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }

    public Rational subtract(Rational one, Rational two) {
        numerator = getNum(one) * getDenom(two) - getNum(two) * getDenom(one);
        denominator = getDenom(one) * getDenom(two);
        long tempNum = numerator > 0 ? numerator : -numerator;
        gcdResult = gcd(tempNum, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }

    public Rational multiply(Rational one, Rational two) {
        numerator = getNum(one) * getNum(two);
        denominator = getDenom(one) * getDenom(two);
        gcdResult = gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }

    public Rational divide(Rational one, Rational two) {
        numerator = getNum(one) * getDenom(two);
        denominator = getNum(two) * getDenom(one);
        gcdResult = gcd(numerator, denominator);
        numerator /= gcdResult;
        denominator /= gcdResult;
        return new Rational(numerator, denominator);
    }
}