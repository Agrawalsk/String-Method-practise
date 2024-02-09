package stringJava;

import java.util.Scanner;

class question {
    public static void toggle(StringBuilder d) {
        // StringBuilder v=new StringBuilder();
        for (int i = 0; i < d.length(); i++) {
            boolean flag = true;//small
            char ch = d.charAt(i);
            if (ch == ' ') continue;
            int asci = ch;
            if (asci < 97) flag = false;//capital
            if (flag) {
                asci -= 32;
                char dh = (char) asci;
                d.setCharAt(i, dh);
            } else {
                asci += 32;
                char dh = (char) asci;
                d.setCharAt(i, dh);
            }

        }
        System.out.println(d);
    }

    public void countPalindromicSubstring(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) { //for substring

            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                int end = sub.length();
//              while(true){
//                  if (s.charAt(start)==s.charAt(end-1))
//                  start++;
//                  end--;
//              }
                String nw = "";
                while (end > 0) {
                    nw += sub.charAt(end - 1);
                    end--;
                }
                if (nw.equals(sub)) c++;
            }
        }
        System.out.println(c);
    }

    public void reverseTheWordOfTheString(String s) {
        String[] v = (s.split(" "));
        for (String temp : v) {
            StringBuilder p = new StringBuilder(temp);
            p.reverse();
            System.out.print(p + " ");


        }
    }

    public void compressionOfTheGivenString( String s) {

        int j = 0, q = 0;
        for (int i = 0; i < s.length(); i += q) {
            q = 0;
            int c = 0, n = 0;
            while (j < s.length()) {
                if (s.charAt(i) == s.charAt(j)) {
                    c++;
                    n++;
                    j++;
                } else {
                    break;
                }

            }
            q += n;
            System.out.print(s.charAt(i));
           if(c!=1) System.out.print(c);
        }
    }

}


public class QuestionOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder s1 = new StringBuilder(sc.nextLine());
//        question.toggle(s1);
// write the code to count the number of  palindromic substrings


//         String a = sc.nextLine();
        question q = new question();
//          q.countPalindromicSubstring(a);
        String v=sc.nextLine();
        q.compressionOfTheGivenString(v);

    }

}
