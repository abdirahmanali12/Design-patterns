package com.designpatterns.creational.factory.method.cloth;

public class WomenKhimar implements Cloth{
    @Override
    public String clothName() {
        return "Khimar saudi";
    }

    @Override
    public String size() {
        return "43inch";
    }
}
