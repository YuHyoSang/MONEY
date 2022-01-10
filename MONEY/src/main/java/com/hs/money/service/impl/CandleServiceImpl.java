package com.hs.money.service.impl;

import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.hs.money.service.CandleService;

@Service
public class CandleServiceImpl implements CandleService {

	@Override
	public JsonArray getMinuteCandle(String marketCode, String to, String count) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonArray getDayCandle() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonArray getWeekCandle() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonArray getMonthCandle() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
