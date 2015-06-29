package ru.fsep.lessons.transfer;


import com.google.common.base.Objects;



/**
 * Created by Надежда on 29.06.2015.
 */
public class Program {

    public static void main(String[] args) {

        Transable [] transeHuman =  new Human[5];
        transeHuman[0] = new Man(22, "Alex");
        transeHuman[1]= new Man(24, "Allan");
        transeHuman[2]= new Man(28, "Aly");
        transeHuman[3] = new Woman(32,"Rita");
        transeHuman[4] = new Woman(34,"Lily");

        for(int i = 0; i < transeHuman.length; i++)
        System.out.println(transeHuman[i]);

        Transfer transnew = new Transfer();
        transnew.transeAll(transeHuman);

          for (int i = 0; i < transeHuman.length; i++){
            System.out.println(transeHuman[i]);
          }

    }
}
