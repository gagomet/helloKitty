package com.hellokitty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */

@Controller
public class IndexPageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView logged() throws Exception {
        ModelAndView model = new ModelAndView();
        model.addObject("message", "YoYoYo!!");
        model.setViewName("index");
        return model;
    }
}
