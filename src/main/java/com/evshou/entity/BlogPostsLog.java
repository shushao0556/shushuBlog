package com.evshou.entity;

import java.util.Date;

public class BlogPostsLog {
    private Long id;

    private Long postId;

    private String postUrl;

    private String postsCategory;

    private Date createDate;

    private Integer postStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl == null ? null : postUrl.trim();
    }

    public String getPostsCategory() {
        return postsCategory;
    }

    public void setPostsCategory(String postsCategory) {
        this.postsCategory = postsCategory == null ? null : postsCategory.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(Integer postStatus) {
        this.postStatus = postStatus;
    }
}