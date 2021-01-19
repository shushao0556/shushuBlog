package com.evshou.mapper;

import com.evshou.entity.BlogPosts;
import com.evshou.entity.BlogPostsExample;
import com.evshou.entity.BlogPostsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogPostsMapper {
    List<BlogPosts> getAllPosts();

    int countByExample(BlogPostsExample example);

    int deleteByExample(BlogPostsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlogPostsWithBLOBs record);

    int insertSelective(BlogPostsWithBLOBs record);

    List<BlogPostsWithBLOBs> selectByExampleWithBLOBs(BlogPostsExample example);

    List<BlogPosts> selectByExample(BlogPostsExample example);

    BlogPostsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlogPostsWithBLOBs record, @Param("example") BlogPostsExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogPostsWithBLOBs record, @Param("example") BlogPostsExample example);

    int updateByExample(@Param("record") BlogPosts record, @Param("example") BlogPostsExample example);

    int updateByPrimaryKeySelective(BlogPostsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogPostsWithBLOBs record);

    int updateByPrimaryKey(BlogPosts record);
}