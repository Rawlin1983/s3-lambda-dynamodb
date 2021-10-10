package com.test.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ApiParameters
{
    String meter;

    String date;

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
