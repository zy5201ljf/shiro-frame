package com.levmin.shiro.mapper;

import com.levmin.shiro.entity.SystemResources;
import com.levmin.shiro.entity.SystemResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemResourcesMapper {
    int countByExample(SystemResourcesExample example);

    int deleteByExample(SystemResourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemResources record);

    int insertSelective(SystemResources record);

    List<SystemResources> selectByExample(SystemResourcesExample example);

    SystemResources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemResources record, @Param("example") SystemResourcesExample example);

    int updateByExample(@Param("record") SystemResources record, @Param("example") SystemResourcesExample example);

    int updateByPrimaryKeySelective(SystemResources record);

    int updateByPrimaryKey(SystemResources record);
}