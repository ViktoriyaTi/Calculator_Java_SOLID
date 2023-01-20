public class Calculations {
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

}