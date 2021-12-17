package com.designpatterns.creational.factory.method.cloth;

public class MenUnderShirt implements Cloth{

    @Override
    public String clothName() {
        return "Under shirt";
    }

    @Override
    public String size() {
        return "30";
    }
}
