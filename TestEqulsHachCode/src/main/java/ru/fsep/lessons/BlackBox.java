package ru.fsep.lessons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
/**
 * Created by Ôëþð on 25.06.2015.
 */
public class BlackBox {
    private int a;
    private int b;

    public BlackBox(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("a", a)
                .add("b", b)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a, b);
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
        return Objects.equal(this.a, other.a)
                && Objects.equal(this.b, other.b);
    }
}
