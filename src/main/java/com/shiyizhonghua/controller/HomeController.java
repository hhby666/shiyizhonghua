package com.shiyizhonghua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: HomeController
 * @Description: 主页控制类，加载主页面
 * @Author: zhuaowei
 * @Date: 2021/10/29
 * @Version: 1.0
 */

@RestController
public class HomeController {

    @GetMapping("index")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
