package com.report.dailyreport.mapper;

import com.report.dailyreport.po.DailyReport;
import com.report.dailyreport.po.DailyReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyReportMapper {
    long countByExample(DailyReportExample example);

    int deleteByExample(DailyReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DailyReport record);

    int insertSelective(DailyReport record);

    List<DailyReport> selectByExample(DailyReportExample example);

    DailyReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DailyReport record, @Param("example") DailyReportExample example);

    int updateByExample(@Param("record") DailyReport record, @Param("example") DailyReportExample example);

    int updateByPrimaryKeySelective(DailyReport record);

    int updateByPrimaryKey(DailyReport record);
}