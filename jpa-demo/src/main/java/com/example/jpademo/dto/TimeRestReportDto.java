package com.example.jpademo.dto;

import com.example.jpademo.domain.ReportPerson;
import com.example.jpademo.domain.TimeRest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author liujb
 * @description
 * @date 2022-10-15 23:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeRestReportDto implements Serializable {


    /**
     * 休息时间
     */
    private TimeRest timeRest;


    /**
     * 汇报人 列表
     */
    private List<ReportPerson> reportPersonList;

    /*
{
  "timeRest": {
    "startTime": "1665973697649",
    "endTime": "1665973697649",
    "restTime": 10,
    "isDelete": 1
  },
  "reportPersonList": [
    {
      "name":"m",
      "isDelete":1
    },
    {
      "name": "n",
      "isDelete": 1
    },
    {
      "name": "p",
      "isDelete": 1
    }
  ]
}
     */

}
