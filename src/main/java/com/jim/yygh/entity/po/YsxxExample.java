package com.jim.yygh.entity.po;

import java.util.ArrayList;
import java.util.List;

public class YsxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YsxxExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYsNameIsNull() {
            addCriterion("ys_name is null");
            return (Criteria) this;
        }

        public Criteria andYsNameIsNotNull() {
            addCriterion("ys_name is not null");
            return (Criteria) this;
        }

        public Criteria andYsNameEqualTo(String value) {
            addCriterion("ys_name =", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameNotEqualTo(String value) {
            addCriterion("ys_name <>", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameGreaterThan(String value) {
            addCriterion("ys_name >", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ys_name >=", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameLessThan(String value) {
            addCriterion("ys_name <", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameLessThanOrEqualTo(String value) {
            addCriterion("ys_name <=", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameLike(String value) {
            addCriterion("ys_name like", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameNotLike(String value) {
            addCriterion("ys_name not like", value, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameIn(List<String> values) {
            addCriterion("ys_name in", values, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameNotIn(List<String> values) {
            addCriterion("ys_name not in", values, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameBetween(String value1, String value2) {
            addCriterion("ys_name between", value1, value2, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsNameNotBetween(String value1, String value2) {
            addCriterion("ys_name not between", value1, value2, "ysName");
            return (Criteria) this;
        }

        public Criteria andYsSexIsNull() {
            addCriterion("ys_sex is null");
            return (Criteria) this;
        }

        public Criteria andYsSexIsNotNull() {
            addCriterion("ys_sex is not null");
            return (Criteria) this;
        }

        public Criteria andYsSexEqualTo(String value) {
            addCriterion("ys_sex =", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexNotEqualTo(String value) {
            addCriterion("ys_sex <>", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexGreaterThan(String value) {
            addCriterion("ys_sex >", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexGreaterThanOrEqualTo(String value) {
            addCriterion("ys_sex >=", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexLessThan(String value) {
            addCriterion("ys_sex <", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexLessThanOrEqualTo(String value) {
            addCriterion("ys_sex <=", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexLike(String value) {
            addCriterion("ys_sex like", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexNotLike(String value) {
            addCriterion("ys_sex not like", value, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexIn(List<String> values) {
            addCriterion("ys_sex in", values, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexNotIn(List<String> values) {
            addCriterion("ys_sex not in", values, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexBetween(String value1, String value2) {
            addCriterion("ys_sex between", value1, value2, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsSexNotBetween(String value1, String value2) {
            addCriterion("ys_sex not between", value1, value2, "ysSex");
            return (Criteria) this;
        }

        public Criteria andYsAgeIsNull() {
            addCriterion("ys_age is null");
            return (Criteria) this;
        }

        public Criteria andYsAgeIsNotNull() {
            addCriterion("ys_age is not null");
            return (Criteria) this;
        }

        public Criteria andYsAgeEqualTo(Integer value) {
            addCriterion("ys_age =", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeNotEqualTo(Integer value) {
            addCriterion("ys_age <>", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeGreaterThan(Integer value) {
            addCriterion("ys_age >", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ys_age >=", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeLessThan(Integer value) {
            addCriterion("ys_age <", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeLessThanOrEqualTo(Integer value) {
            addCriterion("ys_age <=", value, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeIn(List<Integer> values) {
            addCriterion("ys_age in", values, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeNotIn(List<Integer> values) {
            addCriterion("ys_age not in", values, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeBetween(Integer value1, Integer value2) {
            addCriterion("ys_age between", value1, value2, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("ys_age not between", value1, value2, "ysAge");
            return (Criteria) this;
        }

        public Criteria andYsSummaryIsNull() {
            addCriterion("ys_summary is null");
            return (Criteria) this;
        }

        public Criteria andYsSummaryIsNotNull() {
            addCriterion("ys_summary is not null");
            return (Criteria) this;
        }

        public Criteria andYsSummaryEqualTo(String value) {
            addCriterion("ys_summary =", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryNotEqualTo(String value) {
            addCriterion("ys_summary <>", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryGreaterThan(String value) {
            addCriterion("ys_summary >", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("ys_summary >=", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryLessThan(String value) {
            addCriterion("ys_summary <", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryLessThanOrEqualTo(String value) {
            addCriterion("ys_summary <=", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryLike(String value) {
            addCriterion("ys_summary like", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryNotLike(String value) {
            addCriterion("ys_summary not like", value, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryIn(List<String> values) {
            addCriterion("ys_summary in", values, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryNotIn(List<String> values) {
            addCriterion("ys_summary not in", values, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryBetween(String value1, String value2) {
            addCriterion("ys_summary between", value1, value2, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsSummaryNotBetween(String value1, String value2) {
            addCriterion("ys_summary not between", value1, value2, "ysSummary");
            return (Criteria) this;
        }

        public Criteria andYsZcIsNull() {
            addCriterion("ys_zc is null");
            return (Criteria) this;
        }

        public Criteria andYsZcIsNotNull() {
            addCriterion("ys_zc is not null");
            return (Criteria) this;
        }

        public Criteria andYsZcEqualTo(String value) {
            addCriterion("ys_zc =", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcNotEqualTo(String value) {
            addCriterion("ys_zc <>", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcGreaterThan(String value) {
            addCriterion("ys_zc >", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcGreaterThanOrEqualTo(String value) {
            addCriterion("ys_zc >=", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcLessThan(String value) {
            addCriterion("ys_zc <", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcLessThanOrEqualTo(String value) {
            addCriterion("ys_zc <=", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcLike(String value) {
            addCriterion("ys_zc like", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcNotLike(String value) {
            addCriterion("ys_zc not like", value, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcIn(List<String> values) {
            addCriterion("ys_zc in", values, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcNotIn(List<String> values) {
            addCriterion("ys_zc not in", values, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcBetween(String value1, String value2) {
            addCriterion("ys_zc between", value1, value2, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsZcNotBetween(String value1, String value2) {
            addCriterion("ys_zc not between", value1, value2, "ysZc");
            return (Criteria) this;
        }

        public Criteria andYsPhotoIsNull() {
            addCriterion("ys_photo is null");
            return (Criteria) this;
        }

        public Criteria andYsPhotoIsNotNull() {
            addCriterion("ys_photo is not null");
            return (Criteria) this;
        }

        public Criteria andYsPhotoEqualTo(String value) {
            addCriterion("ys_photo =", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoNotEqualTo(String value) {
            addCriterion("ys_photo <>", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoGreaterThan(String value) {
            addCriterion("ys_photo >", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("ys_photo >=", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoLessThan(String value) {
            addCriterion("ys_photo <", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoLessThanOrEqualTo(String value) {
            addCriterion("ys_photo <=", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoLike(String value) {
            addCriterion("ys_photo like", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoNotLike(String value) {
            addCriterion("ys_photo not like", value, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoIn(List<String> values) {
            addCriterion("ys_photo in", values, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoNotIn(List<String> values) {
            addCriterion("ys_photo not in", values, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoBetween(String value1, String value2) {
            addCriterion("ys_photo between", value1, value2, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andYsPhotoNotBetween(String value1, String value2) {
            addCriterion("ys_photo not between", value1, value2, "ysPhoto");
            return (Criteria) this;
        }

        public Criteria andKsIdIsNull() {
            addCriterion("ks_id is null");
            return (Criteria) this;
        }

        public Criteria andKsIdIsNotNull() {
            addCriterion("ks_id is not null");
            return (Criteria) this;
        }

        public Criteria andKsIdEqualTo(Integer value) {
            addCriterion("ks_id =", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotEqualTo(Integer value) {
            addCriterion("ks_id <>", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThan(Integer value) {
            addCriterion("ks_id >", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ks_id >=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThan(Integer value) {
            addCriterion("ks_id <", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ks_id <=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdIn(List<Integer> values) {
            addCriterion("ks_id in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotIn(List<Integer> values) {
            addCriterion("ks_id not in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdBetween(Integer value1, Integer value2) {
            addCriterion("ks_id between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ks_id not between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("isdel like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("isdel not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andYsPhoneIsNull() {
            addCriterion("ys_phone is null");
            return (Criteria) this;
        }

        public Criteria andYsPhoneIsNotNull() {
            addCriterion("ys_phone is not null");
            return (Criteria) this;
        }

        public Criteria andYsPhoneEqualTo(String value) {
            addCriterion("ys_phone =", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneNotEqualTo(String value) {
            addCriterion("ys_phone <>", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneGreaterThan(String value) {
            addCriterion("ys_phone >", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ys_phone >=", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneLessThan(String value) {
            addCriterion("ys_phone <", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneLessThanOrEqualTo(String value) {
            addCriterion("ys_phone <=", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneLike(String value) {
            addCriterion("ys_phone like", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneNotLike(String value) {
            addCriterion("ys_phone not like", value, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneIn(List<String> values) {
            addCriterion("ys_phone in", values, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneNotIn(List<String> values) {
            addCriterion("ys_phone not in", values, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneBetween(String value1, String value2) {
            addCriterion("ys_phone between", value1, value2, "ysPhone");
            return (Criteria) this;
        }

        public Criteria andYsPhoneNotBetween(String value1, String value2) {
            addCriterion("ys_phone not between", value1, value2, "ysPhone");
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