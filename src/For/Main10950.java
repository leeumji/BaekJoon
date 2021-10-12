package For;

import java.util.Scanner;

public class Main10950 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        for (int i=1; i<=n; i++) {
            int a = scr.nextInt();
            int b = scr.nextInt();
            System.out.println(a+b);
        }
    }
}
