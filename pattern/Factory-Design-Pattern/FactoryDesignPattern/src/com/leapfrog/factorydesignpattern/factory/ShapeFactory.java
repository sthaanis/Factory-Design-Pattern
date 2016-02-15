/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.factorydesignpattern.factory;

import com.leapfrog.factorydesignpattern.concreteclass.Circle;
import com.leapfrog.factorydesignpattern.concreteclass.Rectangle;
import com.leapfrog.factorydesignpattern.concreteclass.Square;
import com.leapfrog.factorydesignpattern.showInterface.Shape;

/**
 *
 * @author User
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
