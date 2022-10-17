package com.example.jpademo.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName t_report_person
 */
@Entity
@Table(name="t_report_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportPerson implements Serializable {
    /**
     *  id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 汇报人名称
     */
    private String name;


    /**
     * 0:删除 1:未删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 汇报人 关联 休息时间 多对一
     */
    @ManyToOne(targetEntity = TimeRest.class,cascade={CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "time_rest_id",referencedColumnName = "t_id")
    private TimeRest timeRest;


}