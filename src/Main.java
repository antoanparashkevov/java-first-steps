import com.citb408.video.Video;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        //static methods are accessed by the class name
        Video.setMaxDuration(BigDecimal.valueOf(5));
        System.out.println(Video.getMaxDuration());

        //When I create my own constructor, the default one gone and MUST use my own
        Video myVideo1 = new Video(1, "Animals", BigDecimal.valueOf(20.0));
        Video myVideo2 = new Video(2, "Animals", BigDecimal.valueOf(20.0));

        //Changed again
        Video.setMaxDuration(BigDecimal.valueOf(10));
        System.out.println(Video.getMaxDuration());

        //since I have another constructor with no parameters, it is possible to create an object instance like this
        Video myVideo3 = new Video(3);

        //the result is from the overridden toString()

        System.out.println(myVideo1);
        //OR
        //System.out.println(myVideo1.toString());

        System.out.println(myVideo2);
        System.out.println(myVideo3);//the default

        //using dot notation to access the instance variables
        System.out.println(myVideo1.name);
        System.out.println(myVideo1.duration);

        System.out.println("Hello world!");
    }
}