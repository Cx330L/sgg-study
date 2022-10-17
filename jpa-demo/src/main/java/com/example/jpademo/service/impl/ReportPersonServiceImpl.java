package com.example.jpademo.service.impl;

import com.example.jpademo.domain.ReportPerson;
import com.example.jpademo.repository.ReportPersonRepository;
import com.example.jpademo.service.ReportPersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 23:35
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ReportPersonServiceImpl implements ReportPersonService {


    private final ReportPersonRepository reportPersonRepository;


    public List<ReportPerson> saveAll(List<ReportPerson> list) {
        return reportPersonRepository.saveAll(list);
    }

}
