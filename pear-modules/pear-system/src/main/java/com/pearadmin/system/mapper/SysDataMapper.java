package com.pearadmin.system.mapper;

import com.pearadmin.common.plugin.logging.aop.enums.LoggingType;
import com.pearadmin.system.domain.SysData;
import com.pearadmin.system.domain.SysLog;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Describe: 日 志 接 口
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 * */
@Mapper
public interface SysDataMapper {


    List<SysData> getData();
}
