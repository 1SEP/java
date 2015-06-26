package ru.fesp.lessons;

import sun.java2d.pipe.AATextRenderer;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Main {
    public static void main(String ... args){
        Woman woman = new Woman(44, "Olga");

        System.out.println(woman.toString(woman.getAge(), woman.getName()));

        Man man = new Man (30, "Mark");

        System.out.println(man.toString(man.getAge(), man.getName()));

        System.out.println(new Transfer().trans(woman));
        System.out.println(new Transfer().trans(man));
    }
}
