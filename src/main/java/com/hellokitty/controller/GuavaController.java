package com.hellokitty.controller;

import com.hellokitty.service.GuavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

    @RequestMapping(value = "/listResults", method = RequestMethod.POST)
    public ModelAndView getListResults(@RequestParam String number, ModelAndView modelAndView){
        modelAndView.setViewName("listorder");
        modelAndView.addObject("order", guavaService.manipulateWithListOrder(getIntegerListWithCustomEntries(Integer.parseInt(number))));
        return modelAndView;
    }

    private List<Integer> getIntegerListWithCustomEntries(int entriesNumber){
        List<Integer> result = new ArrayList<>();
        Random randomizer = new Random();
        for(int i = 0; i < entriesNumber; i++){
            result.add(randomizer.nextInt(100));
        }
        return result;
    }
}
