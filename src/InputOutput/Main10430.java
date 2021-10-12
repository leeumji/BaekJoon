package InputOutput;

import java.util.Scanner;

public class Main10430 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        System.out.println((a+b) % c);
        System.out.println(((a%c) + (b%c)) % c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
