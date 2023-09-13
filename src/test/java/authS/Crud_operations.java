package authS;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class Crud_operations {
	
	int id=271;
	
	
	@Test
	public void getcall() {
		
		given()
		
		
		.when().get("https://reqres.in/api/users?page=1")
		
		
		
		
		.then().statusCode(200).log().all();		
		
	}
	
	@Test
	public void GetCall() {
		
		given()
		
		
		.when().get("https://reqres.in/api/users/271")
		
		
		
		.then().statusCode(200).log().all();
	}
	
	@Test
	public void postcall() {
		
		HashMap payload=new HashMap();
		payload.put("name","morpues1");
		payload.put("job", "admin");
		
		
		given().contentType("application/json").body(payload)
		
		
		.when().post("https://reqres.in/api/users")
		
		
		.then().statusCode(201).log().all();
	}
	
	@Test
	public void putcall() {
		HashMap payload=new HashMap();
		payload.put("name","david");
		payload.put("job", "admin");
		
		
		given().contentType("application/json").body(payload)
		
		
		.when().put("https://reqres.in/api/users/" +id)
		
		
		.then().statusCode(200).log().all();
		
	}
	
	@Test
	public void deleteCall() {
		
		given()
		
		
		.when().delete("https://reqres.in/api/users/2")
		
		
		.then().statusCode(204).log().all();
	}

}
