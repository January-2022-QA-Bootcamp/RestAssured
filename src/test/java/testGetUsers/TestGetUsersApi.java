package testGetUsers;

import org.testng.annotations.Test;

import apis.GetListUser;
import io.restassured.path.json.JsonPath;
import utils.JsonValidation;

public class TestGetUsersApi {

	@Test
	public void testGetUsersWithParam() {
		String responseString = GetListUser.getListUser("1", 200);
		System.out.println("--------------------------------------");
		JsonPath jsonPath = JsonValidation.path(responseString);
		System.out.println(jsonPath.get("per_page"));
		System.out.println(jsonPath.get("data[2].first_name"));
		System.out.println(jsonPath.getList("data").size());
		System.out.println(jsonPath.getList("data").get(1));
		System.out.println(jsonPath.getMap("data[1]").get("email"));
		jsonPath.peek();
	}
}
