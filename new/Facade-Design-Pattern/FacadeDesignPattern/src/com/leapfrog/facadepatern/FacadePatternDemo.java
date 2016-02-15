/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.facadepatern;

import com.leapfrog.facadepattern.facade.ShapeMaker;

/**
 *
 * @author User
 */
public class FacadePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeMaker shapemaker = new ShapeMaker();
        shapemaker.drawCircle();
        shapemaker.drawRectangle();
        shapemaker.drawSquare();
    }

}
