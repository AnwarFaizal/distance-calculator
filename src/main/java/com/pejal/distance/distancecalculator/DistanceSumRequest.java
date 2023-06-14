/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request payload format for summing values.
 * @author pejalhebat
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DistanceSumRequest {
    private List<Distance> distanceList;
    private String unit;
    
}
