package core;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MEventController {
	
	private final String jsonURL = "data/data.json";

    @RequestMapping("/data")
    public @ResponseBody String data() {
    	return "dataMemoria(" + FileUtil.getJSONFile(jsonURL) + ")";
    }

}
