/**
 * Created by ramil on 27.06.2015.
 */
public class Transfer {

    public void transAll(Transable transables[]) {
       for(int i = 0; i < transables.length; i++){
           transables[i] = transables[i].trans();
       }
    }

}

