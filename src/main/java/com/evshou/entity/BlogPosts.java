package com.evshou.entity;

import java.util.Date;

public class BlogPosts {
    private Long id;

    private String postAuthor;

    private Date postDate;

    private Integer postStatus;

    private String postCategory;

    private Integer commentStatus;

    private String postPassword;

    private Date postModified;

    private Integer postVisibility;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor == null ? null : postAuthor.trim();
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory == null ? null : postCategory.trim();
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPostPassword() {
        return postPassword;
    }

    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword == null ? null : postPassword.trim();
    }

    public Date getPostModified() {
        return postModified;
    }

    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    public Integer getPostVisibility() {
        return postVisibility;
    }

    @Override
    public String toString() {
        return "BlogPosts{" +
                "id=" + id +
                ", postAuthor='" + postAuthor + '\'' +
                ", postDate=" + postDate +
                ", postStatus=" + postStatus +
                ", postCategory='" + postCategory + '\'' +
                ", commentStatus=" + commentStatus +
                ", postPassword='" + postPassword + '\'' +
                ", postModified=" + postModified +
                ", postVisibility=" + postVisibility +
                '}';
    }

    public BlogPosts(Long id, String postAuthor, Date postDate, Integer postStatus, String postCategory, Integer commentStatus, String postPassword, Date postModified, Integer postVisibility) {
        this.id = id;
        this.postAuthor = postAuthor;
        this.postDate = postDate;
        this.postStatus = postStatus;
        this.postCategory = postCategory;
        this.commentStatus = commentStatus;
        this.postPassword = postPassword;
        this.postModified = postModified;
        this.postVisibility = postVisibility;
    }

    public BlogPosts() {
    }

    public void setPostVisibility(Integer postVisibility) {
        this.postVisibility = postVisibility;
    }
}