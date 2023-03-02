package org.adaschool.Weather;

import org.adaschool.Weather.controller.WeatherReportController;
import org.adaschool.Weather.data.WeatherReport;
import org.adaschool.Weather.service.WeatherReportService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;


@SpringBootTest
class WeatherApplicationTests {

	@Test
	void contextLoads() {
	}

	//WeatherReportService

	@Test
	void testGetWeatherReportService() {
		WeatherReportService weatherReportService = mock(WeatherReportService.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(0.0);
		weatherReport.setHumidity(66.0);
		when(weatherReportService.getWeatherReport(0.0, 66.0)).thenReturn(weatherReport);
		WeatherReport weatherReport0 = weatherReportService.getWeatherReport(0.0, 66.0);
		assert(weatherReport0.getTemperature() == 0.0);
		assert(weatherReport0.getHumidity() == 66.0);
	}

	@Test
	void testFailedGetWeatherReportService() {
		WeatherReportService weatherReportService = mock(WeatherReportService.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(0.0);
		weatherReport.setHumidity(66.0);
		when(weatherReportService.getWeatherReport(0.0, 66.0)).thenReturn(weatherReport);
		WeatherReport weatherReport0 = weatherReportService.getWeatherReport(0.0, 66.0);
		assert(weatherReport0.getTemperature() != 66.0);
		assert(weatherReport0.getHumidity() != 0.0);
	}

	//WeatherReportController

	@Test
	void testGetWeatherReportController(){
		WeatherReportController weatherReportController = mock(WeatherReportController.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(0.0);
		weatherReport.setHumidity(66.0);
		when(weatherReportController.getWeatherReport(0.0, 66.0)).thenReturn(weatherReport);
		WeatherReport weatherReport0 = weatherReportController.getWeatherReport(0.0, 66.0);
		assert(weatherReport0.getTemperature() == 0.0);
		assert(weatherReport0.getHumidity() == 66.0);
	}

	@Test
	void testFailedGetWeatherReportController(){
		WeatherReportController weatherReportController = mock(WeatherReportController.class);
		WeatherReport weatherReport = new WeatherReport();
		weatherReport.setTemperature(0.0);
		weatherReport.setHumidity(66.0);
		when(weatherReportController.getWeatherReport(0.0, 66.0)).thenReturn(weatherReport);
		WeatherReport weatherReport0 = weatherReportController.getWeatherReport(0.0, 66.0);
		assert(weatherReport0.getTemperature() != 66.0);
		assert(weatherReport0.getHumidity() != 0.0);
	}

}
