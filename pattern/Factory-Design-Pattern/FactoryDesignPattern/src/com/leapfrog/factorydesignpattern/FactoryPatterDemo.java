/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.factorydesignpattern;

import com.leapfrog.factorydesignpattern.factory.ShapeFactory;
import com.leapfrog.factorydesignpattern.showInterface.Shape;

/**
 *
 * @author User
 */
public class FactoryPatterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }

}
