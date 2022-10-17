package com.example.jpademo.repository;

import com.example.jpademo.domain.ReportPerson;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 22:52
 */
public interface ReportPersonRepository extends JpaRepository<ReportPerson, Long> {

}
