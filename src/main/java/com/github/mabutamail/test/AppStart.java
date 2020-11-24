package com.github.mabutamail.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppStart {
    public final static Logger LOGGER = LoggerFactory.getLogger(AppStart.class);
    public static void main(String[] args) {
        LOGGER.info("====================       Начало программы        ====================");
        System.out.println("Программа работает");
    }
}