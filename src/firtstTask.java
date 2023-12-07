import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;


abstract class A {
    public String varA1 = "aaa";
    public int varA2;

    public int getVarA2() {
        return varA2;
    }

    public void setVarA2(int varA2) {
        if (varA2 >= 100)
            this.varA2 = 99;
        else if (varA2 < 0) this.varA2 = 0;
        else this.varA2 = varA2;
    }

    public abstract int foo(LocalDate dt);


    public abstract void buzz();
}

class B extends A {
    private double varB1 = 5;

    public double getVarB1() {
        return varB1;
    }

    public void setVarB1(double varB1) {
        this.varB1 = varB1;
    }

    public void foo(Date dt) {
    }

    @Override
    public int foo(LocalDate dt) {
        return 0;
    }

    @Override
    public void buzz() {

    }
}

abstract class C extends A{
    protected UUID varC1;
}

class D  extends C{
    E varD1;

    public Date foo(Date dt) {
        return dt;
    }

    @Override
    public int foo(LocalDate dt) {
        return 0;
    }

    @Override
    public void buzz() {

    }
}

class E {
    public E varE1;

    public void bar() {
    }

    private int bar(int size) {
        return size;
    }
}

