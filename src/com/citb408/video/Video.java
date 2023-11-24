package com.citb408.video;

import java.math.BigDecimal;

public class Video {
    //will create an ID of the video. All RBs have an ID field
    private long id;
    public String name;
    public BigDecimal duration;//actually this is of type Object since BigDecimal is a class and we create an object instance

    //I create another constructor without parameters.
    //That makes available the option to create an object instance with the default constructor
    public Video() {

    }

    public Video(String n, BigDecimal d) {
        this.name = n;
        this.duration = d;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name +
                "', duration=" + duration +
                "}";
    }
}


