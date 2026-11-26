/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arellano_ece;

/**
 *
 * @author Arellano_CPE113
 */
public class EngineeringPoint {

    private double x;
    private double y;

    public EngineeringPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistance(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double calculateSlope(EngineeringPoint point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;

        if (dx == 0) {
            return Double.NaN;
        }
        return dy / dx;
    }

}
