package ru.fesp.lessons;

/**
 * Created by Ôëşğ on 26.06.2015.
 */
public class Transfer {


    public Man trans(Woman woman){
        return new Man(woman.getAge(), woman.getName());
    }
    public Woman trans (Man man){
        return new Woman(man.getAge(),man.getName());
    }
}
