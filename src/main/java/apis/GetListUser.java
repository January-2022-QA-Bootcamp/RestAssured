package apis;

import io.restassured.RestAssured;
import utils.ReadConfig;

public class GetListUser {

	public static String getListUser(String param, int status) {
		String response = RestAssured.given()
				.baseUri(ReadConfig.getInstance().getBaseUrl())
				.queryParam(Params.PAGE.value, param)
				.log().all()
				.get(ReadConfig.getInstance().getGetUserEndpoint())
				.then()
				.statusCode(status)
				.log().all()
				.extract()
				.asPrettyString();
		return response;
	}
}
