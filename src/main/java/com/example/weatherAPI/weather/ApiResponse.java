package com.example.weatherAPI.weather;

public class ApiResponse {
	private String loction;
	private String Time;
	private String temp;
	private String humidity;
	private String Wind_speed;
	public ApiResponse() {
		
	}
	public ApiResponse(String loction, String time, String temp, String humidity, String wind_speed) {
		super();
		this.loction = loction;
		Time = time;
		this.temp = temp;
		this.humidity = humidity;
		Wind_speed = wind_speed;
	}
	public String getLoction() {
		return loction;
	}
	public void setLoction(String loction) {
		this.loction = loction;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWind_speed() {
		return Wind_speed;
	}
	public void setWind_speed(String wind_speed) {
		Wind_speed = wind_speed;
	}
	@Override
	public String toString() {
		return "ApiResponse [loction=" + loction + ", Time=" + Time + ", temp=" + temp + ", humidity=" + humidity
				+ ", Wind_speed=" + Wind_speed + "]";
	}
}
