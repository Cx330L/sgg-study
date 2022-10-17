package com.example.jpademo.service;

import com.example.jpademo.domain.TimeRest;
import com.example.jpademo.dto.TimeRestReportDto;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 21:43
 */
public interface TimeRestService {


    TimeRest insertTimeRest(TimeRest timeRest);

    /**
     * 级联保存
     * @param timeRestReportDto
     * @return
     */
    TimeRest cascadeSave(TimeRestReportDto timeRestReportDto);

}
