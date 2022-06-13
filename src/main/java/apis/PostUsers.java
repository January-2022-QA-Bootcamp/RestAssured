package apis;

import java.io.File;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import utils.ReadConfig;

public class PostUsers {

	public static String postUser(String body, int status) {
		return RestAssured.given()
				.baseUri(ReadConfig.getInstance().getBaseUrl())
				.contentType(ContentType.JSON)
				.body(body)
				.log().all()
				.post(ReadConfig.getInstance().getGetUserEndpoint())
				.then()
				.statusCode(status)
				.log().all()
				.and()
				.extract().asPrettyString();
	}
	
	public static String postUser(File body, int status) {
		return RestAssured.given()
				.baseUri(ReadConfig.getInstance().getBaseUrl())
				.contentType(ContentType.JSON)
				.body(body)
				.log().all()
				.post(ReadConfig.getInstance().getGetUserEndpoint())
				.then()
				.statusCode(status)
				.log().all()
				.and()
				.extract().asPrettyString();
	}
	
	public static String postUser(Map<String, String> body, int status) {
		return RestAssured.given()
				.baseUri(ReadConfig.getInstance().getBaseUrl())
				.contentType(ContentType.JSON)
				.body(body)
				.log().all()
				.when()
				.post(ReadConfig.getInstance().getGetUserEndpoint())
				.then()
				.statusCode(status)
				.log().all()
				.and()
				.extract().asPrettyString();
	}
}
