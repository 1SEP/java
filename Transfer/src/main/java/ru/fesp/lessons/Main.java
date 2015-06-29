package ru.fesp.lessons;

/**
 * Created by Ôëşğ on 26.06.2015.
 */
public class Main {
    public static void main(String ... args){
        Transable [] transable = new Human[2];
        transable[0] = new Man(12,"alex");
        transable[1] = new Woman(13,"kalex");
        for(int i=0; i<transable.length; i++)
            System.out.println(transable[i]);

        Transfer transfer = new Transfer();
        transfer.transAll(transable);
        for(int i=0; i<transable.length; i++)
            System.out.println(transable[i]);
    }
}
