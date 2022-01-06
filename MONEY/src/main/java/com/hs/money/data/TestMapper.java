package com.hs.money.data;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	String getDatabaseTime();
}
