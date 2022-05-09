package firstjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {

        var data = List.of("apple", "orange", "watermelon");

        /*
        var result = new ArrayList<String>();
        for(String s : data){
            if(s.length() >=5){
                result.add(s);
            }
        }




        //exam3
        var result = 0;
        for(String s: data){
            if(s.length() >= 5){
                result++;
            }
        }
                System.out.println(result);



        //exam4

        for(String s: data){
            if(s.contains("p")){
                System.out.println("p포함");
            }
        }
*/

        //exam5
        for(String s: data){
            if(s.length()>=6){
                if(s.contains("p")){
                    System.out.println(s.toString());
                    System.out.println("p포함");
                }
            }
       }
    }
}
