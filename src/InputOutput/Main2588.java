package InputOutput;

import java.util.Scanner;

public class Main2588 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();

        System.out.println(a * (b%10));     // 1의 자리
        System.out.println(a * ((b/10)%10));    // 10의 자리
        System.out.println(a * (b/100));    // 100의 자리
        System.out.println(a * b);
    }
}
