/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author pejalhebat
 */

@Slf4j
public class DistanceConverter {
    
    private static final double TO_YARDS = 1.09361;
    
    public static double meterToYards(double meter) {
        return meter * TO_YARDS;
    }
    
    public static double yardToMeters(double yard) {
        return yard * (1 / TO_YARDS);
    }
    
    public static double toMeters(double distance, Measurement unit) {
        return distance * (1 / unit.conversion);
    }
    
    public static double metersToUnit(double distance, Measurement unit) {
        return distance * unit.conversion;
    }
    
}
