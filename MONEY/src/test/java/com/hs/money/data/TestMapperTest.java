package com.hs.money.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
public class TestMapperTest {
	private Logger log = LogManager.getLogger(TestMapperTest.class);
	
	@Autowired
	TestMapper testMapper;
	
//	@Test
	public void test() throws Exception {
		String time = testMapper.getDatabaseTime();
		log.info("######################### time : " + time);
				
	}
}
