package com.designpatterns.creational.factory.method.factories;

import com.designpatterns.creational.factory.method.cloth.Cloth;
import com.designpatterns.creational.factory.method.cloth.ClothName;
import com.designpatterns.creational.factory.method.cloth.WomenHijab;
import com.designpatterns.creational.factory.method.cloth.WomenKhimar;

public class WomenClothFactory extends ClothingFactory {

    @Override
    protected Cloth createCloth(ClothName clothName) {
        if(clothName.equals(ClothName.HIJAB))
            return new WomenHijab();
        if (clothName.equals(ClothName.TROUSER))
            return new WomenKhimar();
        throw  new UnsupportedOperationException("This women cloth is not available");
    }
}
