package javaBasics;

public class Basic {
    // PART 1 — CONDITIONALS
    public static void main(String[] args) {

        int age = 18;
        boolean isGrown = false;

        if (age > 16) {
            System.out.println("You have grown so, much thorfin");
            isGrown = true;
        } else {
            System.out.println("Fill yourself");
        }
        // Flow
        // Condition true?
        // YES → execute block
        // NO → skip

        if (age >= 18) {

            if (isGrown) {
                System.out.println("Now you are able to leave the sword");
            }

        }

        // Types of Loops
        // Loop Usage
        // for known iterations
        // while unknown iterations
        // do-while execute at least once
        // enhanced for arrays/collections

        // while loop
        System.out.print("This is while loop");
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do while loop
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }

}
