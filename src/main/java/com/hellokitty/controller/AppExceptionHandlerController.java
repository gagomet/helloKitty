package com.hellokitty.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */
@ControllerAdvice
public class AppExceptionHandlerController {
    @ExceptionHandler(Exception.class)
    public ModelAndView handleAllException(Exception ex) {
        ModelAndView model = new ModelAndView("error");
        model.addObject("error", ex.getMessage());
        model.addObject("message", "Whoops! something wrong");
        return model;
    }
}
