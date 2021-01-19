package com.evshou.mapper;

import com.evshou.entity.BlogLinks;
import com.evshou.entity.BlogLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogLinksMapper {
    int countByExample(BlogLinksExample example);

    int deleteByExample(BlogLinksExample example);

    int deleteByPrimaryKey(Long linksId);

    int insert(BlogLinks record);

    int insertSelective(BlogLinks record);

    List<BlogLinks> selectByExampleWithBLOBs(BlogLinksExample example);

    List<BlogLinks> selectByExample(BlogLinksExample example);

    BlogLinks selectByPrimaryKey(Long linksId);

    int updateByExampleSelective(@Param("record") BlogLinks record, @Param("example") BlogLinksExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogLinks record, @Param("example") BlogLinksExample example);

    int updateByExample(@Param("record") BlogLinks record, @Param("example") BlogLinksExample example);

    int updateByPrimaryKeySelective(BlogLinks record);

    int updateByPrimaryKeyWithBLOBs(BlogLinks record);

    int updateByPrimaryKey(BlogLinks record);
}