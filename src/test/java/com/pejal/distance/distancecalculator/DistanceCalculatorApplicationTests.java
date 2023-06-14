package com.pejal.distance.distancecalculator;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class DistanceCalculatorApplicationTests {
    private final static String BASE_URI = "http://localhost";
 
    @LocalServerPort
    private int port;
    
    @BeforeTestExecution
    public void configureRestAssured() {
        RestAssured.baseURI = BASE_URI;
        RestAssured.port = port;
    }

	@Test
	void contextLoads() {
	}
    
        @Test
    void checkLocationCount() {
        String result = given()
                .when()
                .get("/distance/about")
                .then()
                .assertThat().log().all().statusCode(200)
                .extract().asString();
            assertThat(result).isNotEmpty();
    }

}
