package authS;



import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class NoAuth {
	
	@Test
	public void getcall() {
		
		given()
		
		
		
		.when().get("https://reqres.in/api/users?page=2")
		
		
		
		
		.then().statusCode(200).log().all();
	}
	
	@Test	
	public void postcall() {
		
		HashMap payload=new HashMap();
		payload.put("name","aadil");
		payload.put("job", "qa");
		
		
		given().contentType("application/json").body(payload)
		
		
		.when().post("https://reqres.in/api/users")
		
		
		
		.then().statusCode(201).log().all();
	}
	
	
	//BASIC AUTH AUTOMATION
	@Test
	public void basicauth() {
		
		given().auth().basic("postman", "password")
		
		
		.when().get("https://postman-echo.com/basic-auth")
		
		
		.then().statusCode(200).log().all();
		
		
	}

}
