/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pejalhebat
 */

@Slf4j
@RestController
@RequestMapping("/distance")
public class DistanceService {
    
    @Autowired
    private DistanceCalculator calculator;
    
    @GetMapping("/about")
    public String getAbout(){
        return "Distance calculator";
    }
    
    @PostMapping
    public Distance sumAllDistances(@RequestBody DistanceSumRequest request ) {
        return calculator.sumAllDistances(request);
    }
    
    @GetMapping("/sumrequest")
    public DistanceSumRequest getSampleRequestFormat() {
        return calculator.getSampleSumRequest();
    }
    
}
