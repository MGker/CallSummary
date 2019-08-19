package com.callsummary.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallExample() {
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

        public Criteria andCallreferenceIsNull() {
            addCriterion("CALLREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andCallreferenceIsNotNull() {
            addCriterion("CALLREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCallreferenceEqualTo(String value) {
            addCriterion("CALLREFERENCE =", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceNotEqualTo(String value) {
            addCriterion("CALLREFERENCE <>", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceGreaterThan(String value) {
            addCriterion("CALLREFERENCE >", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceGreaterThanOrEqualTo(String value) {
            addCriterion("CALLREFERENCE >=", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceLessThan(String value) {
            addCriterion("CALLREFERENCE <", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceLessThanOrEqualTo(String value) {
            addCriterion("CALLREFERENCE <=", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceLike(String value) {
            addCriterion("CALLREFERENCE like", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceNotLike(String value) {
            addCriterion("CALLREFERENCE not like", value, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceIn(List<String> values) {
            addCriterion("CALLREFERENCE in", values, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceNotIn(List<String> values) {
            addCriterion("CALLREFERENCE not in", values, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceBetween(String value1, String value2) {
            addCriterion("CALLREFERENCE between", value1, value2, "callreference");
            return (Criteria) this;
        }

        public Criteria andCallreferenceNotBetween(String value1, String value2) {
            addCriterion("CALLREFERENCE not between", value1, value2, "callreference");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeIsNull() {
            addCriterion("CONNECTTIME is null");
            return (Criteria) this;
        }

        public Criteria andConnecttimeIsNotNull() {
            addCriterion("CONNECTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConnecttimeEqualTo(Date value) {
            addCriterion("CONNECTTIME =", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeNotEqualTo(Date value) {
            addCriterion("CONNECTTIME <>", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeGreaterThan(Date value) {
            addCriterion("CONNECTTIME >", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CONNECTTIME >=", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeLessThan(Date value) {
            addCriterion("CONNECTTIME <", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeLessThanOrEqualTo(Date value) {
            addCriterion("CONNECTTIME <=", value, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeIn(List<Date> values) {
            addCriterion("CONNECTTIME in", values, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeNotIn(List<Date> values) {
            addCriterion("CONNECTTIME not in", values, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeBetween(Date value1, Date value2) {
            addCriterion("CONNECTTIME between", value1, value2, "connecttime");
            return (Criteria) this;
        }

        public Criteria andConnecttimeNotBetween(Date value1, Date value2) {
            addCriterion("CONNECTTIME not between", value1, value2, "connecttime");
            return (Criteria) this;
        }

        public Criteria andCleartimeIsNull() {
            addCriterion("CLEARTIME is null");
            return (Criteria) this;
        }

        public Criteria andCleartimeIsNotNull() {
            addCriterion("CLEARTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCleartimeEqualTo(Date value) {
            addCriterion("CLEARTIME =", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotEqualTo(Date value) {
            addCriterion("CLEARTIME <>", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThan(Date value) {
            addCriterion("CLEARTIME >", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLEARTIME >=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThan(Date value) {
            addCriterion("CLEARTIME <", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeLessThanOrEqualTo(Date value) {
            addCriterion("CLEARTIME <=", value, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeIn(List<Date> values) {
            addCriterion("CLEARTIME in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotIn(List<Date> values) {
            addCriterion("CLEARTIME not in", values, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeBetween(Date value1, Date value2) {
            addCriterion("CLEARTIME between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andCleartimeNotBetween(Date value1, Date value2) {
            addCriterion("CLEARTIME not between", value1, value2, "cleartime");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("EXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("EXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(String value) {
            addCriterion("EXTENSION =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(String value) {
            addCriterion("EXTENSION <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(String value) {
            addCriterion("EXTENSION >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(String value) {
            addCriterion("EXTENSION <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLike(String value) {
            addCriterion("EXTENSION like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotLike(String value) {
            addCriterion("EXTENSION not like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<String> values) {
            addCriterion("EXTENSION in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<String> values) {
            addCriterion("EXTENSION not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(String value1, String value2) {
            addCriterion("EXTENSION between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(String value1, String value2) {
            addCriterion("EXTENSION not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNull() {
            addCriterion("CALLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCalltypeIsNotNull() {
            addCriterion("CALLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCalltypeEqualTo(Integer value) {
            addCriterion("CALLTYPE =", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotEqualTo(Integer value) {
            addCriterion("CALLTYPE <>", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThan(Integer value) {
            addCriterion("CALLTYPE >", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CALLTYPE >=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThan(Integer value) {
            addCriterion("CALLTYPE <", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeLessThanOrEqualTo(Integer value) {
            addCriterion("CALLTYPE <=", value, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeIn(List<Integer> values) {
            addCriterion("CALLTYPE in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotIn(List<Integer> values) {
            addCriterion("CALLTYPE not in", values, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeBetween(Integer value1, Integer value2) {
            addCriterion("CALLTYPE between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andCalltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CALLTYPE not between", value1, value2, "calltype");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("INSERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("INSERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(BigDecimal value) {
            addCriterion("INSERTTIME =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(BigDecimal value) {
            addCriterion("INSERTTIME <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(BigDecimal value) {
            addCriterion("INSERTTIME >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSERTTIME >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(BigDecimal value) {
            addCriterion("INSERTTIME <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSERTTIME <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<BigDecimal> values) {
            addCriterion("INSERTTIME in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<BigDecimal> values) {
            addCriterion("INSERTTIME not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSERTTIME between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSERTTIME not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(BigDecimal value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(BigDecimal value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(BigDecimal value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(BigDecimal value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<BigDecimal> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<BigDecimal> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeIsNull() {
            addCriterion("OFFSETTIME is null");
            return (Criteria) this;
        }

        public Criteria andOffsettimeIsNotNull() {
            addCriterion("OFFSETTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOffsettimeEqualTo(Integer value) {
            addCriterion("OFFSETTIME =", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeNotEqualTo(Integer value) {
            addCriterion("OFFSETTIME <>", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeGreaterThan(Integer value) {
            addCriterion("OFFSETTIME >", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFSETTIME >=", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeLessThan(Integer value) {
            addCriterion("OFFSETTIME <", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeLessThanOrEqualTo(Integer value) {
            addCriterion("OFFSETTIME <=", value, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeIn(List<Integer> values) {
            addCriterion("OFFSETTIME in", values, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeNotIn(List<Integer> values) {
            addCriterion("OFFSETTIME not in", values, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeBetween(Integer value1, Integer value2) {
            addCriterion("OFFSETTIME between", value1, value2, "offsettime");
            return (Criteria) this;
        }

        public Criteria andOffsettimeNotBetween(Integer value1, Integer value2) {
            addCriterion("OFFSETTIME not between", value1, value2, "offsettime");
            return (Criteria) this;
        }

        public Criteria andVoiceidIsNull() {
            addCriterion("VOICEID is null");
            return (Criteria) this;
        }

        public Criteria andVoiceidIsNotNull() {
            addCriterion("VOICEID is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceidEqualTo(Integer value) {
            addCriterion("VOICEID =", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidNotEqualTo(Integer value) {
            addCriterion("VOICEID <>", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidGreaterThan(Integer value) {
            addCriterion("VOICEID >", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOICEID >=", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidLessThan(Integer value) {
            addCriterion("VOICEID <", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidLessThanOrEqualTo(Integer value) {
            addCriterion("VOICEID <=", value, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidIn(List<Integer> values) {
            addCriterion("VOICEID in", values, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidNotIn(List<Integer> values) {
            addCriterion("VOICEID not in", values, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidBetween(Integer value1, Integer value2) {
            addCriterion("VOICEID between", value1, value2, "voiceid");
            return (Criteria) this;
        }

        public Criteria andVoiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("VOICEID not between", value1, value2, "voiceid");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("CHANNELID is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("CHANNELID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(Integer value) {
            addCriterion("CHANNELID =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(Integer value) {
            addCriterion("CHANNELID <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(Integer value) {
            addCriterion("CHANNELID >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANNELID >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(Integer value) {
            addCriterion("CHANNELID <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(Integer value) {
            addCriterion("CHANNELID <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<Integer> values) {
            addCriterion("CHANNELID in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<Integer> values) {
            addCriterion("CHANNELID not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(Integer value1, Integer value2) {
            addCriterion("CHANNELID between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANNELID not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("AGENTID is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("AGENTID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(String value) {
            addCriterion("AGENTID =", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(String value) {
            addCriterion("AGENTID <>", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(String value) {
            addCriterion("AGENTID >", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTID >=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(String value) {
            addCriterion("AGENTID <", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(String value) {
            addCriterion("AGENTID <=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLike(String value) {
            addCriterion("AGENTID like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotLike(String value) {
            addCriterion("AGENTID not like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<String> values) {
            addCriterion("AGENTID in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<String> values) {
            addCriterion("AGENTID not in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(String value1, String value2) {
            addCriterion("AGENTID between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(String value1, String value2) {
            addCriterion("AGENTID not between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andCalleridIsNull() {
            addCriterion("CALLERID is null");
            return (Criteria) this;
        }

        public Criteria andCalleridIsNotNull() {
            addCriterion("CALLERID is not null");
            return (Criteria) this;
        }

        public Criteria andCalleridEqualTo(String value) {
            addCriterion("CALLERID =", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridNotEqualTo(String value) {
            addCriterion("CALLERID <>", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridGreaterThan(String value) {
            addCriterion("CALLERID >", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridGreaterThanOrEqualTo(String value) {
            addCriterion("CALLERID >=", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridLessThan(String value) {
            addCriterion("CALLERID <", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridLessThanOrEqualTo(String value) {
            addCriterion("CALLERID <=", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridLike(String value) {
            addCriterion("CALLERID like", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridNotLike(String value) {
            addCriterion("CALLERID not like", value, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridIn(List<String> values) {
            addCriterion("CALLERID in", values, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridNotIn(List<String> values) {
            addCriterion("CALLERID not in", values, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridBetween(String value1, String value2) {
            addCriterion("CALLERID between", value1, value2, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalleridNotBetween(String value1, String value2) {
            addCriterion("CALLERID not between", value1, value2, "callerid");
            return (Criteria) this;
        }

        public Criteria andCalledidIsNull() {
            addCriterion("CALLEDID is null");
            return (Criteria) this;
        }

        public Criteria andCalledidIsNotNull() {
            addCriterion("CALLEDID is not null");
            return (Criteria) this;
        }

        public Criteria andCalledidEqualTo(String value) {
            addCriterion("CALLEDID =", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidNotEqualTo(String value) {
            addCriterion("CALLEDID <>", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidGreaterThan(String value) {
            addCriterion("CALLEDID >", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidGreaterThanOrEqualTo(String value) {
            addCriterion("CALLEDID >=", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidLessThan(String value) {
            addCriterion("CALLEDID <", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidLessThanOrEqualTo(String value) {
            addCriterion("CALLEDID <=", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidLike(String value) {
            addCriterion("CALLEDID like", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidNotLike(String value) {
            addCriterion("CALLEDID not like", value, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidIn(List<String> values) {
            addCriterion("CALLEDID in", values, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidNotIn(List<String> values) {
            addCriterion("CALLEDID not in", values, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidBetween(String value1, String value2) {
            addCriterion("CALLEDID between", value1, value2, "calledid");
            return (Criteria) this;
        }

        public Criteria andCalledidNotBetween(String value1, String value2) {
            addCriterion("CALLEDID not between", value1, value2, "calledid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("DEVICEID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("DEVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("DEVICEID =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("DEVICEID <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("DEVICEID >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICEID >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("DEVICEID <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("DEVICEID <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("DEVICEID like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("DEVICEID not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("DEVICEID in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("DEVICEID not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("DEVICEID between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("DEVICEID not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("DIRECTION =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("DIRECTION <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("DIRECTION >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTION >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("DIRECTION <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("DIRECTION <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("DIRECTION like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("DIRECTION not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("DIRECTION in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("DIRECTION not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("DIRECTION between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("DIRECTION not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andCticallidIsNull() {
            addCriterion("CTICALLID is null");
            return (Criteria) this;
        }

        public Criteria andCticallidIsNotNull() {
            addCriterion("CTICALLID is not null");
            return (Criteria) this;
        }

        public Criteria andCticallidEqualTo(String value) {
            addCriterion("CTICALLID =", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidNotEqualTo(String value) {
            addCriterion("CTICALLID <>", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidGreaterThan(String value) {
            addCriterion("CTICALLID >", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidGreaterThanOrEqualTo(String value) {
            addCriterion("CTICALLID >=", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidLessThan(String value) {
            addCriterion("CTICALLID <", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidLessThanOrEqualTo(String value) {
            addCriterion("CTICALLID <=", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidLike(String value) {
            addCriterion("CTICALLID like", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidNotLike(String value) {
            addCriterion("CTICALLID not like", value, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidIn(List<String> values) {
            addCriterion("CTICALLID in", values, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidNotIn(List<String> values) {
            addCriterion("CTICALLID not in", values, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidBetween(String value1, String value2) {
            addCriterion("CTICALLID between", value1, value2, "cticallid");
            return (Criteria) this;
        }

        public Criteria andCticallidNotBetween(String value1, String value2) {
            addCriterion("CTICALLID not between", value1, value2, "cticallid");
            return (Criteria) this;
        }

        public Criteria andTransferflagIsNull() {
            addCriterion("TRANSFERFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTransferflagIsNotNull() {
            addCriterion("TRANSFERFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTransferflagEqualTo(String value) {
            addCriterion("TRANSFERFLAG =", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagNotEqualTo(String value) {
            addCriterion("TRANSFERFLAG <>", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagGreaterThan(String value) {
            addCriterion("TRANSFERFLAG >", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFERFLAG >=", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagLessThan(String value) {
            addCriterion("TRANSFERFLAG <", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagLessThanOrEqualTo(String value) {
            addCriterion("TRANSFERFLAG <=", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagLike(String value) {
            addCriterion("TRANSFERFLAG like", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagNotLike(String value) {
            addCriterion("TRANSFERFLAG not like", value, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagIn(List<String> values) {
            addCriterion("TRANSFERFLAG in", values, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagNotIn(List<String> values) {
            addCriterion("TRANSFERFLAG not in", values, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagBetween(String value1, String value2) {
            addCriterion("TRANSFERFLAG between", value1, value2, "transferflag");
            return (Criteria) this;
        }

        public Criteria andTransferflagNotBetween(String value1, String value2) {
            addCriterion("TRANSFERFLAG not between", value1, value2, "transferflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagIsNull() {
            addCriterion("CONFERENCEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andConferenceflagIsNotNull() {
            addCriterion("CONFERENCEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceflagEqualTo(String value) {
            addCriterion("CONFERENCEFLAG =", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagNotEqualTo(String value) {
            addCriterion("CONFERENCEFLAG <>", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagGreaterThan(String value) {
            addCriterion("CONFERENCEFLAG >", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagGreaterThanOrEqualTo(String value) {
            addCriterion("CONFERENCEFLAG >=", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagLessThan(String value) {
            addCriterion("CONFERENCEFLAG <", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagLessThanOrEqualTo(String value) {
            addCriterion("CONFERENCEFLAG <=", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagLike(String value) {
            addCriterion("CONFERENCEFLAG like", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagNotLike(String value) {
            addCriterion("CONFERENCEFLAG not like", value, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagIn(List<String> values) {
            addCriterion("CONFERENCEFLAG in", values, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagNotIn(List<String> values) {
            addCriterion("CONFERENCEFLAG not in", values, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagBetween(String value1, String value2) {
            addCriterion("CONFERENCEFLAG between", value1, value2, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andConferenceflagNotBetween(String value1, String value2) {
            addCriterion("CONFERENCEFLAG not between", value1, value2, "conferenceflag");
            return (Criteria) this;
        }

        public Criteria andLockflagIsNull() {
            addCriterion("LOCKFLAG is null");
            return (Criteria) this;
        }

        public Criteria andLockflagIsNotNull() {
            addCriterion("LOCKFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLockflagEqualTo(String value) {
            addCriterion("LOCKFLAG =", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotEqualTo(String value) {
            addCriterion("LOCKFLAG <>", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagGreaterThan(String value) {
            addCriterion("LOCKFLAG >", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKFLAG >=", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLessThan(String value) {
            addCriterion("LOCKFLAG <", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLessThanOrEqualTo(String value) {
            addCriterion("LOCKFLAG <=", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagLike(String value) {
            addCriterion("LOCKFLAG like", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotLike(String value) {
            addCriterion("LOCKFLAG not like", value, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagIn(List<String> values) {
            addCriterion("LOCKFLAG in", values, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotIn(List<String> values) {
            addCriterion("LOCKFLAG not in", values, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagBetween(String value1, String value2) {
            addCriterion("LOCKFLAG between", value1, value2, "lockflag");
            return (Criteria) this;
        }

        public Criteria andLockflagNotBetween(String value1, String value2) {
            addCriterion("LOCKFLAG not between", value1, value2, "lockflag");
            return (Criteria) this;
        }

        public Criteria andSkillgroupIsNull() {
            addCriterion("SKILLGROUP is null");
            return (Criteria) this;
        }

        public Criteria andSkillgroupIsNotNull() {
            addCriterion("SKILLGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSkillgroupEqualTo(String value) {
            addCriterion("SKILLGROUP =", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupNotEqualTo(String value) {
            addCriterion("SKILLGROUP <>", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupGreaterThan(String value) {
            addCriterion("SKILLGROUP >", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupGreaterThanOrEqualTo(String value) {
            addCriterion("SKILLGROUP >=", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupLessThan(String value) {
            addCriterion("SKILLGROUP <", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupLessThanOrEqualTo(String value) {
            addCriterion("SKILLGROUP <=", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupLike(String value) {
            addCriterion("SKILLGROUP like", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupNotLike(String value) {
            addCriterion("SKILLGROUP not like", value, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupIn(List<String> values) {
            addCriterion("SKILLGROUP in", values, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupNotIn(List<String> values) {
            addCriterion("SKILLGROUP not in", values, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupBetween(String value1, String value2) {
            addCriterion("SKILLGROUP between", value1, value2, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andSkillgroupNotBetween(String value1, String value2) {
            addCriterion("SKILLGROUP not between", value1, value2, "skillgroup");
            return (Criteria) this;
        }

        public Criteria andLockeridIsNull() {
            addCriterion("LOCKERID is null");
            return (Criteria) this;
        }

        public Criteria andLockeridIsNotNull() {
            addCriterion("LOCKERID is not null");
            return (Criteria) this;
        }

        public Criteria andLockeridEqualTo(String value) {
            addCriterion("LOCKERID =", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridNotEqualTo(String value) {
            addCriterion("LOCKERID <>", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridGreaterThan(String value) {
            addCriterion("LOCKERID >", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKERID >=", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridLessThan(String value) {
            addCriterion("LOCKERID <", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridLessThanOrEqualTo(String value) {
            addCriterion("LOCKERID <=", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridLike(String value) {
            addCriterion("LOCKERID like", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridNotLike(String value) {
            addCriterion("LOCKERID not like", value, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridIn(List<String> values) {
            addCriterion("LOCKERID in", values, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridNotIn(List<String> values) {
            addCriterion("LOCKERID not in", values, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridBetween(String value1, String value2) {
            addCriterion("LOCKERID between", value1, value2, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockeridNotBetween(String value1, String value2) {
            addCriterion("LOCKERID not between", value1, value2, "lockerid");
            return (Criteria) this;
        }

        public Criteria andLockmemoIsNull() {
            addCriterion("LOCKMEMO is null");
            return (Criteria) this;
        }

        public Criteria andLockmemoIsNotNull() {
            addCriterion("LOCKMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andLockmemoEqualTo(String value) {
            addCriterion("LOCKMEMO =", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoNotEqualTo(String value) {
            addCriterion("LOCKMEMO <>", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoGreaterThan(String value) {
            addCriterion("LOCKMEMO >", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKMEMO >=", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoLessThan(String value) {
            addCriterion("LOCKMEMO <", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoLessThanOrEqualTo(String value) {
            addCriterion("LOCKMEMO <=", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoLike(String value) {
            addCriterion("LOCKMEMO like", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoNotLike(String value) {
            addCriterion("LOCKMEMO not like", value, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoIn(List<String> values) {
            addCriterion("LOCKMEMO in", values, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoNotIn(List<String> values) {
            addCriterion("LOCKMEMO not in", values, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoBetween(String value1, String value2) {
            addCriterion("LOCKMEMO between", value1, value2, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andLockmemoNotBetween(String value1, String value2) {
            addCriterion("LOCKMEMO not between", value1, value2, "lockmemo");
            return (Criteria) this;
        }

        public Criteria andArchivecountIsNull() {
            addCriterion("ARCHIVECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andArchivecountIsNotNull() {
            addCriterion("ARCHIVECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andArchivecountEqualTo(Integer value) {
            addCriterion("ARCHIVECOUNT =", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountNotEqualTo(Integer value) {
            addCriterion("ARCHIVECOUNT <>", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountGreaterThan(Integer value) {
            addCriterion("ARCHIVECOUNT >", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ARCHIVECOUNT >=", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountLessThan(Integer value) {
            addCriterion("ARCHIVECOUNT <", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountLessThanOrEqualTo(Integer value) {
            addCriterion("ARCHIVECOUNT <=", value, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountIn(List<Integer> values) {
            addCriterion("ARCHIVECOUNT in", values, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountNotIn(List<Integer> values) {
            addCriterion("ARCHIVECOUNT not in", values, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountBetween(Integer value1, Integer value2) {
            addCriterion("ARCHIVECOUNT between", value1, value2, "archivecount");
            return (Criteria) this;
        }

        public Criteria andArchivecountNotBetween(Integer value1, Integer value2) {
            addCriterion("ARCHIVECOUNT not between", value1, value2, "archivecount");
            return (Criteria) this;
        }

        public Criteria andTagcountIsNull() {
            addCriterion("TAGCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTagcountIsNotNull() {
            addCriterion("TAGCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTagcountEqualTo(Long value) {
            addCriterion("TAGCOUNT =", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountNotEqualTo(Long value) {
            addCriterion("TAGCOUNT <>", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountGreaterThan(Long value) {
            addCriterion("TAGCOUNT >", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountGreaterThanOrEqualTo(Long value) {
            addCriterion("TAGCOUNT >=", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountLessThan(Long value) {
            addCriterion("TAGCOUNT <", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountLessThanOrEqualTo(Long value) {
            addCriterion("TAGCOUNT <=", value, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountIn(List<Long> values) {
            addCriterion("TAGCOUNT in", values, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountNotIn(List<Long> values) {
            addCriterion("TAGCOUNT not in", values, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountBetween(Long value1, Long value2) {
            addCriterion("TAGCOUNT between", value1, value2, "tagcount");
            return (Criteria) this;
        }

        public Criteria andTagcountNotBetween(Long value1, Long value2) {
            addCriterion("TAGCOUNT not between", value1, value2, "tagcount");
            return (Criteria) this;
        }

        public Criteria andCustomer1IsNull() {
            addCriterion("CUSTOMER1 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer1IsNotNull() {
            addCriterion("CUSTOMER1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer1EqualTo(String value) {
            addCriterion("CUSTOMER1 =", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1NotEqualTo(String value) {
            addCriterion("CUSTOMER1 <>", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1GreaterThan(String value) {
            addCriterion("CUSTOMER1 >", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER1 >=", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1LessThan(String value) {
            addCriterion("CUSTOMER1 <", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER1 <=", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1Like(String value) {
            addCriterion("CUSTOMER1 like", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1NotLike(String value) {
            addCriterion("CUSTOMER1 not like", value, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1In(List<String> values) {
            addCriterion("CUSTOMER1 in", values, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1NotIn(List<String> values) {
            addCriterion("CUSTOMER1 not in", values, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1Between(String value1, String value2) {
            addCriterion("CUSTOMER1 between", value1, value2, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer1NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER1 not between", value1, value2, "customer1");
            return (Criteria) this;
        }

        public Criteria andCustomer2IsNull() {
            addCriterion("CUSTOMER2 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer2IsNotNull() {
            addCriterion("CUSTOMER2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer2EqualTo(String value) {
            addCriterion("CUSTOMER2 =", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2NotEqualTo(String value) {
            addCriterion("CUSTOMER2 <>", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2GreaterThan(String value) {
            addCriterion("CUSTOMER2 >", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER2 >=", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2LessThan(String value) {
            addCriterion("CUSTOMER2 <", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER2 <=", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2Like(String value) {
            addCriterion("CUSTOMER2 like", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2NotLike(String value) {
            addCriterion("CUSTOMER2 not like", value, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2In(List<String> values) {
            addCriterion("CUSTOMER2 in", values, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2NotIn(List<String> values) {
            addCriterion("CUSTOMER2 not in", values, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2Between(String value1, String value2) {
            addCriterion("CUSTOMER2 between", value1, value2, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer2NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER2 not between", value1, value2, "customer2");
            return (Criteria) this;
        }

        public Criteria andCustomer3IsNull() {
            addCriterion("CUSTOMER3 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer3IsNotNull() {
            addCriterion("CUSTOMER3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer3EqualTo(String value) {
            addCriterion("CUSTOMER3 =", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3NotEqualTo(String value) {
            addCriterion("CUSTOMER3 <>", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3GreaterThan(String value) {
            addCriterion("CUSTOMER3 >", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER3 >=", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3LessThan(String value) {
            addCriterion("CUSTOMER3 <", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER3 <=", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3Like(String value) {
            addCriterion("CUSTOMER3 like", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3NotLike(String value) {
            addCriterion("CUSTOMER3 not like", value, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3In(List<String> values) {
            addCriterion("CUSTOMER3 in", values, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3NotIn(List<String> values) {
            addCriterion("CUSTOMER3 not in", values, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3Between(String value1, String value2) {
            addCriterion("CUSTOMER3 between", value1, value2, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer3NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER3 not between", value1, value2, "customer3");
            return (Criteria) this;
        }

        public Criteria andCustomer4IsNull() {
            addCriterion("CUSTOMER4 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer4IsNotNull() {
            addCriterion("CUSTOMER4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer4EqualTo(String value) {
            addCriterion("CUSTOMER4 =", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4NotEqualTo(String value) {
            addCriterion("CUSTOMER4 <>", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4GreaterThan(String value) {
            addCriterion("CUSTOMER4 >", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER4 >=", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4LessThan(String value) {
            addCriterion("CUSTOMER4 <", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER4 <=", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4Like(String value) {
            addCriterion("CUSTOMER4 like", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4NotLike(String value) {
            addCriterion("CUSTOMER4 not like", value, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4In(List<String> values) {
            addCriterion("CUSTOMER4 in", values, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4NotIn(List<String> values) {
            addCriterion("CUSTOMER4 not in", values, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4Between(String value1, String value2) {
            addCriterion("CUSTOMER4 between", value1, value2, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer4NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER4 not between", value1, value2, "customer4");
            return (Criteria) this;
        }

        public Criteria andCustomer5IsNull() {
            addCriterion("CUSTOMER5 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer5IsNotNull() {
            addCriterion("CUSTOMER5 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer5EqualTo(String value) {
            addCriterion("CUSTOMER5 =", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5NotEqualTo(String value) {
            addCriterion("CUSTOMER5 <>", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5GreaterThan(String value) {
            addCriterion("CUSTOMER5 >", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER5 >=", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5LessThan(String value) {
            addCriterion("CUSTOMER5 <", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER5 <=", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5Like(String value) {
            addCriterion("CUSTOMER5 like", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5NotLike(String value) {
            addCriterion("CUSTOMER5 not like", value, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5In(List<String> values) {
            addCriterion("CUSTOMER5 in", values, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5NotIn(List<String> values) {
            addCriterion("CUSTOMER5 not in", values, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5Between(String value1, String value2) {
            addCriterion("CUSTOMER5 between", value1, value2, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer5NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER5 not between", value1, value2, "customer5");
            return (Criteria) this;
        }

        public Criteria andCustomer6IsNull() {
            addCriterion("CUSTOMER6 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer6IsNotNull() {
            addCriterion("CUSTOMER6 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer6EqualTo(String value) {
            addCriterion("CUSTOMER6 =", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6NotEqualTo(String value) {
            addCriterion("CUSTOMER6 <>", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6GreaterThan(String value) {
            addCriterion("CUSTOMER6 >", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER6 >=", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6LessThan(String value) {
            addCriterion("CUSTOMER6 <", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER6 <=", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6Like(String value) {
            addCriterion("CUSTOMER6 like", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6NotLike(String value) {
            addCriterion("CUSTOMER6 not like", value, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6In(List<String> values) {
            addCriterion("CUSTOMER6 in", values, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6NotIn(List<String> values) {
            addCriterion("CUSTOMER6 not in", values, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6Between(String value1, String value2) {
            addCriterion("CUSTOMER6 between", value1, value2, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer6NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER6 not between", value1, value2, "customer6");
            return (Criteria) this;
        }

        public Criteria andCustomer7IsNull() {
            addCriterion("CUSTOMER7 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer7IsNotNull() {
            addCriterion("CUSTOMER7 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer7EqualTo(String value) {
            addCriterion("CUSTOMER7 =", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7NotEqualTo(String value) {
            addCriterion("CUSTOMER7 <>", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7GreaterThan(String value) {
            addCriterion("CUSTOMER7 >", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER7 >=", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7LessThan(String value) {
            addCriterion("CUSTOMER7 <", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER7 <=", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7Like(String value) {
            addCriterion("CUSTOMER7 like", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7NotLike(String value) {
            addCriterion("CUSTOMER7 not like", value, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7In(List<String> values) {
            addCriterion("CUSTOMER7 in", values, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7NotIn(List<String> values) {
            addCriterion("CUSTOMER7 not in", values, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7Between(String value1, String value2) {
            addCriterion("CUSTOMER7 between", value1, value2, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer7NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER7 not between", value1, value2, "customer7");
            return (Criteria) this;
        }

        public Criteria andCustomer8IsNull() {
            addCriterion("CUSTOMER8 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer8IsNotNull() {
            addCriterion("CUSTOMER8 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer8EqualTo(String value) {
            addCriterion("CUSTOMER8 =", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8NotEqualTo(String value) {
            addCriterion("CUSTOMER8 <>", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8GreaterThan(String value) {
            addCriterion("CUSTOMER8 >", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER8 >=", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8LessThan(String value) {
            addCriterion("CUSTOMER8 <", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER8 <=", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8Like(String value) {
            addCriterion("CUSTOMER8 like", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8NotLike(String value) {
            addCriterion("CUSTOMER8 not like", value, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8In(List<String> values) {
            addCriterion("CUSTOMER8 in", values, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8NotIn(List<String> values) {
            addCriterion("CUSTOMER8 not in", values, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8Between(String value1, String value2) {
            addCriterion("CUSTOMER8 between", value1, value2, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer8NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER8 not between", value1, value2, "customer8");
            return (Criteria) this;
        }

        public Criteria andCustomer9IsNull() {
            addCriterion("CUSTOMER9 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer9IsNotNull() {
            addCriterion("CUSTOMER9 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer9EqualTo(String value) {
            addCriterion("CUSTOMER9 =", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9NotEqualTo(String value) {
            addCriterion("CUSTOMER9 <>", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9GreaterThan(String value) {
            addCriterion("CUSTOMER9 >", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER9 >=", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9LessThan(String value) {
            addCriterion("CUSTOMER9 <", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER9 <=", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9Like(String value) {
            addCriterion("CUSTOMER9 like", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9NotLike(String value) {
            addCriterion("CUSTOMER9 not like", value, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9In(List<String> values) {
            addCriterion("CUSTOMER9 in", values, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9NotIn(List<String> values) {
            addCriterion("CUSTOMER9 not in", values, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9Between(String value1, String value2) {
            addCriterion("CUSTOMER9 between", value1, value2, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer9NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER9 not between", value1, value2, "customer9");
            return (Criteria) this;
        }

        public Criteria andCustomer10IsNull() {
            addCriterion("CUSTOMER10 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer10IsNotNull() {
            addCriterion("CUSTOMER10 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer10EqualTo(String value) {
            addCriterion("CUSTOMER10 =", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10NotEqualTo(String value) {
            addCriterion("CUSTOMER10 <>", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10GreaterThan(String value) {
            addCriterion("CUSTOMER10 >", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER10 >=", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10LessThan(String value) {
            addCriterion("CUSTOMER10 <", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER10 <=", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10Like(String value) {
            addCriterion("CUSTOMER10 like", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10NotLike(String value) {
            addCriterion("CUSTOMER10 not like", value, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10In(List<String> values) {
            addCriterion("CUSTOMER10 in", values, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10NotIn(List<String> values) {
            addCriterion("CUSTOMER10 not in", values, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10Between(String value1, String value2) {
            addCriterion("CUSTOMER10 between", value1, value2, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer10NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER10 not between", value1, value2, "customer10");
            return (Criteria) this;
        }

        public Criteria andCustomer11IsNull() {
            addCriterion("CUSTOMER11 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer11IsNotNull() {
            addCriterion("CUSTOMER11 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer11EqualTo(String value) {
            addCriterion("CUSTOMER11 =", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11NotEqualTo(String value) {
            addCriterion("CUSTOMER11 <>", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11GreaterThan(String value) {
            addCriterion("CUSTOMER11 >", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER11 >=", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11LessThan(String value) {
            addCriterion("CUSTOMER11 <", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER11 <=", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11Like(String value) {
            addCriterion("CUSTOMER11 like", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11NotLike(String value) {
            addCriterion("CUSTOMER11 not like", value, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11In(List<String> values) {
            addCriterion("CUSTOMER11 in", values, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11NotIn(List<String> values) {
            addCriterion("CUSTOMER11 not in", values, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11Between(String value1, String value2) {
            addCriterion("CUSTOMER11 between", value1, value2, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer11NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER11 not between", value1, value2, "customer11");
            return (Criteria) this;
        }

        public Criteria andCustomer12IsNull() {
            addCriterion("CUSTOMER12 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer12IsNotNull() {
            addCriterion("CUSTOMER12 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer12EqualTo(String value) {
            addCriterion("CUSTOMER12 =", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12NotEqualTo(String value) {
            addCriterion("CUSTOMER12 <>", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12GreaterThan(String value) {
            addCriterion("CUSTOMER12 >", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER12 >=", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12LessThan(String value) {
            addCriterion("CUSTOMER12 <", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER12 <=", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12Like(String value) {
            addCriterion("CUSTOMER12 like", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12NotLike(String value) {
            addCriterion("CUSTOMER12 not like", value, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12In(List<String> values) {
            addCriterion("CUSTOMER12 in", values, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12NotIn(List<String> values) {
            addCriterion("CUSTOMER12 not in", values, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12Between(String value1, String value2) {
            addCriterion("CUSTOMER12 between", value1, value2, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer12NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER12 not between", value1, value2, "customer12");
            return (Criteria) this;
        }

        public Criteria andCustomer13IsNull() {
            addCriterion("CUSTOMER13 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer13IsNotNull() {
            addCriterion("CUSTOMER13 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer13EqualTo(String value) {
            addCriterion("CUSTOMER13 =", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13NotEqualTo(String value) {
            addCriterion("CUSTOMER13 <>", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13GreaterThan(String value) {
            addCriterion("CUSTOMER13 >", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER13 >=", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13LessThan(String value) {
            addCriterion("CUSTOMER13 <", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER13 <=", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13Like(String value) {
            addCriterion("CUSTOMER13 like", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13NotLike(String value) {
            addCriterion("CUSTOMER13 not like", value, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13In(List<String> values) {
            addCriterion("CUSTOMER13 in", values, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13NotIn(List<String> values) {
            addCriterion("CUSTOMER13 not in", values, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13Between(String value1, String value2) {
            addCriterion("CUSTOMER13 between", value1, value2, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer13NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER13 not between", value1, value2, "customer13");
            return (Criteria) this;
        }

        public Criteria andCustomer14IsNull() {
            addCriterion("CUSTOMER14 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer14IsNotNull() {
            addCriterion("CUSTOMER14 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer14EqualTo(String value) {
            addCriterion("CUSTOMER14 =", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14NotEqualTo(String value) {
            addCriterion("CUSTOMER14 <>", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14GreaterThan(String value) {
            addCriterion("CUSTOMER14 >", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER14 >=", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14LessThan(String value) {
            addCriterion("CUSTOMER14 <", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER14 <=", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14Like(String value) {
            addCriterion("CUSTOMER14 like", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14NotLike(String value) {
            addCriterion("CUSTOMER14 not like", value, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14In(List<String> values) {
            addCriterion("CUSTOMER14 in", values, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14NotIn(List<String> values) {
            addCriterion("CUSTOMER14 not in", values, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14Between(String value1, String value2) {
            addCriterion("CUSTOMER14 between", value1, value2, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer14NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER14 not between", value1, value2, "customer14");
            return (Criteria) this;
        }

        public Criteria andCustomer15IsNull() {
            addCriterion("CUSTOMER15 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer15IsNotNull() {
            addCriterion("CUSTOMER15 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer15EqualTo(String value) {
            addCriterion("CUSTOMER15 =", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15NotEqualTo(String value) {
            addCriterion("CUSTOMER15 <>", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15GreaterThan(String value) {
            addCriterion("CUSTOMER15 >", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER15 >=", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15LessThan(String value) {
            addCriterion("CUSTOMER15 <", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER15 <=", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15Like(String value) {
            addCriterion("CUSTOMER15 like", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15NotLike(String value) {
            addCriterion("CUSTOMER15 not like", value, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15In(List<String> values) {
            addCriterion("CUSTOMER15 in", values, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15NotIn(List<String> values) {
            addCriterion("CUSTOMER15 not in", values, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15Between(String value1, String value2) {
            addCriterion("CUSTOMER15 between", value1, value2, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer15NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER15 not between", value1, value2, "customer15");
            return (Criteria) this;
        }

        public Criteria andCustomer16IsNull() {
            addCriterion("CUSTOMER16 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer16IsNotNull() {
            addCriterion("CUSTOMER16 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer16EqualTo(String value) {
            addCriterion("CUSTOMER16 =", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16NotEqualTo(String value) {
            addCriterion("CUSTOMER16 <>", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16GreaterThan(String value) {
            addCriterion("CUSTOMER16 >", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER16 >=", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16LessThan(String value) {
            addCriterion("CUSTOMER16 <", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER16 <=", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16Like(String value) {
            addCriterion("CUSTOMER16 like", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16NotLike(String value) {
            addCriterion("CUSTOMER16 not like", value, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16In(List<String> values) {
            addCriterion("CUSTOMER16 in", values, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16NotIn(List<String> values) {
            addCriterion("CUSTOMER16 not in", values, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16Between(String value1, String value2) {
            addCriterion("CUSTOMER16 between", value1, value2, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer16NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER16 not between", value1, value2, "customer16");
            return (Criteria) this;
        }

        public Criteria andCustomer17IsNull() {
            addCriterion("CUSTOMER17 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer17IsNotNull() {
            addCriterion("CUSTOMER17 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer17EqualTo(String value) {
            addCriterion("CUSTOMER17 =", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17NotEqualTo(String value) {
            addCriterion("CUSTOMER17 <>", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17GreaterThan(String value) {
            addCriterion("CUSTOMER17 >", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER17 >=", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17LessThan(String value) {
            addCriterion("CUSTOMER17 <", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER17 <=", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17Like(String value) {
            addCriterion("CUSTOMER17 like", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17NotLike(String value) {
            addCriterion("CUSTOMER17 not like", value, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17In(List<String> values) {
            addCriterion("CUSTOMER17 in", values, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17NotIn(List<String> values) {
            addCriterion("CUSTOMER17 not in", values, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17Between(String value1, String value2) {
            addCriterion("CUSTOMER17 between", value1, value2, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer17NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER17 not between", value1, value2, "customer17");
            return (Criteria) this;
        }

        public Criteria andCustomer18IsNull() {
            addCriterion("CUSTOMER18 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer18IsNotNull() {
            addCriterion("CUSTOMER18 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer18EqualTo(String value) {
            addCriterion("CUSTOMER18 =", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18NotEqualTo(String value) {
            addCriterion("CUSTOMER18 <>", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18GreaterThan(String value) {
            addCriterion("CUSTOMER18 >", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER18 >=", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18LessThan(String value) {
            addCriterion("CUSTOMER18 <", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER18 <=", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18Like(String value) {
            addCriterion("CUSTOMER18 like", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18NotLike(String value) {
            addCriterion("CUSTOMER18 not like", value, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18In(List<String> values) {
            addCriterion("CUSTOMER18 in", values, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18NotIn(List<String> values) {
            addCriterion("CUSTOMER18 not in", values, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18Between(String value1, String value2) {
            addCriterion("CUSTOMER18 between", value1, value2, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer18NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER18 not between", value1, value2, "customer18");
            return (Criteria) this;
        }

        public Criteria andCustomer19IsNull() {
            addCriterion("CUSTOMER19 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer19IsNotNull() {
            addCriterion("CUSTOMER19 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer19EqualTo(String value) {
            addCriterion("CUSTOMER19 =", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19NotEqualTo(String value) {
            addCriterion("CUSTOMER19 <>", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19GreaterThan(String value) {
            addCriterion("CUSTOMER19 >", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER19 >=", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19LessThan(String value) {
            addCriterion("CUSTOMER19 <", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER19 <=", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19Like(String value) {
            addCriterion("CUSTOMER19 like", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19NotLike(String value) {
            addCriterion("CUSTOMER19 not like", value, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19In(List<String> values) {
            addCriterion("CUSTOMER19 in", values, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19NotIn(List<String> values) {
            addCriterion("CUSTOMER19 not in", values, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19Between(String value1, String value2) {
            addCriterion("CUSTOMER19 between", value1, value2, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer19NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER19 not between", value1, value2, "customer19");
            return (Criteria) this;
        }

        public Criteria andCustomer20IsNull() {
            addCriterion("CUSTOMER20 is null");
            return (Criteria) this;
        }

        public Criteria andCustomer20IsNotNull() {
            addCriterion("CUSTOMER20 is not null");
            return (Criteria) this;
        }

        public Criteria andCustomer20EqualTo(String value) {
            addCriterion("CUSTOMER20 =", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20NotEqualTo(String value) {
            addCriterion("CUSTOMER20 <>", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20GreaterThan(String value) {
            addCriterion("CUSTOMER20 >", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER20 >=", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20LessThan(String value) {
            addCriterion("CUSTOMER20 <", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20LessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER20 <=", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20Like(String value) {
            addCriterion("CUSTOMER20 like", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20NotLike(String value) {
            addCriterion("CUSTOMER20 not like", value, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20In(List<String> values) {
            addCriterion("CUSTOMER20 in", values, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20NotIn(List<String> values) {
            addCriterion("CUSTOMER20 not in", values, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20Between(String value1, String value2) {
            addCriterion("CUSTOMER20 between", value1, value2, "customer20");
            return (Criteria) this;
        }

        public Criteria andCustomer20NotBetween(String value1, String value2) {
            addCriterion("CUSTOMER20 not between", value1, value2, "customer20");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNull() {
            addCriterion("ENCRYPTED is null");
            return (Criteria) this;
        }

        public Criteria andEncryptedIsNotNull() {
            addCriterion("ENCRYPTED is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptedEqualTo(String value) {
            addCriterion("ENCRYPTED =", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotEqualTo(String value) {
            addCriterion("ENCRYPTED <>", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThan(String value) {
            addCriterion("ENCRYPTED >", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedGreaterThanOrEqualTo(String value) {
            addCriterion("ENCRYPTED >=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThan(String value) {
            addCriterion("ENCRYPTED <", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLessThanOrEqualTo(String value) {
            addCriterion("ENCRYPTED <=", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedLike(String value) {
            addCriterion("ENCRYPTED like", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotLike(String value) {
            addCriterion("ENCRYPTED not like", value, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedIn(List<String> values) {
            addCriterion("ENCRYPTED in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotIn(List<String> values) {
            addCriterion("ENCRYPTED not in", values, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedBetween(String value1, String value2) {
            addCriterion("ENCRYPTED between", value1, value2, "encrypted");
            return (Criteria) this;
        }

        public Criteria andEncryptedNotBetween(String value1, String value2) {
            addCriterion("ENCRYPTED not between", value1, value2, "encrypted");
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