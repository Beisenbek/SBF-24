package com.example.soapclient;

import com.example.soapclient.wsdl.Country;
import com.example.soapclient.wsdl.Currency;
import com.example.soapclient.wsdl.GetCountryResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SoapClientApplicationTests {

	@Autowired
	CountryClient countryClient;

	@Test
	void contextLoads() {

	}

	@Test
	void testPoland(){
		//Assign
		String country = "Poland";
		//Act
		GetCountryResponse response = countryClient.getCountry(country);
		//Assert
		Assert.hasText(response.getCountry().getCurrency().value(),"PLN");
	}

	@Test
	void testCountry(){
		//Assign
		int initPopulation  = 1000;
		Country country = new Country();
		country.setCapital("ABC");
		country.setName("ABCountry");
		country.setCurrency(Currency.EUR);
		country.setPopulation(initPopulation);
		//Act
		country.setPopulation(country.getPopulation() + 1);
		//Assert
		Assert.isTrue(initPopulation == country.getPopulation(),"population");
	}

}
