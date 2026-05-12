import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        // sc.nextInt()
        // sc.nextDouble()
        // sc.next()
        // sc.nextLine()
        // sc.nextBoolean()
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");

        }
        System.out.println("The number you have Enter: " + age);

        // array declartion
        int[] someNum = new int[4];
        someNum[1] = 2;
        someNum[0] = 8;
        someNum[2] = 6;
        someNum[3] = 9;
        // full initialization
        int[] arr = { 1, 2, 3, 4, 5 };

        // Array Length
        // arr.length
        // NOT:
        // arr.length()
        // Because arrays are special structures, not objects like String.
        
    }
}

// Primitive Types
// Type Size Example
// int 4 bytes 10
// long 8 bytes 100000L
// double decimal 10.5
// char single character 'A'
// boolean true/false true
// int[]

// int day = 2;

// switch(day) {

// case 1:
// System.out.println("Monday");
// break;

// case 2:
// System.out.println("Tuesday");
// break;

// default:
// System.out.println("Invalid");
// }