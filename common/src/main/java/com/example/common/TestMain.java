package com.example.common;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.util.StatusPrinter;
import org.apache.logging.log4j.spi.LoggerContext;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {
    public static void loadLoggerContext() {
        System.getProperties().put("logback.configurationFile", "./logback.xml");
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.setPrintStream(System.err);
        StatusPrinter.print((Context) lc);
    }

    public static void main(String[] args) {
        try {
            loadLoggerContext();
            FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("./conf/spring-base.xml");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
