package core;

import static org.junit.Assert.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

import core.FileUtil;


public class FileUtilTest {

	@Test
	public void testGetJson() {
		String url = "data/data.json";
		JSONObject obj = FileUtil.getJSONObjectFromFile(url);
		
		assertNotNull(obj);
	}

	@Test
	public void testGetJsonSize() {
		String url = "data/data.json";
		JSONObject obj = FileUtil.getJSONObjectFromFile(url);
		
		assertEquals(20, ((JSONArray)obj.get("data")).size());;
	}
	
	@Test
	public void testCategories() {
		String url = "data/categories.json";
		JSONArray obj = FileUtil.getJSONArrayFromFile(url);
		
		assertEquals(5, obj.size());	
		
	}
	
	@Test
	public void testCountries() {
		String url = "data/countries_ar.json";
		JSONArray obj = FileUtil.getJSONArrayFromFile(url);
		
		assertEquals(249, obj.size());		
	}
}
