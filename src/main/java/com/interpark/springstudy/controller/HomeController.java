package com.interpark.springstudy.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.interpark.springstudy.di.step6.Car;
import com.interpark.springstudy.dto.TestDto;
import com.interpark.springstudy.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	HomeService homeSc;
	
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
	
	@RequestMapping(value = "/data/path/{name}", method = RequestMethod.GET)
	public String pathValue(@PathVariable String name, Model model) {
		
		model.addAttribute("name", name);
		return "home2";
	}
	
	@RequestMapping(value = "/dbtest", method = RequestMethod.GET)
	public String dbtest(Model model) throws SQLException {
		
		model.addAttribute("name", homeSc.test());
		return "home2";
	}
	
	@RequestMapping(value = "/ditest", method = RequestMethod.GET)
	public String diTest(Model model) {
		System.out.println("-------------------");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:spring/di/spring-di3.xml");

		Car car = (Car)context.getBean("car");
		
		model.addAttribute("name", car.getTireBrand());
		return "home2";
	}
}
