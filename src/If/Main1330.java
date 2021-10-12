package If;

import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        if (a > b) {
            System.out.println(">");
        }else if (a < b) {
            System.out.println("<");
        }else if (a == b) {
            System.out.println("==");
        }
    }
}
