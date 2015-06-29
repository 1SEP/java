package ru.fesp.lessons;
import com.google.common.base.MoreObjects;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Woman extends Human implements Transable{
    public Woman(int age, String name) {
        super(age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("I'm Woman , age", getAge())
                .add("name", getName())
                .toString();
    }

    @Override
    public Man trans(){
        return new Man(this.getAge(), this.getName());
    }
}
