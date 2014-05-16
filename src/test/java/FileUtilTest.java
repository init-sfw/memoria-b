import static org.junit.Assert.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

import core.FileUtil;


public class FileUtilTest {

	@Test
	public void testGetJson() {
		String url = "data/data.json";
		JSONObject obj = FileUtil.getJSONFile(url);
		
		assertNotNull(obj);
	}

	@Test
	public void testGetJsonSize() {
		String url = "data/data.json";
		JSONObject obj = FileUtil.getJSONFile(url);
		
		assertEquals(20, ((JSONArray)obj.get("data")).size());;
	}

}
