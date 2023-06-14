/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author pejalhebat
 */
@Slf4j
@Component
public class DistanceCalculator {

    public Distance getDefaultDistance() {
        return new Distance(5.5, Measurement.METER.label);
    }

    public DistanceSumRequest getSampleSumRequest() {
        List<Distance> distanceList = new ArrayList<>();
        distanceList.add(getDefaultDistance());
        return DistanceSumRequest
                .builder()
                .distanceList(distanceList)
                .unit(Measurement.METER.label)
                .build();
                
    }
    
    public Distance summAllDistances(DistanceSumRequest sumRequest){
        Distance resultDistance = new Distance();
        resultDistance.setUnit(sumRequest.getUnit());
//        BigDecimal sumDistance = new BigDecimal(0);
//        for (Distance distance: sumRequest.getDistanceList()) {
//            sumDistance.add(new BigDecimal(distance.))
//        }
        double distanceInMeters = sumRequest
                .getDistanceList()
                .stream()
        .mapToDouble(DistanceCalculator::convertToMeters)
        .sum();
        
        resultDistance.setLength(
                DistanceConverter.metersToUnit(
                        distanceInMeters, 
                        Measurement.valueOfLabel(sumRequest.getUnit())));
        
        return resultDistance;
    }
    
    private static Double convertToMeters(Distance distance) {
        return DistanceConverter.toMeters(distance.getLength()
                , Measurement.valueOfLabel(distance.getUnit()));
    }
    
}
