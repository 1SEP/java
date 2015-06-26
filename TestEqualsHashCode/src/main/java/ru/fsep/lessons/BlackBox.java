package ru.fsep.lessons;

/**
 * Created by aspire on 26.06.2015.
 */
public class BlackBox {
    int varA;
    int varB;

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + varA;
        result = prime * result + varB;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        BlackBox that = (BlackBox) obj;
        if(varA != that.varA)
            return false;
        if(varB != that.varB)
            return false;
        return true;
    }
}
