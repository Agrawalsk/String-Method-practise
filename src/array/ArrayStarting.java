package array;

import java.util.Scanner;

public class ArrayStarting {
    public static void main(String[] args) {
//    int []a=new int[5];
//    int[][] a =new int[5][];
        int[] b = {1, 2, 3, 6, 2, 7, 4};
        ArrayStarting a = new ArrayStarting();
//    a.MaxOfarray(b);
//        int n=5;
//int[] brr = new int[n];
//brr=a.assingingValues(brr);
//System.out.println(Arrays.toString(brr));
        // we can copy one array to another with the
        // predefined function that are clone()
        //and other are
        // copyOf(NameOfOriginalArray,howMUchLengthYOuWantsToCopy)
        // and copyOfRange(NameOfOriginalArray,startIndex,EndIndex(excluded))
    }

    public void MaxOfarray(int[] d) {
        int a = d[0];
        for (int c : d) {
            if (c > a) {
                a = c;
            }

        }
        System.out.println(a);

    }

    public int[] assingingValues(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
