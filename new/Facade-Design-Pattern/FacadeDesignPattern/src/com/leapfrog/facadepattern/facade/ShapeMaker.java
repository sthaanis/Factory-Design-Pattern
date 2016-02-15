/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.facadepattern.facade;

import com.leapfrog.facadepattern.Interface.Shape;
import com.leapfrog.facadepattern.concreteclass.Circle;
import com.leapfrog.facadepattern.concreteclass.Rectangle;
import com.leapfrog.facadepattern.concreteclass.Square;

/**
 *
 * @author User
 */
public class ShapeMaker {

    private Shape Circle;
    private Shape Rectangle;
    private Shape Square;

    public ShapeMaker() {
        Circle = new Circle();
        Rectangle = new Rectangle();
        Square = new Square();

    }

    public void drawCircle() {
        Circle.draw();
    }

    public void drawRectangle() {
        Rectangle.draw();
    }

    public void drawSquare() {
        Square.draw();
    }
}
