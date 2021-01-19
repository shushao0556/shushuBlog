package com.evshou.mapper;

import com.evshou.entity.BlogOptions;
import com.evshou.entity.BlogOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogOptionsMapper {
    int countByExample(BlogOptionsExample example);

    int deleteByExample(BlogOptionsExample example);

    int deleteByPrimaryKey(Integer optionsId);

    int insert(BlogOptions record);

    int insertSelective(BlogOptions record);

    List<BlogOptions> selectByExample(BlogOptionsExample example);

    BlogOptions selectByPrimaryKey(Integer optionsId);

    int updateByExampleSelective(@Param("record") BlogOptions record, @Param("example") BlogOptionsExample example);

    int updateByExample(@Param("record") BlogOptions record, @Param("example") BlogOptionsExample example);

    int updateByPrimaryKeySelective(BlogOptions record);

    int updateByPrimaryKey(BlogOptions record);
}