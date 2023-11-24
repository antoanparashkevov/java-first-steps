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

        //compareTo returns 0, 1, or -1

        //the result in the if statement should return a boolean
        //BigDecimal.ZERO is a constant value from the BigDecimal class
        if( duration.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Invalid duration! Should be a positive number!");
        } else {
            //or just maxDuration
            if( Video.maxDuration.compareTo(duration) < 0 ) {
                System.out.println("Duration is greater than Max Duration");
            } else {

                this.duration = duration;
            }
        }
    }

    //methods that are allowed to manipulate/change static props/methods are also static.
    public static void setMaxDuration(BigDecimal maxDuration) {
    //this.duration -> not allowed from the static context since this points to the object's context
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


