package firstjava;

import java.util.List;

public class InterfaceSample1 {
    interface Named{
        String name();
    }

    record Student(String name, int score) {}
    record Teacher(String name, String subject){}

    public static void main(String[] args) {
        var people = List.of(new Student("sage", 88), new Teacher("hong", "Math"));

        for(var p : people) {
            var n = p instanceof Student s ? s.name() :
                    p instanceof Teacher t ? t.name :
                            "===";
            System.out.println("안녕하세요 %s님".formatted(n));

                            }
    }
}
