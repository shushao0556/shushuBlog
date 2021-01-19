package com.evshou.mapper;

import com.evshou.entity.BlogPostsCategory;
import com.evshou.entity.BlogUsers;
import com.evshou.entity.Pages;
import com.evshou.util.MybatisUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PagesImpl implements PagesMapper{
    @Override
    public PageInfo<BlogUsers> getAllUsers(Pages pages) {
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogUsersMapper mapper = ss.getMapper(BlogUsersMapper.class);
        PageHelper.startPage(pages.getPageNums(),pages.getPageSize());
        List<BlogUsers> allUsers = mapper.getAllUsers();
        return new PageInfo<>(allUsers);
    }

    @Override
    public PageInfo<BlogPostsCategory> getAllPostsCategory(Pages pages) {
        SqlSession ss = MybatisUtils.getSqlSession();
        BlogPostsCategoryMapper mapper = ss.getMapper(BlogPostsCategoryMapper.class);
        PageHelper.startPage(pages.getPageNums(),pages.getPageSize());
        List<BlogPostsCategory> allCategory = mapper.getAllCategory();
        return new PageInfo<>(allCategory);
    }
}
