package ru.fesp.lessons;

import com.google.common.base.Objects;
import sun.java2d.pipe.AATextRenderer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Main {
    public static void main(String ... args){
//        Woman woman = new Woman(44, "Olga");
//
//        System.out.println(woman);
//
//        Man man = new Man (30, "Mark");
//        System.out.println(man);

//        System.out.println(new Transfer().trans(woman));
//        System.out.println(new Transfer().trans(man));


        Transable [] transable = new Human[2];
        transable[0] = new Man(12,"alex");
        transable[1] = new Man(13,"kalex");

        for(int i=0; i<transable.length; i++)
            System.out.println(transable[i]);

        Transfer transfer = new Transfer();
        transfer.transAll(transable);

        for(int i=0; i<transable.length; i++)
            System.out.println(transable[i]);

    }
}
