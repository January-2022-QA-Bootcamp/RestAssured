package utils;

import io.restassured.path.json.JsonPath;

public class JsonValidation {

	public static JsonPath path(String response) {
		return new JsonPath(response);
	}
}
