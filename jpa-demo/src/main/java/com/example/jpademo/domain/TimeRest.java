package com.example.jpademo.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName t_time_rest
 */
@Entity
@Table(name="t_time_rest")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TimeRest implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     *  休息时长
     */
    @Column(name = "rest_time")
    private Integer restTime;

    /**
     * 0:删除 1:未删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 休息 时间 关联 汇报人列表   一对多
     */
    @OneToMany(targetEntity = ReportPerson.class)
    @JoinColumn(name = "time_rest_id",referencedColumnName = "t_id")
    private List<ReportPerson> ReportPersons;

    private static final long serialVersionUID = 1L;




}