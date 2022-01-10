package com.hs.money.service;

import com.google.gson.JsonArray;

public interface CandleService {
	/* 분 단위 캔들  marketCode : 제공된 마켓코드, to : 마지막캔들시간  yyyy-MM-dd'T'HH:mm:ss'Z' or yyyy-MM-dd HH:mm:ss, count : 1~200*/
	public JsonArray getMinuteCandle(String marketCode, String to, String count) throws Exception;
	/* 일 단위 캔들 */
	public JsonArray getDayCandle() throws Exception;
	/* 주 단위 캔들 */
	public JsonArray getWeekCandle() throws Exception;
	/* 월 단위 캔들 */
	public JsonArray getMonthCandle() throws Exception;
}
