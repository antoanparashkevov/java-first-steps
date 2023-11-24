package com.citb408.video;

import java.math.BigDecimal;

public class Video {
    //will create an ID of the video. All RBs have an ID field
    private final int id;
    public String name;
    public BigDecimal duration;//actually this is of type Object since BigDecimal is a class and we create an object instance

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

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}


