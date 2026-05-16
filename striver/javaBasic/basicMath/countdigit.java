package basicMath;

import java.util.Scanner;

public class countdigit {
    // count all digit of a number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Total digits: " + count);
        sc.close();
    }
}
