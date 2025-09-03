package java_basics;

public class StringExamples {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("charAt(1): " + str.charAt(1));

        // toUpperCase()
        System.out.println("toUpperCase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase: " + str.toLowerCase());

        // substring()
        System.out.println("substring(2, 7): " + str.substring(2, 7));

        // equals()
        System.out.println("equals(str2): " + str.equals(str2));

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(str2): " + str.trim().equalsIgnoreCase(str2.trim()));

        // contains()
        System.out.println("contains(\"Java\"): " + str.contains("Java"));

        // startsWith()
        System.out.println("startsWith(\"  He\"): " + str.startsWith("  He"));

        // endsWith()
        System.out.println("endsWith(\"World  \"): " + str.endsWith("World  "));

        // indexOf()
        System.out.println("indexOf(\"Java\"): " + str.indexOf("Java"));

        // trim()
        System.out.println("trim: [" + str.trim() + "]");

        // replace()
        System.out.println("replace 'a' with 'o': " + str.replace('a', 'o'));

        // split()
        String[] words = str.trim().split(" ");
        System.out.println("split by space:");
        for (String word : words) {
            System.out.println(word);
        }

        // String immutability
        String s = "Hello";
        s.concat(" World"); // won't change original
        System.out.println("After concat (without assign): " + s);
        s = s.concat(" World"); // assign back
        System.out.println("After concat (with assign): " + s);

        // StringBuilder example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder append: " + sb);

        // StringBuffer example
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");
        System.out.println("StringBuffer append: " + sbf);
    }
}

