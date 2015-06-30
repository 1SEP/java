/**
 * Created by ramil on 27.06.2015.
 */
public class Transfer {


    public Woman transfer(Man man) {
        return new Woman(man.getAge(), man.name);
    }

    public Man transfer(Woman woman) {
        return new Man(woman.getAge(), woman.name);
    }
}
