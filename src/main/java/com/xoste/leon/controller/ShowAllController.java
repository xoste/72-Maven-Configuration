package com.xoste.leon.controller;

import com.xoste.leon.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Leon
 */
@Controller
public class ShowAllController {
    @Resource
    private UsersService usersServiceImpl;
    @RequestMapping("/show")
    public String showAll(Model model) {
        model.addAttribute("usersList", usersServiceImpl.showAll());
        return "/index.jsp";
    }
}
