package If;

import java.util.Scanner;

public class Main2753 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();

        if((a%4 == 0 && (a%100) != 0) || ((a%400) == 0)) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
