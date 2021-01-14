package com.report.dailyreport.po;

import java.util.Date;

public class DailyReport {
    private Long id;

    private String env;

    private String jobname;

    private String sqlCondition;

    private String jobstatus;

    private Integer total;

    private Integer passed;

    private Integer failed;

    private Integer warning;

    private String rspTime;

    private Float passedPercentage;

    private String reportUrl;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env == null ? null : env.trim();
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getSqlCondition() {
        return sqlCondition;
    }

    public void setSqlCondition(String sqlCondition) {
        this.sqlCondition = sqlCondition == null ? null : sqlCondition.trim();
    }

    public String getJobstatus() {
        return jobstatus;
    }

    public void setJobstatus(String jobstatus) {
        this.jobstatus = jobstatus == null ? null : jobstatus.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPassed() {
        return passed;
    }

    public void setPassed(Integer passed) {
        this.passed = passed;
    }

    public Integer getFailed() {
        return failed;
    }

    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public Integer getWarning() {
        return warning;
    }

    public void setWarning(Integer warning) {
        this.warning = warning;
    }

    public String getRspTime() {
        return rspTime;
    }

    public void setRspTime(String rspTime) {
        this.rspTime = rspTime == null ? null : rspTime.trim();
    }

    public Float getPassedPercentage() {
        return passedPercentage;
    }

    public void setPassedPercentage(Float passedPercentage) {
        this.passedPercentage = passedPercentage;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl == null ? null : reportUrl.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}