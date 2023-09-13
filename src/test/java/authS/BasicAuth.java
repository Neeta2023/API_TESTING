package authS;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class BasicAuth {
	
	
	@Test
	public void basicAuth() {
		
		given().auth().basic("postman", "password")
		
		
		.when().get("https://postman-echo.com/basic-auth")
		
		.then().statusCode(200).log().all();
		
	}
	
	
	@Test
	public void bearertoken() {
		
		
		String token="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";
		
		given().headers("Authorization","Bearer " +token)
		
		
		.when().get("https://api.github.com/user/repos")
		
		
		
		.then().statusCode(200).log().all();
	}
}
