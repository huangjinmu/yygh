package com.jim.yygh.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KsxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KsxxExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNull() {
            addCriterion("ks_name is null");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNotNull() {
            addCriterion("ks_name is not null");
            return (Criteria) this;
        }

        public Criteria andKsNameEqualTo(String value) {
            addCriterion("ks_name =", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotEqualTo(String value) {
            addCriterion("ks_name <>", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThan(String value) {
            addCriterion("ks_name >", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ks_name >=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThan(String value) {
            addCriterion("ks_name <", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThanOrEqualTo(String value) {
            addCriterion("ks_name <=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLike(String value) {
            addCriterion("ks_name like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotLike(String value) {
            addCriterion("ks_name not like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameIn(List<String> values) {
            addCriterion("ks_name in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotIn(List<String> values) {
            addCriterion("ks_name not in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameBetween(String value1, String value2) {
            addCriterion("ks_name between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotBetween(String value1, String value2) {
            addCriterion("ks_name not between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsjjIsNull() {
            addCriterion("ksjj is null");
            return (Criteria) this;
        }

        public Criteria andKsjjIsNotNull() {
            addCriterion("ksjj is not null");
            return (Criteria) this;
        }

        public Criteria andKsjjEqualTo(String value) {
            addCriterion("ksjj =", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjNotEqualTo(String value) {
            addCriterion("ksjj <>", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjGreaterThan(String value) {
            addCriterion("ksjj >", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjGreaterThanOrEqualTo(String value) {
            addCriterion("ksjj >=", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjLessThan(String value) {
            addCriterion("ksjj <", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjLessThanOrEqualTo(String value) {
            addCriterion("ksjj <=", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjLike(String value) {
            addCriterion("ksjj like", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjNotLike(String value) {
            addCriterion("ksjj not like", value, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjIn(List<String> values) {
            addCriterion("ksjj in", values, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjNotIn(List<String> values) {
            addCriterion("ksjj not in", values, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjBetween(String value1, String value2) {
            addCriterion("ksjj between", value1, value2, "ksjj");
            return (Criteria) this;
        }

        public Criteria andKsjjNotBetween(String value1, String value2) {
            addCriterion("ksjj not between", value1, value2, "ksjj");
            return (Criteria) this;
        }

        public Criteria andSfscIsNull() {
            addCriterion("sfsc is null");
            return (Criteria) this;
        }

        public Criteria andSfscIsNotNull() {
            addCriterion("sfsc is not null");
            return (Criteria) this;
        }

        public Criteria andSfscEqualTo(String value) {
            addCriterion("sfsc =", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscNotEqualTo(String value) {
            addCriterion("sfsc <>", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscGreaterThan(String value) {
            addCriterion("sfsc >", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscGreaterThanOrEqualTo(String value) {
            addCriterion("sfsc >=", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscLessThan(String value) {
            addCriterion("sfsc <", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscLessThanOrEqualTo(String value) {
            addCriterion("sfsc <=", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscLike(String value) {
            addCriterion("sfsc like", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscNotLike(String value) {
            addCriterion("sfsc not like", value, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscIn(List<String> values) {
            addCriterion("sfsc in", values, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscNotIn(List<String> values) {
            addCriterion("sfsc not in", values, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscBetween(String value1, String value2) {
            addCriterion("sfsc between", value1, value2, "sfsc");
            return (Criteria) this;
        }

        public Criteria andSfscNotBetween(String value1, String value2) {
            addCriterion("sfsc not between", value1, value2, "sfsc");
            return (Criteria) this;
        }

        public Criteria andKsjsIsNull() {
            addCriterion("ksjs is null");
            return (Criteria) this;
        }

        public Criteria andKsjsIsNotNull() {
            addCriterion("ksjs is not null");
            return (Criteria) this;
        }

        public Criteria andKsjsEqualTo(String value) {
            addCriterion("ksjs =", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsNotEqualTo(String value) {
            addCriterion("ksjs <>", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsGreaterThan(String value) {
            addCriterion("ksjs >", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsGreaterThanOrEqualTo(String value) {
            addCriterion("ksjs >=", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsLessThan(String value) {
            addCriterion("ksjs <", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsLessThanOrEqualTo(String value) {
            addCriterion("ksjs <=", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsLike(String value) {
            addCriterion("ksjs like", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsNotLike(String value) {
            addCriterion("ksjs not like", value, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsIn(List<String> values) {
            addCriterion("ksjs in", values, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsNotIn(List<String> values) {
            addCriterion("ksjs not in", values, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsBetween(String value1, String value2) {
            addCriterion("ksjs between", value1, value2, "ksjs");
            return (Criteria) this;
        }

        public Criteria andKsjsNotBetween(String value1, String value2) {
            addCriterion("ksjs not between", value1, value2, "ksjs");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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