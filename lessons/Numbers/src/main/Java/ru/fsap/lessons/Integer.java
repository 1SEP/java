package ru.fsap.lessons;

public class Integer {
    protected int n;

    public Integer(int n) {
        this.n = n;
    }

    public void setN(int n){
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void show(){
        System.out.println("Value: " + this.n);
    }

    @Override
    public String toString(){
        return ("Value: " + this.n);
    }
}


