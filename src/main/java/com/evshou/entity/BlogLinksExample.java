package com.evshou.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogLinksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogLinksExample() {
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

        public Criteria andLinksIdIsNull() {
            addCriterion("links_id is null");
            return (Criteria) this;
        }

        public Criteria andLinksIdIsNotNull() {
            addCriterion("links_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinksIdEqualTo(Long value) {
            addCriterion("links_id =", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdNotEqualTo(Long value) {
            addCriterion("links_id <>", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdGreaterThan(Long value) {
            addCriterion("links_id >", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdGreaterThanOrEqualTo(Long value) {
            addCriterion("links_id >=", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdLessThan(Long value) {
            addCriterion("links_id <", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdLessThanOrEqualTo(Long value) {
            addCriterion("links_id <=", value, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdIn(List<Long> values) {
            addCriterion("links_id in", values, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdNotIn(List<Long> values) {
            addCriterion("links_id not in", values, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdBetween(Long value1, Long value2) {
            addCriterion("links_id between", value1, value2, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksIdNotBetween(Long value1, Long value2) {
            addCriterion("links_id not between", value1, value2, "linksId");
            return (Criteria) this;
        }

        public Criteria andLinksNameIsNull() {
            addCriterion("links_name is null");
            return (Criteria) this;
        }

        public Criteria andLinksNameIsNotNull() {
            addCriterion("links_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinksNameEqualTo(String value) {
            addCriterion("links_name =", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameNotEqualTo(String value) {
            addCriterion("links_name <>", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameGreaterThan(String value) {
            addCriterion("links_name >", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameGreaterThanOrEqualTo(String value) {
            addCriterion("links_name >=", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameLessThan(String value) {
            addCriterion("links_name <", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameLessThanOrEqualTo(String value) {
            addCriterion("links_name <=", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameLike(String value) {
            addCriterion("links_name like", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameNotLike(String value) {
            addCriterion("links_name not like", value, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameIn(List<String> values) {
            addCriterion("links_name in", values, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameNotIn(List<String> values) {
            addCriterion("links_name not in", values, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameBetween(String value1, String value2) {
            addCriterion("links_name between", value1, value2, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksNameNotBetween(String value1, String value2) {
            addCriterion("links_name not between", value1, value2, "linksName");
            return (Criteria) this;
        }

        public Criteria andLinksUrlIsNull() {
            addCriterion("links_url is null");
            return (Criteria) this;
        }

        public Criteria andLinksUrlIsNotNull() {
            addCriterion("links_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinksUrlEqualTo(String value) {
            addCriterion("links_url =", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlNotEqualTo(String value) {
            addCriterion("links_url <>", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlGreaterThan(String value) {
            addCriterion("links_url >", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlGreaterThanOrEqualTo(String value) {
            addCriterion("links_url >=", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlLessThan(String value) {
            addCriterion("links_url <", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlLessThanOrEqualTo(String value) {
            addCriterion("links_url <=", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlLike(String value) {
            addCriterion("links_url like", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlNotLike(String value) {
            addCriterion("links_url not like", value, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlIn(List<String> values) {
            addCriterion("links_url in", values, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlNotIn(List<String> values) {
            addCriterion("links_url not in", values, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlBetween(String value1, String value2) {
            addCriterion("links_url between", value1, value2, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksUrlNotBetween(String value1, String value2) {
            addCriterion("links_url not between", value1, value2, "linksUrl");
            return (Criteria) this;
        }

        public Criteria andLinksImageIsNull() {
            addCriterion("links_image is null");
            return (Criteria) this;
        }

        public Criteria andLinksImageIsNotNull() {
            addCriterion("links_image is not null");
            return (Criteria) this;
        }

        public Criteria andLinksImageEqualTo(String value) {
            addCriterion("links_image =", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageNotEqualTo(String value) {
            addCriterion("links_image <>", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageGreaterThan(String value) {
            addCriterion("links_image >", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageGreaterThanOrEqualTo(String value) {
            addCriterion("links_image >=", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageLessThan(String value) {
            addCriterion("links_image <", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageLessThanOrEqualTo(String value) {
            addCriterion("links_image <=", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageLike(String value) {
            addCriterion("links_image like", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageNotLike(String value) {
            addCriterion("links_image not like", value, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageIn(List<String> values) {
            addCriterion("links_image in", values, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageNotIn(List<String> values) {
            addCriterion("links_image not in", values, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageBetween(String value1, String value2) {
            addCriterion("links_image between", value1, value2, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksImageNotBetween(String value1, String value2) {
            addCriterion("links_image not between", value1, value2, "linksImage");
            return (Criteria) this;
        }

        public Criteria andLinksTargetIsNull() {
            addCriterion("links_target is null");
            return (Criteria) this;
        }

        public Criteria andLinksTargetIsNotNull() {
            addCriterion("links_target is not null");
            return (Criteria) this;
        }

        public Criteria andLinksTargetEqualTo(Integer value) {
            addCriterion("links_target =", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetNotEqualTo(Integer value) {
            addCriterion("links_target <>", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetGreaterThan(Integer value) {
            addCriterion("links_target >", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetGreaterThanOrEqualTo(Integer value) {
            addCriterion("links_target >=", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetLessThan(Integer value) {
            addCriterion("links_target <", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetLessThanOrEqualTo(Integer value) {
            addCriterion("links_target <=", value, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetIn(List<Integer> values) {
            addCriterion("links_target in", values, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetNotIn(List<Integer> values) {
            addCriterion("links_target not in", values, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetBetween(Integer value1, Integer value2) {
            addCriterion("links_target between", value1, value2, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksTargetNotBetween(Integer value1, Integer value2) {
            addCriterion("links_target not between", value1, value2, "linksTarget");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionIsNull() {
            addCriterion("links_description is null");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionIsNotNull() {
            addCriterion("links_description is not null");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionEqualTo(String value) {
            addCriterion("links_description =", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionNotEqualTo(String value) {
            addCriterion("links_description <>", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionGreaterThan(String value) {
            addCriterion("links_description >", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("links_description >=", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionLessThan(String value) {
            addCriterion("links_description <", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionLessThanOrEqualTo(String value) {
            addCriterion("links_description <=", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionLike(String value) {
            addCriterion("links_description like", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionNotLike(String value) {
            addCriterion("links_description not like", value, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionIn(List<String> values) {
            addCriterion("links_description in", values, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionNotIn(List<String> values) {
            addCriterion("links_description not in", values, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionBetween(String value1, String value2) {
            addCriterion("links_description between", value1, value2, "linksDescription");
            return (Criteria) this;
        }

        public Criteria andLinksDescriptionNotBetween(String value1, String value2) {
            addCriterion("links_description not between", value1, value2, "linksDescription");
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