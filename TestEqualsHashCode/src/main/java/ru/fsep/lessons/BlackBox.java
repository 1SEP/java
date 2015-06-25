package ru.fsep.lessons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class BlackBox {
    int varA;
    int varB;

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("varA", varA)
                .add("varB", varB)
                .toString();
    }
}
