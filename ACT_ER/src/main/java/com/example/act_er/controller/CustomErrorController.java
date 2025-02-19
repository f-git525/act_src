package com.example.act_er.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CustomErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "error"; // エラーページのテンプレート名を返します（例：error.html、error.jsp）
    }

    public String getErrorPath() {
        return "/error";
    }
}
