package com.evshou.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentsExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Long value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Long value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Long value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Long value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Long> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Long> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Long value1, Long value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdIsNull() {
            addCriterion("comment_post_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdIsNotNull() {
            addCriterion("comment_post_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdEqualTo(Long value) {
            addCriterion("comment_post_id =", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdNotEqualTo(Long value) {
            addCriterion("comment_post_id <>", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdGreaterThan(Long value) {
            addCriterion("comment_post_id >", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdGreaterThanOrEqualTo(Long value) {
            addCriterion("comment_post_id >=", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdLessThan(Long value) {
            addCriterion("comment_post_id <", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdLessThanOrEqualTo(Long value) {
            addCriterion("comment_post_id <=", value, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdIn(List<Long> values) {
            addCriterion("comment_post_id in", values, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdNotIn(List<Long> values) {
            addCriterion("comment_post_id not in", values, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdBetween(Long value1, Long value2) {
            addCriterion("comment_post_id between", value1, value2, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentPostIdNotBetween(Long value1, Long value2) {
            addCriterion("comment_post_id not between", value1, value2, "commentPostId");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNull() {
            addCriterion("comment_author is null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNotNull() {
            addCriterion("comment_author is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEqualTo(String value) {
            addCriterion("comment_author =", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotEqualTo(String value) {
            addCriterion("comment_author <>", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThan(String value) {
            addCriterion("comment_author >", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author >=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThan(String value) {
            addCriterion("comment_author <", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThanOrEqualTo(String value) {
            addCriterion("comment_author <=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLike(String value) {
            addCriterion("comment_author like", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotLike(String value) {
            addCriterion("comment_author not like", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIn(List<String> values) {
            addCriterion("comment_author in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotIn(List<String> values) {
            addCriterion("comment_author not in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorBetween(String value1, String value2) {
            addCriterion("comment_author between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotBetween(String value1, String value2) {
            addCriterion("comment_author not between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailIsNull() {
            addCriterion("comment_author_email is null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailIsNotNull() {
            addCriterion("comment_author_email is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailEqualTo(String value) {
            addCriterion("comment_author_email =", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailNotEqualTo(String value) {
            addCriterion("comment_author_email <>", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailGreaterThan(String value) {
            addCriterion("comment_author_email >", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_email >=", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailLessThan(String value) {
            addCriterion("comment_author_email <", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("comment_author_email <=", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailLike(String value) {
            addCriterion("comment_author_email like", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailNotLike(String value) {
            addCriterion("comment_author_email not like", value, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailIn(List<String> values) {
            addCriterion("comment_author_email in", values, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailNotIn(List<String> values) {
            addCriterion("comment_author_email not in", values, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailBetween(String value1, String value2) {
            addCriterion("comment_author_email between", value1, value2, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("comment_author_email not between", value1, value2, "commentAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpIsNull() {
            addCriterion("comment_author_ip is null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpIsNotNull() {
            addCriterion("comment_author_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpEqualTo(String value) {
            addCriterion("comment_author_ip =", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpNotEqualTo(String value) {
            addCriterion("comment_author_ip <>", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpGreaterThan(String value) {
            addCriterion("comment_author_ip >", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author_ip >=", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpLessThan(String value) {
            addCriterion("comment_author_ip <", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpLessThanOrEqualTo(String value) {
            addCriterion("comment_author_ip <=", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpLike(String value) {
            addCriterion("comment_author_ip like", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpNotLike(String value) {
            addCriterion("comment_author_ip not like", value, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpIn(List<String> values) {
            addCriterion("comment_author_ip in", values, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpNotIn(List<String> values) {
            addCriterion("comment_author_ip not in", values, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpBetween(String value1, String value2) {
            addCriterion("comment_author_ip between", value1, value2, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIpNotBetween(String value1, String value2) {
            addCriterion("comment_author_ip not between", value1, value2, "commentAuthorIp");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
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