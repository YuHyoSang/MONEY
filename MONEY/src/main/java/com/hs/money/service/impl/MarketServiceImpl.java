package com.hs.money.service.impl;

import java.io.IOException;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hs.money.service.MarketService;

@Service
public class MarketServiceImpl implements MarketService {

	private Logger log = LogManager.getLogger(MarketServiceImpl.class);
	
	@Value("${api.server.url}")
	private  String serverUrl;
	@Value("${api.access.key}")
	private  String accessKey;
	@Value("${api.secret.key}")
	private  String secretKey;
	
	@Override
	public JsonArray getMaketAll() {
		log.info("getMaketAll");
		Gson gson = new Gson();
		JsonObject jsonObject = new JsonObject();
		JsonArray jsonArray = new JsonArray();
		
        Algorithm algorithm = Algorithm.HMAC256(secretKey);
        String jwtToken = JWT.create()
                .withClaim("access_key", accessKey)
                .withClaim("nonce", UUID.randomUUID().toString())
                .sign(algorithm);

        String authenticationToken = "Bearer " + jwtToken;
		
		try {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet("https://api.upbit.com/v1/market/all?isDetails=false");
            request.setHeader("Content-Type", "application/json");
            request.addHeader("Authorization", authenticationToken);

            HttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            jsonArray = gson.fromJson(EntityUtils.toString(entity, "UTF-8"), JsonArray.class);
            log.info(jsonArray.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return jsonArray;
	}
}
