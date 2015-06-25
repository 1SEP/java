/**
 * Created by aspire on 23.06.2015.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age) throws Exception {
        this.name = name;
        if(age >= 0)
            this.age = age;
        else{
            throw new Exception("Incorrect number of age!..");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "My name " + this.name + " " + ", age is " + this.age;
    }
}
