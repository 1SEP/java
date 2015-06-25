package ru.fsap.lessons;

public class Retional extends Integer {

    private int m;

    public Retional(int n, int m) {
        super(n);
        if (m != 0) {
            this.m = m;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public void show() {
        System.out.println("Value: " + n + ", " + m);
    }

    @Override
    public String toString() {
        return ("Value: " + n + ", " + m);
    }
}


