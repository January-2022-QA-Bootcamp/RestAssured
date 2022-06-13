package restassured.qa.reqres.testPackage;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class MainMethodRest {

	public static void main(String[] args) {
		/*
		 * RestAssured.given() .baseUri("https://reqres.in") .when()	.log().all()
		 * .get("/api/users?page=1") .then() .statusCode(200).and() .log().all();
		 */
		
		//RestAssured.get("https://reqres.in/api/users?page=1").then().log().all();
		
		String bodyString  = "{\"name\": \"mitch\",\"job\": \"qa\"}";
		
		RestAssured.given().contentType(ContentType.JSON).body(bodyString).post("https://reqres.in/api/users")
		.then().log().all();
	}
}
