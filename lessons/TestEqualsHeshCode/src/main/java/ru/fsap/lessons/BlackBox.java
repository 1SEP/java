package ru.fsap.lessons;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class BlackBox {

    public int varA;

    public int varB;

    public BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(varA, varB);
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
        return Objects.equal(this.varA, other.varA)
                && Objects.equal(this.varB, other.varB);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("varA", varA)
                .add("varB", varB)
                .toString();
    }

//    @Override
//    public boolean equals(final Object obj){
//
//        if(this == obj){
//            return true;
//        }
//
//        if(obj == null){
//            return false;
//        }
//
//        if(getClass() != obj.getClass()){
//            return false;
//        }
//
//        final BlackBox that = (BlackBox) obj;
//        return Objects.equal(this.varA, that.varA) && Objects.equal(this.varB, that.varB);
//    }
//
//    @Override
//    public int hashCode(){
//        return (Objects.hashCode(varA, varB));
//    }
//
//    @Override
//    public String toString(){
//        return MoreObjects.toStringHelper(this)
//            .add("varA", varA)
//            .add("varB", varB)
//        .toString();
//    }
//
//    @Override
//    public int hashCode(){
//        final int prime = 30;
//        int result = 15;
//        result = prime * result + varA;
//        result = prime * result + varB;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//
//        if(obj == null){
//            return false;
//        }
//
//        if(getClass() != obj.getClass()){
//            return false;
//        }
//
//        BlackBox that = (BlackBox) obj;
//
//        if(varA != that.varA){
//            return false;
//        }
//
//        if(varB != that.varB){
//            return false;
//        }
//
//        return true;
//    }
}
