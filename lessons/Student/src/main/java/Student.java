import com.google.common.base.Objects;

/**
 * Created by ramil on 01.07.2015.
 */
public class Student {
    private String name;
    private  int ball_matan;
    private  int ball_rus;
    private  int ball_phisic;

    public Student(String name, int ball_matan, int ball_rus , int ball_phisic) {
        this.name = name;
        this.ball_matan = ball_matan;
        this.ball_rus = ball_rus;
        this.ball_phisic = ball_phisic;
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
                && Objects.equal(this.ball_matan, other.ball_matan)
                && Objects.equal(this.ball_rus, other.ball_rus)
                && Objects.equal(this.ball_phisic, other.ball_phisic);
    }
    @Override
    public String toString() {
        return name + ball_matan + ball_rus + ball_phisic;
    }
}
