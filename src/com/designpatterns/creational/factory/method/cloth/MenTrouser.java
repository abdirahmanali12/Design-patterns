package com.designpatterns.creational.factory.method.cloth;

public class MenTrouser implements Cloth{
    @Override
    public String clothName() {
        return "Jeans";
    }

    @Override
    public String size() {
        return "36";
    }
}
