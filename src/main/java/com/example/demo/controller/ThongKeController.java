package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trang-chu")
public class ThongKeController {
    @GetMapping("/thong-ke")
    public String index(){
        return "thongke";
    }
}
