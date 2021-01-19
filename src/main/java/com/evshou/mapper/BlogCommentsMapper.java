package com.evshou.mapper;

import com.evshou.entity.BlogComments;
import com.evshou.entity.BlogCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogCommentsMapper {
    int countByExample(BlogCommentsExample example);

    int deleteByExample(BlogCommentsExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(BlogComments record);

    int insertSelective(BlogComments record);

    List<BlogComments> selectByExampleWithBLOBs(BlogCommentsExample example);

    List<BlogComments> selectByExample(BlogCommentsExample example);

    BlogComments selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByExample(@Param("record") BlogComments record, @Param("example") BlogCommentsExample example);

    int updateByPrimaryKeySelective(BlogComments record);

    int updateByPrimaryKeyWithBLOBs(BlogComments record);

    int updateByPrimaryKey(BlogComments record);
}