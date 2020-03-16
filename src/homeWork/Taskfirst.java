package homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Taskfirst {
    public static void main(String[] args) {
// 1.
        /*int a = 16;
        int b = 20;
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);*/

        /*int a = 20;
        int b = 16;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
            System.out.println(a + b);
        }*/
// 2.
        /*int[] someArr8 = {5, 4, 10, 6, 1, 3, 7, 25};
        Arrays.sort(someArr8);
        System.out.println(Arrays.toString(someArr8));
        for (int i = 0; i < someArr8.length; i++) {
            for (int k = i + 1; k < someArr8.length; k++) {
                if (someArr8[i] + someArr8[k] == 7) {
                    System.out.print(someArr8[i]);
                    System.out.print(someArr8[k]);
                }
            }
        }*/
// 3.
        /*int[] someArr9 = new int[7];
        for (int n = 0; n < someArr9.length; n++) {
            someArr9[n] = (int) (Math.random() * 60 );
        }
        Arrays.sort(someArr9);
        System.out.println(Arrays.toString(someArr9));
        int max = someArr9[6];
        int min = someArr9[0];
        int mid = someArr9[3];
        for (int n = 0; n <someArr9.length ; n++) {
            if (max < someArr9[n])
                max = someArr9[n];
            else if (mid == someArr9[n])
                mid = someArr9[n];
            else if (min > someArr9[n])
                min = someArr9[n];
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);*/
// 4.
      /*int n;
      while (true) {
        System.out.println("Введите натуральное число больше 3-х");
        Scanner one = new Scanner(System.in);
        n = one.nextInt();
        if (n > 3) {
            System.out.println(n);
            break;
        }
        else if (n <= 3) {
            System.out.println("Введите число удовлетворяющее условиям");
            }
        }
        int[] someArr2 = new int[n];
        int evenNumbers = 0;
        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] = (int) (Math.random() * n);
            if(someArr2[i] % 2 ==0) {
                evenNumbers++;
            }
        }
        System.out.println(Arrays.toString(someArr2));
        int[] someArr3 = new int[evenNumbers];
        int index = 0;
        for (int i = 0; i < someArr2.length; i++) {
            if (someArr2[i] % 2 == 0) {
                someArr3[index] = someArr2[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(someArr3));*/
// 5.
        /*int[][] someArr4;
        someArr4 = new int[5][8];
        for (int i = 0; i < someArr4.length; i++) {
            for (int j = 0; j < someArr4[i].length; j++) {
                someArr4[i][j] = (int) (Math.random() * 198 - 99);
            }
        }
        System.out.println(Arrays.deepToString(someArr4));
        //Arrays.sort(someArr4);
        int max = someArr4[4][someArr4.length];
        for (int i = 0; i < someArr4.length; i++) {
            for (int j = 0; j < someArr4[i].length; j++) {
                if (max < someArr4[i][j])
                    max = someArr4[i][j];
            }
        }
        System.out.println(max);*/
    }
}
