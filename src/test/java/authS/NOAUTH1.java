package authS;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class NOAUTH1 {
	
	
	
	
	@Test
	public void getcall()
	{
		
		given()
		
		
		.when().get("https://reqres.in/api/users?page=2")
		
		
		
		.then().statusCode(200).log().all();
	}
	
	@Test
	public void postcall()
	
	{
		
		
		HashMap payload=new HashMap();
		payload.put("name", "momo");
		payload.put("role", "student");
		
		given().contentType("Application/json").body(payload)
		
		
		.when().post("https://reqres.in/api/users")
		
		
		.then().statusCode(201).log().all();
	}
	
	@Test
	public void putcall()
	{
		
		HashMap putpayload=new HashMap();
		putpayload.put("color", "brown");
		putpayload.put("role", "dancer");
		
		
		given().contentType("Application/json").body(putpayload)
		
		
		.when().put("https://reqres.in/api/users/2")
		
		
		.then().statusCode(200).log().all();
		
	}

}
