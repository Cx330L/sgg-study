package com.example.jpademo.service;

import com.example.jpademo.domain.ReportPerson;

import java.util.List;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 23:34
 */
public interface ReportPersonService {


    List<ReportPerson> saveAll(List<ReportPerson> list);

}
