/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.factorydesignpattern.concreteclass;

import com.leapfrog.factorydesignpattern.showInterface.Shape;

/**
 *
 * @author User
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
    
}
