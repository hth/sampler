package com.sampler.view.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@SuppressWarnings ({
    "PMD.BeanMembersShouldSerialize",
    "PMD.LocalVariableCouldBeFinal",
    "PMD.MethodArgumentCouldBeFinal",
    "PMD.LongVariable"
})
public class SamplerContextListener implements ServletContextListener {
    private static final Logger LOG = LoggerFactory.getLogger(SamplerContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.info("Initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.info("Destroyed");
    }
}
