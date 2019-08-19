package com.callsummary.model;

import java.util.ArrayList;
import java.util.List;

public class CallSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallSummaryExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEIsNull() {
            addCriterion("CALLREFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEIsNotNull() {
            addCriterion("CALLREFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEEqualTo(String value) {
            addCriterion("CALLREFERENCE =", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCENotEqualTo(String value) {
            addCriterion("CALLREFERENCE <>", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEGreaterThan(String value) {
            addCriterion("CALLREFERENCE >", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEGreaterThanOrEqualTo(String value) {
            addCriterion("CALLREFERENCE >=", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCELessThan(String value) {
            addCriterion("CALLREFERENCE <", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCELessThanOrEqualTo(String value) {
            addCriterion("CALLREFERENCE <=", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCELike(String value) {
            addCriterion("CALLREFERENCE like", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCENotLike(String value) {
            addCriterion("CALLREFERENCE not like", value, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEIn(List<String> values) {
            addCriterion("CALLREFERENCE in", values, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCENotIn(List<String> values) {
            addCriterion("CALLREFERENCE not in", values, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCEBetween(String value1, String value2) {
            addCriterion("CALLREFERENCE between", value1, value2, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCALLREFERENCENotBetween(String value1, String value2) {
            addCriterion("CALLREFERENCE not between", value1, value2, "CALLREFERENCE");
            return (Criteria) this;
        }

        public Criteria andCARD_NOIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCARD_NOIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCARD_NOEqualTo(String value) {
            addCriterion("CARD_NO =", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NONotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOLessThan(String value) {
            addCriterion("CARD_NO <", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOLike(String value) {
            addCriterion("CARD_NO like", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NONotLike(String value) {
            addCriterion("CARD_NO not like", value, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOIn(List<String> values) {
            addCriterion("CARD_NO in", values, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NONotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NOBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andCARD_NONotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "CARD_NO");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTIsNull() {
            addCriterion("TRANS_DT is null");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTIsNotNull() {
            addCriterion("TRANS_DT is not null");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTEqualTo(String value) {
            addCriterion("TRANS_DT =", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTNotEqualTo(String value) {
            addCriterion("TRANS_DT <>", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTGreaterThan(String value) {
            addCriterion("TRANS_DT >", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_DT >=", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTLessThan(String value) {
            addCriterion("TRANS_DT <", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTLessThanOrEqualTo(String value) {
            addCriterion("TRANS_DT <=", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTLike(String value) {
            addCriterion("TRANS_DT like", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTNotLike(String value) {
            addCriterion("TRANS_DT not like", value, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTIn(List<String> values) {
            addCriterion("TRANS_DT in", values, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTNotIn(List<String> values) {
            addCriterion("TRANS_DT not in", values, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTBetween(String value1, String value2) {
            addCriterion("TRANS_DT between", value1, value2, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andTRANS_DTNotBetween(String value1, String value2) {
            addCriterion("TRANS_DT not between", value1, value2, "TRANS_DT");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOIsNull() {
            addCriterion("CMPLOYEE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOIsNotNull() {
            addCriterion("CMPLOYEE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOEqualTo(String value) {
            addCriterion("CMPLOYEE_NO =", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NONotEqualTo(String value) {
            addCriterion("CMPLOYEE_NO <>", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOGreaterThan(String value) {
            addCriterion("CMPLOYEE_NO >", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CMPLOYEE_NO >=", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOLessThan(String value) {
            addCriterion("CMPLOYEE_NO <", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOLessThanOrEqualTo(String value) {
            addCriterion("CMPLOYEE_NO <=", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOLike(String value) {
            addCriterion("CMPLOYEE_NO like", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NONotLike(String value) {
            addCriterion("CMPLOYEE_NO not like", value, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOIn(List<String> values) {
            addCriterion("CMPLOYEE_NO in", values, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NONotIn(List<String> values) {
            addCriterion("CMPLOYEE_NO not in", values, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NOBetween(String value1, String value2) {
            addCriterion("CMPLOYEE_NO between", value1, value2, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NONotBetween(String value1, String value2) {
            addCriterion("CMPLOYEE_NO not between", value1, value2, "CMPLOYEE_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOIsNull() {
            addCriterion("CALL_IN_NO is null");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOIsNotNull() {
            addCriterion("CALL_IN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOEqualTo(String value) {
            addCriterion("CALL_IN_NO =", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NONotEqualTo(String value) {
            addCriterion("CALL_IN_NO <>", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOGreaterThan(String value) {
            addCriterion("CALL_IN_NO >", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_IN_NO >=", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOLessThan(String value) {
            addCriterion("CALL_IN_NO <", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOLessThanOrEqualTo(String value) {
            addCriterion("CALL_IN_NO <=", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOLike(String value) {
            addCriterion("CALL_IN_NO like", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NONotLike(String value) {
            addCriterion("CALL_IN_NO not like", value, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOIn(List<String> values) {
            addCriterion("CALL_IN_NO in", values, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NONotIn(List<String> values) {
            addCriterion("CALL_IN_NO not in", values, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NOBetween(String value1, String value2) {
            addCriterion("CALL_IN_NO between", value1, value2, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_IN_NONotBetween(String value1, String value2) {
            addCriterion("CALL_IN_NO not between", value1, value2, "CALL_IN_NO");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1IsNull() {
            addCriterion("SERVICE_TYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1IsNotNull() {
            addCriterion("SERVICE_TYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1EqualTo(String value) {
            addCriterion("SERVICE_TYPE1 =", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE1 <>", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1GreaterThan(String value) {
            addCriterion("SERVICE_TYPE1 >", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE1 >=", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1LessThan(String value) {
            addCriterion("SERVICE_TYPE1 <", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE1 <=", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1Like(String value) {
            addCriterion("SERVICE_TYPE1 like", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1NotLike(String value) {
            addCriterion("SERVICE_TYPE1 not like", value, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1In(List<String> values) {
            addCriterion("SERVICE_TYPE1 in", values, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE1 not in", values, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE1 between", value1, value2, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE1NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE1 not between", value1, value2, "SERVICE_TYPE1");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEIsNull() {
            addCriterion("SERVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEIsNotNull() {
            addCriterion("SERVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEEqualTo(String value) {
            addCriterion("SERVICE_TYPE =", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPENotEqualTo(String value) {
            addCriterion("SERVICE_TYPE <>", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEGreaterThan(String value) {
            addCriterion("SERVICE_TYPE >", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE >=", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPELessThan(String value) {
            addCriterion("SERVICE_TYPE <", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPELessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE <=", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPELike(String value) {
            addCriterion("SERVICE_TYPE like", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPENotLike(String value) {
            addCriterion("SERVICE_TYPE not like", value, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEIn(List<String> values) {
            addCriterion("SERVICE_TYPE in", values, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPENotIn(List<String> values) {
            addCriterion("SERVICE_TYPE not in", values, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPEBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE between", value1, value2, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPENotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE not between", value1, value2, "SERVICE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3IsNull() {
            addCriterion("SERVICE_TYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3IsNotNull() {
            addCriterion("SERVICE_TYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3EqualTo(String value) {
            addCriterion("SERVICE_TYPE3 =", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE3 <>", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3GreaterThan(String value) {
            addCriterion("SERVICE_TYPE3 >", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE3 >=", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3LessThan(String value) {
            addCriterion("SERVICE_TYPE3 <", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE3 <=", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3Like(String value) {
            addCriterion("SERVICE_TYPE3 like", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3NotLike(String value) {
            addCriterion("SERVICE_TYPE3 not like", value, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3In(List<String> values) {
            addCriterion("SERVICE_TYPE3 in", values, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE3 not in", values, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE3 between", value1, value2, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE3NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE3 not between", value1, value2, "SERVICE_TYPE3");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4IsNull() {
            addCriterion("SERVICE_TYPE4 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4IsNotNull() {
            addCriterion("SERVICE_TYPE4 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4EqualTo(String value) {
            addCriterion("SERVICE_TYPE4 =", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE4 <>", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4GreaterThan(String value) {
            addCriterion("SERVICE_TYPE4 >", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE4 >=", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4LessThan(String value) {
            addCriterion("SERVICE_TYPE4 <", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE4 <=", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4Like(String value) {
            addCriterion("SERVICE_TYPE4 like", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4NotLike(String value) {
            addCriterion("SERVICE_TYPE4 not like", value, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4In(List<String> values) {
            addCriterion("SERVICE_TYPE4 in", values, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE4 not in", values, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE4 between", value1, value2, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE4NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE4 not between", value1, value2, "SERVICE_TYPE4");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5IsNull() {
            addCriterion("SERVICE_TYPE5 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5IsNotNull() {
            addCriterion("SERVICE_TYPE5 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5EqualTo(String value) {
            addCriterion("SERVICE_TYPE5 =", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE5 <>", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5GreaterThan(String value) {
            addCriterion("SERVICE_TYPE5 >", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE5 >=", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5LessThan(String value) {
            addCriterion("SERVICE_TYPE5 <", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE5 <=", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5Like(String value) {
            addCriterion("SERVICE_TYPE5 like", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5NotLike(String value) {
            addCriterion("SERVICE_TYPE5 not like", value, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5In(List<String> values) {
            addCriterion("SERVICE_TYPE5 in", values, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE5 not in", values, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE5 between", value1, value2, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE5NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE5 not between", value1, value2, "SERVICE_TYPE5");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6IsNull() {
            addCriterion("SERVICE_TYPE6 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6IsNotNull() {
            addCriterion("SERVICE_TYPE6 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6EqualTo(String value) {
            addCriterion("SERVICE_TYPE6 =", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE6 <>", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6GreaterThan(String value) {
            addCriterion("SERVICE_TYPE6 >", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE6 >=", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6LessThan(String value) {
            addCriterion("SERVICE_TYPE6 <", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE6 <=", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6Like(String value) {
            addCriterion("SERVICE_TYPE6 like", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6NotLike(String value) {
            addCriterion("SERVICE_TYPE6 not like", value, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6In(List<String> values) {
            addCriterion("SERVICE_TYPE6 in", values, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE6 not in", values, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE6 between", value1, value2, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE6NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE6 not between", value1, value2, "SERVICE_TYPE6");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7IsNull() {
            addCriterion("SERVICE_TYPE7 is null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7IsNotNull() {
            addCriterion("SERVICE_TYPE7 is not null");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7EqualTo(String value) {
            addCriterion("SERVICE_TYPE7 =", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7NotEqualTo(String value) {
            addCriterion("SERVICE_TYPE7 <>", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7GreaterThan(String value) {
            addCriterion("SERVICE_TYPE7 >", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7GreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE7 >=", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7LessThan(String value) {
            addCriterion("SERVICE_TYPE7 <", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7LessThanOrEqualTo(String value) {
            addCriterion("SERVICE_TYPE7 <=", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7Like(String value) {
            addCriterion("SERVICE_TYPE7 like", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7NotLike(String value) {
            addCriterion("SERVICE_TYPE7 not like", value, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7In(List<String> values) {
            addCriterion("SERVICE_TYPE7 in", values, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7NotIn(List<String> values) {
            addCriterion("SERVICE_TYPE7 not in", values, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7Between(String value1, String value2) {
            addCriterion("SERVICE_TYPE7 between", value1, value2, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andSERVICE_TYPE7NotBetween(String value1, String value2) {
            addCriterion("SERVICE_TYPE7 not between", value1, value2, "SERVICE_TYPE7");
            return (Criteria) this;
        }

        public Criteria andCTI_NOIsNull() {
            addCriterion("CTI_NO is null");
            return (Criteria) this;
        }

        public Criteria andCTI_NOIsNotNull() {
            addCriterion("CTI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCTI_NOEqualTo(String value) {
            addCriterion("CTI_NO =", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NONotEqualTo(String value) {
            addCriterion("CTI_NO <>", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOGreaterThan(String value) {
            addCriterion("CTI_NO >", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CTI_NO >=", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOLessThan(String value) {
            addCriterion("CTI_NO <", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOLessThanOrEqualTo(String value) {
            addCriterion("CTI_NO <=", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOLike(String value) {
            addCriterion("CTI_NO like", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NONotLike(String value) {
            addCriterion("CTI_NO not like", value, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOIn(List<String> values) {
            addCriterion("CTI_NO in", values, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NONotIn(List<String> values) {
            addCriterion("CTI_NO not in", values, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NOBetween(String value1, String value2) {
            addCriterion("CTI_NO between", value1, value2, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andCTI_NONotBetween(String value1, String value2) {
            addCriterion("CTI_NO not between", value1, value2, "CTI_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOIsNull() {
            addCriterion("IN_CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOIsNotNull() {
            addCriterion("IN_CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOEqualTo(String value) {
            addCriterion("IN_CARD_NO =", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NONotEqualTo(String value) {
            addCriterion("IN_CARD_NO <>", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOGreaterThan(String value) {
            addCriterion("IN_CARD_NO >", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOGreaterThanOrEqualTo(String value) {
            addCriterion("IN_CARD_NO >=", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOLessThan(String value) {
            addCriterion("IN_CARD_NO <", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOLessThanOrEqualTo(String value) {
            addCriterion("IN_CARD_NO <=", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOLike(String value) {
            addCriterion("IN_CARD_NO like", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NONotLike(String value) {
            addCriterion("IN_CARD_NO not like", value, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOIn(List<String> values) {
            addCriterion("IN_CARD_NO in", values, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NONotIn(List<String> values) {
            addCriterion("IN_CARD_NO not in", values, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NOBetween(String value1, String value2) {
            addCriterion("IN_CARD_NO between", value1, value2, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIN_CARD_NONotBetween(String value1, String value2) {
            addCriterion("IN_CARD_NO not between", value1, value2, "IN_CARD_NO");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGIsNull() {
            addCriterion("IC_CARD_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGIsNotNull() {
            addCriterion("IC_CARD_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGEqualTo(String value) {
            addCriterion("IC_CARD_FLAG =", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGNotEqualTo(String value) {
            addCriterion("IC_CARD_FLAG <>", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGGreaterThan(String value) {
            addCriterion("IC_CARD_FLAG >", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("IC_CARD_FLAG >=", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGLessThan(String value) {
            addCriterion("IC_CARD_FLAG <", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGLessThanOrEqualTo(String value) {
            addCriterion("IC_CARD_FLAG <=", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGLike(String value) {
            addCriterion("IC_CARD_FLAG like", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGNotLike(String value) {
            addCriterion("IC_CARD_FLAG not like", value, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGIn(List<String> values) {
            addCriterion("IC_CARD_FLAG in", values, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGNotIn(List<String> values) {
            addCriterion("IC_CARD_FLAG not in", values, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGBetween(String value1, String value2) {
            addCriterion("IC_CARD_FLAG between", value1, value2, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andIC_CARD_FLAGNotBetween(String value1, String value2) {
            addCriterion("IC_CARD_FLAG not between", value1, value2, "IC_CARD_FLAG");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEIsNull() {
            addCriterion("CUST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEIsNotNull() {
            addCriterion("CUST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEEqualTo(String value) {
            addCriterion("CUST_TYPE =", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPENotEqualTo(String value) {
            addCriterion("CUST_TYPE <>", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEGreaterThan(String value) {
            addCriterion("CUST_TYPE >", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE >=", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPELessThan(String value) {
            addCriterion("CUST_TYPE <", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPELessThanOrEqualTo(String value) {
            addCriterion("CUST_TYPE <=", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPELike(String value) {
            addCriterion("CUST_TYPE like", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPENotLike(String value) {
            addCriterion("CUST_TYPE not like", value, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEIn(List<String> values) {
            addCriterion("CUST_TYPE in", values, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPENotIn(List<String> values) {
            addCriterion("CUST_TYPE not in", values, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPEBetween(String value1, String value2) {
            addCriterion("CUST_TYPE between", value1, value2, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_TYPENotBetween(String value1, String value2) {
            addCriterion("CUST_TYPE not between", value1, value2, "CUST_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYIsNull() {
            addCriterion("CUST_IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYIsNotNull() {
            addCriterion("CUST_IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYEqualTo(String value) {
            addCriterion("CUST_IDENTITY =", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYNotEqualTo(String value) {
            addCriterion("CUST_IDENTITY <>", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYGreaterThan(String value) {
            addCriterion("CUST_IDENTITY >", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_IDENTITY >=", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYLessThan(String value) {
            addCriterion("CUST_IDENTITY <", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYLessThanOrEqualTo(String value) {
            addCriterion("CUST_IDENTITY <=", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYLike(String value) {
            addCriterion("CUST_IDENTITY like", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYNotLike(String value) {
            addCriterion("CUST_IDENTITY not like", value, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYIn(List<String> values) {
            addCriterion("CUST_IDENTITY in", values, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYNotIn(List<String> values) {
            addCriterion("CUST_IDENTITY not in", values, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYBetween(String value1, String value2) {
            addCriterion("CUST_IDENTITY between", value1, value2, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCUST_IDENTITYNotBetween(String value1, String value2) {
            addCriterion("CUST_IDENTITY not between", value1, value2, "CUST_IDENTITY");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEIsNull() {
            addCriterion("CTI_CALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEIsNotNull() {
            addCriterion("CTI_CALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEEqualTo(String value) {
            addCriterion("CTI_CALL_TYPE =", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPENotEqualTo(String value) {
            addCriterion("CTI_CALL_TYPE <>", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEGreaterThan(String value) {
            addCriterion("CTI_CALL_TYPE >", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CTI_CALL_TYPE >=", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPELessThan(String value) {
            addCriterion("CTI_CALL_TYPE <", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPELessThanOrEqualTo(String value) {
            addCriterion("CTI_CALL_TYPE <=", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPELike(String value) {
            addCriterion("CTI_CALL_TYPE like", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPENotLike(String value) {
            addCriterion("CTI_CALL_TYPE not like", value, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEIn(List<String> values) {
            addCriterion("CTI_CALL_TYPE in", values, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPENotIn(List<String> values) {
            addCriterion("CTI_CALL_TYPE not in", values, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPEBetween(String value1, String value2) {
            addCriterion("CTI_CALL_TYPE between", value1, value2, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTI_CALL_TYPENotBetween(String value1, String value2) {
            addCriterion("CTI_CALL_TYPE not between", value1, value2, "CTI_CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELessThan(String value) {
            addCriterion("LANGUAGE <", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGELike(String value) {
            addCriterion("LANGUAGE like", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotLike(String value) {
            addCriterion("LANGUAGE not like", value, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGEBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andLANGUAGENotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "LANGUAGE");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGIsNull() {
            addCriterion("ONE_FINISH_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGIsNotNull() {
            addCriterion("ONE_FINISH_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGEqualTo(String value) {
            addCriterion("ONE_FINISH_FLAG =", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGNotEqualTo(String value) {
            addCriterion("ONE_FINISH_FLAG <>", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGGreaterThan(String value) {
            addCriterion("ONE_FINISH_FLAG >", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("ONE_FINISH_FLAG >=", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGLessThan(String value) {
            addCriterion("ONE_FINISH_FLAG <", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGLessThanOrEqualTo(String value) {
            addCriterion("ONE_FINISH_FLAG <=", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGLike(String value) {
            addCriterion("ONE_FINISH_FLAG like", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGNotLike(String value) {
            addCriterion("ONE_FINISH_FLAG not like", value, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGIn(List<String> values) {
            addCriterion("ONE_FINISH_FLAG in", values, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGNotIn(List<String> values) {
            addCriterion("ONE_FINISH_FLAG not in", values, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGBetween(String value1, String value2) {
            addCriterion("ONE_FINISH_FLAG between", value1, value2, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andONE_FINISH_FLAGNotBetween(String value1, String value2) {
            addCriterion("ONE_FINISH_FLAG not between", value1, value2, "ONE_FINISH_FLAG");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOIsNull() {
            addCriterion("CALL_OUT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOIsNotNull() {
            addCriterion("CALL_OUT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOEqualTo(String value) {
            addCriterion("CALL_OUT_NO =", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NONotEqualTo(String value) {
            addCriterion("CALL_OUT_NO <>", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOGreaterThan(String value) {
            addCriterion("CALL_OUT_NO >", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_OUT_NO >=", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOLessThan(String value) {
            addCriterion("CALL_OUT_NO <", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOLessThanOrEqualTo(String value) {
            addCriterion("CALL_OUT_NO <=", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOLike(String value) {
            addCriterion("CALL_OUT_NO like", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NONotLike(String value) {
            addCriterion("CALL_OUT_NO not like", value, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOIn(List<String> values) {
            addCriterion("CALL_OUT_NO in", values, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NONotIn(List<String> values) {
            addCriterion("CALL_OUT_NO not in", values, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NOBetween(String value1, String value2) {
            addCriterion("CALL_OUT_NO between", value1, value2, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andCALL_OUT_NONotBetween(String value1, String value2) {
            addCriterion("CALL_OUT_NO not between", value1, value2, "CALL_OUT_NO");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIsNull() {
            addCriterion("EXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIsNotNull() {
            addCriterion("EXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONEqualTo(String value) {
            addCriterion("EXTENSION =", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotEqualTo(String value) {
            addCriterion("EXTENSION <>", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONGreaterThan(String value) {
            addCriterion("EXTENSION >", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION >=", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLessThan(String value) {
            addCriterion("EXTENSION <", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION <=", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLike(String value) {
            addCriterion("EXTENSION like", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotLike(String value) {
            addCriterion("EXTENSION not like", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIn(List<String> values) {
            addCriterion("EXTENSION in", values, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotIn(List<String> values) {
            addCriterion("EXTENSION not in", values, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONBetween(String value1, String value2) {
            addCriterion("EXTENSION between", value1, value2, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotBetween(String value1, String value2) {
            addCriterion("EXTENSION not between", value1, value2, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDIsNull() {
            addCriterion("CALL_AGENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDIsNotNull() {
            addCriterion("CALL_AGENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDEqualTo(String value) {
            addCriterion("CALL_AGENT_ID =", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDNotEqualTo(String value) {
            addCriterion("CALL_AGENT_ID <>", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDGreaterThan(String value) {
            addCriterion("CALL_AGENT_ID >", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_AGENT_ID >=", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDLessThan(String value) {
            addCriterion("CALL_AGENT_ID <", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDLessThanOrEqualTo(String value) {
            addCriterion("CALL_AGENT_ID <=", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDLike(String value) {
            addCriterion("CALL_AGENT_ID like", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDNotLike(String value) {
            addCriterion("CALL_AGENT_ID not like", value, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDIn(List<String> values) {
            addCriterion("CALL_AGENT_ID in", values, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDNotIn(List<String> values) {
            addCriterion("CALL_AGENT_ID not in", values, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDBetween(String value1, String value2) {
            addCriterion("CALL_AGENT_ID between", value1, value2, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andCALL_AGENT_IDNotBetween(String value1, String value2) {
            addCriterion("CALL_AGENT_ID not between", value1, value2, "CALL_AGENT_ID");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGIsNull() {
            addCriterion("MAKEUP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGIsNotNull() {
            addCriterion("MAKEUP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGEqualTo(String value) {
            addCriterion("MAKEUP_FLAG =", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGNotEqualTo(String value) {
            addCriterion("MAKEUP_FLAG <>", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGGreaterThan(String value) {
            addCriterion("MAKEUP_FLAG >", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("MAKEUP_FLAG >=", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGLessThan(String value) {
            addCriterion("MAKEUP_FLAG <", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGLessThanOrEqualTo(String value) {
            addCriterion("MAKEUP_FLAG <=", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGLike(String value) {
            addCriterion("MAKEUP_FLAG like", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGNotLike(String value) {
            addCriterion("MAKEUP_FLAG not like", value, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGIn(List<String> values) {
            addCriterion("MAKEUP_FLAG in", values, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGNotIn(List<String> values) {
            addCriterion("MAKEUP_FLAG not in", values, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGBetween(String value1, String value2) {
            addCriterion("MAKEUP_FLAG between", value1, value2, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andMAKEUP_FLAGNotBetween(String value1, String value2) {
            addCriterion("MAKEUP_FLAG not between", value1, value2, "MAKEUP_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGIsNull() {
            addCriterion("SATISFYS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGIsNotNull() {
            addCriterion("SATISFYS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGEqualTo(String value) {
            addCriterion("SATISFYS_FLAG =", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGNotEqualTo(String value) {
            addCriterion("SATISFYS_FLAG <>", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGGreaterThan(String value) {
            addCriterion("SATISFYS_FLAG >", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("SATISFYS_FLAG >=", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGLessThan(String value) {
            addCriterion("SATISFYS_FLAG <", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGLessThanOrEqualTo(String value) {
            addCriterion("SATISFYS_FLAG <=", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGLike(String value) {
            addCriterion("SATISFYS_FLAG like", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGNotLike(String value) {
            addCriterion("SATISFYS_FLAG not like", value, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGIn(List<String> values) {
            addCriterion("SATISFYS_FLAG in", values, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGNotIn(List<String> values) {
            addCriterion("SATISFYS_FLAG not in", values, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGBetween(String value1, String value2) {
            addCriterion("SATISFYS_FLAG between", value1, value2, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_FLAGNotBetween(String value1, String value2) {
            addCriterion("SATISFYS_FLAG not between", value1, value2, "SATISFYS_FLAG");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEIsNull() {
            addCriterion("CALL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEIsNotNull() {
            addCriterion("CALL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEEqualTo(String value) {
            addCriterion("CALL_TYPE =", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPENotEqualTo(String value) {
            addCriterion("CALL_TYPE <>", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEGreaterThan(String value) {
            addCriterion("CALL_TYPE >", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE >=", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPELessThan(String value) {
            addCriterion("CALL_TYPE <", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPELessThanOrEqualTo(String value) {
            addCriterion("CALL_TYPE <=", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPELike(String value) {
            addCriterion("CALL_TYPE like", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPENotLike(String value) {
            addCriterion("CALL_TYPE not like", value, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEIn(List<String> values) {
            addCriterion("CALL_TYPE in", values, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPENotIn(List<String> values) {
            addCriterion("CALL_TYPE not in", values, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPEBetween(String value1, String value2) {
            addCriterion("CALL_TYPE between", value1, value2, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCALL_TYPENotBetween(String value1, String value2) {
            addCriterion("CALL_TYPE not between", value1, value2, "CALL_TYPE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEIsNull() {
            addCriterion("CUST_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEIsNotNull() {
            addCriterion("CUST_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEEqualTo(String value) {
            addCriterion("CUST_PHONE =", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONENotEqualTo(String value) {
            addCriterion("CUST_PHONE <>", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEGreaterThan(String value) {
            addCriterion("CUST_PHONE >", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_PHONE >=", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONELessThan(String value) {
            addCriterion("CUST_PHONE <", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONELessThanOrEqualTo(String value) {
            addCriterion("CUST_PHONE <=", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONELike(String value) {
            addCriterion("CUST_PHONE like", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONENotLike(String value) {
            addCriterion("CUST_PHONE not like", value, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEIn(List<String> values) {
            addCriterion("CUST_PHONE in", values, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONENotIn(List<String> values) {
            addCriterion("CUST_PHONE not in", values, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONEBetween(String value1, String value2) {
            addCriterion("CUST_PHONE between", value1, value2, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCUST_PHONENotBetween(String value1, String value2) {
            addCriterion("CUST_PHONE not between", value1, value2, "CUST_PHONE");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESIsNull() {
            addCriterion("CALL_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESIsNotNull() {
            addCriterion("CALL_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESEqualTo(String value) {
            addCriterion("CALL_TIMES =", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESNotEqualTo(String value) {
            addCriterion("CALL_TIMES <>", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESGreaterThan(String value) {
            addCriterion("CALL_TIMES >", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_TIMES >=", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESLessThan(String value) {
            addCriterion("CALL_TIMES <", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESLessThanOrEqualTo(String value) {
            addCriterion("CALL_TIMES <=", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESLike(String value) {
            addCriterion("CALL_TIMES like", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESNotLike(String value) {
            addCriterion("CALL_TIMES not like", value, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESIn(List<String> values) {
            addCriterion("CALL_TIMES in", values, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESNotIn(List<String> values) {
            addCriterion("CALL_TIMES not in", values, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESBetween(String value1, String value2) {
            addCriterion("CALL_TIMES between", value1, value2, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_TIMESNotBetween(String value1, String value2) {
            addCriterion("CALL_TIMES not between", value1, value2, "CALL_TIMES");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEIsNull() {
            addCriterion("CALL_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEIsNotNull() {
            addCriterion("CALL_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEEqualTo(String value) {
            addCriterion("CALL_END_TIME =", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMENotEqualTo(String value) {
            addCriterion("CALL_END_TIME <>", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEGreaterThan(String value) {
            addCriterion("CALL_END_TIME >", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_END_TIME >=", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMELessThan(String value) {
            addCriterion("CALL_END_TIME <", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMELessThanOrEqualTo(String value) {
            addCriterion("CALL_END_TIME <=", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMELike(String value) {
            addCriterion("CALL_END_TIME like", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMENotLike(String value) {
            addCriterion("CALL_END_TIME not like", value, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEIn(List<String> values) {
            addCriterion("CALL_END_TIME in", values, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMENotIn(List<String> values) {
            addCriterion("CALL_END_TIME not in", values, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMEBetween(String value1, String value2) {
            addCriterion("CALL_END_TIME between", value1, value2, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_END_TIMENotBetween(String value1, String value2) {
            addCriterion("CALL_END_TIME not between", value1, value2, "CALL_END_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEIsNull() {
            addCriterion("CALL_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEIsNotNull() {
            addCriterion("CALL_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEEqualTo(String value) {
            addCriterion("CALL_START_TIME =", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMENotEqualTo(String value) {
            addCriterion("CALL_START_TIME <>", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEGreaterThan(String value) {
            addCriterion("CALL_START_TIME >", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_START_TIME >=", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMELessThan(String value) {
            addCriterion("CALL_START_TIME <", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMELessThanOrEqualTo(String value) {
            addCriterion("CALL_START_TIME <=", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMELike(String value) {
            addCriterion("CALL_START_TIME like", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMENotLike(String value) {
            addCriterion("CALL_START_TIME not like", value, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEIn(List<String> values) {
            addCriterion("CALL_START_TIME in", values, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMENotIn(List<String> values) {
            addCriterion("CALL_START_TIME not in", values, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMEBetween(String value1, String value2) {
            addCriterion("CALL_START_TIME between", value1, value2, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andCALL_START_TIMENotBetween(String value1, String value2) {
            addCriterion("CALL_START_TIME not between", value1, value2, "CALL_START_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEIsNull() {
            addCriterion("RECORD_FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEIsNotNull() {
            addCriterion("RECORD_FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEEqualTo(String value) {
            addCriterion("RECORD_FINISH_TIME =", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMENotEqualTo(String value) {
            addCriterion("RECORD_FINISH_TIME <>", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEGreaterThan(String value) {
            addCriterion("RECORD_FINISH_TIME >", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_FINISH_TIME >=", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMELessThan(String value) {
            addCriterion("RECORD_FINISH_TIME <", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMELessThanOrEqualTo(String value) {
            addCriterion("RECORD_FINISH_TIME <=", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMELike(String value) {
            addCriterion("RECORD_FINISH_TIME like", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMENotLike(String value) {
            addCriterion("RECORD_FINISH_TIME not like", value, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEIn(List<String> values) {
            addCriterion("RECORD_FINISH_TIME in", values, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMENotIn(List<String> values) {
            addCriterion("RECORD_FINISH_TIME not in", values, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMEBetween(String value1, String value2) {
            addCriterion("RECORD_FINISH_TIME between", value1, value2, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andRECORD_FINISH_TIMENotBetween(String value1, String value2) {
            addCriterion("RECORD_FINISH_TIME not between", value1, value2, "RECORD_FINISH_TIME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGIsNull() {
            addCriterion("ACTIVITY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGIsNotNull() {
            addCriterion("ACTIVITY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGEqualTo(String value) {
            addCriterion("ACTIVITY_FLAG =", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGNotEqualTo(String value) {
            addCriterion("ACTIVITY_FLAG <>", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGGreaterThan(String value) {
            addCriterion("ACTIVITY_FLAG >", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_FLAG >=", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGLessThan(String value) {
            addCriterion("ACTIVITY_FLAG <", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_FLAG <=", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGLike(String value) {
            addCriterion("ACTIVITY_FLAG like", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGNotLike(String value) {
            addCriterion("ACTIVITY_FLAG not like", value, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGIn(List<String> values) {
            addCriterion("ACTIVITY_FLAG in", values, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGNotIn(List<String> values) {
            addCriterion("ACTIVITY_FLAG not in", values, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGBetween(String value1, String value2) {
            addCriterion("ACTIVITY_FLAG between", value1, value2, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_FLAGNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_FLAG not between", value1, value2, "ACTIVITY_FLAG");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETIsNull() {
            addCriterion("PAY_METHTEMPLET is null");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETIsNotNull() {
            addCriterion("PAY_METHTEMPLET is not null");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETEqualTo(String value) {
            addCriterion("PAY_METHTEMPLET =", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETNotEqualTo(String value) {
            addCriterion("PAY_METHTEMPLET <>", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETGreaterThan(String value) {
            addCriterion("PAY_METHTEMPLET >", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_METHTEMPLET >=", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETLessThan(String value) {
            addCriterion("PAY_METHTEMPLET <", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETLessThanOrEqualTo(String value) {
            addCriterion("PAY_METHTEMPLET <=", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETLike(String value) {
            addCriterion("PAY_METHTEMPLET like", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETNotLike(String value) {
            addCriterion("PAY_METHTEMPLET not like", value, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETIn(List<String> values) {
            addCriterion("PAY_METHTEMPLET in", values, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETNotIn(List<String> values) {
            addCriterion("PAY_METHTEMPLET not in", values, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETBetween(String value1, String value2) {
            addCriterion("PAY_METHTEMPLET between", value1, value2, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andPAY_METHTEMPLETNotBetween(String value1, String value2) {
            addCriterion("PAY_METHTEMPLET not between", value1, value2, "PAY_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETIsNull() {
            addCriterion("MNCH_METHTEMPLET is null");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETIsNotNull() {
            addCriterion("MNCH_METHTEMPLET is not null");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETEqualTo(String value) {
            addCriterion("MNCH_METHTEMPLET =", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETNotEqualTo(String value) {
            addCriterion("MNCH_METHTEMPLET <>", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETGreaterThan(String value) {
            addCriterion("MNCH_METHTEMPLET >", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETGreaterThanOrEqualTo(String value) {
            addCriterion("MNCH_METHTEMPLET >=", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETLessThan(String value) {
            addCriterion("MNCH_METHTEMPLET <", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETLessThanOrEqualTo(String value) {
            addCriterion("MNCH_METHTEMPLET <=", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETLike(String value) {
            addCriterion("MNCH_METHTEMPLET like", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETNotLike(String value) {
            addCriterion("MNCH_METHTEMPLET not like", value, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETIn(List<String> values) {
            addCriterion("MNCH_METHTEMPLET in", values, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETNotIn(List<String> values) {
            addCriterion("MNCH_METHTEMPLET not in", values, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETBetween(String value1, String value2) {
            addCriterion("MNCH_METHTEMPLET between", value1, value2, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andMNCH_METHTEMPLETNotBetween(String value1, String value2) {
            addCriterion("MNCH_METHTEMPLET not between", value1, value2, "MNCH_METHTEMPLET");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEIsNull() {
            addCriterion("REPEAT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEIsNotNull() {
            addCriterion("REPEAT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEEqualTo(String value) {
            addCriterion("REPEAT_PHONE =", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONENotEqualTo(String value) {
            addCriterion("REPEAT_PHONE <>", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEGreaterThan(String value) {
            addCriterion("REPEAT_PHONE >", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("REPEAT_PHONE >=", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONELessThan(String value) {
            addCriterion("REPEAT_PHONE <", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONELessThanOrEqualTo(String value) {
            addCriterion("REPEAT_PHONE <=", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONELike(String value) {
            addCriterion("REPEAT_PHONE like", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONENotLike(String value) {
            addCriterion("REPEAT_PHONE not like", value, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEIn(List<String> values) {
            addCriterion("REPEAT_PHONE in", values, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONENotIn(List<String> values) {
            addCriterion("REPEAT_PHONE not in", values, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONEBetween(String value1, String value2) {
            addCriterion("REPEAT_PHONE between", value1, value2, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONENotBetween(String value1, String value2) {
            addCriterion("REPEAT_PHONE not between", value1, value2, "REPEAT_PHONE");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMIsNull() {
            addCriterion("CMPLOYEE_NM is null");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMIsNotNull() {
            addCriterion("CMPLOYEE_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMEqualTo(String value) {
            addCriterion("CMPLOYEE_NM =", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMNotEqualTo(String value) {
            addCriterion("CMPLOYEE_NM <>", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMGreaterThan(String value) {
            addCriterion("CMPLOYEE_NM >", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMGreaterThanOrEqualTo(String value) {
            addCriterion("CMPLOYEE_NM >=", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMLessThan(String value) {
            addCriterion("CMPLOYEE_NM <", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMLessThanOrEqualTo(String value) {
            addCriterion("CMPLOYEE_NM <=", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMLike(String value) {
            addCriterion("CMPLOYEE_NM like", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMNotLike(String value) {
            addCriterion("CMPLOYEE_NM not like", value, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMIn(List<String> values) {
            addCriterion("CMPLOYEE_NM in", values, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMNotIn(List<String> values) {
            addCriterion("CMPLOYEE_NM not in", values, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMBetween(String value1, String value2) {
            addCriterion("CMPLOYEE_NM between", value1, value2, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andCMPLOYEE_NMNotBetween(String value1, String value2) {
            addCriterion("CMPLOYEE_NM not between", value1, value2, "CMPLOYEE_NM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEIsNull() {
            addCriterion("REPEAT_PHONE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEIsNotNull() {
            addCriterion("REPEAT_PHONE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEEqualTo(String value) {
            addCriterion("REPEAT_PHONE_TIME =", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMENotEqualTo(String value) {
            addCriterion("REPEAT_PHONE_TIME <>", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEGreaterThan(String value) {
            addCriterion("REPEAT_PHONE_TIME >", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("REPEAT_PHONE_TIME >=", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMELessThan(String value) {
            addCriterion("REPEAT_PHONE_TIME <", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMELessThanOrEqualTo(String value) {
            addCriterion("REPEAT_PHONE_TIME <=", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMELike(String value) {
            addCriterion("REPEAT_PHONE_TIME like", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMENotLike(String value) {
            addCriterion("REPEAT_PHONE_TIME not like", value, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEIn(List<String> values) {
            addCriterion("REPEAT_PHONE_TIME in", values, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMENotIn(List<String> values) {
            addCriterion("REPEAT_PHONE_TIME not in", values, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMEBetween(String value1, String value2) {
            addCriterion("REPEAT_PHONE_TIME between", value1, value2, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_PHONE_TIMENotBetween(String value1, String value2) {
            addCriterion("REPEAT_PHONE_TIME not between", value1, value2, "REPEAT_PHONE_TIME");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMIsNull() {
            addCriterion("REPEAT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMIsNotNull() {
            addCriterion("REPEAT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMEqualTo(String value) {
            addCriterion("REPEAT_NUM =", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMNotEqualTo(String value) {
            addCriterion("REPEAT_NUM <>", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMGreaterThan(String value) {
            addCriterion("REPEAT_NUM >", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMGreaterThanOrEqualTo(String value) {
            addCriterion("REPEAT_NUM >=", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMLessThan(String value) {
            addCriterion("REPEAT_NUM <", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMLessThanOrEqualTo(String value) {
            addCriterion("REPEAT_NUM <=", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMLike(String value) {
            addCriterion("REPEAT_NUM like", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMNotLike(String value) {
            addCriterion("REPEAT_NUM not like", value, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMIn(List<String> values) {
            addCriterion("REPEAT_NUM in", values, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMNotIn(List<String> values) {
            addCriterion("REPEAT_NUM not in", values, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMBetween(String value1, String value2) {
            addCriterion("REPEAT_NUM between", value1, value2, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andREPEAT_NUMNotBetween(String value1, String value2) {
            addCriterion("REPEAT_NUM not between", value1, value2, "REPEAT_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMIsNull() {
            addCriterion("CONFERENCE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMIsNotNull() {
            addCriterion("CONFERENCE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMEqualTo(String value) {
            addCriterion("CONFERENCE_NUM =", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMNotEqualTo(String value) {
            addCriterion("CONFERENCE_NUM <>", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMGreaterThan(String value) {
            addCriterion("CONFERENCE_NUM >", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMGreaterThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_NUM >=", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMLessThan(String value) {
            addCriterion("CONFERENCE_NUM <", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMLessThanOrEqualTo(String value) {
            addCriterion("CONFERENCE_NUM <=", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMLike(String value) {
            addCriterion("CONFERENCE_NUM like", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMNotLike(String value) {
            addCriterion("CONFERENCE_NUM not like", value, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMIn(List<String> values) {
            addCriterion("CONFERENCE_NUM in", values, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMNotIn(List<String> values) {
            addCriterion("CONFERENCE_NUM not in", values, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMBetween(String value1, String value2) {
            addCriterion("CONFERENCE_NUM between", value1, value2, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andCONFERENCE_NUMNotBetween(String value1, String value2) {
            addCriterion("CONFERENCE_NUM not between", value1, value2, "CONFERENCE_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMIsNull() {
            addCriterion("SATISFYS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMIsNotNull() {
            addCriterion("SATISFYS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMEqualTo(String value) {
            addCriterion("SATISFYS_NUM =", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMNotEqualTo(String value) {
            addCriterion("SATISFYS_NUM <>", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMGreaterThan(String value) {
            addCriterion("SATISFYS_NUM >", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMGreaterThanOrEqualTo(String value) {
            addCriterion("SATISFYS_NUM >=", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMLessThan(String value) {
            addCriterion("SATISFYS_NUM <", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMLessThanOrEqualTo(String value) {
            addCriterion("SATISFYS_NUM <=", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMLike(String value) {
            addCriterion("SATISFYS_NUM like", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMNotLike(String value) {
            addCriterion("SATISFYS_NUM not like", value, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMIn(List<String> values) {
            addCriterion("SATISFYS_NUM in", values, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMNotIn(List<String> values) {
            addCriterion("SATISFYS_NUM not in", values, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMBetween(String value1, String value2) {
            addCriterion("SATISFYS_NUM between", value1, value2, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andSATISFYS_NUMNotBetween(String value1, String value2) {
            addCriterion("SATISFYS_NUM not between", value1, value2, "SATISFYS_NUM");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1IsNull() {
            addCriterion("BUSINESS_AREA_PRO1 is null");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1IsNotNull() {
            addCriterion("BUSINESS_AREA_PRO1 is not null");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1EqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO1 =", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1NotEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO1 <>", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1GreaterThan(String value) {
            addCriterion("BUSINESS_AREA_PRO1 >", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO1 >=", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1LessThan(String value) {
            addCriterion("BUSINESS_AREA_PRO1 <", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1LessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO1 <=", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1Like(String value) {
            addCriterion("BUSINESS_AREA_PRO1 like", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1NotLike(String value) {
            addCriterion("BUSINESS_AREA_PRO1 not like", value, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1In(List<String> values) {
            addCriterion("BUSINESS_AREA_PRO1 in", values, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1NotIn(List<String> values) {
            addCriterion("BUSINESS_AREA_PRO1 not in", values, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1Between(String value1, String value2) {
            addCriterion("BUSINESS_AREA_PRO1 between", value1, value2, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO1NotBetween(String value1, String value2) {
            addCriterion("BUSINESS_AREA_PRO1 not between", value1, value2, "BUSINESS_AREA_PRO1");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2IsNull() {
            addCriterion("BUSINESS_AREA_PRO2 is null");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2IsNotNull() {
            addCriterion("BUSINESS_AREA_PRO2 is not null");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2EqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO2 =", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2NotEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO2 <>", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2GreaterThan(String value) {
            addCriterion("BUSINESS_AREA_PRO2 >", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2GreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO2 >=", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2LessThan(String value) {
            addCriterion("BUSINESS_AREA_PRO2 <", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2LessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA_PRO2 <=", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2Like(String value) {
            addCriterion("BUSINESS_AREA_PRO2 like", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2NotLike(String value) {
            addCriterion("BUSINESS_AREA_PRO2 not like", value, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2In(List<String> values) {
            addCriterion("BUSINESS_AREA_PRO2 in", values, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2NotIn(List<String> values) {
            addCriterion("BUSINESS_AREA_PRO2 not in", values, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2Between(String value1, String value2) {
            addCriterion("BUSINESS_AREA_PRO2 between", value1, value2, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andBUSINESS_AREA_PRO2NotBetween(String value1, String value2) {
            addCriterion("BUSINESS_AREA_PRO2 not between", value1, value2, "BUSINESS_AREA_PRO2");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDIsNull() {
            addCriterion("ACQ_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDIsNotNull() {
            addCriterion("ACQ_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDEqualTo(String value) {
            addCriterion("ACQ_INS_ID_CD =", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDNotEqualTo(String value) {
            addCriterion("ACQ_INS_ID_CD <>", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDGreaterThan(String value) {
            addCriterion("ACQ_INS_ID_CD >", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDGreaterThanOrEqualTo(String value) {
            addCriterion("ACQ_INS_ID_CD >=", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDLessThan(String value) {
            addCriterion("ACQ_INS_ID_CD <", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDLessThanOrEqualTo(String value) {
            addCriterion("ACQ_INS_ID_CD <=", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDLike(String value) {
            addCriterion("ACQ_INS_ID_CD like", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDNotLike(String value) {
            addCriterion("ACQ_INS_ID_CD not like", value, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDIn(List<String> values) {
            addCriterion("ACQ_INS_ID_CD in", values, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDNotIn(List<String> values) {
            addCriterion("ACQ_INS_ID_CD not in", values, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDBetween(String value1, String value2) {
            addCriterion("ACQ_INS_ID_CD between", value1, value2, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACQ_INS_ID_CDNotBetween(String value1, String value2) {
            addCriterion("ACQ_INS_ID_CD not between", value1, value2, "ACQ_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEIsNull() {
            addCriterion("ACTIVITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEIsNotNull() {
            addCriterion("ACTIVITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEEqualTo(String value) {
            addCriterion("ACTIVITY_NAME =", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMENotEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <>", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEGreaterThan(String value) {
            addCriterion("ACTIVITY_NAME >", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME >=", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMELessThan(String value) {
            addCriterion("ACTIVITY_NAME <", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMELessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_NAME <=", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMELike(String value) {
            addCriterion("ACTIVITY_NAME like", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMENotLike(String value) {
            addCriterion("ACTIVITY_NAME not like", value, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEIn(List<String> values) {
            addCriterion("ACTIVITY_NAME in", values, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMENotIn(List<String> values) {
            addCriterion("ACTIVITY_NAME not in", values, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMEBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME between", value1, value2, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_NAMENotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_NAME not between", value1, value2, "ACTIVITY_NAME");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDIsNull() {
            addCriterion("TERM_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDIsNotNull() {
            addCriterion("TERM_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDEqualTo(String value) {
            addCriterion("TERM_INS_ID_CD =", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDNotEqualTo(String value) {
            addCriterion("TERM_INS_ID_CD <>", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDGreaterThan(String value) {
            addCriterion("TERM_INS_ID_CD >", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDGreaterThanOrEqualTo(String value) {
            addCriterion("TERM_INS_ID_CD >=", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDLessThan(String value) {
            addCriterion("TERM_INS_ID_CD <", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDLessThanOrEqualTo(String value) {
            addCriterion("TERM_INS_ID_CD <=", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDLike(String value) {
            addCriterion("TERM_INS_ID_CD like", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDNotLike(String value) {
            addCriterion("TERM_INS_ID_CD not like", value, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDIn(List<String> values) {
            addCriterion("TERM_INS_ID_CD in", values, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDNotIn(List<String> values) {
            addCriterion("TERM_INS_ID_CD not in", values, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDBetween(String value1, String value2) {
            addCriterion("TERM_INS_ID_CD between", value1, value2, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andTERM_INS_ID_CDNotBetween(String value1, String value2) {
            addCriterion("TERM_INS_ID_CD not between", value1, value2, "TERM_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODENotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODELessThan(String value) {
            addCriterion("ERROR_CODE <", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODELessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODELike(String value) {
            addCriterion("ERROR_CODE like", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODENotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODENotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODEBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andERROR_CODENotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "ERROR_CODE");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERIsNull() {
            addCriterion("CALL_BACK_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERIsNotNull() {
            addCriterion("CALL_BACK_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBEREqualTo(String value) {
            addCriterion("CALL_BACK_NUMBER =", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERNotEqualTo(String value) {
            addCriterion("CALL_BACK_NUMBER <>", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERGreaterThan(String value) {
            addCriterion("CALL_BACK_NUMBER >", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("CALL_BACK_NUMBER >=", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERLessThan(String value) {
            addCriterion("CALL_BACK_NUMBER <", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERLessThanOrEqualTo(String value) {
            addCriterion("CALL_BACK_NUMBER <=", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERLike(String value) {
            addCriterion("CALL_BACK_NUMBER like", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERNotLike(String value) {
            addCriterion("CALL_BACK_NUMBER not like", value, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERIn(List<String> values) {
            addCriterion("CALL_BACK_NUMBER in", values, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERNotIn(List<String> values) {
            addCriterion("CALL_BACK_NUMBER not in", values, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERBetween(String value1, String value2) {
            addCriterion("CALL_BACK_NUMBER between", value1, value2, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andCALL_BACK_NUMBERNotBetween(String value1, String value2) {
            addCriterion("CALL_BACK_NUMBER not between", value1, value2, "CALL_BACK_NUMBER");
            return (Criteria) this;
        }

        public Criteria andREMARKSIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andREMARKSIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKSEqualTo(String value) {
            addCriterion("REMARKS =", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSGreaterThan(String value) {
            addCriterion("REMARKS >", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLessThan(String value) {
            addCriterion("REMARKS <", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSLike(String value) {
            addCriterion("REMARKS like", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotLike(String value) {
            addCriterion("REMARKS not like", value, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSIn(List<String> values) {
            addCriterion("REMARKS in", values, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andREMARKSNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "REMARKS");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKIsNull() {
            addCriterion("CARD_RANK is null");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKIsNotNull() {
            addCriterion("CARD_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKEqualTo(String value) {
            addCriterion("CARD_RANK =", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKNotEqualTo(String value) {
            addCriterion("CARD_RANK <>", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKGreaterThan(String value) {
            addCriterion("CARD_RANK >", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_RANK >=", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKLessThan(String value) {
            addCriterion("CARD_RANK <", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKLessThanOrEqualTo(String value) {
            addCriterion("CARD_RANK <=", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKLike(String value) {
            addCriterion("CARD_RANK like", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKNotLike(String value) {
            addCriterion("CARD_RANK not like", value, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKIn(List<String> values) {
            addCriterion("CARD_RANK in", values, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKNotIn(List<String> values) {
            addCriterion("CARD_RANK not in", values, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKBetween(String value1, String value2) {
            addCriterion("CARD_RANK between", value1, value2, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andCARD_RANKNotBetween(String value1, String value2) {
            addCriterion("CARD_RANK not between", value1, value2, "CARD_RANK");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDIsNull() {
            addCriterion("ISS_INS_ID is null");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDIsNotNull() {
            addCriterion("ISS_INS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDEqualTo(String value) {
            addCriterion("ISS_INS_ID =", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDNotEqualTo(String value) {
            addCriterion("ISS_INS_ID <>", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDGreaterThan(String value) {
            addCriterion("ISS_INS_ID >", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ISS_INS_ID >=", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDLessThan(String value) {
            addCriterion("ISS_INS_ID <", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDLessThanOrEqualTo(String value) {
            addCriterion("ISS_INS_ID <=", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDLike(String value) {
            addCriterion("ISS_INS_ID like", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDNotLike(String value) {
            addCriterion("ISS_INS_ID not like", value, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDIn(List<String> values) {
            addCriterion("ISS_INS_ID in", values, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDNotIn(List<String> values) {
            addCriterion("ISS_INS_ID not in", values, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDBetween(String value1, String value2) {
            addCriterion("ISS_INS_ID between", value1, value2, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andISS_INS_IDNotBetween(String value1, String value2) {
            addCriterion("ISS_INS_ID not between", value1, value2, "ISS_INS_ID");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMIsNull() {
            addCriterion("INS_CN_NM is null");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMIsNotNull() {
            addCriterion("INS_CN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMEqualTo(String value) {
            addCriterion("INS_CN_NM =", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMNotEqualTo(String value) {
            addCriterion("INS_CN_NM <>", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMGreaterThan(String value) {
            addCriterion("INS_CN_NM >", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMGreaterThanOrEqualTo(String value) {
            addCriterion("INS_CN_NM >=", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMLessThan(String value) {
            addCriterion("INS_CN_NM <", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMLessThanOrEqualTo(String value) {
            addCriterion("INS_CN_NM <=", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMLike(String value) {
            addCriterion("INS_CN_NM like", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMNotLike(String value) {
            addCriterion("INS_CN_NM not like", value, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMIn(List<String> values) {
            addCriterion("INS_CN_NM in", values, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMNotIn(List<String> values) {
            addCriterion("INS_CN_NM not in", values, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMBetween(String value1, String value2) {
            addCriterion("INS_CN_NM between", value1, value2, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andINS_CN_NMNotBetween(String value1, String value2) {
            addCriterion("INS_CN_NM not between", value1, value2, "INS_CN_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDIsNull() {
            addCriterion("CTI_MCHNT_CD is null");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDIsNotNull() {
            addCriterion("CTI_MCHNT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDEqualTo(String value) {
            addCriterion("CTI_MCHNT_CD =", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDNotEqualTo(String value) {
            addCriterion("CTI_MCHNT_CD <>", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDGreaterThan(String value) {
            addCriterion("CTI_MCHNT_CD >", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CTI_MCHNT_CD >=", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDLessThan(String value) {
            addCriterion("CTI_MCHNT_CD <", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDLessThanOrEqualTo(String value) {
            addCriterion("CTI_MCHNT_CD <=", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDLike(String value) {
            addCriterion("CTI_MCHNT_CD like", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDNotLike(String value) {
            addCriterion("CTI_MCHNT_CD not like", value, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDIn(List<String> values) {
            addCriterion("CTI_MCHNT_CD in", values, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDNotIn(List<String> values) {
            addCriterion("CTI_MCHNT_CD not in", values, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDBetween(String value1, String value2) {
            addCriterion("CTI_MCHNT_CD between", value1, value2, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_MCHNT_CDNotBetween(String value1, String value2) {
            addCriterion("CTI_MCHNT_CD not between", value1, value2, "CTI_MCHNT_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDIsNull() {
            addCriterion("CTI_INS_ID_CD is null");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDIsNotNull() {
            addCriterion("CTI_INS_ID_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDEqualTo(String value) {
            addCriterion("CTI_INS_ID_CD =", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDNotEqualTo(String value) {
            addCriterion("CTI_INS_ID_CD <>", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDGreaterThan(String value) {
            addCriterion("CTI_INS_ID_CD >", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CTI_INS_ID_CD >=", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDLessThan(String value) {
            addCriterion("CTI_INS_ID_CD <", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDLessThanOrEqualTo(String value) {
            addCriterion("CTI_INS_ID_CD <=", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDLike(String value) {
            addCriterion("CTI_INS_ID_CD like", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDNotLike(String value) {
            addCriterion("CTI_INS_ID_CD not like", value, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDIn(List<String> values) {
            addCriterion("CTI_INS_ID_CD in", values, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDNotIn(List<String> values) {
            addCriterion("CTI_INS_ID_CD not in", values, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDBetween(String value1, String value2) {
            addCriterion("CTI_INS_ID_CD between", value1, value2, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_CDNotBetween(String value1, String value2) {
            addCriterion("CTI_INS_ID_CD not between", value1, value2, "CTI_INS_ID_CD");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMIsNull() {
            addCriterion("MCHNT_NM is null");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMIsNotNull() {
            addCriterion("MCHNT_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMEqualTo(String value) {
            addCriterion("MCHNT_NM =", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMNotEqualTo(String value) {
            addCriterion("MCHNT_NM <>", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMGreaterThan(String value) {
            addCriterion("MCHNT_NM >", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNT_NM >=", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMLessThan(String value) {
            addCriterion("MCHNT_NM <", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMLessThanOrEqualTo(String value) {
            addCriterion("MCHNT_NM <=", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMLike(String value) {
            addCriterion("MCHNT_NM like", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMNotLike(String value) {
            addCriterion("MCHNT_NM not like", value, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMIn(List<String> values) {
            addCriterion("MCHNT_NM in", values, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMNotIn(List<String> values) {
            addCriterion("MCHNT_NM not in", values, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMBetween(String value1, String value2) {
            addCriterion("MCHNT_NM between", value1, value2, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andMCHNT_NMNotBetween(String value1, String value2) {
            addCriterion("MCHNT_NM not between", value1, value2, "MCHNT_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMIsNull() {
            addCriterion("CTI_INS_ID_NM is null");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMIsNotNull() {
            addCriterion("CTI_INS_ID_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMEqualTo(String value) {
            addCriterion("CTI_INS_ID_NM =", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMNotEqualTo(String value) {
            addCriterion("CTI_INS_ID_NM <>", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMGreaterThan(String value) {
            addCriterion("CTI_INS_ID_NM >", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMGreaterThanOrEqualTo(String value) {
            addCriterion("CTI_INS_ID_NM >=", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMLessThan(String value) {
            addCriterion("CTI_INS_ID_NM <", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMLessThanOrEqualTo(String value) {
            addCriterion("CTI_INS_ID_NM <=", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMLike(String value) {
            addCriterion("CTI_INS_ID_NM like", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMNotLike(String value) {
            addCriterion("CTI_INS_ID_NM not like", value, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMIn(List<String> values) {
            addCriterion("CTI_INS_ID_NM in", values, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMNotIn(List<String> values) {
            addCriterion("CTI_INS_ID_NM not in", values, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMBetween(String value1, String value2) {
            addCriterion("CTI_INS_ID_NM between", value1, value2, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andCTI_INS_ID_NMNotBetween(String value1, String value2) {
            addCriterion("CTI_INS_ID_NM not between", value1, value2, "CTI_INS_ID_NM");
            return (Criteria) this;
        }

        public Criteria andIVR_URLIsNull() {
            addCriterion("IVR_URL is null");
            return (Criteria) this;
        }

        public Criteria andIVR_URLIsNotNull() {
            addCriterion("IVR_URL is not null");
            return (Criteria) this;
        }

        public Criteria andIVR_URLEqualTo(String value) {
            addCriterion("IVR_URL =", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLNotEqualTo(String value) {
            addCriterion("IVR_URL <>", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLGreaterThan(String value) {
            addCriterion("IVR_URL >", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLGreaterThanOrEqualTo(String value) {
            addCriterion("IVR_URL >=", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLLessThan(String value) {
            addCriterion("IVR_URL <", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLLessThanOrEqualTo(String value) {
            addCriterion("IVR_URL <=", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLLike(String value) {
            addCriterion("IVR_URL like", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLNotLike(String value) {
            addCriterion("IVR_URL not like", value, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLIn(List<String> values) {
            addCriterion("IVR_URL in", values, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLNotIn(List<String> values) {
            addCriterion("IVR_URL not in", values, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLBetween(String value1, String value2) {
            addCriterion("IVR_URL between", value1, value2, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andIVR_URLNotBetween(String value1, String value2) {
            addCriterion("IVR_URL not between", value1, value2, "IVR_URL");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKIsNull() {
            addCriterion("OUT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKIsNotNull() {
            addCriterion("OUT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKEqualTo(String value) {
            addCriterion("OUT_BANK =", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKNotEqualTo(String value) {
            addCriterion("OUT_BANK <>", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKGreaterThan(String value) {
            addCriterion("OUT_BANK >", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_BANK >=", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKLessThan(String value) {
            addCriterion("OUT_BANK <", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKLessThanOrEqualTo(String value) {
            addCriterion("OUT_BANK <=", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKLike(String value) {
            addCriterion("OUT_BANK like", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKNotLike(String value) {
            addCriterion("OUT_BANK not like", value, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKIn(List<String> values) {
            addCriterion("OUT_BANK in", values, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKNotIn(List<String> values) {
            addCriterion("OUT_BANK not in", values, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKBetween(String value1, String value2) {
            addCriterion("OUT_BANK between", value1, value2, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_BANKNotBetween(String value1, String value2) {
            addCriterion("OUT_BANK not between", value1, value2, "OUT_BANK");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERIsNull() {
            addCriterion("OUT_CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERIsNotNull() {
            addCriterion("OUT_CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBEREqualTo(String value) {
            addCriterion("OUT_CARD_NUMBER =", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERNotEqualTo(String value) {
            addCriterion("OUT_CARD_NUMBER <>", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERGreaterThan(String value) {
            addCriterion("OUT_CARD_NUMBER >", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_CARD_NUMBER >=", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERLessThan(String value) {
            addCriterion("OUT_CARD_NUMBER <", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERLessThanOrEqualTo(String value) {
            addCriterion("OUT_CARD_NUMBER <=", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERLike(String value) {
            addCriterion("OUT_CARD_NUMBER like", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERNotLike(String value) {
            addCriterion("OUT_CARD_NUMBER not like", value, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERIn(List<String> values) {
            addCriterion("OUT_CARD_NUMBER in", values, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERNotIn(List<String> values) {
            addCriterion("OUT_CARD_NUMBER not in", values, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERBetween(String value1, String value2) {
            addCriterion("OUT_CARD_NUMBER between", value1, value2, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andOUT_CARD_NUMBERNotBetween(String value1, String value2) {
            addCriterion("OUT_CARD_NUMBER not between", value1, value2, "OUT_CARD_NUMBER");
            return (Criteria) this;
        }

        public Criteria andIS_OWNIsNull() {
            addCriterion("IS_OWN is null");
            return (Criteria) this;
        }

        public Criteria andIS_OWNIsNotNull() {
            addCriterion("IS_OWN is not null");
            return (Criteria) this;
        }

        public Criteria andIS_OWNEqualTo(String value) {
            addCriterion("IS_OWN =", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNNotEqualTo(String value) {
            addCriterion("IS_OWN <>", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNGreaterThan(String value) {
            addCriterion("IS_OWN >", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OWN >=", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNLessThan(String value) {
            addCriterion("IS_OWN <", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNLessThanOrEqualTo(String value) {
            addCriterion("IS_OWN <=", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNLike(String value) {
            addCriterion("IS_OWN like", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNNotLike(String value) {
            addCriterion("IS_OWN not like", value, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNIn(List<String> values) {
            addCriterion("IS_OWN in", values, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNNotIn(List<String> values) {
            addCriterion("IS_OWN not in", values, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNBetween(String value1, String value2) {
            addCriterion("IS_OWN between", value1, value2, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andIS_OWNNotBetween(String value1, String value2) {
            addCriterion("IS_OWN not between", value1, value2, "IS_OWN");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEIsNull() {
            addCriterion("DEAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEIsNotNull() {
            addCriterion("DEAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEEqualTo(String value) {
            addCriterion("DEAL_TYPE =", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPENotEqualTo(String value) {
            addCriterion("DEAL_TYPE <>", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEGreaterThan(String value) {
            addCriterion("DEAL_TYPE >", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("DEAL_TYPE >=", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPELessThan(String value) {
            addCriterion("DEAL_TYPE <", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPELessThanOrEqualTo(String value) {
            addCriterion("DEAL_TYPE <=", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPELike(String value) {
            addCriterion("DEAL_TYPE like", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPENotLike(String value) {
            addCriterion("DEAL_TYPE not like", value, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEIn(List<String> values) {
            addCriterion("DEAL_TYPE in", values, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPENotIn(List<String> values) {
            addCriterion("DEAL_TYPE not in", values, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPEBetween(String value1, String value2) {
            addCriterion("DEAL_TYPE between", value1, value2, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andDEAL_TYPENotBetween(String value1, String value2) {
            addCriterion("DEAL_TYPE not between", value1, value2, "DEAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDEqualTo(String value) {
            addCriterion("ACTIVITY_ID =", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDNotEqualTo(String value) {
            addCriterion("ACTIVITY_ID <>", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDGreaterThan(String value) {
            addCriterion("ACTIVITY_ID >", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID >=", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDLessThan(String value) {
            addCriterion("ACTIVITY_ID <", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID <=", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDLike(String value) {
            addCriterion("ACTIVITY_ID like", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDNotLike(String value) {
            addCriterion("ACTIVITY_ID not like", value, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDIn(List<String> values) {
            addCriterion("ACTIVITY_ID in", values, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDNotIn(List<String> values) {
            addCriterion("ACTIVITY_ID not in", values, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "ACTIVITY_ID");
            return (Criteria) this;
        }

        public Criteria andACTIVITY_IDNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "ACTIVITY_ID");
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