package com.pearadmin.system.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pearadmin.common.constant.ControllerConstant;
import com.pearadmin.common.plugin.logging.aop.enums.LoggingType;
import com.pearadmin.common.web.base.BaseController;
import com.pearadmin.common.web.domain.request.PageDomain;
import com.pearadmin.common.web.domain.response.Result;
import com.pearadmin.common.web.domain.response.module.ResultTable;
import com.pearadmin.system.domain.CountByName;
import com.pearadmin.system.domain.SysData;
import com.pearadmin.system.domain.SysLog;
import com.pearadmin.system.mapper.CountByNameMapper;
import com.pearadmin.system.mapper.SysDataMapper;
import com.pearadmin.system.service.ISysLogService;
import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Describe: 日志控制器
 * Author: 就 眠 仪 式
 * CreateTime: 2019/10/23
 */
@RestController
@Api(tags = {"数据"})
@RequestMapping("/mydata")
public class SysDataController extends BaseController {

    @Resource
    private SysDataMapper sysDataMapper;
    @Resource
    private CountByNameMapper countByNameMapper;

    @GetMapping("getData")
    @PreAuthorize("permitAll()")
    public List<SysData> getData(){
        return sysDataMapper.getData();
    }
    @GetMapping("countbyname")
    @PreAuthorize("permitAll()")
    public ResultTable countByName(){
        List<CountByName> allData = countByNameMapper.allData();
        return pageTable(allData,allData.size());
    }

}
