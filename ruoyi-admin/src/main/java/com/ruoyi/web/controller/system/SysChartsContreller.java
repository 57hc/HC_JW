package com.ruoyi.web.controller.system;


import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chart")
public class SysChartsContreller {
    private String prefix = "pages/charts";
    @RequiresPermissions("chart:view")
    @RequestMapping("/chartjs")
    public String chartjs()
    {
        return prefix + "/chartjs";
    }

    @RequiresPermissions("morris:view")
    @RequestMapping("/morris")
    public String morris()
    {
        return prefix + "/morris";
    }
}
