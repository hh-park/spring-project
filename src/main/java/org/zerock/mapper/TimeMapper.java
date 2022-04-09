package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("SELECT sysdate FROM dual")
	public String getTime();
	
	// Mapper 인터페이스와 XML을 같이 사용하기 위함
	// @Select 같은 MyBatis 어노테이션과 SQL이 존재하지 않음 -> 실제 SQL은  TimeMapper.xml로 처리
	public String getTime2();
}
