package com.ruoyi.web.controller.system;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/lodop")
public class SysLopdopController {
    private String prefix = "print";
    @RequiresPermissions("lodop:test")
    @RequestMapping("/test")
    public String lopdop()
    {
        return prefix + "/lopdop";
    }



}
