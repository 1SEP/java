import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Objects;

/**
 * Created by ramil on 27.06.2015.
 */
public class Human implements Transable {
     public static final int MIN_AGE = 0;
     public static final int MAX_NAME_LENGTH = 10;
     protected int age;
     protected String name;

     public Human(int age, String name) {
          if (age > MIN_AGE) {
               this.age = age;
          }
          else
               throw new IllegalArgumentException("error");
          if(name.length() < MAX_NAME_LENGTH)
               this.name = name;
          else
               throw new IllegalArgumentException("error");
     }


     public Human trans() {
          throw  new NotImplementedException();
     }
}
