package firstjava;

public class RemoveDuplicate3 {
    public static void main(String[] args) {
        var data = "abcde";
        var builder = new StringBuilder();
        char t = 0;

        for(int i = 0; i < data.length(); i++){
            if(i % 2 == 0) {
                t = data.charAt(i);
            }else{
                builder.append(data.charAt(i));
                builder.append(t);
            }
            if(builder.length() < data.length()) {
                builder.append(i);
            }

            System.out.println(builder.toString());
        }
    }
}


