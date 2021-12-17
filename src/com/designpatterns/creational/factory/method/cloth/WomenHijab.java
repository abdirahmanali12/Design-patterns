package com.designpatterns.creational.factory.method.cloth;

public class WomenHijab implements Cloth {
    @Override
    public String clothName() {
        return "Hijab";
    }

    @Override
    public String size() {
        return "40cm";
    }
}
