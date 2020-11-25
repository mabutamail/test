package com.github.mabutamail.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppStart {
    public final static Logger LOGGER = LoggerFactory.getLogger(AppStart.class);

    public static void main(String[] args) {
        LOGGER.info("====================       Начало программы        ====================");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(12, 67));
    }

}