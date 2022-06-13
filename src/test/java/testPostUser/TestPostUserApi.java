package testPostUser;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import apis.PostUsers;

public class TestPostUserApi {

	@Test(enabled = false)
	public void testPostUserUsingStringPayload() {
		String bodyString = "{ \"name\":\"Donald\",\"job\":\"Ex-President\"}";
		PostUsers.postUser(bodyString, 201);
	}
	
	@Test(enabled = false)
	public void testPostUserUsingFilePayload() {
		File file = new File("src/main/resources/user.json");
		PostUsers.postUser(file, 201);
		PostUsers.postUser(file, 201);
		PostUsers.postUser(file, 201);
		PostUsers.postUser(file, 201);
		PostUsers.postUser(file, 201);
		PostUsers.postUser(file, 403);
	}
	
	@Test
	public void testPostUserUsingMapPayload() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Nasir Hussain");
		map.put("job", "QE");
		PostUsers.postUser(map, 201);
	}
}
