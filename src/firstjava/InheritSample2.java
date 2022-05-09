package firstjava;

import java.util.List;

public class InheritSample2 {
    static class User {
        String name;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "%s = %s".formatted(getClass().getSimpleName(), getName());
        }

        static class Student extends InheritSample1.User {
            int score;

            Student(String name, int score) {
                this.name = name;
                this.score = score;
            }

            public int getScore() {
                return score;
            }
        }

        static class Teacher extends InheritSample1.User {
            String subject;

            Teacher(String name, String subject) {
                this.name = name;
                this.subject = subject;
            }

            public String getSubject() {
                return subject;
            }
        }

        public static void main(String[] args) {
            List<InheritSample1.User> people = List.of(
                    new InheritSample1.User.Student("sage", 89),
                    new InheritSample1.User.Teacher("Lee", "English"));
            for (var p : people) {
                System.out.println("안녕하세요. %s 님".formatted(p.getName()));
            }
        }

    }
}