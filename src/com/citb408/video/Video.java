package com.citb408.video;

import java.math.BigDecimal;

//Plain Old Java Object (POJO)
public class Video {
    //will create an ID of the video. All RBs have an ID field
    private final int id;

    public String name;

    //actually this is of type Object since BigDecimal is a class, and we create an object instance
    public BigDecimal duration;

    //equal between different object instances
    public static BigDecimal maxDuration;

    //I create another constructor without parameters.
    //That makes available the option to create an object instance with the default constructor
    public Video(int id) {
        this.id = id;
    }

    public Video(int id, String n, BigDecimal d) {
        this.id = id;
        this.name = n;
        this.duration = d;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDuration() {
        return duration;
    }

    public static BigDecimal getMaxDuration() {
        return maxDuration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    //methods that are allowed to manipulate/change static props/methods are also static.
    public static void setMaxDuration(BigDecimal maxDuration) {
        Video.maxDuration = maxDuration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}


