package stringJava;

import java.util.Scanner;

public class Assingment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for (int i = n.length() - 1; i >= 0; i--) {
            char a = n.charAt(i);
            switch (a) {
                case '0':
                    System.out.println("O-|-OOOO");
                    break;
                case '1':
                    System.out.println("O-|O-OOO");
                    break;
                case '2':
                    System.out.println("O-|OO-OO");
                    break;
                case '3':
                    System.out.println("O-|OOO-O");
                    break;
                case '4':
                    System.out.println("O-|OOOO-");
                    break;
                case '5':
                    System.out.println("-O|-OOOO");
                    break;
                case '6':
                    System.out.println("-O|O-OOO");
                    break;
                case '7':
                    System.out.println("-O|OO-OO");
                    break;
                case '8':
                    System.out.println("-O|OOO-O");
                    break;
                case '9':
                    System.out.println("-O|OOOO-");
                    break;
            }
        }

    }
}
