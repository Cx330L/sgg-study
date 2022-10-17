package com.example.jpademo.controller;

import com.example.jpademo.domain.TimeRest;
import com.example.jpademo.dto.TimeRestReportDto;
import com.example.jpademo.service.TimeRestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 21:50
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("timeRest")
public class TimeRestController {


    private final TimeRestService timeRestService;




    /**
     *
     * @param timeRest
     * @return
     */
    @PostMapping("/save")
    public TimeRest save(@RequestBody  TimeRest timeRest){
        return timeRestService.insertTimeRest(timeRest);
    }


    @PostMapping("/cascadeSave")
    public TimeRest cascadeSave(@RequestBody TimeRestReportDto timeRestReportDto) {
        return timeRestService.cascadeSave(timeRestReportDto);
    }


}
