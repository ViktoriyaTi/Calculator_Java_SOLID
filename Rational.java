public class Rational {
    private long numerator;// числитель
    private long denominator;// знаменатель

    public Rational() {

    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenomimator() {
        return denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}
