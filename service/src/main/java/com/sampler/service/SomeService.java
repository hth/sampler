package com.sampler.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

@Service
public class SomeService {
    private static final Logger LOG = LoggerFactory.getLogger(SomeService.class);

    public boolean callMe() {
        return true;
    }
}
