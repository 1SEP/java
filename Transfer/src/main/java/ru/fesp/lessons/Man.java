package ru.fesp.lessons;

import com.google.common.base.MoreObjects;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Man extends Human implements Transable{

    public Man(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I'm Man , age", getAge())
                .add("name", getName())
                .toString();
    }

    public Woman trans(){
        return new Woman(this.getAge(), this.getName());
    }
}
