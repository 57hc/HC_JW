package com.ruoyi.system.service.impl;

import com.ruoyi.system.mapper.SysProcudtMapper;
import com.ruoyi.system.service.ISysProcudtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
@Service
public class SysProcdutServiceImpl implements ISysProcudtService {
    @Autowired
    private SysProcudtMapper sysProcudtMapper;
    @Override
    public List<LinkedHashMap<String, Object>> findall(String sql) {
        return sysProcudtMapper.select(sql);
    }
}
