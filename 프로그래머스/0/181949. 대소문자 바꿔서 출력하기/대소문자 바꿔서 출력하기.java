import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder answer = new StringBuilder(a);
        
        for(int i=0;i<answer.length();i++) {
            char x = answer.charAt(i);
            if(Character.isUpperCase(x)) {
                answer.setCharAt(i, Character.toLowerCase(x));
            } else {
                answer.setCharAt(i, Character.toUpperCase(x));
            }
        }
        System.out.println(answer);
    }
}