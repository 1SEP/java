/**
 * Created by Rauf on 29.06.2015.
 */
public class Transfer {

    public void transAll(Transable[] transables){
        for(Transable t : transables){
            t = t.trans();
        }
    }

}
