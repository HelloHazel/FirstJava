package Exam0427;

public class Exam1 {
    public static void main(String[] args) {
        var data = "aa0bcd1efg1gg0abc";
        boolean isCheck = true;

        for(char ch: data.toCharArray()) {
            if(ch == '0') {
                isCheck = false;
            } else if (ch == '1') {
                isCheck = true;
            }else{
                System.out.println(isCheck? ch : (char) (ch - 32));
            }
        }
    }
}
