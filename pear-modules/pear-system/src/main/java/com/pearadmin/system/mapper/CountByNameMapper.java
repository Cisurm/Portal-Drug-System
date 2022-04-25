package com.pearadmin.system.mapper;

import com.pearadmin.system.domain.CountByName;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CountByNameMapper {

    @Select("select config_name name,count(*) count from sys_config group by config_name;")
    List<CountByName> allData();

}
