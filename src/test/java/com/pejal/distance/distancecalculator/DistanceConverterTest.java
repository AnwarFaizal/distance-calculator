/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pejal.distance.distancecalculator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author pejalhebat
 */
@Slf4j
public class DistanceConverterTest {
    
    public DistanceConverterTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of meterToYards method, of class DistanceConverter.
     */
    @Test
    public void testMeterToYards() {
        log.info("meterToYards");
        double meter = 5.5;
        DistanceConverter instance = new DistanceConverter();
        double expResult = 6.014855;
        double result = instance.meterToYards(meter);
        assertThat(result).isEqualTo(expResult);

    }

    /**
     * Test of yardToMeters method, of class DistanceConverter.
     */
    @Test
    public void testYardToMeters() {
        log.info("yardToMeters");
        double yard = 7.7;
        DistanceConverter instance = new DistanceConverter();
        double expResult = 7.040901235358127;
        double result = instance.yardToMeters(yard);
        assertThat(result).isEqualTo(expResult);
    }
    
}
