/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_amyzhang;

/**
 *
 * @author 342905163
 */
public class Vehicle {
    
    private int passengerNum;
    private double passengerFare, fuelEfficiency;
    private static double gasPrice;
    private static final int PROFIT = 400; //check if final is needed
    
    public Vehicle (int passengerNum, double passengerFare, double fuelEfficiency) {
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    public double revenue() {
        return passengerNum * passengerFare;
    }
    
    public double totalCost(int distance) {
        return distance * fuelEfficiency * gasPrice;
    }
    
    public double calculateProfit() {
        return this.revenue() - this.totalCost(distance);
    }
    
    public static double compareTo(Vehicle vehicle1, Vehicle vehicle2) {
        //if (vehicle1.getProfit() > vehicle2.getProfit()) return vehicle1
        //else return vehicle2
    }

    @Override
    public String toString() {
        //use content method
        return "Vehicle{" + "passengerNum=" + passengerNum + ", passengerFare=" + passengerFare + ", fuelEfficiency=" + fuelEfficiency + '}';
    }
    
    
}
