import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by ramil on 26.06.2015.
 */
public class BlackBox {

    int varA = 1;
    int varB = 2;
    String test = "";

    BlackBox(int varA , int varB){
        this.varA = varA;
        this.varB = varB;
    }
    @Override
    public int hashCode(){
        final int prime = 30;
        int result = 15;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return  true;
        if(obj==null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        BlackBox that = (BlackBox)obj;
        return Objects.equal(this.varA,that.varA) && Objects.equal(this.varB,that.varB);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("test", test).toString();
    }
}
