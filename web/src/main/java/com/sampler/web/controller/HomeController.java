package com.sampler.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sampler.service.SomeService;

/**
 * User: hth
 * Date: 5/18/16 1:36 PM
 */
@SuppressWarnings ({
        "PMD.BeanMembersShouldSerialize",
        "PMD.LocalVariableCouldBeFinal",
        "PMD.MethodArgumentCouldBeFinal",
        "PMD.LongVariable"
})
@Controller
@RequestMapping (value = "/open/home")
public class HomeController {
    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    private final SomeService someService;

    @Autowired
    public HomeController(SomeService someService) {
        this.someService = someService;
    }

    @RequestMapping (method = {RequestMethod.GET})
    public String getIndexPage() {
        LOG.info("Reached home");
        boolean called = someService.callMe();
        LOG.info("Called service {}", called);
        return "showHome";
    }
}
