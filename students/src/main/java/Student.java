/**
 * Created by Rauf on 01.07.2015.
 */

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Student {
    private String name;
    private String surname;
    private int point;

    public Student(String name, String surname, int point) {
        this.name = name;
        this.surname = surname;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, surname, point);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equal(this.name, other.name)
                && Objects.equal(this.surname, other.surname)
                && Objects.equal(this.point, other.point);
    }
}
