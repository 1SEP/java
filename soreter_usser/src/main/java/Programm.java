import javax.naming.ldap.SortResponseControl;
import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Надежда on 23.06.2015.
 */
public class Programm {
    public static void main(String[] args) {

        System.out.println("napolnite massiv");

           Scanner in = new Scanner(System.in);
           int a[] = new int[10];
               for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
              }

        Sorter simple_sort = new Sorter();
          simple_sort.Sort(a);
          for (int i = 0; i < 10; i++)
            System.out.print(a[i]);
    }
}
