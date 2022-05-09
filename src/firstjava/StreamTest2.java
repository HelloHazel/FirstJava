package firstjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
6자    이상을    대문자로    표시
6자    이상의    문자의    총    합계    표시
모든    문자열이    a를    포함하는지    여부를    결정하기
 c를    포함하는    것이    1개이든지    어떤지를    판정하기
 */

public class StreamTest2 {
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "orange", "pineapple");


        /*
        //1번
        for (String s : strs) {
            if (s.length() >= 6) {
                System.out.println(s.toUpperCase());
                }

      //2번
        var result = 0;
        for (String s : strs) {
            if (s.length() >= 6) {
                result++;
            }
        }
        System.out.println(result);
    }
}
//3번
        for (String s : strs) {
            if (s.contains("a")) {
                System.out.println("a포함");
            }
        }
    }
}

*/
 //4번
        for (String s : strs) {
            if (s.contains("c")) {
                System.out.println("c포함");
            } else {
                System.out.println("c 미포함");
            }
        }
    }
}