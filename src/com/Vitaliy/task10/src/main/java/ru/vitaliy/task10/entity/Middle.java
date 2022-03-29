package ru.vitaliy.task10.entity;

import org.springframework.stereotype.Component;

@Component
public class Middle implements Programmer {

    @Override
    public void doCoding() {
        System.out.println("<MiddleCode>");
    }
}
