import com.citb408.video.Author;
import com.citb408.video.Video;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Maria", 27);

        //static methods are accessed by the class name
        Video.setMaxDuration(BigDecimal.valueOf(5));
        System.out.println("Max Duration: " + Video.getMaxDuration());

        //When I create my own constructor, the default one gone and MUST use my own
        Video myVideo1 = new Video(1, "Animals", BigDecimal.valueOf(20.0), 10, author, LocalDate.of(2023, 11, 24));
        Video myVideo2 = new Video(2, "Animals", BigDecimal.valueOf(20.0), 10, author, LocalDate.of(2023, 11, 24));

        //Changed again
        Video.setMaxDuration(BigDecimal.valueOf(10));
        System.out.println("Max Duration: " + Video.getMaxDuration());

        //this will output that the Duration is greater than Max Duration
        myVideo1.setDuration(BigDecimal.valueOf(12));

        //since I have another constructor with no parameters, it is possible to create an object instance like this
//        Video myVideo3 = new Video();

        //the result is from the overridden toString()

        System.out.println(myVideo1);
        //OR
        //System.out.println(myVideo1.toString());

        System.out.println(myVideo2);

        //using dot notation to access the instance variables
        System.out.println(myVideo1.name);
        System.out.println(myVideo1.duration);

        System.out.println("Hello world!");
    }
}