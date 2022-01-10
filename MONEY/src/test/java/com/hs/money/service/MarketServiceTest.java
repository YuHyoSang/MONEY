package com.hs.money.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@SpringBootTest
public class MarketServiceTest {

	private Logger log = LogManager.getLogger(MarketServiceTest.class);
	
	@Autowired
	MarketService marketService;
	
	@Test
	public void marketAllTest() {
		JsonArray jsonArray = marketService.getMaketAll();
		log.info(jsonArray.toString());
	}
}
