package com.designpatterns.creational.factory.method.factories;

import com.designpatterns.creational.factory.method.cloth.Cloth;
import com.designpatterns.creational.factory.method.cloth.ClothName;

public abstract class ClothingFactory {

    public Cloth orderCloth(ClothName clothName){
        Cloth cloth = createCloth(clothName);
        System.out.println("created order of "+clothName);
        return cloth;
    }

    protected abstract Cloth createCloth(ClothName clothName);
}
