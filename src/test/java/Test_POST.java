import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class Test_POST {

	@Test
	public void test_01_post () {
//		Map<String, Object> map = new HashMap<String, Object>();
		
//		map.put("name", "Raghav");
//		map.put("job", "Teahcher");
		
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name", "hikmah");
		request.put("Job", "Belum Bekerja");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
			
		
	}
}