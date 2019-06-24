package com.ruoyi.system.service;

import java.util.LinkedHashMap;
import java.util.List;

public interface ISysProcudtService {
    List<LinkedHashMap<String, Object>> findall(String sql);
}
