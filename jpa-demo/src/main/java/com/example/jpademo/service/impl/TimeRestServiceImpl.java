package com.example.jpademo.service.impl;

import com.example.jpademo.domain.ReportPerson;
import com.example.jpademo.domain.TimeRest;
import com.example.jpademo.dto.TimeRestReportDto;
import com.example.jpademo.repository.TimeRestRepository;
import com.example.jpademo.service.ReportPersonService;
import com.example.jpademo.service.TimeRestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 21:43
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class TimeRestServiceImpl implements TimeRestService {


    private final TimeRestRepository timeRestRepository;

    private final ReportPersonService reportPersonService;


    public TimeRest insertTimeRest(TimeRest timeRest) {
        return timeRestRepository.save(timeRest);
    }

    @Transactional // 开启事务
    public TimeRest cascadeSave(TimeRestReportDto timeRestReportDto) {
        // 休息时间
        TimeRest timeRest = timeRestReportDto.getTimeRest();
        // 汇报人 列表
        List<ReportPerson> list = timeRestReportDto.getReportPersonList();
        // 休息时间 关联 汇报人列表
        timeRest.setReportPersons(list);
        // 保存休息时间
        TimeRest result = timeRestRepository.save(timeRest);
        // 保存 汇报人列表
        reportPersonService.saveAll(list);
        // 返回结果
        return result;
    }


}
