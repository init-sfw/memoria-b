package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.*;

@Controller
public class MEventController {
	
	private final String jsonDataURL = "/data/data.json";
	private final String jsonCategoriesURL = "/data/categories.json";
	private final String jsonCountriesURL = "/data/countries_ar.json";

	/**
	 * Método de web service que devuelve el JSON completo con datos en formato Memoria
	 * @return
	 */
    @RequestMapping("/data")
    public @ResponseBody String data() {
    	return "dataMemoria(" + FileUtil.getJSONObjectFromFile(getClass().getResource(jsonDataURL)) + ")";
    }

    @RequestMapping("/categories")
    public @ResponseBody String categories() {
    	return "categoriesMemoria(" + FileUtil.getJSONArrayFromFile(getClass().getResource(jsonCategoriesURL)) + ")";
    }

    @RequestMapping("/countries")
    public @ResponseBody String countries() {
    	return "countriesMemoria(" + FileUtil.getJSONArrayFromFile(getClass().getResource(jsonCountriesURL)) + ")";
    }
}
