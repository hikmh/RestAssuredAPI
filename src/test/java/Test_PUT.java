import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;




public class Test_PUT {

	@Test
	public void test_01(){
		JSONObject request = new JSONObject();
		
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
			
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
		
	}
}
