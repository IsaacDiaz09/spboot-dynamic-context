package dev.isadiape.multiple_contexts.core;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CoreModuke {

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void postConstruct() {
        log.info("core-module loaded");
        log.info("contains ctxt1 dependency? {}", context.containsBean("demo1Service"));
        log.info("contains ctxt2 dependency? {}", context.containsBean("demo2Service"));
    }

}
