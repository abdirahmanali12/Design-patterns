package com.designpatterns.creational.factory.method.factories;

import com.designpatterns.creational.factory.method.cloth.ChildrenShirt;
import com.designpatterns.creational.factory.method.cloth.Cloth;
import com.designpatterns.creational.factory.method.cloth.ClothName;

public class ChildrenClothFactory extends ClothingFactory{
    @Override
    protected Cloth createCloth(ClothName clothName) {
        if(clothName.equals(ClothName.CHILD_SHIRT))
            return new ChildrenShirt();
        throw new UnsupportedOperationException("This children cloth is not available");
    }
}
