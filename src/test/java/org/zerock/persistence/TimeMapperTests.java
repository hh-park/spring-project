package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java 설정의 경우
// @ContextConfiguration(classes = { org.zerock.config.RootConfig.class })
@Log4j
public class TimeMapperTests {

	// TimeMapper 가 정상적으로 사용이 가능한지 알아보기 위한 테스트 코드
	// 스프링 내부에 TimeMapper 타입으로 만들어진 스프링 객체(빈)가 존재한다는 뜻

	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;

	@Test
	public void testGetTime() {
		log.info(timeMapper.getClass().getName());
		// 실제 동작하는 ㅡㅋㄹ래스의 이름을 확인해 주는데, 실행 결과를 보면 개발 시 인터페이스만 만들었는데 내부적으로 적당한 클래스가 만들어진
		// 것을 확인할 수 있음
		log.info(timeMapper.getTime());
	}

	@Test
	public void tetGetTime2() {

		log.info("getTime2");
		log.info(timeMapper.getTime2());

	}

}
