package For;

import java.util.Scanner;

public class Main8393 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int sum = 0;

        for (int i=1; i<=a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
