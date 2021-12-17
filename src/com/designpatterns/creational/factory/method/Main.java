package com.designpatterns.creational.factory.method;

import com.designpatterns.creational.factory.method.cloth.Cloth;
import com.designpatterns.creational.factory.method.cloth.ClothName;
import com.designpatterns.creational.factory.method.factories.ChildrenClothFactory;
import com.designpatterns.creational.factory.method.factories.ClothingFactory;
import com.designpatterns.creational.factory.method.factories.MenClothFactory;
import com.designpatterns.creational.factory.method.factories.WomenClothFactory;

public class Main {
    public static void main(String[] args) {
        ClothingFactory menClothFactory = new MenClothFactory();
        ClothingFactory womenClothFactory = new WomenClothFactory();
        ClothingFactory childrenClothFactory = new ChildrenClothFactory();

        Cloth manCloth = menClothFactory.orderCloth(ClothName.SHIRT);
        Cloth womanCloth= womenClothFactory.orderCloth(ClothName.HIJAB);
        Cloth childCloth = childrenClothFactory.orderCloth(ClothName.CHILD_SHIRT);

        System.out.println(manCloth.clothName()+" and size "+manCloth.size());
        System.out.println(womanCloth.clothName()+" and size "+womanCloth.size());
        System.out.println(childCloth.clothName()+" and size "+childCloth.size());
    }
}
