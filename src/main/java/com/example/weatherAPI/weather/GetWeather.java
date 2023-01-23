package com.example.weatherAPI.weather;

import java.net.URI;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import ch.qos.logback.core.pattern.Converter;



@RestController
public class GetWeather {

	
	@GetMapping("/weather")
	public String getapi() {
		 
		String api_key = "9f69211d78c9e8f0bf25cc274e3ceac2";
		String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid="+api_key;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
//		Gson gson = new Gson();
//		ApiResponse resp = gson.fromJson(result, ApiResponse.class);
//		
//		System.out.println(resp);
	
		
		return result;
	
	}
}