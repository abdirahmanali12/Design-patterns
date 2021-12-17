package com.designpatterns.creational.factory.method.cloth;

public class ChildrenShirt implements  Cloth{

    @Override
    public String clothName() {
        return "Children shirt";
    }

    @Override
    public String size() {
        return "S";
    }
}
