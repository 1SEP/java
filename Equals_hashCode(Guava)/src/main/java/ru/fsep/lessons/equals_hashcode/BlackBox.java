package ru.fsep.lessons.equals_hashcode;


import com.google.common.base.*;

/**
 * Created by Надежда on 25.06.2015.
 */
public class BlackBox {
    int varA, varB;

    public BlackBox(int varA,int varB) {
        this.varA = varA;
        this.varB = varB;
    }



    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BlackBox other = (BlackBox) obj;
        return Objects.equal(this.varA, other.varB)
                && Objects.equal(this.varA, other.varB);
    }

        @Override
                public int hashCode(){
            return Objects.hashCode(varA,varB);


        }

          @Override
    public String toString(){

              return MoreObjects.toStringHelper(this).add("varA",varA).add("varB",varB).toString();
          }

}


