package com.ruoyi.system.mapper;

import java.util.LinkedHashMap;
import java.util.List;

public interface SysProcudtMapper {
    List<LinkedHashMap<String, Object>> select(String sql);

}
