package Exam0427;

import java.util.List;

public class Exam1201 {
    interface Named {
        String name();

        default String greeting(){
            return "안녕하세요.%s님".formatted(name());
        }

        static void msg(Named named){
            System.out.println("Hello " + named.name());
    }
    record Staff(String name, String job) implements Named {}
    record Student(String name, int score) implements Named { }
    record Teacher(String name, String subject) implements Named { }

    public static void main(String[] args) {
        var people = List.of(new Student("sage", 88), new Teacher("hong",
                "Math"), new Staff("test", "driver") );

        for(Named p : people) {
            var n = p.name();
            var m = p.greeting();
            System.out.println("안녕하세요 %s 님".formatted(n));
            System.out.println(m);
        }

        msg(() -> {
            return "no name";
        });

        }
    }
}