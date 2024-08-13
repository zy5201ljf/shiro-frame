package com.levmin.shiro.mapper;

import com.levmin.shiro.entity.StudentUser;
import com.levmin.shiro.entity.StudentUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentUserMapper {
    int countByExample(StudentUserExample example);

    int deleteByExample(StudentUserExample example);

    int insert(StudentUser record);

    int insertSelective(StudentUser record);

    List<StudentUser> selectByExample(StudentUserExample example);

    int updateByExampleSelective(@Param("record") StudentUser record, @Param("example") StudentUserExample example);

    int updateByExample(@Param("record") StudentUser record, @Param("example") StudentUserExample example);
}