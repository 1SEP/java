package ru.fsap.lessons;

/**
 * Created by user on 25.06.2015.
 */
public class Program {
    public static void main(String[] args) {
        BlackBox box1 = new BlackBox(1, 2);
        BlackBox box2 = new BlackBox(1, 2);

        System.out.println(box1.hashCode());

        System.out.println(box1.equals(box2));

        System.out.println(box1.toString());
    }
}
