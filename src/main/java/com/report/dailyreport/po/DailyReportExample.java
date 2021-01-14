package com.report.dailyreport.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyReportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnvIsNull() {
            addCriterion("env is null");
            return (Criteria) this;
        }

        public Criteria andEnvIsNotNull() {
            addCriterion("env is not null");
            return (Criteria) this;
        }

        public Criteria andEnvEqualTo(String value) {
            addCriterion("env =", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotEqualTo(String value) {
            addCriterion("env <>", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThan(String value) {
            addCriterion("env >", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvGreaterThanOrEqualTo(String value) {
            addCriterion("env >=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThan(String value) {
            addCriterion("env <", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLessThanOrEqualTo(String value) {
            addCriterion("env <=", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvLike(String value) {
            addCriterion("env like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotLike(String value) {
            addCriterion("env not like", value, "env");
            return (Criteria) this;
        }

        public Criteria andEnvIn(List<String> values) {
            addCriterion("env in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotIn(List<String> values) {
            addCriterion("env not in", values, "env");
            return (Criteria) this;
        }

        public Criteria andEnvBetween(String value1, String value2) {
            addCriterion("env between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andEnvNotBetween(String value1, String value2) {
            addCriterion("env not between", value1, value2, "env");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNull() {
            addCriterion("jobname is null");
            return (Criteria) this;
        }

        public Criteria andJobnameIsNotNull() {
            addCriterion("jobname is not null");
            return (Criteria) this;
        }

        public Criteria andJobnameEqualTo(String value) {
            addCriterion("jobname =", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotEqualTo(String value) {
            addCriterion("jobname <>", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThan(String value) {
            addCriterion("jobname >", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameGreaterThanOrEqualTo(String value) {
            addCriterion("jobname >=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThan(String value) {
            addCriterion("jobname <", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLessThanOrEqualTo(String value) {
            addCriterion("jobname <=", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameLike(String value) {
            addCriterion("jobname like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotLike(String value) {
            addCriterion("jobname not like", value, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameIn(List<String> values) {
            addCriterion("jobname in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotIn(List<String> values) {
            addCriterion("jobname not in", values, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameBetween(String value1, String value2) {
            addCriterion("jobname between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andJobnameNotBetween(String value1, String value2) {
            addCriterion("jobname not between", value1, value2, "jobname");
            return (Criteria) this;
        }

        public Criteria andSqlConditionIsNull() {
            addCriterion("sql_condition is null");
            return (Criteria) this;
        }

        public Criteria andSqlConditionIsNotNull() {
            addCriterion("sql_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSqlConditionEqualTo(String value) {
            addCriterion("sql_condition =", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionNotEqualTo(String value) {
            addCriterion("sql_condition <>", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionGreaterThan(String value) {
            addCriterion("sql_condition >", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionGreaterThanOrEqualTo(String value) {
            addCriterion("sql_condition >=", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionLessThan(String value) {
            addCriterion("sql_condition <", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionLessThanOrEqualTo(String value) {
            addCriterion("sql_condition <=", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionLike(String value) {
            addCriterion("sql_condition like", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionNotLike(String value) {
            addCriterion("sql_condition not like", value, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionIn(List<String> values) {
            addCriterion("sql_condition in", values, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionNotIn(List<String> values) {
            addCriterion("sql_condition not in", values, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionBetween(String value1, String value2) {
            addCriterion("sql_condition between", value1, value2, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andSqlConditionNotBetween(String value1, String value2) {
            addCriterion("sql_condition not between", value1, value2, "sqlCondition");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNull() {
            addCriterion("jobstatus is null");
            return (Criteria) this;
        }

        public Criteria andJobstatusIsNotNull() {
            addCriterion("jobstatus is not null");
            return (Criteria) this;
        }

        public Criteria andJobstatusEqualTo(String value) {
            addCriterion("jobstatus =", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotEqualTo(String value) {
            addCriterion("jobstatus <>", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThan(String value) {
            addCriterion("jobstatus >", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusGreaterThanOrEqualTo(String value) {
            addCriterion("jobstatus >=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThan(String value) {
            addCriterion("jobstatus <", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLessThanOrEqualTo(String value) {
            addCriterion("jobstatus <=", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusLike(String value) {
            addCriterion("jobstatus like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotLike(String value) {
            addCriterion("jobstatus not like", value, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusIn(List<String> values) {
            addCriterion("jobstatus in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotIn(List<String> values) {
            addCriterion("jobstatus not in", values, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusBetween(String value1, String value2) {
            addCriterion("jobstatus between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andJobstatusNotBetween(String value1, String value2) {
            addCriterion("jobstatus not between", value1, value2, "jobstatus");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andPassedIsNull() {
            addCriterion("passed is null");
            return (Criteria) this;
        }

        public Criteria andPassedIsNotNull() {
            addCriterion("passed is not null");
            return (Criteria) this;
        }

        public Criteria andPassedEqualTo(Integer value) {
            addCriterion("passed =", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotEqualTo(Integer value) {
            addCriterion("passed <>", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThan(Integer value) {
            addCriterion("passed >", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThanOrEqualTo(Integer value) {
            addCriterion("passed >=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThan(Integer value) {
            addCriterion("passed <", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThanOrEqualTo(Integer value) {
            addCriterion("passed <=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedIn(List<Integer> values) {
            addCriterion("passed in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotIn(List<Integer> values) {
            addCriterion("passed not in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedBetween(Integer value1, Integer value2) {
            addCriterion("passed between", value1, value2, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotBetween(Integer value1, Integer value2) {
            addCriterion("passed not between", value1, value2, "passed");
            return (Criteria) this;
        }

        public Criteria andFailedIsNull() {
            addCriterion("failed is null");
            return (Criteria) this;
        }

        public Criteria andFailedIsNotNull() {
            addCriterion("failed is not null");
            return (Criteria) this;
        }

        public Criteria andFailedEqualTo(Integer value) {
            addCriterion("failed =", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedNotEqualTo(Integer value) {
            addCriterion("failed <>", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedGreaterThan(Integer value) {
            addCriterion("failed >", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedGreaterThanOrEqualTo(Integer value) {
            addCriterion("failed >=", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedLessThan(Integer value) {
            addCriterion("failed <", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedLessThanOrEqualTo(Integer value) {
            addCriterion("failed <=", value, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedIn(List<Integer> values) {
            addCriterion("failed in", values, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedNotIn(List<Integer> values) {
            addCriterion("failed not in", values, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedBetween(Integer value1, Integer value2) {
            addCriterion("failed between", value1, value2, "failed");
            return (Criteria) this;
        }

        public Criteria andFailedNotBetween(Integer value1, Integer value2) {
            addCriterion("failed not between", value1, value2, "failed");
            return (Criteria) this;
        }

        public Criteria andWarningIsNull() {
            addCriterion("warning is null");
            return (Criteria) this;
        }

        public Criteria andWarningIsNotNull() {
            addCriterion("warning is not null");
            return (Criteria) this;
        }

        public Criteria andWarningEqualTo(Integer value) {
            addCriterion("warning =", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotEqualTo(Integer value) {
            addCriterion("warning <>", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningGreaterThan(Integer value) {
            addCriterion("warning >", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("warning >=", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningLessThan(Integer value) {
            addCriterion("warning <", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningLessThanOrEqualTo(Integer value) {
            addCriterion("warning <=", value, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningIn(List<Integer> values) {
            addCriterion("warning in", values, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotIn(List<Integer> values) {
            addCriterion("warning not in", values, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningBetween(Integer value1, Integer value2) {
            addCriterion("warning between", value1, value2, "warning");
            return (Criteria) this;
        }

        public Criteria andWarningNotBetween(Integer value1, Integer value2) {
            addCriterion("warning not between", value1, value2, "warning");
            return (Criteria) this;
        }

        public Criteria andRspTimeIsNull() {
            addCriterion("rsp_time is null");
            return (Criteria) this;
        }

        public Criteria andRspTimeIsNotNull() {
            addCriterion("rsp_time is not null");
            return (Criteria) this;
        }

        public Criteria andRspTimeEqualTo(String value) {
            addCriterion("rsp_time =", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotEqualTo(String value) {
            addCriterion("rsp_time <>", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeGreaterThan(String value) {
            addCriterion("rsp_time >", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rsp_time >=", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeLessThan(String value) {
            addCriterion("rsp_time <", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeLessThanOrEqualTo(String value) {
            addCriterion("rsp_time <=", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeLike(String value) {
            addCriterion("rsp_time like", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotLike(String value) {
            addCriterion("rsp_time not like", value, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeIn(List<String> values) {
            addCriterion("rsp_time in", values, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotIn(List<String> values) {
            addCriterion("rsp_time not in", values, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeBetween(String value1, String value2) {
            addCriterion("rsp_time between", value1, value2, "rspTime");
            return (Criteria) this;
        }

        public Criteria andRspTimeNotBetween(String value1, String value2) {
            addCriterion("rsp_time not between", value1, value2, "rspTime");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageIsNull() {
            addCriterion("passed_percentage is null");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageIsNotNull() {
            addCriterion("passed_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageEqualTo(Float value) {
            addCriterion("passed_percentage =", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageNotEqualTo(Float value) {
            addCriterion("passed_percentage <>", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageGreaterThan(Float value) {
            addCriterion("passed_percentage >", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageGreaterThanOrEqualTo(Float value) {
            addCriterion("passed_percentage >=", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageLessThan(Float value) {
            addCriterion("passed_percentage <", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageLessThanOrEqualTo(Float value) {
            addCriterion("passed_percentage <=", value, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageIn(List<Float> values) {
            addCriterion("passed_percentage in", values, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageNotIn(List<Float> values) {
            addCriterion("passed_percentage not in", values, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageBetween(Float value1, Float value2) {
            addCriterion("passed_percentage between", value1, value2, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andPassedPercentageNotBetween(Float value1, Float value2) {
            addCriterion("passed_percentage not between", value1, value2, "passedPercentage");
            return (Criteria) this;
        }

        public Criteria andReportUrlIsNull() {
            addCriterion("report_url is null");
            return (Criteria) this;
        }

        public Criteria andReportUrlIsNotNull() {
            addCriterion("report_url is not null");
            return (Criteria) this;
        }

        public Criteria andReportUrlEqualTo(String value) {
            addCriterion("report_url =", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlNotEqualTo(String value) {
            addCriterion("report_url <>", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlGreaterThan(String value) {
            addCriterion("report_url >", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlGreaterThanOrEqualTo(String value) {
            addCriterion("report_url >=", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlLessThan(String value) {
            addCriterion("report_url <", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlLessThanOrEqualTo(String value) {
            addCriterion("report_url <=", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlLike(String value) {
            addCriterion("report_url like", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlNotLike(String value) {
            addCriterion("report_url not like", value, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlIn(List<String> values) {
            addCriterion("report_url in", values, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlNotIn(List<String> values) {
            addCriterion("report_url not in", values, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlBetween(String value1, String value2) {
            addCriterion("report_url between", value1, value2, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andReportUrlNotBetween(String value1, String value2) {
            addCriterion("report_url not between", value1, value2, "reportUrl");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}