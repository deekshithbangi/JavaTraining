package com.bangi;

public class OperatorsProofOfConcept {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int divison = a / b;
        int modulus = a % b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + divison);
        System.out.println("Modulus: " + modulus);

        int num = 5;
        num++;
        System.out.println("Increment: " + num);
        num--;
        System.out.println("Decrement: " + num);

        int x = 10;
        int y = 20;

        System.out.println("Equal to: " + (x == y));
        System.out.println("Not Equal to: " + (x != y));
        System.out.println("Greater than: " + (x > y));
        System.out.println("Less than: " + (x < y));
        System.out.println("Greater than or Equal to: " + (x >= y));
        System.out.println("Less than or Equal to: " + (x <= y));

        // Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("Logical AND: " + (p && q));
        System.out.println("Logical OR: " + (p || q));
        System.out.println("Logical AND: " + (p & q)); // here we are using short circuit operator, so it will not check the second condition if the first condition is false
        System.out.println("Logical OR: " + (p | q));

        // Logical NOT
        System.out.println("Logical NOT for p: " + (!p));
        System.out.println("Logical NOT for q: " + (!q));

        // Conditional Operator (Ternary Operator)
        int age = 20;
        String status = (age < 18) ? "Minor" : "Adult";
        System.out.println("Age Status: " + status);

        // Bitwise Operators (Assuming integers)
        int m = 5; // Binary: 101
        int n = 3; // Binary: 011

        // Bitwise AND
        System.out.println("Bitwise AND: " + (m & n)); // Result: 001 (Decimal: 1)

        // Bitwise OR
        System.out.println("Bitwise OR: " + (m | n)); // Result: 111 (Decimal: 7)

        // Bitwise XOR
        System.out.println("Bitwise XOR: " + (m ^ n)); // Result: 110 (Decimal: 6)

        // Bitwise NOT
        System.out.println("Bitwise NOT for m: " + (~m)); // Result: 11111111111111111111111111111010 (Decimal: -6)

        // Bitwise Left Shift
        int shiftLeft = m << 1; // Shift left by 1 bit
        System.out.println("Bitwise Left Shift: " + shiftLeft); // Result: 10 (Decimal: 10)

        // Bitwise Right Shift
        int shiftRight = m >> 1; // Shift right by 1 bit
        System.out.println("Bitwise Right Shift: " + shiftRight); // Result: 2 (Decimal: 2)

    }
}