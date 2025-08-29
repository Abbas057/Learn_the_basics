package java_basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b → " + (a == b));
        System.out.println("a != b → " + (a != b));
        System.out.println("a > b  → " + (a > b));
        System.out.println("a < b  → " + (a < b));
        System.out.println("a >= b → " + (a >= b));
        System.out.println("a <= b → " + (a <= b));

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y → " + (x && y));
        System.out.println("x || y → " + (x || y));
        System.out.println("!x     → " + (!x));

        // 4. Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5 → " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3 → " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2 → " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4 → " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3 → " + c);

        // 5. Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // pre-increment
        System.out.println("d++ = " + (d++)); // post-increment
        System.out.println("After d++ → " + d);
        System.out.println("--d = " + (--d)); // pre-decrement
        System.out.println("d-- = " + (d--)); // post-decrement
        System.out.println("After d-- → " + d);

        // 6. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);
    }
}
