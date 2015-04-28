package com.hellokitty.controller;

import com.hellokitty.service.GuavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */
@Controller
public class GuavaController {
    @Autowired
    private GuavaService guavaService;

    @RequestMapping(value = "/odd", method = RequestMethod.POST)
    public ModelAndView thisOdd(@RequestParam String number, ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("message", "this is cool");
        modelAndView.addObject("result", guavaService.oddNumber(Integer.parseInt(number)));
       return modelAndView;
    }

    @RequestMapping(value = "/listResults", method = RequestMethod.GET)
    public ModelAndView getListResults(ModelAndView modelAndView){

        return modelAndView;
    }
}
