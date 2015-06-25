package ru.fsep.lessons.equals_hashcode;

/**
 * Created by Надежда on 25.06.2015.
 */
public class Program {
    public static void main(String[] args) {

        BlackBox blackBox1 = new BlackBox(1,2);
        BlackBox blackBox2 = new BlackBox(1,2);

        System.out.println(blackBox1.hashCode());
        System.out.println(blackBox2.hashCode());

        System.out.println(blackBox1.equals(blackBox2));

        System.out.println(blackBox1.toString());
    }
}
