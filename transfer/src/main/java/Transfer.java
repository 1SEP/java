/**
 * Created by Rauf on 29.06.2015.
 */
public class Transfer {

    public Human trans(Human human){

        if(human instanceof Man){
            return new Woman(human.getAge(),human.getName());
        }else if(human instanceof Woman){
            return new Man(human.getAge(),human.getName());
        }else throw  new IllegalArgumentException("Your object isn't human");

    }

    public void transAll(Transable[] transables){
        for(Transable t:transables){
            t=t.trans( (Human) t);
        }
    }

}
