/**
 * Created by Rauf on 29.06.2015.
 */
public class Transfer {

    public Man trans(Woman woman){
        return new Man(woman.getAge(),woman.getName());
    }

    public Woman trans(Man man){
        return new Woman(man.getAge(),man.getName());
    }
}
