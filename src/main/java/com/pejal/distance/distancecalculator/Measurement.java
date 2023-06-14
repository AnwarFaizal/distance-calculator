/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pejalhebat
 */
public enum Measurement {
    METER("Meters",1.0),
    YARD("Yards",1.09361);
    
    public final String label;
    public final double conversion;
    
    private static final Map<String, Measurement> BY_LABEL = new HashMap<>();
    
    static {
        for (Measurement e : values()) {
            BY_LABEL.put(e.label, e);
        }
    }
    
    private Measurement(String label, double conversion) {
        this.label = label;
        this.conversion = conversion;
    }
    public static Measurement valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
    
}
