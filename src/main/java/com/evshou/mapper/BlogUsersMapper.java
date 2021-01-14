package com.evshou.mapper;

import com.evshou.entity.BlogUsers;
import com.evshou.entity.BlogUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface BlogUsersMapper {
    BlogUsers checkLogin(String username,String password);

    @Select("select*from blog_users")
    List<BlogUsers> getAllUsers();

    int countByExample(BlogUsersExample example);

    int deleteByExample(BlogUsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BlogUsers record);

    int insertSelective(BlogUsers record);

    List<BlogUsers> selectByExample(BlogUsersExample example);

    BlogUsers selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BlogUsers record, @Param("example") BlogUsersExample example);

    int updateByExample(@Param("record") BlogUsers record, @Param("example") BlogUsersExample example);

    int updateByPrimaryKeySelective(BlogUsers record);

    int updateByPrimaryKey(BlogUsers record);
}