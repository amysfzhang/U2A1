/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a1_amyzhang;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 *
 * @author 342905163
 */
public class Vehicle {
    
    private String model;
    private int passengerNum;
    private double passengerFare, fuelEfficiency, distance;
    private static double gasPrice;
    private final int PROFIT = 400; //check if final is needed
    
    public Vehicle (int passengerNum, double passengerFare, double fuelEfficiency) {
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
    }

    public Vehicle(String model, int passengerNum, double passengerFare, double fuelEfficiency, double distance) {
        this.model = model;
        this.passengerNum = passengerNum;
        this.passengerFare = passengerFare;
        this.fuelEfficiency = fuelEfficiency;
        this.distance = distance;
    }
    
    public double revenue() {
        return passengerNum * passengerFare;
    }
    
    public double totalCost() {
        return distance * fuelEfficiency * gasPrice;
    }
    
    public double calculateProfit() {
        return this.revenue() - this.totalCost();
    }
    
    public boolean isProfitable() {
        if (this.calculateProfit() > PROFIT) {
            return true;
        } else {
                return false;
        }
    }
    
    public static Vehicle compareTo(Vehicle a, Vehicle b) {
        if (a.calculateProfit() > b.calculateProfit()) {
            return a;
        } else {
            return b;
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    //setter methods
    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public void setPassengerFare(double passengerFare) {
        this.passengerFare = passengerFare;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static void setGasPrice(double gasPrice) {
        Vehicle.gasPrice = gasPrice;
    }

    //getter methods
    public int getPassengerNum() {
        return passengerNum;
    }

    public double getPassengerFare() {
        return passengerFare;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getDistance() {
        return distance;
    }

    public static double getGasPrice() {
        return gasPrice;
    }

    public String getModel() {
        return model;
    }

    public int getPROFIT() {
        return PROFIT;
    }
    
     
}
