package com.interpark.springstudy;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		JSONObject obj = new JSONObject();
		obj.put("name", "sun");
		obj.put("age", 32);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("json", obj );
		
		return "home";
	}

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String data(Locale locale, Model model, TestDto dto) {
		
		model.addAttribute("name", dto.getName());
		model.addAttribute("age", dto.getAge());
		return "home2";
	}
}
