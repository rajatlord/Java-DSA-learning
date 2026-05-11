package javaBasics;

public class JB {
// JB represnts Java Basics
    // data sturcture
    int age = 22;
    double salary = 22.8;
    char grade = 'A';
    boolean isJavaFun = true;
    String name = "Rajat";

    int[] arr = { 1, 3, 6, 8 };

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        JB obj = new JB();
        if (obj.age > 18) {
            System.err.println("Adult");
        } else {
            System.out.println("Minor");
        }

        // loop
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // method call
        int result = add(5, 10);
        System.out.println("Addition: " + result);

        // array print
        for(int j = 0; j < obj.arr.length; j++){
        System.out.print(obj.arr[j] +" ");
        }

    }
}
