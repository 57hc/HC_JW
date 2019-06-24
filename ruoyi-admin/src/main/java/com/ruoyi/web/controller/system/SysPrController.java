package com.ruoyi.web.controller.system;


import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.SysBulidLog;
import com.ruoyi.system.service.ISysBulidLogService;
import com.ruoyi.system.service.ISysProcudtService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
@RequestMapping("prodcut")
public class SysPrController {

    @Autowired
    private ISysProcudtService procudtSerivce;
    private ISysBulidLogService iSysBulidLogService;
    private String prefix = "report";
    @RequiresPermissions("prodcut:view")
    @RequestMapping("/pr")
    public String chartjs()
    {
        return prefix + "/index";
    }
    @PostMapping("/chect")
    @ResponseBody
    public  List<LinkedHashMap<String,Object>> chect(HttpServletRequest request, Model model){
        String sql= request.getParameter("val");
        SysBulidLog sysBulidLog=new SysBulidLog();
        sysBulidLog.setSql(sql);
        sysBulidLog.setCreatetime( DateUtils.parseDate( DateUtils.getTime()));
        List<LinkedHashMap<String,Object>> collect=procudtSerivce.findall(sql);
        return collect;
    }

}
