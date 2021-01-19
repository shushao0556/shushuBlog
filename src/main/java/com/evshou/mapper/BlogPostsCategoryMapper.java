package com.evshou.mapper;

import com.evshou.entity.BlogPostsCategory;
import com.evshou.entity.BlogPostsCategoryExample;

import java.math.BigInteger;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPostsCategoryMapper {
    BigInteger getAllPostsByCategory();

    List<BlogPostsCategory> getAllCategory();

    int countByExample(BlogPostsCategoryExample example);

    int deleteByExample(BlogPostsCategoryExample example);

    int deleteByPrimaryKey(Long categoryId);

    int insert(BlogPostsCategory record);

    int insertSelective(BlogPostsCategory record);

    List<BlogPostsCategory> selectByExample(BlogPostsCategoryExample example);

    BlogPostsCategory selectByPrimaryKey(Long categoryId);

    int updateByExampleSelective(@Param("record") BlogPostsCategory record, @Param("example") BlogPostsCategoryExample example);

    int updateByExample(@Param("record") BlogPostsCategory record, @Param("example") BlogPostsCategoryExample example);

    int updateByPrimaryKeySelective(BlogPostsCategory record);

    int updateByPrimaryKey(BlogPostsCategory record);
}