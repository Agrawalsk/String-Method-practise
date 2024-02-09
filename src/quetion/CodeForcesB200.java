package quetion;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class CodeForcesB200 {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       double d=0;
       byte n=sc.nextByte();

       Formatter fm=new Formatter();
       double []a=new double[n];
       for (byte i=0; i<n ; i++){
           a[i]=sc.nextDouble();
           d +=a[i];
       }
//       fm.format("%.12f", d/n);
       System.out.println((d/n));
   }
}
