package org.YohBank;

public class SBI implements RBI{

    @Override
    public void banking() {
        System.out.println("SBI Is providing banking information");
    }

    @Override
    public void internetbanking() {
        System.out.println("SBI Is providing internet banking information");

    }
}
