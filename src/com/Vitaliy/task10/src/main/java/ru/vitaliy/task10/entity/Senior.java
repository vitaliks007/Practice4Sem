package ru.vitaliy.task10.entity;

import org.springframework.stereotype.Component;

@Component
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("<SeniorCode>");
    }
}
