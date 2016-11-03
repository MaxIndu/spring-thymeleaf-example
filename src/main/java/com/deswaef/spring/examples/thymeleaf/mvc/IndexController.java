package com.deswaef.spring.examples.thymeleaf.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    private Log LOG = LogFactory.getLog(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        return "test";
    }

    @RequestMapping(value = "/prop", method = RequestMethod.GET)
    public String prop(ModelMap map) {
        return "test";
    }

}
