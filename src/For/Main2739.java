package For;

import java.util.Scanner;

public class Main2739 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }

    }
}
