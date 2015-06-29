package ru.fsep.lessons.transfer;

import com.google.common.base.Objects;

/**
 * Created by Надежда on 26.06.2015.
 */
public class Man  extends Human implements Transable {
     public Man(int age, String name){
        super(age, name);
    }

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public Woman trans(){
        return new Woman(this.getAge(),this.getName());
    }


}
