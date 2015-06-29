package ru.fesp.lessons;

import com.google.common.base.Objects;

import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ôëþð on 26.06.2015.
 */
public class Transfer {
    public Man trans(Woman woman){

        return new Man(woman.getAge(), woman.getName());
    }
    public Woman trans (Man man) {
        return new Woman(man.getAge(),man.getName());
    }
    public void transAll(Transable transables[]){
        for(int i = 0; i < transables.length; i++){
            transables[i] = (Transable) transables[i].trans();
        }
    }
}
