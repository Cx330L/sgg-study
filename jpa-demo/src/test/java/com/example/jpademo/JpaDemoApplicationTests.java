package com.example.jpademo;

import com.example.jpademo.domain.ReportPerson;
import com.example.jpademo.domain.TimeRest;
import com.example.jpademo.repository.ReportPersonRepository;
import com.example.jpademo.service.TimeRestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
@Slf4j
class JpaDemoApplicationTests {


	@Autowired
	TimeRestService timeRestService;

	@Autowired
	ReportPersonRepository reportPersonRepository;

	@Test
	@Transactional
	@Rollback(value = false)
	void contextLoads() {
		// 休息时间
		TimeRest timeRest = TimeRest.builder()
				.restTime(10)
				.endTime(new Date())
				.startTime(new Date())
				.isDelete(1)
				.build();
		// 汇报人列表
		List<ReportPerson> list = Arrays.asList(
				ReportPerson.builder()
						.name("a")
						.isDelete(1)
						.build(),
				ReportPerson.builder()
						.name("b")
						.isDelete(1)
						.build(),
				ReportPerson.builder()
						.name("c")
						.isDelete(1)
						.build()
		);

		timeRest.setReportPersons(list);
		TimeRest result = timeRestService.insertTimeRest(timeRest);
		reportPersonRepository.saveAll(list);
		Assertions.assertNotNull(result);

	}





}
