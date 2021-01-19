package com.evshou.mapper;

import com.evshou.entity.BlogPostsCategory;
import com.evshou.entity.BlogUsers;
import com.evshou.entity.Pages;
import com.github.pagehelper.PageInfo;

public interface PagesMapper {
    PageInfo<BlogUsers> getAllUsers(Pages pages);
    PageInfo<BlogPostsCategory> getAllPostsCategory(Pages pages);
}
