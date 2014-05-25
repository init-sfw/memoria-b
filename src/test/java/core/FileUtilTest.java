package core;

import static org.junit.Assert.*;

import java.io.File;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.junit.Test;

import core.FileUtil;


public class FileUtilTest {

	@Test
	public void testGetJson() {
		URL url = getClass().getResource("/data/data.json");	
		JSONObject obj = FileUtil.getJSONObjectFromFile(url);
		
		assertNotNull(obj);
	}

	@Test
	public void testGetJsonSize() {
		URL url = getClass().getResource("/data/data.json");
		JSONObject obj = FileUtil.getJSONObjectFromFile(url);
		
		assertEquals(20, ((JSONArray)obj.get("data")).size());;
	}
	
	@Test
	public void testCategories() {
		URL url = getClass().getResource("/data/categories.json");
		JSONArray obj = FileUtil.getJSONArrayFromFile(url);
		
		assertEquals(5, obj.size());	
		
	}
	
	@Test
	public void testCountries() {
		URL url = getClass().getResource("/data/countries_ar.json");
		JSONArray obj = FileUtil.getJSONArrayFromFile(url);
		
		assertEquals(249, obj.size());		
	}
}
