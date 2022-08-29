package com.library.controller;

import com.library.bean.Tage;
import com.library.service.LoginService;
import com.library.service.TageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author huai
 * @date 2022/8/30
 */
@RestController
public class TageController {

    @Autowired
    private TageService tageService;

    @Autowired
    private LoginService loginService;

    private Tage tage;

    private Tage getTage(int tagId) {
        return tageService.getTage(tagId);
    }

    @RequestMapping("/allTages")
    public Object allTages() {
        return tageService.tages();
    }

    @RequestMapping("/deleteTage")
    public Object deleteTage(int tagId) {
        return tageService.deleteTage(tagId);
    }

    @RequestMapping("/editTage")
    public Object editTage(int tagId, String tagName) {
        tage = getTage(tagId);
        tage.setClassName(tagName);
        return tageService.editTage(tage);
    }

    @RequestMapping("/addTage")
    public Object addTage(String tagName) {
        tage = new Tage();
        tage.setClassName(tagName);
        return tageService.addTage(tage);
    }

    @RequestMapping("/tage_add.html")
    public ModelAndView addBook() {
        return new ModelAndView("admin_tage_add");
    }




}
