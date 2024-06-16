package com.eizenheim.hmt1m2p1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        int nsd = nsd(numerator, denominator);
        this.numerator = numerator / nsd;
        this.denominator = denominator / nsd;
    }

    public Fraction() {
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return  numerator +
                "/" + denominator;
    }

    public int nsd (int first, int second) {
        return second == 0 ? first : nsd(second,first%second);
    }

    public Fraction sum (Fraction fraction1, Fraction fraction2) {
        int nsk = (fraction1.denominator*fraction2.denominator)/nsd(fraction1.denominator, fraction2.denominator);
        int newNumerator = (nsk/fraction1.denominator*fraction1.numerator) + (nsk/fraction2.denominator*fraction2.numerator);
        int newDenominator = nsk;
        Fraction res = new Fraction(newNumerator, newDenominator);
        return res;
    }

    public Fraction subtraction (Fraction fraction1, Fraction fraction2) {
        int nsk = (fraction1.denominator*fraction2.denominator)/nsd(fraction1.denominator, fraction2.denominator);
        int newNumerator = (nsk/fraction1.denominator*fraction1.numerator) - (nsk/fraction2.denominator*fraction2.numerator);
        int newDenominator = nsk;
        Fraction res = new Fraction(newNumerator, newDenominator);
        return res;
    }

    public Fraction multiplication (Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator*fraction2.numerator;
        int newDenominator = fraction1.denominator*fraction2.denominator;

        Fraction res = new Fraction(newNumerator, newDenominator);
        return res;
    }

    public Fraction division (Fraction fraction1, Fraction fraction2) {
        int newNumerator = fraction1.numerator * fraction2.denominator;
        int newDenominator = fraction1.denominator * fraction2.numerator;

        Fraction res = new Fraction(newNumerator, newDenominator);
        return res;
    }
}
