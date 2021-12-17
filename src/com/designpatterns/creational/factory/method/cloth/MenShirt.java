package com.designpatterns.creational.factory.method.cloth;

public class MenShirt implements Cloth{

    @Override
    public String clothName() {
        return "Qamis";
    }

    @Override
    public String size() {
        return "XL";
    }
}
