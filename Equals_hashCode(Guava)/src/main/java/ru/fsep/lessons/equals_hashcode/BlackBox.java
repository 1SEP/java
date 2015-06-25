package ru.fsep.lessons.equals_hashcode;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by Надежда on 25.06.2015.
 */
public class BlackBox {
    public static final int MIN_VARA = 0;
    public static final int MIN_VARB = 1;
    int varA, varB;

    public BlackBox(int varA,int varB) {
        if( varA > MIN_VARA && varB > MIN_VARB)
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("varA", varA)
                .add("varB", varB)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(varA, varB);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final BlackBox other = (BlackBox) obj;
        return Objects.equal(this.varA, other.varA)
                && Objects.equal(this.varB, other.varB);
    }


}


