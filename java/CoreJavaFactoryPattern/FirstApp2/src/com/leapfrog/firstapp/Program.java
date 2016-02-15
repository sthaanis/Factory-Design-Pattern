/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.firstapp;

import com.leapfrog.firstapp.command.MathCommand;
import com.leapfrog.firstapp.command.MathFactory;
import com.leapfrog.firstapp.util.Calculator;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Program {

    private static void menu() {
        System.out.println("+.Add");
        System.out.println("-.Subtract");
        System.out.println("*.Multiplication");
        System.out.println("/.Division");
        System.out.println("^.Power");
        System.out.println("Enter your choice:");

    }

    public static void showConfirmDialog(Scanner sc) {
        System.out.println("Do you want to continue[y/n]");
        if (sc.next().equalsIgnoreCase("n")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        double x, y, total = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter First Number:");
            x = sc.nextInt();
            System.out.println("Enter Second Number:");
            y = sc.nextInt();

            menu();

            MathCommand cmd = MathFactory.get(sc.next());
            if (cmd != null) {
                System.out.println(cmd.calculate(x, y));
            } else {
                System.out.println("Invalid Command");
            }
            showConfirmDialog(sc);
        }

    }

}
