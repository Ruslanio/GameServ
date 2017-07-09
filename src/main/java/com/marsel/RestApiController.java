package com.marsel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ruslan on 09.07.2017.
 */
@RestController
public class RestApiController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "success";
    }
}
