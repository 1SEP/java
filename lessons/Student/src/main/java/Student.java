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

    public String toString() {
        return name + ball_matan + ball_rus + ball_phisic;
    }
}
