package test;

import core.BaseTest;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author anderson.mann
 *
 */
public class SimulationTest extends BaseTest {
	
	@Test
	public void checkStatus200() {
		given()
		.when()
			.get()
		.then()
			.statusCode(200)
		;
	}	
	
	@Test
	public void checkListSize() {
		ArrayList<String> names =
		given()
		.when()
			.get()
		.then()
			.statusCode(200)
			.extract().path("meses.findAll{it != null}")
			;
		assertEquals(4, names.size());
	}
	
	@Test
	public void invalidSimulation() {
		given()
		.when()
			.post()
		.then()
			.statusCode(400)
		;		
	}
	
	@Test
	public void validSimulation() {
		Map<String,String> simulation = new HashMap<>();
		simulation.put("perfil", "paraVoce");
		simulation.put("valorAplicar", "250000");
		simulation.put("valorInvestir", "30000");
		simulation.put("tempo", "6");
		simulation.put("periodo", "M");		
		given()
		.when()
			.post()
		.then()
			.statusCode(201)
		;		
	}
}