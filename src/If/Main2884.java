package If;

import java.util.Scanner;

public class Main2884 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int h = scr.nextInt();
        int m = scr.nextInt();

        if (m < 45) {
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        }else {
            System.out.println(h + " " + ( m-45 ));
        }
    }
}
