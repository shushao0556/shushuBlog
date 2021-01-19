package com.evshou.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogPostsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogPostsExample() {
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

        public Criteria andPostAuthorIsNull() {
            addCriterion("post_author is null");
            return (Criteria) this;
        }

        public Criteria andPostAuthorIsNotNull() {
            addCriterion("post_author is not null");
            return (Criteria) this;
        }

        public Criteria andPostAuthorEqualTo(String value) {
            addCriterion("post_author =", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotEqualTo(String value) {
            addCriterion("post_author <>", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorGreaterThan(String value) {
            addCriterion("post_author >", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("post_author >=", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorLessThan(String value) {
            addCriterion("post_author <", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorLessThanOrEqualTo(String value) {
            addCriterion("post_author <=", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorLike(String value) {
            addCriterion("post_author like", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotLike(String value) {
            addCriterion("post_author not like", value, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorIn(List<String> values) {
            addCriterion("post_author in", values, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotIn(List<String> values) {
            addCriterion("post_author not in", values, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorBetween(String value1, String value2) {
            addCriterion("post_author between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostAuthorNotBetween(String value1, String value2) {
            addCriterion("post_author not between", value1, value2, "postAuthor");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNull() {
            addCriterion("post_date is null");
            return (Criteria) this;
        }

        public Criteria andPostDateIsNotNull() {
            addCriterion("post_date is not null");
            return (Criteria) this;
        }

        public Criteria andPostDateEqualTo(Date value) {
            addCriterion("post_date =", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotEqualTo(Date value) {
            addCriterion("post_date <>", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThan(Date value) {
            addCriterion("post_date >", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateGreaterThanOrEqualTo(Date value) {
            addCriterion("post_date >=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThan(Date value) {
            addCriterion("post_date <", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateLessThanOrEqualTo(Date value) {
            addCriterion("post_date <=", value, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateIn(List<Date> values) {
            addCriterion("post_date in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotIn(List<Date> values) {
            addCriterion("post_date not in", values, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateBetween(Date value1, Date value2) {
            addCriterion("post_date between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostDateNotBetween(Date value1, Date value2) {
            addCriterion("post_date not between", value1, value2, "postDate");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNull() {
            addCriterion("post_status is null");
            return (Criteria) this;
        }

        public Criteria andPostStatusIsNotNull() {
            addCriterion("post_status is not null");
            return (Criteria) this;
        }

        public Criteria andPostStatusEqualTo(Integer value) {
            addCriterion("post_status =", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotEqualTo(Integer value) {
            addCriterion("post_status <>", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThan(Integer value) {
            addCriterion("post_status >", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_status >=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThan(Integer value) {
            addCriterion("post_status <", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusLessThanOrEqualTo(Integer value) {
            addCriterion("post_status <=", value, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusIn(List<Integer> values) {
            addCriterion("post_status in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotIn(List<Integer> values) {
            addCriterion("post_status not in", values, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusBetween(Integer value1, Integer value2) {
            addCriterion("post_status between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("post_status not between", value1, value2, "postStatus");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIsNull() {
            addCriterion("post_category is null");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIsNotNull() {
            addCriterion("post_category is not null");
            return (Criteria) this;
        }

        public Criteria andPostCategoryEqualTo(String value) {
            addCriterion("post_category =", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotEqualTo(String value) {
            addCriterion("post_category <>", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryGreaterThan(String value) {
            addCriterion("post_category >", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("post_category >=", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLessThan(String value) {
            addCriterion("post_category <", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLessThanOrEqualTo(String value) {
            addCriterion("post_category <=", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLike(String value) {
            addCriterion("post_category like", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotLike(String value) {
            addCriterion("post_category not like", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIn(List<String> values) {
            addCriterion("post_category in", values, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotIn(List<String> values) {
            addCriterion("post_category not in", values, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryBetween(String value1, String value2) {
            addCriterion("post_category between", value1, value2, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotBetween(String value1, String value2) {
            addCriterion("post_category not between", value1, value2, "postCategory");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(Integer value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(Integer value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(Integer value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(Integer value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<Integer> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<Integer> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(Integer value1, Integer value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andPostPasswordIsNull() {
            addCriterion("post_password is null");
            return (Criteria) this;
        }

        public Criteria andPostPasswordIsNotNull() {
            addCriterion("post_password is not null");
            return (Criteria) this;
        }

        public Criteria andPostPasswordEqualTo(String value) {
            addCriterion("post_password =", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordNotEqualTo(String value) {
            addCriterion("post_password <>", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordGreaterThan(String value) {
            addCriterion("post_password >", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("post_password >=", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordLessThan(String value) {
            addCriterion("post_password <", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordLessThanOrEqualTo(String value) {
            addCriterion("post_password <=", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordLike(String value) {
            addCriterion("post_password like", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordNotLike(String value) {
            addCriterion("post_password not like", value, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordIn(List<String> values) {
            addCriterion("post_password in", values, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordNotIn(List<String> values) {
            addCriterion("post_password not in", values, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordBetween(String value1, String value2) {
            addCriterion("post_password between", value1, value2, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostPasswordNotBetween(String value1, String value2) {
            addCriterion("post_password not between", value1, value2, "postPassword");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIsNull() {
            addCriterion("post_modified is null");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIsNotNull() {
            addCriterion("post_modified is not null");
            return (Criteria) this;
        }

        public Criteria andPostModifiedEqualTo(Date value) {
            addCriterion("post_modified =", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotEqualTo(Date value) {
            addCriterion("post_modified <>", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedGreaterThan(Date value) {
            addCriterion("post_modified >", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("post_modified >=", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedLessThan(Date value) {
            addCriterion("post_modified <", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedLessThanOrEqualTo(Date value) {
            addCriterion("post_modified <=", value, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedIn(List<Date> values) {
            addCriterion("post_modified in", values, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotIn(List<Date> values) {
            addCriterion("post_modified not in", values, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedBetween(Date value1, Date value2) {
            addCriterion("post_modified between", value1, value2, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostModifiedNotBetween(Date value1, Date value2) {
            addCriterion("post_modified not between", value1, value2, "postModified");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityIsNull() {
            addCriterion("post_visibility is null");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityIsNotNull() {
            addCriterion("post_visibility is not null");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityEqualTo(Integer value) {
            addCriterion("post_visibility =", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityNotEqualTo(Integer value) {
            addCriterion("post_visibility <>", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityGreaterThan(Integer value) {
            addCriterion("post_visibility >", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_visibility >=", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityLessThan(Integer value) {
            addCriterion("post_visibility <", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityLessThanOrEqualTo(Integer value) {
            addCriterion("post_visibility <=", value, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityIn(List<Integer> values) {
            addCriterion("post_visibility in", values, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityNotIn(List<Integer> values) {
            addCriterion("post_visibility not in", values, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityBetween(Integer value1, Integer value2) {
            addCriterion("post_visibility between", value1, value2, "postVisibility");
            return (Criteria) this;
        }

        public Criteria andPostVisibilityNotBetween(Integer value1, Integer value2) {
            addCriterion("post_visibility not between", value1, value2, "postVisibility");
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