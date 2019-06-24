package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysBulidLog;
import com.ruoyi.system.mapper.SysBulidLogMapper;
import com.ruoyi.system.service.ISysBulidLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysBulidLogServiceImpl implements ISysBulidLogService {
    @Autowired
   private    SysBulidLogMapper sysBulidLogMapper;
    @Override
    public void insert(SysBulidLog sysBulidLog) {
        sysBulidLogMapper.insert(sysBulidLog);
    }
}
