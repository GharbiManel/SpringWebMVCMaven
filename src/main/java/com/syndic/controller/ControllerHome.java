package com.syndic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Manel on 03/12/2015.
 */
@Controller
public class ControllerHome {
    @RequestMapping(value = "/" )
    public String home(){
        return "test";
    }
}
