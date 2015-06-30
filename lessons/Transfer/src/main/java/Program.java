/**
 * Created by ramil on 30.06.2015.
 */
public class Program {
    public static void main(String[] args) {
        Transable test[] = new Transable[5];
        test[0]= new Man(5, "mars");
        test[1]= new Woman(10, "katya");

        Transfer transfer = new Transfer();
        transfer.transAll(test);
        System.out.println(test[0]);
    }
}
