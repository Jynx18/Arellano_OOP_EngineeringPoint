/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arellano_ece;

/**
 *
 * @author Arellano_CPE113
 */
public class Arellano_ece {

    public static void main(String[] args) {
       EngineeringPoint pointA = new EngineeringPoint(3, 4);
        EngineeringPoint pointB = new EngineeringPoint(9, 12);
        EngineeringPoint pointC = new EngineeringPoint(3, 10);

        System.out.println("==== ENGINEERING DISTANCE AND SLOPE ANALYZER ====");
        
        System.out.println("");
        
        // Point A and Point B
        System.out.println("--- Point A and Point B ---");
        
         System.out.printf("Point A: (%.2f, %.2f)%n", pointA.getX(), pointA.getY());

        System.out.printf("Point B: (%.2f, %.2f)%n", pointB.getX(), pointB.getY());
        
        System.out.printf("Distance: %.2f units%n",
                pointA.calculateDistance(pointB));

        System.out.printf("Slope: %.2f%n",
                pointA.calculateSlope(pointB));
        
        System.out.println("");

        // Point B and Point C
        System.out.println("--- Point B and Point C ---");
        
        System.out.printf("Point B: (%.2f, %.2f)%n", pointB.getX(), pointB.getY());

        System.out.printf("Point C: (%.2f, %.2f)%n", pointC.getX(), pointC.getY());

        System.out.printf("Distance: %.2f units%n",
                pointB.calculateDistance(pointC));


        if (pointB.getX() == pointC.getX()) {
            System.out.println("Slope is undefined");
        } else {
            System.out.printf("Slope: %.2f%n", pointB.calculateSlope(pointC));
        }
        
        System.out.println("");

        // Point A and Point C
        System.out.println("\n--- Point A and Point C ---");
        
        System.out.printf("Point A: (%.2f, %.2f)%n", pointA.getX(), pointA.getY());
        System.out.printf("Point C: (%.2f, %.2f)%n", pointC.getX(), pointC.getY());

        System.out.printf("Distance: %.2f units%n", pointA.calculateDistance(pointC));


        if (pointA.getX() == pointC.getX()) {
            System.out.println("Slope is undefined");
        } else {
            System.out.printf("Slope: %.2f%n", pointA.calculateSlope(pointC));
    }
    }
}

