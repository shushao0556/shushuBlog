package com.evshou.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogOptionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogOptionsExample() {
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

        public Criteria andOptionsIdIsNull() {
            addCriterion("options_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIdIsNotNull() {
            addCriterion("options_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsIdEqualTo(Integer value) {
            addCriterion("options_id =", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotEqualTo(Integer value) {
            addCriterion("options_id <>", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdGreaterThan(Integer value) {
            addCriterion("options_id >", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("options_id >=", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdLessThan(Integer value) {
            addCriterion("options_id <", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdLessThanOrEqualTo(Integer value) {
            addCriterion("options_id <=", value, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdIn(List<Integer> values) {
            addCriterion("options_id in", values, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotIn(List<Integer> values) {
            addCriterion("options_id not in", values, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdBetween(Integer value1, Integer value2) {
            addCriterion("options_id between", value1, value2, "optionsId");
            return (Criteria) this;
        }

        public Criteria andOptionsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("options_id not between", value1, value2, "optionsId");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNull() {
            addCriterion("webTitle is null");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNotNull() {
            addCriterion("webTitle is not null");
            return (Criteria) this;
        }

        public Criteria andWebtitleEqualTo(String value) {
            addCriterion("webTitle =", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotEqualTo(String value) {
            addCriterion("webTitle <>", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThan(String value) {
            addCriterion("webTitle >", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThanOrEqualTo(String value) {
            addCriterion("webTitle >=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThan(String value) {
            addCriterion("webTitle <", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThanOrEqualTo(String value) {
            addCriterion("webTitle <=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLike(String value) {
            addCriterion("webTitle like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotLike(String value) {
            addCriterion("webTitle not like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleIn(List<String> values) {
            addCriterion("webTitle in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotIn(List<String> values) {
            addCriterion("webTitle not in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleBetween(String value1, String value2) {
            addCriterion("webTitle between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotBetween(String value1, String value2) {
            addCriterion("webTitle not between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitle2IsNull() {
            addCriterion("webTitle2 is null");
            return (Criteria) this;
        }

        public Criteria andWebtitle2IsNotNull() {
            addCriterion("webTitle2 is not null");
            return (Criteria) this;
        }

        public Criteria andWebtitle2EqualTo(String value) {
            addCriterion("webTitle2 =", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2NotEqualTo(String value) {
            addCriterion("webTitle2 <>", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2GreaterThan(String value) {
            addCriterion("webTitle2 >", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2GreaterThanOrEqualTo(String value) {
            addCriterion("webTitle2 >=", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2LessThan(String value) {
            addCriterion("webTitle2 <", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2LessThanOrEqualTo(String value) {
            addCriterion("webTitle2 <=", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2Like(String value) {
            addCriterion("webTitle2 like", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2NotLike(String value) {
            addCriterion("webTitle2 not like", value, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2In(List<String> values) {
            addCriterion("webTitle2 in", values, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2NotIn(List<String> values) {
            addCriterion("webTitle2 not in", values, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2Between(String value1, String value2) {
            addCriterion("webTitle2 between", value1, value2, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWebtitle2NotBetween(String value1, String value2) {
            addCriterion("webTitle2 not between", value1, value2, "webtitle2");
            return (Criteria) this;
        }

        public Criteria andWeburlIsNull() {
            addCriterion("webUrl is null");
            return (Criteria) this;
        }

        public Criteria andWeburlIsNotNull() {
            addCriterion("webUrl is not null");
            return (Criteria) this;
        }

        public Criteria andWeburlEqualTo(String value) {
            addCriterion("webUrl =", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotEqualTo(String value) {
            addCriterion("webUrl <>", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThan(String value) {
            addCriterion("webUrl >", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlGreaterThanOrEqualTo(String value) {
            addCriterion("webUrl >=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThan(String value) {
            addCriterion("webUrl <", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLessThanOrEqualTo(String value) {
            addCriterion("webUrl <=", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlLike(String value) {
            addCriterion("webUrl like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotLike(String value) {
            addCriterion("webUrl not like", value, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlIn(List<String> values) {
            addCriterion("webUrl in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotIn(List<String> values) {
            addCriterion("webUrl not in", values, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlBetween(String value1, String value2) {
            addCriterion("webUrl between", value1, value2, "weburl");
            return (Criteria) this;
        }

        public Criteria andWeburlNotBetween(String value1, String value2) {
            addCriterion("webUrl not between", value1, value2, "weburl");
            return (Criteria) this;
        }

        public Criteria andWebemailIsNull() {
            addCriterion("webEmail is null");
            return (Criteria) this;
        }

        public Criteria andWebemailIsNotNull() {
            addCriterion("webEmail is not null");
            return (Criteria) this;
        }

        public Criteria andWebemailEqualTo(String value) {
            addCriterion("webEmail =", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotEqualTo(String value) {
            addCriterion("webEmail <>", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailGreaterThan(String value) {
            addCriterion("webEmail >", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailGreaterThanOrEqualTo(String value) {
            addCriterion("webEmail >=", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLessThan(String value) {
            addCriterion("webEmail <", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLessThanOrEqualTo(String value) {
            addCriterion("webEmail <=", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailLike(String value) {
            addCriterion("webEmail like", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotLike(String value) {
            addCriterion("webEmail not like", value, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailIn(List<String> values) {
            addCriterion("webEmail in", values, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotIn(List<String> values) {
            addCriterion("webEmail not in", values, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailBetween(String value1, String value2) {
            addCriterion("webEmail between", value1, value2, "webemail");
            return (Criteria) this;
        }

        public Criteria andWebemailNotBetween(String value1, String value2) {
            addCriterion("webEmail not between", value1, value2, "webemail");
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