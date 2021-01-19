package com.evshou.mapper;

import com.evshou.entity.BlogPostsLog;
import com.evshou.entity.BlogPostsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPostsLogMapper {
    int countByExample(BlogPostsLogExample example);

    int deleteByExample(BlogPostsLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlogPostsLog record);

    int insertSelective(BlogPostsLog record);

    List<BlogPostsLog> selectByExample(BlogPostsLogExample example);

    BlogPostsLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlogPostsLog record, @Param("example") BlogPostsLogExample example);

    int updateByExample(@Param("record") BlogPostsLog record, @Param("example") BlogPostsLogExample example);

    int updateByPrimaryKeySelective(BlogPostsLog record);

    int updateByPrimaryKey(BlogPostsLog record);
}